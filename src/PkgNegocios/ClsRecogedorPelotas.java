/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vera
 */
public class ClsRecogedorPelotas {
    ClsConexion conexion = new ClsConexion();
    Connection con = null;
    
    public boolean AgregarRecogedorPelotas(PkgEntidad.ClsRecogedorPelotas bsk, Connection _Con) {
        
        CallableStatement cstm = null;
        boolean resp = true;
       
        try {
            //con = conexion.getConecion();
            _Con.setAutoCommit(false);
            cstm = _Con.prepareCall("insert into tbRecogedorPelotas (idEquipo, puntajeEquipo) values (?,?);");
            cstm.setInt(1, bsk.getIdEquipo());
            cstm.setInt(2, bsk.getPuntajeEquipo());
            resp = cstm.execute();
            _Con.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //conexion.Cerrar1(con, cstm);
        }
        return resp;
    }
    public void InsertarPosicion(int _IdEquipo, int _PuntajeEquipo ,String _PosicionEquipo)
    {
        con = conexion.getConecion();
        PreparedStatement pst = null;
        String sqlQuery = "insert into tbRecogedorPelotas values (?,?,?)";
        try
        {
            pst = con.prepareStatement(sqlQuery);
            pst.setInt(1, _IdEquipo);
            pst.setInt(2, _PuntajeEquipo);
            pst.setString(3, _PosicionEquipo);
            pst.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
    }
    public int BorrarDatosRecogedorPelotas()
    {
        con = conexion.getConecion();
        int id = 0;        
        PreparedStatement pst = null;
        String sqlQuery = "delete tbRecogedorPelotas"; 
        try 
        {
            pst = con.prepareStatement(sqlQuery); 
            pst.executeUpdate();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ClsRecogedorPelotas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    public List<PkgEntidad.ClsRecogedorPelotas> listado() {
        int cont=1;
        CallableStatement cstm = null;
        ResultSet rs = null;
        List<PkgEntidad.ClsRecogedorPelotas> lista = null;
        try {
            lista = new ArrayList<>();
            con = conexion.getConecion();
            cstm = con.prepareCall("select rp.idEquipo, rp.posicionEquipo, rp.puntajeEquipo, e.detalleEquipo\n" +
            "from tbRecogedorPelotas as rp inner join tbEquipo as e\n" +
            "on rp.idEquipo = e.idEquipo\n" +
            "order by rp.puntajeEquipo DESC");
            rs = cstm.executeQuery();
            PkgEntidad.ClsRecogedorPelotas rp = null;
            while (rs.next()) {
                rp = new PkgEntidad.ClsRecogedorPelotas();
                rp.setIdEquipo(rs.getInt("idEquipo"));
                rp.setPuntajeEquipo(rs.getInt("puntajeEquipo"));
                rp.setPosicionEquipo(cont+" puesto");
                rp.setDetalleEquipo(rs.getString("detalleEquipo"));
                lista.add(rp);
                cont++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            conexion.Cerrar2(cstm, rs);
        }
        return lista;
    }
    public int UpdatePuntaje(int _IdEquipo, int _PuntajeEquipo){
        con = conexion.getConecion();
        int exitosa=0;
        PreparedStatement pst = null;
        String sql = "update tbRecogedorPelotas set puntajeEquipo = ? where idEquipo = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, _PuntajeEquipo);
            pst.setInt(2, _IdEquipo);
            exitosa= pst.executeUpdate();
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return exitosa;
    }
}
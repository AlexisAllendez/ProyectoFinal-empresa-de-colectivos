package accesoADatos;
import EmpresaDeColectivo.Entidades.Pasajero;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PasajeroData {
     private Connection con = null;

      public PasajeroData() {
        con = Conexion.getConexion();
    }
      
     public void guardarPasajero(Pasajero pasajero) {
        String sql = "INSERT INTO pasajeros (nombre, apellido, dni, correo,telefono) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setString(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasajero.setIdPasajero(rs.getInt(1));
                JOptionPane.showMessageDialog(null,
                        "Pasajero añadido con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error al acceder a la tabla Pasajero. Mensaje SQLException: "
                    + ex.getMessage());
        }
    }
     
     
     
     public Pasajero buscarPasajero(int idPasajero) {
    Pasajero pasajero = null;
    String sql = "SELECT ID_Pasajero, Nombre, Apellido, DNI, Correo, Telefono, Estado "
            + "FROM pasajeros "
            + "WHERE ID_Pasajero = ?";
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idPasajero);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            pasajero = new Pasajero(); // Inicializamos el objeto Pasajero aquí
            pasajero.setIdPasajero(rs.getInt("ID_Pasajero")); // Usamos rs.getInt para obtener el valor de ID_Pasajero
            pasajero.setNombre(rs.getString("Nombre"));
            pasajero.setApellido(rs.getString("Apellido"));
            pasajero.setDni(rs.getString("DNI"));
            pasajero.setCorreo(rs.getString("Correo"));
            pasajero.setTelefono(rs.getString("Telefono"));
            pasajero.setEstado(rs.getBoolean("Estado"));
        } else {
            JOptionPane.showMessageDialog(null, "No existe el pasajero");
        }
        ps.close(); // Mover ps.close() fuera del bloque else
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,
                "Error al acceder a la tabla Pasajeros. Mensaje SQLException: "
                + ex.getMessage());
    }

    return pasajero;
}
     
     
    public List<Pasajero> listarPasajeros() {
        List<Pasajero> pasajeros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pasajeros WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setIdPasajero(rs.getInt("ID_Pasajero")); // Corregido para obtener el ID de pasajero
                pasajero.setNombre(rs.getString("Nombre"));
                pasajero.setApellido(rs.getString("Apellido"));
                pasajero.setDni(rs.getString("DNI"));
                pasajero.setCorreo(rs.getString("Correo"));
                pasajero.setTelefono(rs.getString("Telefono"));
                pasajero.setEstado(rs.getBoolean("Estado"));
                pasajeros.add(pasajero);

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pasajeros " + ex.getMessage());
        }
        return pasajeros;
        
        
        

    }
      
      public void modificarPasajero(Pasajero pasajero) {
        String sql = "UPDATE pasajeros SET nombre = ? , apellido = ?, dni = ?,correo = ?,telefono = ?"
                +   " WHERE ID_Pasajero = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
   
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setString(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setInt(6, pasajero.getIdPasajero()); 

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Pasajero no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero " + ex.getMessage());
        }
    }
      
      public void eliminarPasajero(int idPasajero) {
        try {
            String sql = "UPDATE pasajeros SET estado = 0 WHERE ID_Pasajero = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPasajero);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el pasajero.");
            }

            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pasajero");
        }
    }
      
      public Pasajero buscarPasajeroPorDni(String dni) {
        Pasajero pasajero = null;
        String sql = "SELECT ID_Pasajero, nombre, apellido, dni, correo, telefono,estado  "
                + "FROM pasajeros WHERE dni=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pasajero = new Pasajero();
                pasajero.setIdPasajero(rs.getInt("ID_Pasajero"));
                pasajero.setNombre(rs.getString("nombre"));
                pasajero.setApellido(rs.getString("apellido"));
                pasajero.setDni(rs.getString("dni"));
                pasajero.setCorreo(rs.getString("correo"));
                pasajero.setTelefono(rs.getString("telefono"));
                pasajero.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el pasajero");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajero " + ex.getMessage());
        }
        return pasajero;
    }

}

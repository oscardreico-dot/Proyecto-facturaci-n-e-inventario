
package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cliente extends Datos
{   
    private Sentencias_sql sql; 
    public Cliente(String documento,String nombre,String telefono,String pago, String producto, String cantidad,String factura)
    {        
        sql = new Sentencias_sql();
    }    
    public boolean Ingresar_Cliente()
    {               
        
            String datos[] = {getDocumento(), getNombre(), getTelefono(), getPago(), getProducto(), getCantidad(), getFactura()};           
            return sql.insertar(datos, "insert into Cliente(idCC_Cliente,Nombre,Telefono,idTipo_Pago,idCod_Barras,Cantidad,idFactura Venta) values(?,?,?,?,?,?,?)");
               
    }  
}

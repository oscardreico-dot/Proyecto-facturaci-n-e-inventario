package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Proveeedor extends Datos
{
     private Sentencias_sql sql; 
    public Proveeedor(String documento,String nombre,String producto,String factura,String pago)
    {        
        sql = new Sentencias_sql();
    }    
    public boolean Ingresar_Proveeedor()
    {               
        
            String datos[] = {getDocumento(), getNombre(), getProducto(), getFactura(), getPago()};           
            return sql.insertar(datos, "insert into Proveeedor(idNit_Proveedor,Nombre,idProducto,idFactura CompraP,Tipo_Pago) values(?,?,?,?,?)");
               
    }   
}

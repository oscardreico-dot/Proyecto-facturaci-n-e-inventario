
package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Detalle_producto_venta extends Datos
{
   private Sentencias_sql sql; 
    public Detalle_producto_venta(String producto,String tipo,String material,String talla,String color,String cantidad,String intercambio)
    {        
        sql = new Sentencias_sql();
    }    
    public boolean Ingresar_Detalle_producto_venta()
    {               
        
            String datos[] = {getProducto(), getTipo(), getMaterial(), getTalla(), getColor(), getCantidad(), getIntercambio()};           
            return sql.insertar(datos, "insert into Detelle_producto_venta(idDetalle Producto Venta,Tipo Producto,Material,Talla,Color,Existencias,idIntercambio) values(?,?,?,?,?,?,?)");  
    }
}

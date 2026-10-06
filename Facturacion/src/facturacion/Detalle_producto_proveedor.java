
package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Detalle_producto_proveedor extends Datos
{
    private Sentencias_sql sql; 
    public Detalle_producto_proveedor(String producto,String tipo,String material,String talla,String color,String cantidad,String devolucion)
    {        
        sql = new Sentencias_sql();
    }    
    public boolean Ingresar_Detalle_producto_proveedor()
    {               
        
            String datos[] = {getProducto(), getTipo(), getMaterial(), getTalla(), getColor(), getCantidad(), getDevolucion()};           
            return sql.insertar(datos, "insert into Detelle_producto_proveedor(idDetalle Producto Proveedor,Tipo,Material,Talla,Color,Cantidad total,Cod_Devolucion) values(?,?,?,?,?,?,?)");  
    } 
}

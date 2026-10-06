
package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Devoluciones extends Datos
{
    private Sentencias_sql sql; 
    public Devoluciones(String devolucion,String fecha,String producto,String documento)
    {        
        sql = new Sentencias_sql();
    }      
   
    public boolean ingresar_Devoluciones()
    {               
        
            String datos[] = {getDevolucion(), getFecha(), getProducto(), getDocumento()};           
            return sql.insertar(datos, "insert into Devoluciones(idCod_Devoluciones,IdFecha Venta,idProducto,idCC_Cliente) values(?,?,?,?)");
                      
    }              
}

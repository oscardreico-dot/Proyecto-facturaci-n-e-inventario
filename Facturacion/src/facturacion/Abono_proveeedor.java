
package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Abono_proveeedor extends Datos
{
   private Sentencias_sql sql; 

    public Abono_proveeedor(String Abono,String fecha,String valor,String cantidad,String documento,String factura)
    {        
        sql = new Sentencias_sql();
    }      
   
    public boolean ingresar_Abono_proveeedor()
    {               
        
            String datos[] = {getAbono(), getFecha(), getValor(), getCantidad(), getDocumento(), getFactura()};           
            return sql.insertar(datos, "insert into Abono_cliente(idAbono Proveedor,Fecha_Abono,Valor,Cuotas_Cantidad,idNit_Proveedor,idFacturaCompra) values(?,?,?,?,?,?)");
                     
    }  
}

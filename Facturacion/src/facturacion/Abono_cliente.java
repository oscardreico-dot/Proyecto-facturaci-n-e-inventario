
package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Abono_cliente extends Datos
{
     private Sentencias_sql sql; 

    public Abono_cliente(String Abono,String fecha,String valor,String cantidad,String documento,String factura)
    {        
        sql = new Sentencias_sql();
    }      
   
    public boolean ingresar_Abono_cliente()
    {               
        
            String datos[] = {getAbono(), getFecha(), getValor(), getCantidad(), getDocumento(), getFactura()};           
            return sql.insertar(datos, "insert into Abono_cliente(idAbono_Cliente,Fecha,Valor_Total,Cuotas_Cantidad,idCC_Cliente,idFactura_Venta) values(?,?,?,?,?,?)");
                      
    }
}
package facturacion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vendedor extends Datos
{
    private Sentencias_sql sql; 
    public Vendedor(String vendedor,String nombre,String apellido,String telefono,String ventas, String salario, String comision,String documento,String factura)
    {        
        sql = new Sentencias_sql();
    }    
    public boolean Ingresar_Vendedor()
    {               
        
            String datos[] = {getVendedor(), getNombre(), getApellido(), getTelefono(), getVentas(), getSalario(), getComision(), getDocumento(), getFactura()};           
            return sql.insertar(datos, "insert into Vendedor(idCC_Vendedor,Nombre,Apellido,Telefono,Ventas_Realizadas,Salario,Comision,idCC_ClienteB,idFactura Ventas) values(?,?,?,?,?,?,?)");
               
    }  
}

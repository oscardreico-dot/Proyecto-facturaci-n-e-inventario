
package facturacion;

public class Intercambio extends Datos
{
  private Sentencias_sql sql; 

    public Intercambio(String intercambio,String producto,String cantidad,String almacen,String fecha)
    {        
        sql = new Sentencias_sql();
    }      
   
    public boolean ingresar_Intercambio()
    {               
        
            String datos[] = {getIntercambio(), getProducto(), getCantidad(), getAlmacen(), getFecha()};           
            return sql.insertar(datos, "insert into Intercambio(idIntercambio,Tipo_Producto,Cantidad_Prestamo,Almacen_Aliado,Fecha_Prestamo,) values(?,?,?,?,?)");
                      
    }            
}

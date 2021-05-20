public class Producto
{
String codigo;
String nombre;
int  precio;
int cantidad;

public Producto(String codigo,String nombre,int precio, int cantidad)
{
	this.codigo=codigo;
	this.nombre=nombre;
	this.precio=precio;
	this.cantidad=cantidad;
	
	
	
	}//fin del constructor
	
	public String getCodigo()
	{
	return codigo;
	}
	public void setCodigo()
	{
	this.codigo=codigo;	
	}
	public String getNombre()
	{
	return nombre;
	}
	public void setNombre()
	{
	this.nombre=nombre;		
	}
	public int getPrecio()
	{
	return precio;	
	}
	public void setPrecio()
	{
	this.precio=precio;
	}
	public int getCantidad()
	{
	return cantidad;
	}
	public void setCantidad()
	{
	this.cantidad=cantidad;
	}
	

}//fin de la clase manden pelos

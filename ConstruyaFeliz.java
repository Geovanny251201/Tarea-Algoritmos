import javax.swing.JOptionPane;

public class ConstruyaFeliz
{


	public static void main(String args)
	{
		
		String nombre,direccion,id,codigo="pene";
		int cantidad,cantidadAlmacen=0;
		Comprador comprador;
		 int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu Principal:/n1.Realizar Compra/n2.Pagar en la caja/n3.Monto en la caja/n4.Mostrar compradores en espera/n5.Productos sin existencias/n6.Salir"));
			switch(opcion)
			{
			case 1:
			nombre=JOptionPane.showInputDialog(null,"Inserte su nombre ");
			direccion=JOptionPane.showInputDialog(null,"Inserte la direccion del hogar");
			id=JOptionPane.showInputDialog(null,"Inserte su identificacion");
			
			while(codigo=="pene")//para verificar si el producto existe, se vuelve a preguntar en caso de que no exista
			{
				if(codigo=="y"){
				
					cantidad=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del producto que desea comprar"));
					if(cantidad==cantidadAlmacen)
					{
						JOptionPane.showMessageDialog(null,"Existencias insuficientes, solo hay x unidades");
						}
						else{
							
							//aqui se rebaja la cantidad que pidio el usuario a las unidades disponibles
							}
					}else
					{
							JOptionPane.showInputDialog(null,"El codigo del producto no existe ");
						}
				}
			
			comprador=new Comprador(id,nombre,direccion);
			break;
			case 2:
			break;
			case 3:
			break;
			case 4:
			break;
			case 5:
			break;
			case 6:
			break;
			default:
			break;
			
			}//fin del switch menu
	}
}


import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {

		Session session = HibernateUtilities.getSessionFactory().openSession();

		session.beginTransaction();

		Empresa empresa = new Empresa();
		empresa.setCIF("12894-PL");
		empresa.setNombre("Burger King");
		empresa.setDireccion("Carlos Cortes, 70 bajo");
		empresa.setEmpleados(4);
		
		Pedido pedido = new Pedido();
		pedido.setId(1);
		
		Item item = new Item();
		item.setId(1);
		item.setNombre("Bacon");
		item.setCantidad(15);

		session.save(empresa);
		session.save(pedido);
		session.save(item);
		
		session.getTransaction().commit();

		session.close();
		
	}

}

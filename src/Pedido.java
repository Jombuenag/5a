import java.util.Calendar;
import java.util.Date;
import java.io.Serializable;

public class Pedido implements Serializable {

	public int id;
	public Date fecha;
	private Calendar createDate;

	public Calendar getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Calendar createDate) {
		this.createDate = createDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}

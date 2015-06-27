package entorno;


import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;
@PersistenceCapable
public class Plato {
	
	@Persistent
	private String nombre;
	@Persistent
	private String tipo;
	@Persistent
	private String criterio;
	@Persistent
	private String tipocarne;
	@Persistent
	private String precio;
	@Persistent
	private String descripcion;
	@Persistent
	private String img;
	
	public Plato(String nombre, String tipo,String criterio,String tipocarne,String precio,String descripcion, String img) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.criterio = criterio;
		this.tipocarne=tipocarne;
		this.precio=precio;
		this.descripcion=descripcion;
		this.img = img;
				
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCriterio() {
		return criterio;
	}
	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img ) {
		this.img=img;
	}
	
	
	@Override
	public String toString() {
		return nombre+tipo+criterio+descripcion+img;
	}
}

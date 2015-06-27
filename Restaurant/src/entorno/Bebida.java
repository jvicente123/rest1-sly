package entorno;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Key;
@PersistenceCapable
public class Bebida {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String nombre;
	@Persistent
	private String tipo;
	@Persistent
	private String precio;
	@Persistent
	private String descripcion;
	@Persistent
	private String img;
	
	public Bebida(String nombre, String tipo,String precio,String descripcion, String img) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
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
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Bebida [nombre=" + nombre + ", tipo=" + tipo + ", precio="
				+ precio + ", descripcion=" + descripcion + ", img=" + img
				+ "]";
	}
	

	
	
}

package entorno;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Administrador {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String nombre;
	@Persistent
	private String apellido;
	@Persistent
	private String usuario;
	@Persistent
	private String contraseña;
	
	public Administrador(String nombre, String apellido,String Usuario, String contraseña) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario= usuario;
		this.contraseña = contraseña;
				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Administrador [nombre=" + nombre + ", apellido=" + apellido
				+ ", usuario=" + usuario + ", contraseña=" + contraseña + "]";
	}
	
	
	
	

}

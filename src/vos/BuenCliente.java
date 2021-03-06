package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class BuenCliente {

	/**
	 * Numero de documento
	 */
	@JsonProperty(value="numDocumento")
	private int numDocumento;
	
	/**
	 * nombre
	 */
	@JsonProperty(value="nombre")
	private String nombre;
	
	/**
	 * email
	 */
	@JsonProperty(value="email")
	private String email;
	
	/**
	 * rol
	 */
	@JsonProperty(value="rol")
	private String rol;
	
	/**
	 * usuario
	 */
	@JsonProperty(value="usuario")
	private String usuario;
	
	@JsonProperty(value="numBoletas")
	private int numBoletas;

	public BuenCliente(	@JsonProperty(value="numDocumento")int numDocumento,@JsonProperty(value="nombre")String nombre,@JsonProperty(value="email") String email,	@JsonProperty(value="rol") String rol, 	@JsonProperty(value="usuario")String usuario,
			@JsonProperty(value="numBoletas") int numBoletas) {
		super();
		this.numDocumento = numDocumento;
		this.nombre = nombre;
		this.email = email;
		this.rol = rol;
		this.usuario = usuario;
		this.numBoletas = numBoletas;
	}

	public int getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(int numDocumento) {
		this.numDocumento = numDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getNumBoletas() {
		return numBoletas;
	}

	public void setNumBoletas(int numBoletas) {
		this.numBoletas = numBoletas;
	}
	
	
	
}

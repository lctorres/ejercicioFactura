package modelo;

public class Usuario {

	private int id;
	private String nombre;
	private String fecha;
	private String concepto;
	private String cantidad;
	private String precio;
	private String subtotal;
	private String iva;
	private String total;
	
	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Usuario(String nombre, String fecha, String concepto, String cantidad, String precio, String subtotal,
			String iva, String total) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
	}



	public Usuario(int id, String nombre, String fecha, String concepto, String cantidad, String precio,
			String subtotal, String iva, String total) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getConcepto() {
		return concepto;
	}



	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}



	public String getCantidad() {
		return cantidad;
	}



	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}



	public String getPrecio() {
		return precio;
	}



	public void setPrecio(String precio) {
		this.precio = precio;
	}



	public String getSubtotal() {
		return subtotal;
	}



	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}



	public String getIva() {
		return iva;
	}



	public void setIva(String iva) {
		this.iva = iva;
	}



	public String getTotal() {
		return total;
	}



	public void setTotal(String total) {
		this.total = total;
	}

	
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", concepto=" + concepto
				+ ", cantidad=" + cantidad + ", precio=" + precio + ", subtotal=" + subtotal + ", iva=" + iva
				+ ", total=" + total + "]";
	}

	
	
}
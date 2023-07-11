package parcial1;
import java.util.Scanner;
public class Cliente {

	private String nombre;
	private String apellido;
	private String genero;
	private int documento;
	private String email;
	private String domicilio;
	private int telefono;
	
	
	public Cliente(String nombre, String apellido, String genero, int documento, String email, String domicilio,
			int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.documento = documento;
		this.email = email;
		this.domicilio = domicilio;
		this.telefono = telefono;
	}


	public Cliente() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("Carga de Cliente");
		System.out.println("Ingresar Nombre del cliente");
		this.nombre = scanner.next();
		System.out.println("Ingresar Apellido del cliente");
		this.apellido = scanner.next();
		System.out.println("Ingresar Genero del cliente");
		this.genero = scanner.next();
		System.out.println("Ingresar Documento del cliente");
		this.documento = scanner.nextInt();
		System.out.println("Ingresar Email del cliente");
		this.email = scanner.next();
		System.out.println("Ingresar Domicilio del cliente");
		this.domicilio = scanner.next();
		System.out.println("Ingresar telefono del cliente");
		this.telefono = scanner.nextInt();
		System.out.println("-----------------------");
	}
	
	public void mostrar() {
	
		System.out.println("Nombre: "+this.nombre+(", Apellido: "+this.apellido+",Genero: "+this.genero+", Documento: "+this.documento+", Email: "+this.email+", Domicilio: "+this.domicilio+", Telefono: "+this.telefono ));
		
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


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}







}

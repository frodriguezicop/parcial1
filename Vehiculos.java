package parcial1;
import java.util.Scanner;
public class Vehiculos {

	private String marca;
	private String modelo;
	private int año;
	private int nroMotor;
	private String chasis;
	private int potenciaCv;
	private String matricula;
	
	
	public Vehiculos(String marca, String modelo, int año, int nroMotor, String chasis, int potenciaCv,
			String matricula) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.nroMotor = nroMotor;
		this.chasis = chasis;
		this.potenciaCv = potenciaCv;
		this.matricula = matricula;
	}

	
	public Vehiculos() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-----------------------");
		System.out.println("Cargo Vehiculos");
		System.out.println("Ingresar marca");
		this.marca = scanner.next();
		System.out.println("Ingresar Modelo");
		this.modelo = scanner.next();
		System.out.println("Ingresar Año");
		this.año = scanner.nextInt();
		System.out.println("Ingresar Numero de Motor");
		this.nroMotor = scanner.nextInt();
		System.out.println("Ingresar Chasis");
		this.chasis = scanner.next();
		System.out.println("Ingresar Potencia CV");
		this.potenciaCv = scanner.nextInt();
		System.out.println("Ingresar Matricula");
		this.matricula = scanner.next();
			
	}
	
	public void mostrar() {
		
		System.out.println("Marca: "+this.marca+(", Modelo: "+this.modelo+",Año : "+this.año+", Numero de Motor: "+this.nroMotor+", Chasis: "+this.chasis+", Potencia CV: "+this.potenciaCv+", Matricula: "+this.matricula ));

		
		
	}
	
	
	
	
	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public int getNroMotor() {
		return nroMotor;
	}


	public void setNroMotor(int nroMotor) {
		this.nroMotor = nroMotor;
	}


	public String getChasis() {
		return chasis;
	}


	public void setChasis(String chasis) {
		this.chasis = chasis;
	}


	public int getPotenciaCv() {
		return potenciaCv;
	}


	public void setPotenciaCv(int potenciaCv) {
		this.potenciaCv = potenciaCv;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}






}

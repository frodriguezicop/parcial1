package parcial1;
import java.util.ArrayList;
import java.util.Scanner;



public class Polizas {

	private int nroPoliza;
	private String fechaInicio;
	private String fechaFinal;
	private int cantCuotas;
	private formaDePago formaPago;
	private int montoAsegurado;
	private String incluyeGranizo;
	private int montoMaxGranizo;
	private String tipoCobertura;
	
    private ArrayList<GestionCuotas> cuotas;

	
	public enum formaDePago{Efectivo, Transferencia, Debito_Automatico};
	
	public Polizas(int nroPoliza, String fechaInicio, String fechaFinal, int cantCuotas, formaDePago formaPago,
			int montoAsegurado, String incluyeGranizo, int montoMaxGranizo, String tipoCobertura) {
		super();
		this.nroPoliza = nroPoliza;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.cantCuotas = cantCuotas;
		this.formaPago = formaPago;
		this.montoAsegurado = montoAsegurado;
		this.incluyeGranizo = incluyeGranizo;
		this.montoMaxGranizo = montoMaxGranizo;
		this.tipoCobertura = tipoCobertura;
		cuotas = new ArrayList<>();
	}



	public Polizas() {
		
		int ultimoNumeroPoliza = 1000;
		int nroPoliza;
		this.nroPoliza = ++ultimoNumeroPoliza;
		    
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("Ingreso Polizas");
		
		System.out.println("Ingresar Fecha de Inicio");
		this.fechaInicio = scanner.next();
		System.out.println("Ingresar Fecha Final");
		this.fechaFinal = scanner.next();
		System.out.println("Ingresar Cantidad De Cuotas");
		this.cantCuotas = scanner.nextInt();
		System.out.println("Ingresar Forma de Pago: 1: Efectivo, 2: Transferencia, 3: Debito Automatico");
		
		int o = scanner.nextInt();
		
		switch(o) {
		case 1:
			this.formaPago = formaPago.Efectivo;
			break;
		case 2:
			this.formaPago = formaPago.Transferencia;
			break;
		case 3:
			this.formaPago = formaPago.Debito_Automatico;
			break;
		default:
			System.out.println("Ingresar Opcion correcta");
		
		}
		
		
		
		System.out.println("Ingresar Monto asegurado");
		this.montoAsegurado = scanner.nextInt();
		System.out.println("Ingresar si Incluye Granizo, si/no");
		this.incluyeGranizo = scanner.next();
		System.out.println("Ingresar monto Maximo de Granizo");
		this.montoMaxGranizo = scanner.nextInt();
		System.out.println("Ingresar Tipo de cobertura");
		this.tipoCobertura = scanner.next();
		
		
	}
	
	
	public void mostrar() {
		
		System.out.println("Numero de Polizas: "+this.nroPoliza+(", Fecha Inicio: "+this.fechaInicio+", Fecha Final : "+this.fechaFinal+", Cantidad de cuotas: "+this.cantCuotas+", Forma de Pago: "+this.formaPago+", Monto Asegurado: "+this.montoAsegurado+", Incluye Granizo: "+this.incluyeGranizo+", Monto Maximo Granizo: "+this.montoMaxGranizo+", Tipo de cobertura: "+this.tipoCobertura ));
	
	}
	
//	
//	public void registarPagoCuotas(int nroCuotas) {
//	    GestionCuotas cuota = (nroCuotas);

		
	}
	
	
	public int getNroPoliza() {
		return nroPoliza;
	}



	public void setNroPoliza(int nroPoliza) {
		this.nroPoliza = nroPoliza;
	}



	public String getFechaInicio() {
		return fechaInicio;
	}



	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}



	public String getFechaFinal() {
		return fechaFinal;
	}



	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}



	public int getCantCuotas() {
		return cantCuotas;
	}



	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}



	public int getFormaPago() {
		return formaPago;
	}



	public void setFormaPago(int formaPago) {
		this.formaPago = formaPago;
	}



	public int getMontoAsegurado() {
		return montoAsegurado;
	}



	public void setMontoAsegurado(int montoAsegurado) {
		this.montoAsegurado = montoAsegurado;
	}



	public String getIncluyeGranizo() {
		return incluyeGranizo;
	}



	public void setIncluyeGranizo(String incluyeGranizo) {
		this.incluyeGranizo = incluyeGranizo;
	}



	public int getMontoMaxGranizo() {
		return montoMaxGranizo;
	}



	public void setMontoMaxGranizo(int montoMaxGranizo) {
		this.montoMaxGranizo = montoMaxGranizo;
	}



	public String getTipoCobertura() {
		return tipoCobertura;
	}



	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}
	

	
	
	
	
	
	
	
}

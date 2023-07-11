package parcial1;
import java.util.Scanner;
public class GestionCuotas {

	private int nroCuota;
	private int montoTotal;
	private String infoPagada;
	private String fecha_vencimiento;
	private String formaPago;
	
	public GestionCuotas(int nroCuota, int montoTotal, String infoPagada, String fecha_vencimiento, String formaPago) {
		super();
		this.nroCuota = nroCuota;
		this.montoTotal = montoTotal;
		this.infoPagada = infoPagada;
		this.fecha_vencimiento = fecha_vencimiento;
		this.formaPago = formaPago;
	}

	public GestionCuotas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------");
		System.out.println("Gestion de Cuotas");
		System.out.println("Ingresar Numero de Cuota");
		this.nroCuota = scanner.nextInt();
		System.out.println("Ingresar Monto Ttoal");
		this.montoTotal = scanner.nextInt();
		System.out.println("Ingresar Si esta pagada o No");
		this.infoPagada = scanner.next();
		System.out.println("Ingresar Fecha de Vencimiento");
		this.fecha_vencimiento = scanner.next();
		System.out.println("Ingresar Forma de Pago");
		this.formaPago = scanner.next();


		
	}
	
	
	public void mostrar() {
		
		System.out.println("Numero de cuota: "+this.nroCuota+(", Monto total: "+this.montoTotal+", Esta pagada : "+this.infoPagada+", Fecha de Vencimiento: "+this.fecha_vencimiento+", Forma de Pago: "+this.formaPago));
	
		
		
		
	}
	
	

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public int getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(int montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getInfoPagada() {
		return infoPagada;
	}

	public void setInfoPagada(String infoPagada) {
		this.infoPagada = infoPagada;
	}

	public String getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

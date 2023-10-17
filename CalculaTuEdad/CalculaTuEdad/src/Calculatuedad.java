import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Calculatuedad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = teclado.nextLine(); 
		
		System.out.print("Número día nacimiento: ");
		int dia = teclado.nextInt();
		System.out.print("Numero mes nacimiento: ");
		int mes = teclado.nextInt();
		System.out.print("Año nacimiento: ");
		int anio = teclado.nextInt();
		teclado.close();
 
		System.out.println("\nTu edad es: " + calcularEdad(dia, mes, anio)  + "" +  ""+ nombre);
 
	}
 
	static int calcularEdad(int dia, int mes, int anio) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
 
		Period periodo = Period.between(fechaNacimiento, fechaHoy);
 
		return periodo.getYears();
	}
 

	
	
	
	
	
	
	}



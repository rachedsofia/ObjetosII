package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TiempoNoAnemico {
	private LocalDate fecha;

	public TiempoNoAnemico() {
		this.fecha = LocalDate.now();
	}

	public void verFechaCorta() {
		System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(fecha));
	}

	public void verFechaCompleta() {
		System.out.println(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(fecha) + "\n");
	}

}

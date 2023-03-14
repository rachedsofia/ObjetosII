package Modelo;

import java.time.LocalDate;

public class TiempoAnemico {
	private LocalDate fecha;

	public TiempoAnemico(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate myLocalDate) {
		this.fecha = myLocalDate;
	}


}

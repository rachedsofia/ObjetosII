package Modelo;

import java.time.LocalDate;

public class TiempoAnemico {
	private LocalDate fecha;

	public TiempoAnemico(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getMyDate() {
		return fecha;
	}

	public void setMyDate(LocalDate myLocalDate) {
		this.fecha = myLocalDate;
	}


}

package Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Modelo.TiempoAnemico;
import Modelo.TiempoNoAnemico;
import Modelo.TiempoRecord;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("****Anemica****");
				TiempoAnemico miTiempoAnemico = new TiempoAnemico(LocalDate.now());

				System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(miTiempoAnemico.getFecha()));
				System.out.println(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(miTiempoAnemico.getFecha()));
				
				System.out.println("\n****No Anemica****");

				TiempoNoAnemico miTiempoNoAnemico = new TiempoNoAnemico();

				miTiempoNoAnemico.verFechaCorta();
				miTiempoNoAnemico.verFechaCompleta();

		
				System.out.println("\n****Records ****");

				TiempoRecord miTiempoRecord = new TiempoRecord(LocalDate.now());

				System.out.println(DateTimeFormatter.ofPattern("dd-MM-yyyy").format(miTiempoRecord.fecha()));

				System.out.println(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy ").format(miTiempoRecord.fecha()));

			}
	}


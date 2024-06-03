package ar.unrn.tp4.ejercicio1.main;

import ar.unrn.tp4.ejercicio1.db.RegistroDeParticipantesJDBC;
import ar.unrn.tp4.ejercicio1.dominio.DefaultSistemaDeParticipantes;
import ar.unrn.tp4.ejercicio1.dominio.ServicioExterno;
import ar.unrn.tp4.ejercicio1.dominio.SistemaDeParticipantes;
import ar.unrn.tp4.ejercicio1.gui.VentanaAgregarParticipante;

public class Main {
	public static void main(String[] args) {
		ServicioExterno servicio = new RegistroDeParticipantesJDBC("jdbc:mariadb://raspberrypi.local", "pruebas", "pruebas0");
		SistemaDeParticipantes sistema = new DefaultSistemaDeParticipantes(servicio);
		new VentanaAgregarParticipante(sistema);
	}
}

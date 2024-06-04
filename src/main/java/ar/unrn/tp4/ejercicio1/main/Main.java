package ar.unrn.tp4.ejercicio1.main;

import ar.unrn.tp4.ejercicio1.db.RegistroDeParticipantesJDBC;
import ar.unrn.tp4.ejercicio1.dominio.DefaultSistemaDeParticipantes;
import ar.unrn.tp4.ejercicio1.dominio.ServicioExterno;
import ar.unrn.tp4.ejercicio1.dominio.SistemaDeParticipantes;
import ar.unrn.tp4.ejercicio1.gui.VentanaAgregarParticipante;

import java.io.IOException;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws IOException {
		// Carga propiedades desde un archivo
		Properties prop = new Properties();
		prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));

		String url = prop.getProperty("jdbc.url");
		String user = prop.getProperty("jdbc.user"), password = prop.getProperty("jdbc.password");

		ServicioExterno servicio = new RegistroDeParticipantesJDBC(url, user, password);
		SistemaDeParticipantes sistema = new DefaultSistemaDeParticipantes(servicio);
		new VentanaAgregarParticipante(sistema);
	}
}

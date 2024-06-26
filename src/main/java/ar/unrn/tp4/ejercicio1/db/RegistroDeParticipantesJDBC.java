package ar.unrn.tp4.ejercicio1.db;

import ar.unrn.tp4.ejercicio1.dominio.Participante;
import ar.unrn.tp4.ejercicio1.dominio.ServicioExterno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroDeParticipantesJDBC implements ServicioExterno {

	private Connection dbConn;

	public RegistroDeParticipantesJDBC(String url, String user, String password) {
		try {
			this.dbConn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException("Falló al establecer conexión", e);
		}
	}

	@Override
	public void registrarParticipante(Participante participante) {
		try (PreparedStatement st = dbConn.prepareStatement("insert into participantes(nombre, telefono, region) values(?,?,?)");) {
			st.setString(1, participante.nombre().toString());
			st.setString(2, participante.telefono().toString());
			st.setString(3, participante.region().mostrar());
			st.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}

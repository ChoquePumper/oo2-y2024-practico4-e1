package ar.unrn.tp4.ejercicio1.dominio;

import ar.unrn.tp4.ejercicio1.observer.Observable;

import java.util.Map;

public class DefaultSistemaDeParticipantes extends Observable implements SistemaDeParticipantes {

	private ServicioExterno servicio;

	public DefaultSistemaDeParticipantes(ServicioExterno servicio) {
		this.servicio = servicio;
	}

	@Override
	public void agregarParticipante(String nombre, String telefono, String region) {
		servicio.registrarParticipante(new Participante(nombre, telefono, region));

		Map<String, Object> map = Map.of("nombre",nombre, "telefono",telefono, "region",region);
		notificarNuevoRegistro(map);
	}

}

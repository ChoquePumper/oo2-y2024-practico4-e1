package ar.unrn.tp4.ejercicio1.dominio;

public class DefaultSistemaDeParticipantes implements SistemaDeParticipantes {

	private ServicioExterno servicio;

	public DefaultSistemaDeParticipantes(ServicioExterno servicio) {
		this.servicio = servicio;
	}

	@Override
	public void agregarParticipante(String nombre, String telefono, String region) {
		servicio.registrarParticipante(new Participante(nombre, telefono, region));
	}

}

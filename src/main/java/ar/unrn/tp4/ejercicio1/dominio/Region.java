package ar.unrn.tp4.ejercicio1.dominio;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Region {
	CHINA("China"),
	US("US"),
	EUROPA("Europa"),
	;

	/**
	 * Obtiene un objeto Región por el nombre en lugar del nombre interno.
	 *
	 * @param nombre
	 * @return el objeto
	 * @throws IllegalArgumentException si no se encuentra.
	 */
	static Region getPorNombre(String nombre) {
		Map<String, Region> mapa = Stream.of(Region.values())
				.collect(Collectors.toMap((r) -> r.nombre, (r) -> r));
		Region region = mapa.get(nombre);
		if (region == null)
			throw new IllegalArgumentException(
					"Region desconocida. Las conocidas son: "
							+ String.join(", ", mapa.keySet()));
		return region;
	}

	private final String nombre;

	Region(String nombre) {
		this.nombre = nombre;
	}

	public String mostrar() {
		return nombre;
	}
}

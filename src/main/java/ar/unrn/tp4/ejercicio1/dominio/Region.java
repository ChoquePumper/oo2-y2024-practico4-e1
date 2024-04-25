package ar.unrn.tp4.ejercicio1.dominio;

public enum Region {
	CHINA("China"),
	US("US"),
	EUROPA("Europa"),
	;

	private final String nombre;

	Region(String nombre) {
		this.nombre = nombre;
	}

	public String mostrar() {
		return nombre;
	}
}

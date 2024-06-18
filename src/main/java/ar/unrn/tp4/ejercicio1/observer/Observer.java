package ar.unrn.tp4.ejercicio1.observer;

import java.util.Map;

public interface Observer {
	void avisarNuevoRegistro(Map<String, Object> params);
}

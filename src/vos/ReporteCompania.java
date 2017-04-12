package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class ReporteCompania {
	
	@JsonProperty(value="idCompania")
	private int idCompania;
	
	@JsonProperty(value="asistenciaTotal")
	private int asistenciaTotal;
	
	@JsonProperty(value="asistenciaClientes")
	private int asistenciaClientes;
	
	@JsonProperty(value="dineroGeneradoTaquilla")
	private int dineroGeneradoTaquilla;

	public ReporteCompania(
			@JsonProperty(value="idCompania")int idCompania,
			@JsonProperty(value="asistenciaTotal")int asistenciaTotal,
			@JsonProperty(value="asistenciaClientes")int asistenciaClientes,
			@JsonProperty(value="dineroGeneradoTaquilla")int dineroGeneradoTaquilla)
	{
		super();
		this.idCompania = idCompania;
		this.asistenciaTotal = asistenciaTotal;
		this.asistenciaClientes = asistenciaClientes;
		this.dineroGeneradoTaquilla = dineroGeneradoTaquilla;
	}
}

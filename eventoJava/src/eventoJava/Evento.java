package eventoJava;

import java.time.LocalDate;

public class Evento {
	private String nomeEvento; 
	private String dataEvento; 
	private Integer duracaoEvento; 
	
	public Evento () {	}
	
	public Evento (String nome, String dataEvento, Integer duracaoEvento) {
		this.nomeEvento = nome; 
		this.dataEvento = dataEvento; 
		this.duracaoEvento = duracaoEvento; 
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public Integer getDuracaoEvento() {
		return duracaoEvento;
	}

	public void setDuracaoEvento(Integer duracaoEvento) {
		this.duracaoEvento = duracaoEvento;
	}
	
	

}

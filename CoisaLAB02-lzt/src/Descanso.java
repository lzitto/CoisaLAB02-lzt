

/**
 * Classe para controlar a rotina de descanso do aluno.
 * 
 * @author David Leonam Silva Holanda
 */
public class Descanso {
	
	/**
	 * Atributo que representa o número de horas de descanso.
	 */
	private int horasDescanso;
	
	/**
	 * Atributo que representa o número de semanas.
	 */
	private int numSemanas;
	
	public Descanso() {
		this.horasDescanso = 0;
		this.numSemanas = 0;
	}
	
	/**
     * Define a quantidade de horas de descanso semanal.
     * 
     * @param valor Quantidade de horas de descanso.
     */
	public void defineHorasDescanso(int valor) {
		this.horasDescanso = valor;
	}

	 /**
     * Define o número de semanas de descanso.
     * 
     * @param valor Número de semanas.
     */
	public void defineNumeroSemanas(int valor) {
		this.numSemanas = valor;
	}
	
	/**
     * Obtém o status geral da rotina de descanso.
     * 
     * @return String representando o status geral.
     */
	public String getStatusGeral() {
		if (this.horasDescanso == 0 || this.numSemanas == 0) {
			return "cansado";
		}
		
		int totalHoras = this.horasDescanso;
		if (totalHoras >=  (26 * this.numSemanas)) {
			return "descansado";
		} else {
			return "cansado";
		}
	}
}

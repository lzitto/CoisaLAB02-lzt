
/**
 * Classe para controlar o registro de tempo online dedicado a disciplinas.
 *
 * @author David Leonam Silva Holanda
 */
public class RegistroTempoOnline {
	
	private String nomeDisciplina;
	private int tempoOnlineUsado;
	private int tempoOnlineEsperado;
	
	/**
     * Construtor para disciplinas com tempo online esperado padrão.
     * 
     * @param nomeDisciplina Nome da disciplina.
     */
	public RegistroTempoOnline(String nomeDisciplina) {
		this(nomeDisciplina, 120); 
	}
	
	/**
     * Construtor para disciplinas com tempo online esperado personalizado.
     * 
     * @param nomeDisciplina Nome da disciplina.
     * @param tempoEsperado  Tempo online esperado.
     */
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineUsado = 0;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}

	 /**
     * Adiciona tempo online dedicado à disciplina.
     * 
     * @param tempo Tempo online a ser adicionado.
     */
	public void adicionaTempoOnline(int tempo) {
		this.tempoOnlineUsado += tempo;
	}
	
	/**
     * Verifica se a meta de tempo online foi atingida para a disciplina.
     * 
     * @return true se a meta foi atingida, false caso contrário.
     */	
	public boolean atingiuMetaTempoOnline() {
		return this.tempoOnlineUsado >= tempoOnlineEsperado;
	}
	
	/**
     * Gera uma representação em string do registro de tempo online.
     * 
     * @return String formatada representando o registro.
     */
	public String toString() {
		return this.nomeDisciplina + " " + this.tempoOnlineUsado + "/" + tempoOnlineEsperado; 
	}
	
}

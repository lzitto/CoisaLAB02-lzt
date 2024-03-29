

import java.util.Arrays;

/**
 * Classe para representar uma disciplina e suas atividades associadas.
 *
 * @author David Leonam Silva Holanda
 */
public class Disciplina {

	private String nomeDisciplina;
	private double[] notas;
	private int[] pesos;
	private int horasEstudo;
	
	/**
     * Construtor da classe Disciplina.
     * 
     * @param nomeDisciplina Nome da disciplina.
     */
	public Disciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[4];
		this.pesos = new int[] {1,1,1,1};
	}
	
	/**
     * Construtor da classe Disciplina com número específico de notas.
     * 
     * @param nomeDisciplina Nome da disciplina.
     * @param numeroDeNotas  Número de notas a serem cadastradas.
     */
	public Disciplina(String nomeDisciplina, int numeroDeNotas) {
		this.nomeDisciplina = nomeDisciplina;
		this.notas = new double[numeroDeNotas];
		this.pesos = new int[] {1,1,1,1};
		
	}
	
	/**
     * Cadastra horas de estudo para a disciplina.
     * 
     * @param horas Horas a serem cadastradas.
     */
	public void cadastraHoras(int horas) {
		this.horasEstudo += horas;
	}
	
	/**
     * Cadastra uma nota para a disciplina.
     * 
     * @param nota  Número da nota (1 a 4).
     * @param valor Valor da nota.
     */
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota -1] = valorNota;
	}
	
	/**
     * Verifica se o aluno foi aprovado na disciplina.
     * 
     * @return true se aprovado, false caso contrário.
     */
	public boolean aprovado() {
		return this.calcularMedia() >= 7;
	}
	
	/**
     * Gera uma representação em string da disciplina.
     * 
     * @return String formatada representando a disciplina.
     */
    @Override
	public String toString() {
		return this.nomeDisciplina 
		+ " " 
		+ this.horasEstudo 
		+ " " 
		+ this.calcularMedia() 
		+ " " 
		+ Arrays.toString(this.notas);
	}
	
	/**
     * Calcula a média das notas da disciplina.
     * 
     * @return Média das notas.
     */
	private double calcularMedia() {
		double media = 0;
		int count = 0;
		for (int i = 0; i < 4; i++) {
			count += this.notas[i] * this.pesos[i];	
		}
		media = count / Arrays.stream(this.pesos).sum();
		return media;
	}	
}

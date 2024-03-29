

import  java.util.ArrayList;

/**
 * Classe para controlar resumos de estudos.
 *
 * @author David Leonam Silva Holanda
 */
public class RegistroResumos {
    private ArrayList<String> resumosList;
    private ArrayList<String> temasList;
    private int numResumos;
    private int count;
    
    /**
     * Construtor da classe RegistroResumos.
     * 
     * @param numeroDeResumos Número máximo de resumos que podem ser armazenados.
     */   
    public RegistroResumos(int numeroDeResumos) {
        this.numResumos = numeroDeResumos;
        this.resumosList = new ArrayList<>();
        this.temasList = new ArrayList<>();
        this.count = 0;
    }
    
    /**
     * Adiciona um resumo ao registro.
     * 
     * @param tema   Tema do resumo.
     * @param resumo Texto do resumo.
     */  
    public void adiciona(String tema, String resumo) {
        this.temasList.add(tema);
        String novoResumo = tema + ": " + resumo;
        if (count < numResumos) {
            this.resumosList.add(count, novoResumo);
            count++;
        } else {
            this.count = 0;
            this.resumosList.set(count, novoResumo);
            count++;
        }
    }
    
    /**
     * Retorna os resumos armazenados.
     * 
     * @return Array de strings contendo os resumos.
     */   
    public String[] pegaResumos() {
        return this.resumosList.toArray(new String[this.resumosList.size()]);
    }
    
    /**
     * Retorna o número de resumos cadastrados.
     * 
     * @return Número de resumos cadastrados.
     */    
    public int conta() {
        return count;
    }
    
    /**
     * Gera uma representação em string dos resumos cadastrados.
     * 
     * @return String formatada com os resumos.
     */
    public String imprimeResumos() {
        StringBuilder toPrint = new StringBuilder("- ");
        toPrint.append(this.conta()).append(" resumo(s) cadastrado(s)").append(System.lineSeparator()).append("- ");
        for (int i = 0; i < this.conta(); i++) {
            toPrint.append(this.temasList.get(i)).append(" | ");
        }

        return toPrint.substring(0, toPrint.length() - 3);
    }
    
    
    /**
     * Verifica se um resumo com um determinado tema está cadastrado.
     * 
     * @param tema Tema a ser verificado.
     * @return true se o resumo com o tema estiver cadastrado, false caso contrário.
     */
    public boolean temResumo(String tema) {
        return temasList.contains(tema);
    }
}

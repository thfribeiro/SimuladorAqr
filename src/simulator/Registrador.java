package simulator;

import java.util.HashMap;
import java.util.Map;

public class Registrador {

    String nome;
    Memoria memoria;
    Map<Integer, Integer> celula;

    public Registrador(String nome, Memoria memoria) {
        celula = new HashMap();
        celula.put(0, null);
        this.nome = nome;
        this.memoria = memoria;
    }

 

    public void load(int endMemoria) {
        if (memoria.ver(endMemoria) != null) {
            celula.replace(0, memoria.ver(endMemoria));
        } else {
            celula.replace(0, endMemoria);
        }
    }

        public void load2(int valor) {
            celula.replace(0, valor);
    }

    public Integer ver() {
        return (celula.get(0));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Integer, Integer> getCelula() {
        return celula;
    }

    public void setCelula(Map<Integer, Integer> celula) {
        this.celula = celula;
    }
    
}

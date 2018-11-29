package simulator;

import java.util.HashMap;
import java.util.Map;

public class RegistradorFloat {

    String nome;
    Memoria memoria;
    Map<Integer, Double> celula;

    public RegistradorFloat(String nome, Memoria memoria) {
        celula = new HashMap();
        celula.put(0, null);
        this.nome = nome;
        this.memoria = memoria;
    }

 

    public void load(int endMemoria) {
        if (memoria.ver(endMemoria) != null) {
            Double d = memoria.ver(endMemoria).doubleValue();
            celula.replace(0, d);
        }
    }

        public void load2(Double valor) {
            celula.replace(0, valor);
    }


    public Double ver() {
        return (celula.get(0));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Integer, Double> getCelula() {
        return celula;
    }

    public void setCelula(Map<Integer, Double> celula) {
        this.celula = celula;
    }
    
}

package simulator;

public class UC {

    private String instrucao;
    private ULA ula;
    private Memoria memoria;

    public UC(Memoria memoria) {
        this.ula = new ULA();
        this.instrucao = "";
        this.memoria = memoria;
    }

    public void interpretador(String instrucao, Registrador r1, Registrador r2, Registrador r3) {
        if (instrucao.equals("add")) {
            r1.load2(ula.add(r2, r3));
        }
        if (instrucao.equals("sub")) {
            r1.load2(ula.sub(r2, r3));
        }
        if (instrucao.equals("mult")) {
            r1.load2(ula.mult(r2, r3));
        }
    }

    public void interpretador(String instrucao, Registrador r1, int endMemoria) {
        if (instrucao.equals("load")) {
            r1.load(endMemoria);
        }
        else if (instrucao.equals("store")) {
            memoria.store(endMemoria ,r1.ver());
        }
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

}

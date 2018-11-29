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
        if (instrucao.equals("div")) {
            r1.load2(ula.div(r2, r3));
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
    
    
        public void interpretadorPipeline(String instrucao, Registrador r1, Registrador r2, Registrador r3, String instrucao2, Registrador r4, Registrador r5, Registrador r6) {
        if (instrucao.equals("add")) {
            r1.load2(ula.add(r2, r3));
        }
        if (instrucao.equals("sub")) {
            r1.load2(ula.sub(r2, r3));
        }
        if (instrucao.equals("mult")) {
            r1.load2(ula.mult(r2, r3));
        }
        if (instrucao.equals("div")) {
            r1.load2(ula.div(r2, r3));
        }
        if (instrucao2.equals("add")) {
            r4.load2(ula.add(r5, r6));
        }
        if (instrucao2.equals("sub")) {
            r4.load2(ula.sub(r5, r6));
        }
        if (instrucao2.equals("mult")) {
            r4.load2(ula.mult(r5, r6));
        }
        if (instrucao2.equals("div")) {
            r4.load2(ula.div(r5, r6));
        }
    }

    public void interpretadorPipeline(String instrucao, Registrador r1, int endMemoria, String instrucao2, Registrador r2, int endMemoria2) {
        if (instrucao.equals("load")) {
            r1.load(endMemoria);
        }
        else if (instrucao.equals("store")) {
            memoria.store(endMemoria ,r1.ver());
        }
        if (instrucao2.equals("load")) {
            r2.load(endMemoria2);
        }
        else if (instrucao2.equals("store")) {
            memoria.store(endMemoria2 ,r2.ver());
        }
    }
    

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }

}

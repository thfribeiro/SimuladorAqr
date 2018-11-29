package simulator;

public class ULA {

    private String instrucao;

    public ULA() {
        instrucao = "";
    }

    public int add(Registrador r1, Registrador r2) {
        int resultado;
        resultado = r1.ver() + r2.ver();
        return resultado;
    }

    public int sub(Registrador r1, Registrador r2) {
        return (r1.ver() - r2.ver());
    }

    public int mult(Registrador r1, Registrador r2) {
        return (r1.ver() * r2.ver());
    }

    public int div(Registrador r1, Registrador r2) {
        return (r1.ver() / r2.ver());
    }

    public String getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(String instrucao) {
        this.instrucao = instrucao;
    }
}

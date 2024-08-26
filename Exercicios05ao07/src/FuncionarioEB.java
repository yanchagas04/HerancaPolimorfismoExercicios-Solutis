public class FuncionarioEB extends Funcionario {
    private String escolaEB;

    public FuncionarioEB(String nome, String codigoFuncional, String escolaEB) {
        super(nome, codigoFuncional);
        this.escolaEB = escolaEB;
        setRenda(getRenda() * 1.1);
    }

    public String getEscola() {
        return escolaEB;
    }

    public void setEscola(String escolaEB) {
        this.escolaEB = escolaEB;
    }

    
}

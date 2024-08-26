public class FuncionarioEB extends Funcionario {
    private String escolaEB;

    public FuncionarioEB(String nome, String codigoFuncional, String escolaEB, Comissao comissao) {
        super(nome, codigoFuncional, comissao);
        this.escolaEB = escolaEB;
        setRenda(getRenda() * 1.1);
    }

    public FuncionarioEB(String nome, String codigoFuncional, String escolaEB) {
        super(nome, codigoFuncional);
        this.escolaEB = escolaEB;
        setRenda(getRenda() * 1.1);
    }

    public String getEscolaEB() {
        return escolaEB;
    }

    public void setEscolaEB(String escolaEB) {
        this.escolaEB = escolaEB;
    }

    
}

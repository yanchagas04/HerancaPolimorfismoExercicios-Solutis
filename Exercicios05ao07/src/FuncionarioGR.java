public class FuncionarioGR extends FuncionarioEM {
    private String universidade;

    public FuncionarioGR(String nome, String codigoFuncional, String escolaEB, String escolaEM, String universidade) {
        super(nome, codigoFuncional, escolaEB, escolaEM);
        this.universidade = universidade;
        setRenda(getRenda() * 2);
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    
}

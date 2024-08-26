public class FuncionarioEM extends FuncionarioEB {
    private String escolaEM;

    public FuncionarioEM(String nome, String codigoFuncional, String escolaEB, String escolaEM) {
        super(nome, codigoFuncional, escolaEB);
        this.escolaEM = escolaEM;
        setRenda(getRenda() * 1.5);
    }

    public String getEscolaEM() {
        return escolaEM;
    }

    public void setEscolaEM(String escolaEM) {
        this.escolaEM = escolaEM;
    }

    
}

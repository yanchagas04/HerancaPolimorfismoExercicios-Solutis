public class Ex10Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];
        for (int i = 0; i < 10; i++){
            if (i < 4){
                funcionarios[i] = new FuncionarioEB("Funcionário EB " + i, "" + i, "Escola EB " + i);
            } else if (i < 8){
                funcionarios[i] = new FuncionarioEM("Funcionário EM " + i, "" + i, "Escola EB " + i, "Escola EM " + i);
            } else {
                funcionarios[i] = new FuncionarioGR("Funcionário GR " + i, "" + i, "Escola EB " + i, "Escola EM " + i, "Universidade " + i);
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i < 7){
                funcionarios[i].setComissao(Comissao.Vendedor);
            } else if (i < 9){
                funcionarios[i].setComissao(Comissao.Supervisor);
            } else {
                funcionarios[i].setComissao(Comissao.Gerente);
            }
        }
        double custosSalariosTotais = 0, custosSalariosEB = 0, custosSalariosEM = 0, custosSalariosGR = 0;
        for (Funcionario f : funcionarios){
            custosSalariosTotais += f.rendaTotal();
            if (f instanceof FuncionarioGR){
                custosSalariosGR += f.rendaTotal();
            } else if (f instanceof FuncionarioEM){
                custosSalariosEM += f.rendaTotal();
            } else {
                custosSalariosEB += f.rendaTotal();
            }
        }
        System.out.println("Custos totais: R$" + custosSalariosTotais);
        System.out.println("Custos salários Educação Básica: R$" + custosSalariosEB);
        System.out.println("Custos salários Ensino Médio: R$" + custosSalariosEM);
        System.out.println("Custos salários Graduação: R$" + custosSalariosGR);
    }
}

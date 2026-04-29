public class Funcionario_comum extends Funcionario{

    public Funcionario_comum(String nome, String cpf, double salarioBase){
        super(nome , cpf, salarioBase);
}
    @Override
    public double calcularSalario(){
    return getSalarioBase();
    }

    @Override
    public String getTipoFuncionario(){
    return "Funcionario Comum";
    }
}

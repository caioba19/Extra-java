public class Gerente extends Funcionario{
    private static final double BONUS_GERENTE = 0.20;

    public Gerente(String nome , String cpf , double salarioBase){
        super(nome , cpf , salarioBase);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() * (1 + BONUS_GERENTE);
    }

    @Override
    public String getTipoFuncionario(){
        return "Gerente";
    }
}

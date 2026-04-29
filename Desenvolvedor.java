public class Desenvolvedor extends Funcionario{

    private int numeroProjetos;

    private static final double BONUS_MINIMO = 0.10;
    private static final double BONUS_MAXIMO = 0.20;
    private static final int PROJETOS_MiNIMO = 1;
    private static final int PROJETOS_MAXIMO = 10;

    public Desenvolvedor(String nome, String cpf, double salarioBase, int numeroProjetos) {
        super(nome, cpf, salarioBase);
        this.numeroProjetos = numeroProjetos;
    }

    public int getNumeroProjetos() {
        return numeroProjetos;
    }

    public void setNumeroProjetos(int numeroProjetos) {
        if (numeroProjetos >= 0) {
            this.numeroProjetos = numeroProjetos;
        } else {
            System.out.println("Erro : numero de proeto deve ser não negativo!");
        }
    }

    @Override
    public double calcularSalario(){
        double percentualBonus = calcularPercentualBonus();
        return getSalarioBase() *(1 + percentualBonus);
    }

    private double calcularPercentualBonus(){
        if (numeroProjetos <= 0) {
            return BONUS_MINIMO;
        }else if(numeroProjetos >= PROJETOS_MAXIMO){
            return BONUS_MAXIMO;
        }else{
            double taxa = (double) (numeroProjetos - 1) / (PROJETOS_MAXIMO - 1);
            return BONUS_MINIMO + taxa * (BONUS_MAXIMO - BONUS_MINIMO) * taxa;
        }
    }
    @Override
    public String getTipoFuncionario(){
        return "Desenvolvedor";
    }
}

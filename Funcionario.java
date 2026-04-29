public abstract class Funcionario  {

    private String nome;
    private String cpf;
    private double salarioBase;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setsalarioBase(double salarioBase) {
        if (salarioBase > 0){
            this.salarioBase = salarioBase;
    }else{
        System.out.println("Salario base deve ser maior que 0");
    }
}
    public abstract double calcularSalario();

    public abstract String getTipoFuncionario();
}

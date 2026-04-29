import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario_comum("João Silva", "123.456.789-00", 3000.00));

        funcionarios.add(new Gerente("Maria Santos", "987.654.321-00", 5000.00));

        funcionarios.add(new Desenvolvedor("Pedro Oliveira", "456.789.123-00", 4000.00, 5));
        funcionarios.add(new Desenvolvedor("Ana Costa", "789.123.456-00", 4500.00, 10));


        System.out.println("╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║         SISTEMA DE CÁLCULO DE SALÁRIOS DE FUNCIONÁRIOS          ║");
        System.out.println("╚════════════════════════════════════════════════════════════════╝\n");

        System.out.printf("%-25s | %-20s | %-15s | %-15s%n",
                "Nome", "Tipo", "Salário Base", "Salário Final");
        System.out.println("─".repeat(80));

        double totalSalarios = 0;

        for (Funcionario f : funcionarios) {
            double salarioFinal = f.calcularSalario();
            totalSalarios += salarioFinal;

            System.out.printf("%-25s | %-20s | R$ %,-10.2f | R$ %,-10.2f%n",
                    f.getNome(),
                    f.getTipoFuncionario(),
                    f.getSalarioBase(),
                    salarioFinal);

            if (f instanceof Desenvolvedor) {
                Desenvolvedor dev = (Desenvolvedor) f;
                System.out.printf("  └─ Número de projetos: %d%n", dev.getNumeroProjetos());
            }
        }

        System.out.println("─".repeat(80));
        System.out.printf("%-25s | %-20s | %-15s | R$ %,-10.2f%n",
                "", "", "TOTAL:", totalSalarios);
        System.out.println("╚" + "═".repeat(78) + "╝\n");

        System.out.println("Exemplo de uso dos setters:");
        System.out.println("Atualizando salário base de João Silva de R$ 3000.00 para R$ 3500.00");
        funcionarios.get(0).setsalarioBase(3500.00);
        System.out.printf("Novo salário de João Silva: R$ %.2f%n",
                funcionarios.get(0).calcularSalario());
    }

}

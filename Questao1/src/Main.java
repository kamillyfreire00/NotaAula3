import java.time.LocalDate;
import java.time.Period;

// Classe base Funcionario
class Funcionario {
    protected String nome;
    protected LocalDate nasc;
    protected double salario;

    // Construtor
    public Funcionario(String nome, LocalDate nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    // Método para informar o salário
    public void informarSalario() {
        System.out.println("Salário: R$" + salario);
    }

    // Método para calcular a idade
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(nasc, hoje).getYears();
    }
}

// Classe derivada Gerente
class Gerente extends Funcionario {
    private String projeto;

    // Construtor
    public Gerente(String nome, LocalDate nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    // Método para informar o projeto
    public void informarProjeto() {
        System.out.println("Projeto: " + projeto);
    }
}

// Classe derivada Programador
class Programador extends Funcionario {
    private String linguagem;

    // Construtor
    public Programador(String nome, LocalDate nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    // Método para informar a linguagem de programação
    public void informarLinguagem() {
        System.out.println("Linguagem de Programação: " + linguagem);
    }
}

// Classe principal para teste
public class Main {
    public static void main(String[] args) {
        // Exemplo de Gerente
        Gerente gerente = new Gerente("Kamilly Freire", LocalDate.of(2005, 12, 29), 8000.0, "Projeto X");
        System.out.println("Dados do Gerente:");
        System.out.println("Nome: " + gerente.nome);
        System.out.println("Idade: " + gerente.calcularIdade() + " anos");
        gerente.informarSalario();
        gerente.informarProjeto();

        System.out.println();

        // Exemplo de Programador
        Programador programador = new Programador("João Pereira", LocalDate.of(1995, 8, 22), 4500.0, "Java");
        System.out.println("Dados do Programador:");
        System.out.println("Nome: " + programador.nome);
        System.out.println("Idade: " + programador.calcularIdade() + " anos");
        programador.informarSalario();
        programador.informarLinguagem();
    }
}

public class Trabalhador {
    private String nome;
    private int idade;
    private double valorHora;
    private int horasTrabalhadas;
    private boolean ferias;

    public Trabalhador(String nome, int idade, double valorHora, int horasTrabalhadas, boolean ferias){
        this.nome = nome;
        this.idade = idade;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.ferias = ferias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public boolean isFerias() {
        return ferias;
    }

    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }

    public void ferias(){
        if(!ferias) {
            System.out.println("Retornar ao trabalho.");
        }
        else {
            System.out.println("Férias!");
        }
    }
    public double calcularPagamento(){
        double totalPagamento = 0;
       for (Trabalhador nome : nomes) {
           double pagamentoFuncionario = nome.getHorasTrabalhadas() * nome.getValorHora();
           totalPagamento += pagamentoFuncionario;
       }
       return totalPagamento;
     }
    
}

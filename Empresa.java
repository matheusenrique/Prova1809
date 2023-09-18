public class Empresa {
    private String nome, ceo, endereco, cnpj;
    private Trabalhador[] trabalhadores =  new Trabalhador[20];
    private int numFuncionarios;
    

    public Empresa(String nome, String cnpj, String endereco, String ceo,int[] trabalhadores, int numFuncionarios){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.ceo = ceo;
        this.trabalhadores = new Trabalhador[20];
        this.numFuncionarios = numFuncionarios;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCeo() {
        return ceo;
    }


    public void setCeo(String ceo) {
        this.ceo = ceo;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    


    public int getNumFuncionarios() {
        return numFuncionarios;
    }


    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public void contratar(int[] trabalhadores){
        for (int i = 0; i <= trabalhadores.length-1; i++){
            if(trabalhadores[i] == null){
                trabalhadores[i] = trabalhadores;
        
    }
    }


    public void trabalhar(){
        
    }


    public Trabalhador[] getTrabalhadores() {
        return trabalhadores;
    }


    public void setTrabalhadores(Trabalhador[] trabalhadores) {
        this.trabalhadores = trabalhadores;
    }
    
    
    
    


} }

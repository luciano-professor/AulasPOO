package excecao;

public class Pessoa {
    
    private String nome;
    
    public Pessoa(String nome) throws ParametroVazioException{
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws ParametroVazioException {
        
        if(nome.isEmpty()){
            
            //Lançar a exceção para avisar ao resto do programa
            //que ocorreu uma situação inesperada
            //(exceção)
            throw new ParametroVazioException("Nome vazio!");
        }
        
        this.nome = nome;
    }
    
    
    
}

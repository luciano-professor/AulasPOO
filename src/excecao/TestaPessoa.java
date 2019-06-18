package excecao;

public class TestaPessoa {
    
    public static void main(String[] args) {
        
        try{
            Pessoa p1 = new Pessoa("Ana");
            Pessoa p2 = new Pessoa("");
            Pessoa p3 = new Pessoa("Carlos");
            
        }catch(ParametroVazioException e){
          //vai executar o que estiver dentro do catch
          //se aquela exceção especifica ocorrer
            System.out.println(e.getMessage());
        }
        
        System.out.println("Continua a execução...");
        
    }
    
}

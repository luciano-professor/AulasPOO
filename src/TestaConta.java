
public class TestaConta {

    public static void main(String[] args) {

        Conta c1 = new Conta();
        c1.depositar(100);
        c1.setNumero("007");
        
        System.out.println(c1.getSaldo());
        
    }

}

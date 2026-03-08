public class TestaStreaming {
    public static void main(String[] args) {
        // Criando a primeira conta (Plano Básico)
        Streaming s1 = new Streaming("João Silva", "Básico");
        System.out.println(s1.toString());
        
        s1.assistirFilme("O Poderoso Chefão");
        s1.assistirFilme("Batman: O Cavaleiro das Trevas");
        
        System.out.println(s1.toString());
        System.out.println();

        // Criando a segunda conta (Plano Família)
        Streaming s2 = new Streaming("Maria Souza", "Família");
        System.out.println(s2.toString());
        
        s2.assistirFilme("Frozen 2");
        s2.cancelarAssinatura(); // Desativando a conta
        
        // Tentativa de assistir com conta inativa
        s2.assistirFilme("Moana"); 
        
        System.out.println();
        System.out.println(s2.toString());
        
        // Testando uma conta Premium
        Streaming s3 = new Streaming("Carlos Alberto", "Premium");
        System.out.println("\nNova conta criada:");
        System.out.println(s3.toString());
    }
}
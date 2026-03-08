public class Streaming {
    public String usuario, plano;
    public float mensalidade = 0;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    //método construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        if (plano.equalsIgnoreCase("Básico")) {
            this.mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0.0f;
        }
    }

    //atualizações de filme
    public void assistirFilme(String nomeFilme) {
        if(this.ativo) {
           this.ultimoFilmeAssistido = nomeFilme;
           System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Aviso: Assinatura suspensa até que a fatura seja paga!");
        }
    }

    //cancelar assinatura de streaming
    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Assinatura cancelada com sucesso.");
    }

    public String toString(){ // converte objeto para String
        // this representa objeto que chama o método
        String statusTexto = this.ativo ? "Ativo" : "Suspenso";
        return "Usuário: " + this.usuario +
                " Plano: " + this.plano +
                " Mensalidade: R$" + this.mensalidade +
                " Status" + statusTexto +
                " Último Filme: " + (this.ultimoFilmeAssistido.isEmpty() ? "Nenhum" : this.ultimoFilmeAssistido);
    }
}

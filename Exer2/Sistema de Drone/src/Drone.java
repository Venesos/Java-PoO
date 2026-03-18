public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo = false;

    public Drone() {

    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        this.setCodigo(codigo);
        this.setAltura(altura);
        this.setBateria(bateria);
        this.emVoo = emVoo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura >= 0 && altura <= 120){
            this.altura = altura;
        } else System.out.println("Erro, altura fora de regulamentação!");
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else System.out.println("Erro, bateria pode estar danificada!");
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar() {
        if (bateria <= 20) {
            System.out.println("Bateria insuficiente para decolar!");
            return;
        }

        if (testarMotores()) {
            emVoo = true;
            setAltura(2);
            System.out.println("Drone decolou com sucesso!");
        } else {
            System.out.println("Falha nos motores...");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");
        int randomico = (int) (Math.random() * 10);
        if (randomico < 8) {
            System.out.println("Motores Prontos!");
            return true;
        }
        else {
            return false;
        }
    }

    public void subir(float x) {
        if (emVoo) {
            setAltura(this.altura + x);
        } else {
            System.out.println("O drone não está em voo!");
        }
    }

    public void descer(float x) {
        if (emVoo) {
            setAltura(this.altura - x);
        } else {
            System.out.println("O drone não está em voo!");
        }
    }

    @Override
    public String toString() {
        return "Drone: {" +
                "Codigo= '" + codigo + '\'' +
                ", Altura= " + altura + " Metros" +
                ", Bateria= " + bateria + "%" +
                ", Em Voo?= " + (emVoo ? "Sim": "Não")+
                '}';
    }
}
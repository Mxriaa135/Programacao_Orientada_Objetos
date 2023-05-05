public abstract class Veiculo{
    private int id;
    private int velocidadeAtual;
    private int velocidadeMaxima;
    private int precisaoEmCurvas;
    private boolean estaComFarolLigado;

    public Veiculo(){}
    public Veiculo(int id, int velocidadeMaxima, int precisaoEmCurvas){
        this.id = id;
        this.velocidadeMaxima = velocidadeMaxima;
        this.precisaoEmCurvas = precisaoEmCurvas;
    }
    public void acelerar(){
        this.velocidadeAtual = velocidadeAtual + 1;
    }
    public void desacelerar(){
        this.velocidadeAtual = velocidadeAtual - 1;
    }
    public void ligarFarol(){
        this.estaComFarolLigado = true;
    }
    public abstract void utilizarHabilidadeEspecial();
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual){
        this.velocidadeAtual = velocidadeAtual;
    }
    public int getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public int getPrecisaoEmCurvas(){
        return this.precisaoEmCurvas;
    }
    public void setPrecisaoEmCurvas(int precisaoEmCurvas){
        this.precisaoEmCurvas = precisaoEmCurvas;
    }
    public boolean getEstaComFarolLigado(){
        return this.estaComFarolLigado;
    }
    public void setEstaComFarolLigado(boolean estaComFarolLigado){
        this.estaComFarolLigado = estaComFarolLigado;
    }
}

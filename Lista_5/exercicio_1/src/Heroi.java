public class Heroi {
    private int id;
    private String nome;
    private int quantidadesMoedasDeOuro;
    public Heroi(){

    }
    public Heroi(int id, String nome, int quantidadesMoedasDeOuro){
        this.id = id;
        this.nome = nome;
        this.quantidadesMoedasDeOuro = quantidadesMoedasDeOuro;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getQuantidadesMoedasDeOuro(){
        return this.quantidadesMoedasDeOuro = quantidadesMoedasDeOuro;
    }
    public void setQuantidadesMoedasDeOuro(){
        this.quantidadesMoedasDeOuro = quantidadesMoedasDeOuro;
    }
}

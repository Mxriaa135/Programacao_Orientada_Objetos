import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeOuro = 0;
    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        for(int contador = 0; contador < herois.size(); contador++) {
            if (herois.get(contador).getId() == heroi.getId()) {
                System.out.println("Este herói já esta no grupo!");
                return;
            }
        }
        this.totalMoedasDeOuro = this.totalMoedasDeOuro + heroi.getQuantidadesMoedasDeOuro();
        System.out.println("O herói " + heroi.getNome() + " foi adicionado ao grupo");
        this.herois.add(heroi);
    }
    public void removerHeroi(int idHeroi){
        for(int contador = 0; contador < herois.size(); contador++){
            if(herois.get(contador).getId() == idHeroi){
                this.totalMoedasDeOuro = this.totalMoedasDeOuro - herois.get(contador).getQuantidadesMoedasDeOuro();
                System.out.println("O herói " + herois.get(contador).getNome() + " foi removido do grupo");
                herois.remove(contador);
            }
        }
    }
    public int getTotalMoedasDeOuro(){
        return this.totalMoedasDeOuro;
    }
    public void setTotalMoedasDeOuro(int totalMoedasDeOuro){
        this.totalMoedasDeOuro = totalMoedasDeOuro;
    }
    public ArrayList<Heroi> getHerois(){
        return this.herois;
    }
    public void setHerois (ArrayList<Heroi> herois){
        this.herois = herois;
    }
}

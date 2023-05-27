import java.util.ArrayList;
import java.util.List;
public class Grupo {
    private List<Heroi> herois;

    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public List<Heroi> getHerois() {
        return herois;
    }
    public void adicionarHeroi(Heroi novoHeroi) throws NomeRepetididoException {
        for (Heroi heroiPresenteNoGrupo: herois){
            String nomeNovoHeroi = novoHeroi.getNome();
            String nomeHeroiPresenteNoGrupo = heroiPresenteNoGrupo.getNome();

            if (nomeNovoHeroi.equals(nomeHeroiPresenteNoGrupo)){
                throw new NomeRepetididoException("Os herois não podem ter nome repetido");
            }
        }
        this.herois.add(novoHeroi);
    }
}

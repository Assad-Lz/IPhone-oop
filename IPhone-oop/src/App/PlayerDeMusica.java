package App;
import java.util.ArrayList;

//Interface para reprodução de musica na classe principal
public interface PlayerDeMusica {
    public String musicaAtual = "Rage Against The Machine";
    public ArrayList<String> playlist = new ArrayList<String>();
    public int volume = 1;

    //Metodos abastratos para serem implementados na classe IPhone
    public abstract void reproduzirMusicas();
    public abstract void reproduzirPlaylist();
    public abstract int aumentarVolume();
    public abstract int diminuirVolume();
    public abstract void sincronizarItunes();
}
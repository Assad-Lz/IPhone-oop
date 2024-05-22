/**
 * @author Yssaky Assad Luz 
 * @version 0.0.1
 * Sistema com finalidade de aplicar conceitos aprendidos sobre POO no BootCamp Santander
 */
package App; //Definição do Pacote

import java.util.ArrayList;
import java.util.Scanner; //Import classe utilitaria

//Classe principal
public class IPhone implements PlayerDeMusica {
    // Lista de Variáveis de Escopo de Classe
    public String tela = "Tela LCD Retroiluminada LED";
    public String processador = "Samsung SL8900";
    public String memoria = "128 MB RAM";
    protected String camera;
    public int volume = 1;
    public int setVolume;

    // Setter
    public void setCamera(String camera) {
        this.camera = camera;
    }

    // Getter
    public String getCamera() {
        return camera;
    }

    // Metodos Internos da Classe IPhone
    private void iniciar() {
        System.out.println("\nIniciando IPhone...\n");
    }

    private void desligar() {
        System.out.println("\nDesligando IPhone...\n");
    }

    private void reiniciar() {
        System.out.println("\nReiniciando IPhone...\n");
    }

    private static ArrayList<String> playlist = new ArrayList<>();
    static {
        playlist.add("N.W.A");
        playlist.add("Guns And Rose");
        playlist.add("Jason Derulo");
        playlist.add("Beattles");
        playlist.add("Eminem");
        playlist.add("Lady Gaga");
        playlist.add("Bruno Mars");
    }

    // Implementação dos Metodos Abstratos da interface PlayerDeMusica
    @Override
    public void reproduzirMusicas() {
        System.out.println("\n\nIniciando Player de Musica...\n");
        System.out.println("\n\nMusica Atual: " + musicaAtual);
    }

    @Override
    public void reproduzirPlaylist() {
        System.out.println("\n\nIniciando Playlist de Musicas...\n");
        System.out.println("\n\nPlaylist: " + playlist);
    }

    @Override
    public int aumentarVolume() {
        return volume++;
    }

    @Override
    public int diminuirVolume() {
        return volume--;
    }

    @Override
    public void sincronizarItunes() {
        System.out.println("\n\nSincronizando pastas do Itune...");
    }

    public static void main(String[] args) {
        System.out.println(
                "\nSeja Bem-Vindo ao Sistema das funcionalidades trazidas no primeiro IPhone, este sistema não tem a finalidade de ser funcional e somente serve para aprimorar as habilidades de Java e POO.\n\n");

        Scanner read = new Scanner(System.in);// Cria um Scanner para ler input do usuario

        IPhone iPhoneIniciar = new IPhone();// Cria um objeto da clase IPhone para usar metodo iniciar()

        iPhoneIniciar.iniciar();// Chamada do metodo Iniciar

        Chamada novaChamada = new Chamada();// Cria um objeto da classe Chamada para usar o metodo efetuarLigacao()
        System.out.println("Digite um numero para ligar: ");
        novaChamada.efetuarLigacao(read.nextLine() + "..."); // Input do usuario

        // Cria outra instancia da classe IPhone
        IPhone meuIPhone = new IPhone();

        // Chama os métodos abstratos
        meuIPhone.reproduzirMusicas();
        meuIPhone.sincronizarItunes();
        meuIPhone.reproduzirPlaylist();

        // Controla o volume da Musica
        System.out.println("\n\nDeseja Aumentar ou Diminuir Volume da Musica ??");
        System.out.println("\n1 - Aumentar");
        System.out.println("\n2 - Diminuir");
        System.out.println("\n3 - Fechar Aba de Volume");
        meuIPhone.setVolume = read.nextInt();
        // Loop para definir volume enquanto aba de volume não for fechada
        while (meuIPhone.setVolume != 3) {
            int option = read.nextInt(); // Le a próxima entrada inteira
            switch (option) { // Use a variável inteira na instrução switch
                case 1:
                    //Incrementa volume +1
                    meuIPhone.aumentarVolume();
                    System.out.println("\n\nVolume atual: " + meuIPhone.volume);
                    break;
                case 2:
                    // Decrementa volume -1
                    meuIPhone.diminuirVolume();
                    System.out.println("\n\nVolume atual: " + meuIPhone.volume);
                    break;
                case 3:
                    meuIPhone.setVolume = 3;
                    break;
                default:
                    System.out.println("Opção Invalida. Use somente 1, 2, ou 3.");
                    break;
            }
        }
        System.out.println("\nAba de Volume fechada");

        NavegacaoWeb browser = new NavegacaoWeb();

        browser.navegarNaWeb();
        read.close();

        iPhoneIniciar.reiniciar();
        Fotos foto = new Fotos();

        foto.tirarFoto();
        iPhoneIniciar.desligar();
    }

}

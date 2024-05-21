package App;


//Classe para fazer chamadas no IPhone
public class Chamada {
    public String numeroDeTelefone;
    public int sinalDeArea = 5;

    public void efetuarLigacao(String newNumeroDeTelefone){
        verificarSinalDeArea();
        System.out.println("\nEfetuando chamada para: " + newNumeroDeTelefone);
        System.out.println("\nChamada Finalizada !!");
    }

    private void verificarSinalDeArea(){
        if(sinalDeArea > 3){
            System.out.println("\nSinal de Area está bom, pronto pra realizar chamada\n");
        } else {
            System.out.println("\nSinal de Area está ruim, vá para algum lugar que tenha sinal\n");
        }
    }

}

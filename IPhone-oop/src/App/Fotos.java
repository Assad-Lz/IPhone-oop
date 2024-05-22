package App;

public class Fotos extends IPhone {
    private int capacidadeDeGaleria = 1000;

    // Corrigido o nome da variável para corresponder à chamada do método
    public Fotos() {
        super();
        setCamera("Camera OK");
    }

    protected void tirarFoto(){
        String cameraStatus = getCamera();
        if(cameraStatus.equals("Camera OK") && capacidadeDeGaleria <= 1000){
            System.out.println("\nAbrindo camera...");
            System.out.println("\nFoto Tirada !!");
        } else {
            System.out.println("Camera não está funcionando, verifique !");
        }
    }

    public String getCamera() {
        return "Camera OK";
    }
}
package App;

public class NavegacaoWeb {
    private String conexaoDeRede = "2G";
    private boolean webCache = true;

    public void navegarNaWeb(){
        if(verificarConexaoDeRede() == true){
            System.out.println("\nConexão de Rede Verificada (Estavel)");
            if(webCache == true){
                System.out.println("\nFazendo pesquisa..., Encontrando Sites..., Navegando na WEB...");
            } else {
                System.out.println("\nSeu cache da WEB foi Excluido, pode ser que demore um pouco...");
                System.out.println("\nFazendo pesquisa..., Encontrando Sites..., Navegando na WEB...");
            }
            
        } else {
            System.out.println("\nConexão de Rede Verificada (Ruim)");
            System.out.println("\nTente novamente mais tarde");
        }

        
    }

    private boolean verificarConexaoDeRede(){
        if(conexaoDeRede.equals("2G")){
            return true;
        } else {
            return false;
        }
    }
}

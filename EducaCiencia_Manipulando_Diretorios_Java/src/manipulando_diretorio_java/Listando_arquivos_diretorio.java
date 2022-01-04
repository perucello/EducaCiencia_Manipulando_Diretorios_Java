package manipulando_diretorio_java;

import java.io.File;

public class Listando_arquivos_diretorio {

    public String lista_arquivos_diretorio(String pasta) {

         File diretorio = new File(pasta);

        if (diretorio.isDirectory()) {
            System.out.println("\nListando o Diretorio: " + pasta);
            String lista[] = diretorio.list();
             for (String lista1 : lista) {
                 System.out.println(" -> " + lista1);
                 //continue;
             }
        } else {
            System.out.println("Diretorio nao existe - invalido");
        }
        return null;

    }
    
}

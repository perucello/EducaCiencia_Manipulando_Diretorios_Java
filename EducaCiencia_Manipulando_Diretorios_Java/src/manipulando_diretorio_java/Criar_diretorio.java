package manipulando_diretorio_java;

import java.io.File;

public class Criar_diretorio {

    public String CriaDiretorio(String pasta) {
        //String pasta = "C:\\teste\\";
        File diretorio = new File(pasta);

        if (!diretorio.exists()) {
            System.out.println("Pasta criada - " + pasta);
            diretorio.mkdir();
        } else {
            System.out.println("Pasta ja existe - " + pasta);
        }
        return null;

    }

}

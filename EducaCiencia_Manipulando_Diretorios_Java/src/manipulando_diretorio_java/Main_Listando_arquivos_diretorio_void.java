package manipulando_diretorio_java;

import java.io.File;

public class Main_Listando_arquivos_diretorio_void {

    public static void main(String[] args) {

        listarDiretorio();
    }

    
    public static void listarDiretorio(){
       String pasta = "C:\\EducaCienciaFastCode";
         File diretorio = new File(pasta);

        if (diretorio.isDirectory()) {
            System.out.println("Diretorio: " + pasta);
            String lista[] = diretorio.list();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(" -> " + lista[i]);
            }
        } else {
            System.out.println("Diretorio nao existe - invalido");
        }
    }
}

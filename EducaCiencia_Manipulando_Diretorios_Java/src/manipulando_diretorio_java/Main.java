package manipulando_diretorio_java;

public class Main {

    public static void main(String[] args) {

        //Endereço - path
        String pasta = "C:\\EducaCienciaFastCode";
        //Nome do arquivo
        String nomeArquivo = "Manipulando_diretorio_java";
        //para Write
        String nome = "EducaCiencia - ";
        String email = "educaciencia_fastcode@outlook.com.br";
        //Para append
        String nome1 = "EducaCiencia_01 - ";
        String email1 = "educaciencia_fastcode_01@outlook.com.br";

        Criar_diretorio criar = new Criar_diretorio();
        criar.CriaDiretorio(pasta);

        Gravar_dados_doc gravaWord = new Gravar_dados_doc();
        gravaWord.gravar(pasta, nomeArquivo, nome, email);

        Gravar_dados_excel gravaExcel = new Gravar_dados_excel();
        gravaExcel.gravar(pasta, nomeArquivo, nome, email);

        Gravar_dados_txt gravaTxt = new Gravar_dados_txt();
        gravaTxt.gravar(pasta, nomeArquivo, nome, email);

        GravarAppend_dados_doc gravaWordAppend = new GravarAppend_dados_doc();
        gravaWordAppend.gravar(pasta, nomeArquivo, nome1, email);

        GravarAppend_dados_excel gravaExcelAppend = new GravarAppend_dados_excel();
        gravaExcelAppend.gravar(pasta, nomeArquivo, nome1, email);

        GravarAppend_dados_txt gravaTXTAppend = new GravarAppend_dados_txt();
        gravaTXTAppend.gravar(pasta, nomeArquivo, nome1, email);

        Listando_arquivos_diretorio listarDiretorio = new Listando_arquivos_diretorio();
        listarDiretorio.lista_arquivos_diretorio(pasta);

    }
}

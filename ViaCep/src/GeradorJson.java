import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorJson {

    public void arquivoJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String nomeArquivo = endereco.cep() + ".json";
        String diretorio = "ceps/";

        FileWriter file = new FileWriter(diretorio + nomeArquivo);
        file.write(gson.toJson(endereco));
        file.close();
    }
}

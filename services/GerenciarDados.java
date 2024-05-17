package services;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.print.DocFlavor.READER;
import classes.Usuario;
import com.google.code.gson.Gson;

public class GerenciarDados {
    private static final String FILE_PATH = "../json/dados.json";

    public static Map<Usuario> lerUsuarios() {
        Map<Usuario> usuarios = new HashMap<>();

        try (Reader reader = new FileReader(FILE_PATH)) {
            Gson gson = new Gson();

            
        }

        return usuarios;
    }
}
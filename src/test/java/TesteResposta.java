

import org.example.Main;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteResposta  {

 @Test
 void ConectionTest () throws IOException
 {
  URL urlObj = new URL("https://api.publicapis.org/entries");
  HttpURLConnection conexao = (HttpURLConnection)urlObj.openConnection();
  conexao.setRequestMethod("GET");

    assertEquals(200, conexao.getResponseCode(),"O codigo de resposta esperado era 200");

 }

}

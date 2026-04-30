package mavenproject1.att9_zumbi;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

     @FXML
    private void voltarParaoAbrigo() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void entrarNoMercado() throws IOException {
        App.setRoot("tertiary");
    }
}
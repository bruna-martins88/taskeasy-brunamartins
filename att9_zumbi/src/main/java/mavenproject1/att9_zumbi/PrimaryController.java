package mavenproject1.att9_zumbi;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private void sairParaExplorar() throws IOException {
        App.setRoot("secondary");
    }
    
     @FXML
    private void abrirRádio() throws IOException {
        //App.setRoot("secondary"); --> esse é como estavamos fznd antes
        
           Parent root = FXMLLoader.load(getClass().getResource("radio.fxml"));
        
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        
    }
    
    @FXML
    private void fechaJanela() throws IOException {
        App.setRoot("secondary");
    }
    
}


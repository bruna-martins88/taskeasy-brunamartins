package mavenproject1.att9_zumbi;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class ExtraController {
    
    @FXML private Button fechar;
    
    @FXML
    private void fechar()throws IOException {
        App.setRoot("primary");
    }
    
     @FXML
    private void fecharJanela() {
        Stage stage = (Stage) fechar.getScene().getWindow();
        stage.close();
    }
}

package mavenproject1.att9_zumbi;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author aluno
 */
public class RadioController {
    
     @FXML private Button fecha;
    
    @FXML
    private void fechar() throws IOException {
        Stage stage = (Stage) fecha.getScene().getWindow();
        stage.close();
    }
}

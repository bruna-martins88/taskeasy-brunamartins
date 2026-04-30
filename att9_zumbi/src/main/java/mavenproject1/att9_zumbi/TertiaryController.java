package mavenproject1.att9_zumbi;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author User
 */
public class TertiaryController {
    
     @FXML
    private void voltarParaRua() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void explorarMais () throws IOException {
        App.setRoot("fourthiary");
    }
    
}

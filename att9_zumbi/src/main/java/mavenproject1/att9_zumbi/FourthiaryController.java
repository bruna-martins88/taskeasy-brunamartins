package mavenproject1.att9_zumbi;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author User
 */
public class FourthiaryController {
    
    @FXML
    private void correr() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private void lutar() throws IOException {
        App.setRoot("fifthiary");
    }
    
}

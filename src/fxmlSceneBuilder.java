import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class fxmlSceneBuilder {

	@FXML
    private Button button;

    // Adicione m�todos de manipula��o de eventos ou inicializa��o aqui

    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Implemente a l�gica para manipular o evento do bot�o aqui
        System.out.println("Bot�o pressionado!");
    }
}

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class fxmlSceneBuilder {

	@FXML
    private Button button;

    // Adicione métodos de manipulação de eventos ou inicialização aqui

    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Implemente a lógica para manipular o evento do botão aqui
        System.out.println("Botão pressionado!");
    }
}

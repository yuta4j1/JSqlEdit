package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    @FXML
    private TextField selectedFilePath;

    @FXML
    public void showFileChooserDialog() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        File file = fileChooser.showOpenDialog(null);
        selectedFilePath.setText(file.getAbsolutePath().toString());
    }

}

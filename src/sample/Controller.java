package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Model;
public class Controller {

    double firstNumber, secondNumber;


    private boolean newAction;
    private String operation;
    private Model model;

    @FXML
    private TextField display;


    @FXML
    public void didjetAction(ActionEvent actionEvent) {
        String value = ((Button) actionEvent.getSource()).getText();
    }
        if(newAction)

    {
        display.setText(value);

    }
             else

    {
        display.setText(display.getText() + value);
    }

}

        @FXML

    public void operatorAction(ActionEvent actionEvent) {
        String value = ((Button) actionEvent.getSource()).getText();
        if(value.equals("=")) {

            secondNumber = Double.parseDouble(display.getText());
            double result = model.calculate(firstNumber, secondNumber, operation);
        }else {

            firstNumber = Double.parseDouble(display.getText());
            display.setText("");
            operation = value;

        }
            newAction = true;
        }
}

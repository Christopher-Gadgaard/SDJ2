package view.temperature;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import view.ViewController;
import viewmodel.ViewHandler;
import viewmodel.ViewModelFactory;

public class TemperatureViewController implements ViewController
{
  private ViewHandler vh;
  private TemperatureViewModel temperatureViewModel;

  @FXML private TextField t0Temp;
  @FXML private TextField t1Temp;
  @FXML private TextField t2Temp;
  @FXML private TextField radiatorField;




  @Override public void init(ViewHandler vh, ViewModelFactory vmf)
  {
    this.vh=vh;
    this.temperatureViewModel = vmf.getTemperatureViewModel();

    radiatorField.textProperty().bind(temperatureViewModel.radiatorProperty().asString());
    t0Temp.textProperty().bind(temperatureViewModel.t0TempProperty().asString());
    t1Temp.textProperty().bind(temperatureViewModel.t1TempProperty().asString());
    t2Temp.textProperty().bind(temperatureViewModel.t2TempProperty().asString());
  }

  @Override public void reset()
  {

  }

  public void radButtonUp(ActionEvent actionEvent)
  {
    temperatureViewModel.radiatorUp();
  }

  public void radButtonDown(ActionEvent actionEvent)
  {
    temperatureViewModel.radiatorDown();
  }

  public void t0DataButton(ActionEvent actionEvent)
  {
    vh.openDataView();
  }

  public void t1DataButton(ActionEvent actionEvent)
  {
  }

  public void t2DataButton(ActionEvent actionEvent)
  {
  }
}
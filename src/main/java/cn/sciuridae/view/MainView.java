package cn.sciuridae.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fl_main=new FXMLLoader();
        fl_main.setLocation(getClass().getClassLoader().getResource("fxml/main.fxml"));
        AnchorPane anchorPane=fl_main.load();
        Scene main=new Scene(anchorPane);//主页面





        primaryStage.setScene(main);
        primaryStage.setHeight(1000);
        primaryStage.setWidth(1000);
        //primaryStage.setResizable(false);//不许拉伸
        primaryStage.show();


    }
}

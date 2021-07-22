package cn.sciuridae;


import cn.sciuridae.view.MainView;

import java.util.List;

public class Application {
    public static String saveUrl;
    public static List<String> dataUrl;
    

    public static void main(String[] args) {
        //数据准备工作

        javafx.application.Application.launch(MainView.class, args);//启动窗口
    }

    public static void readData() {

    }
}

package cn.sciuridae;


import cn.sciuridae.view.MainView;

public class Application {
    public static void main(String[] args) {
        MainView mainView=new MainView();
        mainView.launch(MainView.class,args);//启动窗口
    }
}

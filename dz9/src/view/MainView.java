package view;

import java.util.ArrayList;

public class MainView extends AppView{
    //передача детей
    public MainView(ArrayList<AppView> children) {
        super("Shop", children);
    }

    @Override
    public void action() {
        System.out.println("Welcome to my shop!");
    }
}

package view;

import java.util.ArrayList;

public abstract class AppView {
    //отображение детей
    public final String title;
    public final ArrayList<AppView> children;

    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    //метод отображения
    public abstract void action();
    //вывод списка детей
    public void displayChildren() {
        System.out.println(title);
        System.out.println("Choose from 1 to " + (children.size() + 1));
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i+1) + " - " + children.get(i).title);
        }
        System.out.println((children.size()+1) + " - Back");
    }
}

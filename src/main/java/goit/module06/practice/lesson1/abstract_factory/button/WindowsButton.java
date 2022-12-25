package goit.module06.practice.lesson1.abstract_factory.button;

import goit.module06.practice.lesson1.abstract_factory.interfaces.Button;

public class WindowsButton implements Button {

    @Override
    public void handleButton() {
        System.out.println("Handle Windows Button !");
    }
}
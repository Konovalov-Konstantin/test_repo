package org.example.state;

import org.example.GumballMachine;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Все шарики распроданы");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Шарики закончились,монетки не принимаю");
    }

    @Override
    public void turnCrank() {
        System.out.println("Че-то там");
    }

    @Override
    public void dispense() {
        System.out.println("Какая-то ошибка");
    }
}

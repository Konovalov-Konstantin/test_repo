package org.example.state;

import org.example.GumballMachine;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Подождите, готовим ваш шарик");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Шарик куплен, возврат монетки невозможен");
    }

    @Override
    public void turnCrank() {
        System.out.println("Шарики закончились");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

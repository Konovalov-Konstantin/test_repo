package org.example.state;

import org.example.GumballMachine;

public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("В автомате уже есть монетка");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Заберите монетку");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Забери свой шарик");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Сначала заплати, мелкий пердун");
    }
}

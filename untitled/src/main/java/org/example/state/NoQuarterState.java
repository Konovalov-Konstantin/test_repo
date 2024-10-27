package org.example.state;

import org.example.GumballMachine;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("Вы бросили монетку");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Ты мне не давал монетку, пиздюк");
    }

    @Override
    public void turnCrank() {
        System.out.println("Сначала бабки. Нет монет - нет билэт");
    }

    @Override
    public void dispense() {
        System.out.println("Шарик выдается только за монетку");
    }
}

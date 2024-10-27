package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        GumballMachine machine = new GumballMachine(3);
        System.out.println(machine.state);
        machine.turnCrank();        // дернуть рычаг
        machine.insertQuarter();    // бросить монетку
        machine.turnCrank();        // дернуть рычаг
        machine.insertQuarter();    // бросить монетку
        machine.insertQuarter();    // бросить монетку
        machine.ejectQuarter();     // вернуть монетку
        System.out.println(machine.state);
        machine.turnCrank();        // дернуть рычаг
    }
}

package state_machine.gumball_machine;

public class SoldOutState implements State {
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("沒有糖果了...");
    }

    @Override public void ejectQuarter() {
        System.out.println("沒有糖果了...");
    }

    @Override public void turnCrank() {
        System.out.println("沒有糖果了...");
    }

    @Override public void dispense() {
        System.out.println("沒有糖果了...");
    }

    @Override public String toString() {
        return "SoldOutState";
    }
}

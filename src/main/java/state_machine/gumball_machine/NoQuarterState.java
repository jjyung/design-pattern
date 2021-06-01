package state_machine.gumball_machine;

public class NoQuarterState implements State {
    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("投幣了。");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override public void ejectQuarter() {
        System.out.println("你還沒投幣。");
    }

    @Override public void turnCrank() {
        System.out.println("投幣，才能轉動。");
    }

    @Override public void dispense() {
        System.out.println("投幣，才能拿糖果。");
    }

    @Override public String toString() {
        return "NoQuarterState";
    }
}

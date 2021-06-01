package state_machine.gumball_machine;

public class HasQuarterState implements State {
    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("你已經投幣了。");
    }

    @Override public void ejectQuarter() {
        System.out.println("退幣。");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override public void turnCrank() {
        System.out.println("轉動中...");
        gumballMachine.setCurrentState(gumballMachine.getSoldState());
    }

    @Override public void dispense() {
        System.out.println("你必須先轉動。");
    }

    @Override public String toString() {
        return "HasQuarterState";
    }
}

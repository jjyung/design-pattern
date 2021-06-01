package state_machine.gumball_machine;

public class SoldState implements State {
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override public void insertQuarter() {
        System.out.println("嘿，先拿糖果才能再投幣。");
    }

    @Override public void ejectQuarter() {
        System.out.println("你已經把錢幣花掉了。");
    }

    @Override public void turnCrank() {
        System.out.println("一次投幣，一次轉動。");
    }

    @Override public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        }
    }

    @Override public String toString() {
        return "SoldState";
    }
}

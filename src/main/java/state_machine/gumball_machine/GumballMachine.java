package state_machine.gumball_machine;

public class GumballMachine {
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;

    private State currentState;
    private int count;

    public GumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);

        this.currentState = count > 0 ? this.noQuarterState : this.soldOutState;
        this.count = count;
    }

    public void insertQuarter() {
        this.currentState.insertQuarter();
    }

    public void ejectQuarter() {
        this.currentState.ejectQuarter();
    }

    public void turnCrank() {
        this.currentState.turnCrank();
        this.currentState.dispense();
    }

    public void releaseBall() {
        if (this.currentState != soldState) {
            System.out.println("沒事發生...");
            return;
        }
        if (count > 0) {
            System.out.println("糖果滾出來了...");
            count--;
        }
    }

    @Override public String toString() {
        return "GumballMachine {" +
            "currentState = " + currentState +
            ", count = " + count +
            '}';
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

package state_machine.gumball_machine;

public interface State {
    // 投幣
    void insertQuarter();

    // 退幣
    void ejectQuarter();

    // 轉動
    void turnCrank();

    // 發放糖果
    void dispense();
}

package calculatingMachine;

public class Calculate {
    int totalValue = 0;

    int add(int value){
        totalValue = value + totalValue;
        return totalValue;
    }
    int subtraction(int value){
        totalValue -= value;
        return totalValue;
    }
}

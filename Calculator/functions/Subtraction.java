package Calculator.functions;

public class Subtraction extends Add{
    
    @Override
    public void display (double fNum, double sNum)
    {
        equals(fNum, sNum);
        System.out.println(result);
    }

    void equals(double fNum, double sNum){
        result = fNum - sNum;
    }
}

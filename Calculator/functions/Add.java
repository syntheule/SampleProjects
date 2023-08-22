package Calculator.functions;

public class Add {
    double fNum, sNum, result = 0;

    public void display(double fNum, double sNum)
    {  
        equals(fNum, sNum);
        System.out.println(result);
    }

    void equals(double fNum, double sNum){
        result = fNum + sNum;
    }
}

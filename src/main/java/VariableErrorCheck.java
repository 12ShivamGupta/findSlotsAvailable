public class VariableErrorCheck
{
    private byte num1;
    private short num2;
    private int num3;
    private long num4;
    private float num5;
    private double num6;
    private char ch;
    private String name;
    private boolean flag;

    public void show()
    {
        System.out.println(num1+": "+num2+": "+num3+": "+num4+": "+num5+": "
                +num6+": "+ch+": "+name+": "+flag);
    }
}

class Main1
{
    public static void main(String[] args) {
        VariableErrorCheck object = new VariableErrorCheck();

        int i;

        object.show();
       // System.out.println(i); compile time error
    }
}

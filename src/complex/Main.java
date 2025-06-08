package complex;

public class Main {
    public static void main(String args[]){
        ComplexNum num1=new ComplexNum();
        num1.real=10;
        num1.img=12;
        num1.print();

        ComplexNum num2=new ComplexNum();
        num2.print(01,12);
        num2.getReal();


        ComplexNum num3=new ComplexNum();
        num3.real=34;
        num3.img=35;

        System.out.println(num3.getReal(num3));
        System.out.println(num3.getImg(num3));
    }
}

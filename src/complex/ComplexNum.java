package complex;

public class ComplexNum {
    int real;
    int img;

    void print(){
        System.out.println(real +" + "+img +"i");
    }
    void print(int real,int img){
        System.out.println(real+" + "+img+"i");
    }


    int  getReal(){
        return real;
    }
    int getReal(ComplexNum other){
        return other.real;
    }


    int getImg(){
        return img;
    }
    int getImg(ComplexNum other){
        return other.img;
    }


}

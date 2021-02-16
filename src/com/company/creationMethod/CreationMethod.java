package com.company.creationMethod;

//many constructors the parameter is a trouble
public class CreationMethod {
    public static void main(String[] args) {
        T t1 = new T(1,"s");
        T t2 = new T(1);
        T t3 = new T("s2");

        T1 t4 = T1.createT1withNAndS(1,"s");
    }
}
class T{

    private int n;
    private String s;
    public T(int n,String s){
        this.n = n;
        this.s = s;
        System.out.println(n + "," + s);
    }
    public T(int n){
        this(n,"s1");
    }
    public T(String s){
        this(0,s);
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public String getS() {
        return s;
    }
    public void setS(String s) {
        this.s = s;
    }
}
class T1{
    private  int n;
    private String s;
    private T1(int n,String s){
        this.n = n;
        this.s = s;
        System.out.println(n + "," + s);
    }
    public static T1 createT1withNAndS(int n,String s){
        return new T1(n,s);
    }
}
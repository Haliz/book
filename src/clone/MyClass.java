package clone;

import java.util.Date;

public class MyClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj1 = new A(10);
        A obj2 = obj1.clone();
        System.out.println(obj1.getD());
        System.out.println(obj2.getD());
        obj2.newDate(1245L);
        System.out.println(obj1.getD());
        System.out.println(obj2.getD());
    }
}

class A implements Cloneable {
    private int x;
    private Date d;

    public A(int x) {
        this.x = x;
        this.d = new Date();
    }

    public int getX() {
        return x;
    }

    public Date getD() {
        return (Date) this.d.clone();
    }

    public void newDate(long time) {
        d.setTime(time);
    }

    @Override
    protected A clone() throws CloneNotSupportedException {
        A obj =(A) super.clone();
        obj.d = getD();
        return obj;
    }
}

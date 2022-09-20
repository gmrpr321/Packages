package pack1.pack2;

import pack1.pack2.pack3.threeClass;

public class twoClass extends threeClass {
    protected void func2() {
        System.out.println("This is from class two ");
        super.func3();
    }
}

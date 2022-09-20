package pack1;

import pack1.pack2.twoClass;

public class oneClass extends twoClass {
    protected void func1() {
        System.out.println("This is from class one ");
        super.func2();
    }
}

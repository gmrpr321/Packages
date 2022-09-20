package basePack;

import basePack.subpack.Innerclass;

class parentClass extends Innerclass {
    void Print_protected() {
        System.out.println(super.pro); // Protected data memeber, accessible
    }

    void Print_default() {
        System.out.println(super.def); // Can't access default data members and throws an Error
    }
}

public class BaseClass {
    public static void main(String args[]) {
        parentClass obj = new parentClass();
        obj.Print_protected();
    }
}

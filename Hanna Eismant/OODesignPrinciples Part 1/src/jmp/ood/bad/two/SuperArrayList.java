package jmp.ood.bad.two;

import java.util.ArrayList;

import javax.naming.OperationNotSupportedException;

public class SuperArrayList extends ArrayList {

    @Override
    public boolean isEmpty() {
        try {
            throw new OperationNotSupportedException("Not supported!");
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }
        return false;
    }
}

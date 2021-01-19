package primery.lambda;

public class HopeChecker implements WhatCan{
    @Override
    public boolean Test(Animal a) {
        return a.isCanHope();
    }
}

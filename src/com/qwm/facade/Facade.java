package com.qwm.facade;

/**
 * Created by qiwenming on 16/6/23.
 * Facade类(外观类)
 */
public class Facade {
    private SubSystemOne subOne;
    private SubSystemTwo subTwo;;
    private SubSystemThree subThree;
    private SubSystemFour subFour;
    public Facade() {
        subOne = new SubSystemOne();
        subTwo = new SubSystemTwo();
        subThree = new SubSystemThree();
        subFour = new SubSystemFour();
    }

    public void methodA(){
        System.out.println("------方法组A--------");
        subOne.methOne();
        subFour.methFour();
        subThree.methThree();
    }

    public void methodB(){
        System.out.println("------方法组B--------");
        subOne.methOne();
        subTwo.methTwo();
    }

}

package _19_Interface;

/*
* extends 단일상속
* implements 다중상속
* */
public abstract class Button implements Press, Up, Down {
    @Override
    public void onDown() {};

    @Override
    public abstract void onPressed();

    @Override
    public void onUp() {};
}

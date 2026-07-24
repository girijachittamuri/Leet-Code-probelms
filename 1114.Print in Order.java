class Foo {

    private int n = 1;

    public Foo() {
    }

    public void first(Runnable printFirst) {
        printFirst.run();
        n = 2;
    }

    public void second(Runnable printSecond) {
        while (n != 2) {
        }
        printSecond.run();
        n = 3;
    }

    public void third(Runnable printThird) {
        while (n != 3) {
        }
        printThird.run();
    }
}

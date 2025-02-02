public class OuterDemo implements InnerDemo,ThirdInterface {
    public void showConfig() {
        System.out.println("null");
    }

    public void display() {
        System.out.println("Hello User");
    }

    public void myInterface() {
        System.out.println("User is busy");
    }

    public void displayName() {
        System.out.println("Kavishka Sasindu is my name");
    }
}

// can implements many interfaces to one class using extends keyword.

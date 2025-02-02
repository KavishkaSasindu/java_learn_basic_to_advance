
// interface are by default public and abstract
public interface InnerDemo extends SecondInterface{

    // all the variables in interface final and static
    final int AGE = 24;

    public void showConfig();

    public void display();
}

// interfaces can be inherit each other using extends keyword
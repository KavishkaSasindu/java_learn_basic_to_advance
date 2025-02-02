public enum EnumClass {

    MacBook(2000),
    Dell(3000);

    // enum constructor and variables and private
    private int price;

    private EnumClass(int price) {  // Constructor
        this.price = price;
    }

    // in enum class we can write our own methods

    
    private EnumClass() {
        // default condtructore
    }

    public int getPrice() {  // Getter method
        return price;
    }
}

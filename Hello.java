public class Hello {
    private String name;
    private String userEmail;

    // non-parameterized constructor
    Hello() {
        name = "Kavishka Sasindu";
        userEmail = "user@gmail.com";
        System.out.println(name);
        System.out.println(userEmail);
    }

    // parameterized constructor
    Hello(String name,String userEmail) {
        this.name = name;
        this.userEmail = userEmail;
    }

// getters and setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Change the value of name: " + name);
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        System.out.println("Change the value of userEmali: "+ userEmail);
    }

}
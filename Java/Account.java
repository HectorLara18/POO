class Account {
    Integer id;
    String name;
    String document;
    String emai;
    String password;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }

    void printName() {
        System.out.println("Name: " + name);
    }
}
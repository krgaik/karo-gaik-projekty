class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge1() {
        return age1;
    }

    public void setAge1(double age1) {
        this.age1 = age1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    String name;
    double age1;
    double height;

    public User(String name, double age1, double height) {
        this.name = name;
        this.age1 = age1;
        this.height = height;
    }

    public boolean Name(String name) {
        if (name != null) ;
        return true;
    }

    public boolean Age(double age1) {
        if (age1 > 30)
            return true;
        else return false;
    }

    public boolean Height(double height) {
        if (height > 160)
            return true;
        else return false;
    }
}

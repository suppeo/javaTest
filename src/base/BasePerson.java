package base;

public abstract class BasePerson {
    private String pname;
    private int sex;
    private int age;

    public BasePerson(String pname, int sex, int age) {
        this.pname = pname;
        this.age = age;
        this.sex = sex;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void job();
}

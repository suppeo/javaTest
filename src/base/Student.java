package base;

/**
 *
 */
public class Student extends BasePerson implements Comparable {
    private String sId;
    private String zhuanYe;

    /**
     * @param pname
     * @param sex
     * @param age
     * @param sId
     * @param zhuanYe
     */
    public Student(String pname, int sex, int age, String sId, String zhuanYe) {
        super(pname, sex, age);
        this.sId = sId;
        this.zhuanYe = zhuanYe;
    }

    @Override
    public void finalize() {
        System.out.println(this.getPname() + "_对象被作为垃圾回收");
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getZhuanYe() {
        return zhuanYe;
    }

    public void setZhuanYe(String zhuanYe) {
        this.zhuanYe = zhuanYe;
    }

    @Override
    public void job() {
        System.out.println(this.getPname() + "学习" + this.getZhuanYe());
    }

    @Override
    public String toString() {
        return "学号：" + this.sId + " 姓名：" + this.getPname() + " 性别：" + (this.getSex() > 0 ? "男" : "女") + " 年龄：" + this.getAge() + " 专业：" + this.getZhuanYe() + "\n";
    }

    @Override
    public int hashCode() {
        return sId.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student student = (Student) obj;
        boolean b = this.sId.equals(student.sId);
        return b;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        return this.getsId().compareTo(student.getsId());
    }
}

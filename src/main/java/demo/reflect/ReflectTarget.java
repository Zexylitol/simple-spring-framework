package demo.reflect;

import java.sql.Ref;

/**
 * @author yzz
 * @create 2022-04-20 14:54
 */
public class ReflectTarget extends ReflectTargetOrigin {
    /*********************** 构造函数 *************************/
    /**
     * 默认带参构造函数
     * @param str
     */
    ReflectTarget(String str) {
        System.out.println("(default)Constructor with parameter :  s = " + str);
    }

    /**
     * 无参构造
     */
    public ReflectTarget() {
        System.out.println("Non-parameter constructor");
    }

    /**
     * 有一个参数的构造函数
     * @param name
     */
    public ReflectTarget(char name) {
        System.out.println("Constructor with one parameter : name = " + name);
    }

    /**
     * 有多个参数的构造函数
     * @param name
     * @param index
     */
    public ReflectTarget(String name, int index) {
        System.out.println("Constructor with multiple parameters : name = " + name + " index = " + index);
    }

    /**
     * 受保护的构造函数
     * @param n
     */
    protected ReflectTarget(boolean n) {
        System.out.println("Protected Constructor with parameter : n = " + n);
    }
    /**
     * 私有的构造函数
     * @param index
     */
    private ReflectTarget(int index) {
        System.out.println("Private Constructor with parameter : index = " + index);
    }

    /*********************** 成员变量 *************************/
    public String name;
    protected int index;
    char type;
    private String targetInfo;

    @Override
    public String toString() {
        return "ReflectTarget{" +
                "name='" + name + '\'' +
                ", index=" + index +
                ", type=" + type +
                ", targetInfo='" + targetInfo + '\'' +
                '}';
    }
    /*********************** 成员方法 *************************/
    public void show1(String s) {
        System.out.println("implement public void show1(String): s = " + s);
    }
    protected void show2() {
        System.out.println("implement protected void show2()");
    }

    void show3() {
        System.out.println("implement void show3()");
    }

    private String show4(int index) {
        System.out.println("implement private String show4(int): index = " + index);
        return "show4result";
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 获取Class对象方式一
        ReflectTarget reflectTarget = new ReflectTarget();
        Class<? extends ReflectTarget> reflectTargetClass1 = reflectTarget.getClass();
        System.out.println("1st: " + reflectTargetClass1.getName());
        // 方式二
        Class<ReflectTarget> reflectTargetClass2 = ReflectTarget.class;
        System.out.println("2nd: " + reflectTargetClass2.getName());
        // 判断方式一与方式二获取到的是否是同一个Class对象
        System.out.println("1st == 2nd: " + (reflectTargetClass1 == reflectTargetClass2));
        // 方式三
        Class<?> reflectTargetClass3 = Class.forName("demo.reflect.ReflectTarget");
        System.out.println("3rd: " + reflectTargetClass3.getName());
        System.out.println("1st == 3rd: " + (reflectTargetClass1 == reflectTargetClass3));
    }
}

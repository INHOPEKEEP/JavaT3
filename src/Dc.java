public class Dc implements SMan,TMan{

    String name;

    String sex;

    int age;

    double tu;                 //学费

    double sal;                //薪水

    public void upT(float tu) {

        this.tu=tu;
    }


    public void catT(float tu) {
        System.out.println("每学期学费是:"+tu);

    }

    @Override
    public void faSal(float sal) {
        this.sal=sal;
    }

    @Override
    public void catSal(float sal) {
        System.out.println("每月薪水是:"+sal);
    }
}

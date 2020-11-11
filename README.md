# JavaT3

## 计G201 吴晓波

## 实验目的

学会抽象类和接口的定义与实现，还有java的异常处理机制。

## 实验要求

* 设计老师管理与学生管理两个接口，分别有查薪水，发放薪水，缴纳学费，查学费等方法
* 设计博士生类，实现上述两个接口，并详细化接口的方法
* 该博士生类具有姓名，性别，年龄，每学期学费，每月薪水等属性，
* 测试类，实例化至少两个博士类，拥有统计年收入，年学费，计算两者之差，年缴税等的方法，最后输出信息

## 流程图

![](https://github.com/INHOPEKEEP/JavaT2/blob/main/picture/liuchengtu.png)

## 核心代码
```
Scanner sc = new Scanner(System.in);
Scanner sc2 = new Scanner(System.in);
dc.name=sc.next();
dc.age=sc.nextInt();
dc.sex=sc.next();
dc.sal=sc.nextFloat();
dc.tu=sc.nextFloat();
```
```
try {
            t.catM(dc1);
            //System.out.println("\n");
            System.out.println("-----------------------------------------------");
            System.out.println("-----------------------------------------------");
            t.catM(dc2);}
        catch (Exception e){
            System.out.println("输入有误，请按规则输入！");
        }
```
## 实验结果

![](https://github.com/INHOPEKEEP/JavaT3/blob/main/picture/T31.PNG)
![](https://github.com/INHOPEKEEP/JavaT2/blob/main/picture/2.PNG)

## 实验总结
通过这次实验，掌握了接口的定义和使用，如果要实现接口，得实现它的所有方法，抽象类也是这样。学会使用简单的Java的异常处理，Scanner类的使用。还有理解了static final的意义，

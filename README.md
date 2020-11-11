# JavaT3

## 计G201 吴晓波

## 实验要求

+ 4个类，PC,CPU,HardDisk,Test
+ CPU类返回speed，HardDisk类返回amount，PC类show方法能显示cpu的速度和硬盘的容量
+ 主类Test创建三个类的对象并实例化，调用方法三个类中的方法
+ 多个构造方法，多个属性，放在不同的包中，修饰符多样化

## UML图

![](https://github.com/INHOPEKEEP/JavaT1/blob/main/picture/11.png)

## 核心代码
1.
```
public void setSpeed(int speed) {
        this.speed = speed;
    }
public int getSpeed() {
        return speed;
    }
```
2.
```
public void setAmount(int amount) {
        this.amount = amount;
    }
public int getAmount() {
        return amount;
    }
```
3.
```
public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

public void setHD(HardDisk hD) {
        HD = hD;
    }
```
4.
```
CPU cpu = new CPU(2200);

HardDisk HD = new HardDisk(200);

PC pc = new PC();
```
## 实验结果

![](https://github.com/INHOPEKEEP/JavaT1/blob/main/picture/20%20(2).png)

## 实验总结

通过这次实验掌握了，不同修饰符对方法和属性的作用与范围，
get，set方法，包的封装，创建并实例化对象，通过创建对象调用类的方法和属性

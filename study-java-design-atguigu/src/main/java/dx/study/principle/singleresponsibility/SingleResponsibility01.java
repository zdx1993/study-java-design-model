package dx.study.principle.singleresponsibility;

/**
 * @description: 并没有做到单一职责的代码实现
 * @author: zhang.da.xin
 * @create: 2019-07-12 14:00
 **/


public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
        //run之后就会发现,这个方法管地上跑的也管天上飞的,那就发生问题了。
    }
}
//交通工具类
class Vehicle {
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}

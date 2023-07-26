import java.lang.management.OperatingSystemMXBean;

public class ComputerDemo {
    public static void main(String[] args) {
       Computer Laptop = new Computer();
        Laptop.year=1992;
        Laptop.price=200;
        Laptop.hardDiskMemory = 1000;
        Laptop.freeMemory = 600;
        Laptop.operationSystem = "Windows";
       Computer PC = new Computer();
       PC.year = 2000;
       PC.price = 400;
       PC.hardDiskMemory = 2000;
       PC.freeMemory = 1500;
       PC.operationSystem = "Linux";

       System.out.println("This Laptop has: " + Laptop.freeMemory + " free memory!");
        System.out.println("This PC is runing " + PC.operationSystem);
        int freeMemory;
        String changeOperationSystem;

        Laptop.useMemory(freeMemory = 100);
        PC.changeOperationSystem(changeOperationSystem = "Windows");
        Computer otherComp;
        otherComp = new Computer (1992, 300, true, 600,500,"Linux");
        System.out.println(otherComp.comparePrice(otherComp));
        System.out.println(otherComp.comparePrice(PC));
        System.out.println(otherComp.comparePrice(Laptop));
    }
}

public class Computer {
     int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

        Computer(){
            this.isNotebook = false;
            this.operationSystem = "WinXP";
        }
        Computer(int year, double price, double hardDiskMemory, double freeMemory){
            this();
            this.year = year;
            this.price = price;
            this.hardDiskMemory = hardDiskMemory;
            this.freeMemory = freeMemory;
        }
    Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
            this(year,price,hardDiskMemory,freeMemory);
            this.operationSystem = operationSystem;
    }

    int comparePrice(Computer otherComp){
            if(this.price<otherComp.price){
                return(-1);
            }else if (this.price>otherComp.price){
                return(1);
            }else {
                return(0);
            }

    }

    void changeOperationSystem(String changeOperationSystem) {
        System.out.println("New OS is "+ changeOperationSystem);

    }
    void useMemory(int useMemory) {
        System.out.println("Use memory  "+ useMemory);

    }


    }


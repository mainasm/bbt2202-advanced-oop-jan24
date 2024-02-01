//An interface containing a static class
interface MyEv {
    static void batteryInfo() {
        System.out.println("All electric vehicles use lithium batteries.");
    }
}

class MyEvMain {
    public static void main(String[] args) {
        System.out.println("What type of batteries to electric vehicles use?");
        MyEv.batteryInfo();
    }
}



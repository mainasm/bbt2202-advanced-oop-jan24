abstract class BirdAfterLSP {
}

class FlyingBird extends BirdAfterLSP {
    public void fly() {
        System.out.println("This bird can fly.");
    }
}

class OstrichBird extends BirdAfterLSP {
    // Ostrich does not override fly method
}

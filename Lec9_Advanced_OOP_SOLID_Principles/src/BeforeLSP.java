class Bird {
    public void fly() {
        System.out.println("This bird can fly.");
    }
}
class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich cannot fly.");
    }
}

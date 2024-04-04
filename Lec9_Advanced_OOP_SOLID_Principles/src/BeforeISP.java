interface SmartDevice {
    void call();
    void takePhoto();
    void playMusic();
}

class Smartphone implements SmartDevice {
    public void call() {
        // Implementation
    }

    public void takePhoto() {
        // Implementation
    }

    public void playMusic() {
        // Implementation
    }
}

class Camera implements SmartDevice {
    public void call() {
        throw new UnsupportedOperationException();
    }

    public void takePhoto() {
        // Implementation
    }

    public void playMusic() {
        throw new UnsupportedOperationException();
    }
}

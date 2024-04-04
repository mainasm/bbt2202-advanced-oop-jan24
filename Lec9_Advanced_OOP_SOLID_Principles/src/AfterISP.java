interface PhoneAfterISP {
    void call();
}

interface CameraAfterISP {
    void takePhoto();
}

interface MusicPlayerAfterISP {
    void playMusic();
}

class SmartphoneAfterISP implements PhoneAfterISP, CameraAfterISP, MusicPlayerAfterISP {
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

class BasicCamera implements CameraAfterISP {
    public void takePhoto() {
        // Implementation
    }
}

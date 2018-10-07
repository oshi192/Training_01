package mvc;

import util.Reader;

class Model {
    private String hello;
    private String world;

    void setHello(String hello) {
        this.hello = hello;
    }

    void setWorld(String world) {
        this.world = world;
    }

    String getHello() {
        return hello;
    }

    String getWorld() {
        return world;
    }

    boolean validateInput(String inputStr, String compereStr) {
        boolean validate = false;
        if (!inputStr.trim().equalsIgnoreCase(compereStr)) {
            validate = true;
        }
        return validate;
    }
}

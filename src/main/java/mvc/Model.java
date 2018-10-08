package mvc;

public class Model {
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

    /**
     * compares 2 Strings with ignorecase
     * @param inputStr - 1st strting
     * @param compereStr - second
     * @return true if equals
     */
    public boolean validateInput(String inputStr, String compereStr) {
        boolean validate = false;
        if (inputStr.trim().equalsIgnoreCase(compereStr)) {
            validate = true;
        }
        return validate;
    }
}

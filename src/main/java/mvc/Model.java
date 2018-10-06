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
//
//    private boolean validateInput(String inputStr, String compereStr) {
//        boolean validate = false;
//        if (!inputStr.trim().equalsIgnoreCase(compereStr)) {
//            validate = true;
//        }
//        return validate;
//    }
//
//    private String processWord(String word) {
//        String inputStr;
//        do {
//            View.printMsg(View.ENTER_MSG + "\"" + word + "\"");
//            do {                            // to skip empty lines //
//                inputStr = Reader.getString();
//            } while (inputStr.equals(""));
//            if (validateInput(inputStr, word)) {
//                View.printMsg(View.ERROR_MSG + "\"" + inputStr + "\"");
//            }
//        } while (validateInput(inputStr, word));
//        return inputStr;
//    }
}

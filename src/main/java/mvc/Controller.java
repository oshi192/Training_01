package mvc;

import util.Reader;

public class Controller {
    private static final String HELLO = "Hello";
    private static final String WORLD = "world!";

    private Model model;

    public Controller () {
        model = new Model();
    }

    public void processUser() {
        View.printMsg(View.WELCOME_MSG);
        model.setHello(processWord(HELLO));
        model.setWorld(processWord(WORLD));
        View.printMsg(View.RESULT_MSG);
        View.printMsg(HELLO + " " + WORLD + " : " + model.getHello() + " " + model.getWorld());
    }

    /**
     * reads a string until it's valid (or correct)
     * @param word - string to compare for validity
     * @return entered strings
     */
    private String processWord(String word) {
        String inputStr;
        do {
            View.printMsg(View.ENTER_MSG + "\"" + word + "\"");
            do {                            // to skip empty lines //
                inputStr = Reader.getString();
            } while (inputStr.equals(""));
            if (!model.validateInput(inputStr, word)) {
                View.printMsg(View.ERROR_MSG + "\"" + inputStr + "\"");
            }
        } while (!model.validateInput(inputStr, word));
        return inputStr;
    }

}

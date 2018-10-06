package mvc;

class View {
    static final String ENTER_MSG = "please type: ";
    static final String WELCOME_MSG = "--------- Welcome! -----------";
    static final String ERROR_MSG = "error in string: ";
    static final String RESULT_MSG = "-------- The result! ---------";

    private View(){

    }

    static void printMsg(String message){
        System.out.println(message);
    }

}

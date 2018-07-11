package Workshop31;

/*
 *DO NOT EDIT CODE IN MAIN function
 */


/**
 *
 * @author DuyDT
 */
public class Main {
	/*The main method is given, you do not need to code this one*/
    public static void main(String[] args) {
        MyNumber m = new MyNumber();
        InputThread t1 = new InputThread(m);
        OutputThread t2 = new OutputThread(m);
        t1.start();
        t2.start();
    }
}

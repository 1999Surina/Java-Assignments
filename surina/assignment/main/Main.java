package JavaAssignments.surina.assignment.main;
import JavaAssignments.surina.assignment.data.Data;
import JavaAssignments.surina.assignment.singleton.Singleton;

public class Main {


    public static void main(String[] args) {
        Data data = new Data();
        data.printGlobalUnInitialized();
        data.printLocalUnInitialized();

        Singleton singleton = Singleton.initialize("Initial String");
        singleton.printString();
    }
}
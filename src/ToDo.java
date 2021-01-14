import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        ArrayList <String> toDoList = new ArrayList<>();
        while(true){
            System.out.println("Please write a thing to do (When finished, type END): ");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if(str.equalsIgnoreCase("END")) break;
            toDoList.add(str);

        }
        System.out.println("TODO list:");
        for(String toDoStr : toDoList)
        System.out.println("\t- "+toDoStr);

    }
}

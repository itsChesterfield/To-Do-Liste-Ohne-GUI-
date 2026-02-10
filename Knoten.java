/*
@Author Max Danigel
 */
package liste;
import java.time.LocalDate;
import java.time.LocalTime; // Für das Datum und die Uhrzeit bei der erstellung der To-Do.


public class Knoten{
    ToDo todo;
    Knoten left;
     Knoten right;

    public Knoten(ToDo todo){ // Default Konstruktor, der jedes mal mit einem Scanner die Eingabe überprüft
        this.todo = todo;
    }
    public Knoten(ToDo todo, Knoten left, Knoten right){
        this.todo = todo;
        this.left = left;
        this.right = right;
    }

    public void knotenAusgabe(){
        System.out.println(todo.toString());
    }
}

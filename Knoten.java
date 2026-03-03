/*
@Author Max Danigel
 */
package liste;
import java.time.LocalDate;
import java.time.LocalTime; // Für das Datum und die Uhrzeit bei der erstellung der To-Do.


public class Knoten extends ToDo{
    ToDo todo;
    Knoten left;
     Knoten right;

    public Knoten(String value, int priority){ // Default Konstruktor, der jedes mal mit einem Scanner die Eingabe überprüft
        super(value, priority);
    }
    public Knoten(String value, int priority, Knoten left, Knoten right){
		super(value, priority);
		this.todo = todo;
        this.left = left;
        this.right = right;
    }

    public void knotenAusgabe(){
        System.out.println(todo.toString());
    }
}

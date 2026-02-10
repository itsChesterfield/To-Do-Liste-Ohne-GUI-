package liste;
import java.time.LocalDate;
import java.time.LocalTime;
/*
Um alles Seperat zu erhalten, habe ich eine extra ToDo Klasse erstellt, für das do one Prinzip!
 */

public class ToDo implements Comparable<ToDo>{
	private String value;
	private int priority;
	private LocalDate date;
	private LocalTime time;
	private int counter = 0;

	public ToDo(String value, int priority){ // Default Konstruktor, der jedes mal mit einem Scanner die Eingabe überprüft
		setValue(value);
		setPriority(priority);
		time = LocalTime.now().withSecond(0).withNano(0); // Setzt Sekunden und Nano direkt auf 0, damit sie nicht mit geprintet werden.
		this.date = LocalDate.now();
		//TODO: Datum und Uhrzeit noch weiter anpassen, bis es schön aussieht.
	}
	/*
	@Setter Legt den Wert für die To-Do fest.
	@Exception Überprüft ob etwas in das To-Do Feld eingegeben wurde, oder ob es mit null belegt wurde.
	 */
	public void setValue(String value)throws NullPointerException, IllegalArgumentException{

		if(value == null){
			throw new NullPointerException("Du kannst keine To-Do mit null belegen!");
		}
		if(value.equals("")){
			throw new IllegalArgumentException("Du hast vergessen etwas einzutragen!");
		}
		this.value = value;
	}


	/*
	@Setter Legt die Priorität der To-Do fest.
	@Exception Überprüft ob der Wert zwischen 1-3 liegt.
	 */
	public void setPriority(int priority)throws IllegalArgumentException{
		if(priority <= 0 || priority > 3){
			throw new IllegalArgumentException("Der Wert darf nicht unter 1 oder über 3 sein!");
		}
		this.priority = priority;
	}
	public void setCounter(int counter){
		this.counter = counter;
	}
	public int getPriority(){
		return this.priority;
	}
	public String getValue(){
		return value;
	}
	/*
	@ToString Wie das Objekt auf dem Terminal geprintet wird.
	 */
	public String toString(){
		return "" + counter + ": " + this.value + " (prio:" + this.priority + ") | Erstellt am: " + this.date + " | Uhrzeit: " + this.time;
	}
	public int compareTo(ToDo todo) {
		if(this.priority < todo.getPriority()){
			return -1;
		}
		if(this.priority > todo.getPriority()){
			return 1;
		}
		return 0;
	}
}

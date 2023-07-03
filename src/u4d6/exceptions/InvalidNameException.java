package u4d6.exceptions;

public class InvalidNameException extends Exception {
	// Se estendo Exception sto dichiarando una CHECKED EXCEPTION

	public InvalidNameException(String message) {
		super(message);
	}
}

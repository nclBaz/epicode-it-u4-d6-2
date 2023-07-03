package u4d6.exceptions;

public class NumberLessThanZeroException extends RuntimeException {
	// Se estendo RuntimeException sto dichiarando una UNCHECKED EXCEPTION
	public NumberLessThanZeroException(int number) {
		super("Il numero inserito " + number + " è minore di zero!");
	}
}

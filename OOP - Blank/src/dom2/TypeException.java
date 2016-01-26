package dom2;

public class TypeException extends Exception {

	public static final long serialVersionUID = 1L;

	public TypeException() {
		super();
	}

	public TypeException(String message) {
		super(message);
	}

	public TypeException(String message, Throwable cause) {
		super(message, cause);
	}

	public TypeException(Throwable cause) {
		super(cause);
	}
}

package animals.exceptions;

public class WeightException extends Exception{
	private String msg;

	public WeightException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return this.msg;
	}

}

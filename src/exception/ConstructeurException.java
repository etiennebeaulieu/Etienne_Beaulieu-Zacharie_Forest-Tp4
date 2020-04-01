package exception;

public class ConstructeurException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConstructeurException()
	{
		super();
	}

	public ConstructeurException(String message)
	{
		super(message);
	}
}

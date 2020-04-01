package exception;

public class PiocheException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PiocheException()
	{
		super();
	}

	public PiocheException(String message)
	{
		super(message);
	}
}
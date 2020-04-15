package exception;

//Étienne Beaulieu et Zacharie Forest
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

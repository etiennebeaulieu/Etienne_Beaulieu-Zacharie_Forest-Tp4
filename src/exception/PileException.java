package exception;

//Étienne Beaulieu et Zacharie Forest
public class PileException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PileException()
	{
		super();
	}

	public PileException(String message)
	{
		super(message);
	}
}
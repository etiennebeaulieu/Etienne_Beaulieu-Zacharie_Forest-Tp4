package exception;

//Étienne Beaulieu et Zacharie Forest
public class PileException extends RuntimeException
{
	public PileException()
	{
		super();
	}

	public PileException(String message)
	{
		super(message);
	}
}
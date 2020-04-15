package exception;

//Étienne Beaulieu et Zacharie Forest
public class PiocheException extends RuntimeException
{
	public PiocheException()
	{
		super();
	}

	public PiocheException(String message)
	{
		super(message);
	}
}
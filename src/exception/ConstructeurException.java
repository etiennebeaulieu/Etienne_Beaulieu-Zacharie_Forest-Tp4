package exception;

//Étienne Beaulieu et Zacharie Forest
public class ConstructeurException extends RuntimeException
{
	public ConstructeurException()
	{
		super();
	}

	public ConstructeurException(String message)
	{
		super(message);
	}
}

package exceptions;

public class ServiceException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServiceException(String msj, Throwable e) {
		super(msj,e);
	}
	
}

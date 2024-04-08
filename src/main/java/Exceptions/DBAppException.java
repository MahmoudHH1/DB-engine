package Exceptions;


public class DBAppException extends Exception {


	public DBAppException( String strMessage ){
		super( strMessage );
	}
	public DBAppException(Throwable cause){
		super(cause);
	}
	public DBAppException(String message, Throwable cause){
		super(message, cause);
	}
	

}
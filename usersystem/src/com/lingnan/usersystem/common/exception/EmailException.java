package com.lingnan.usersystem.common.exception;

/**
 * 邮箱验证异常类
 * @author haoge
 *
 */
public class EmailException extends ServiceException{

	/**
	 * 默认的构造方法
	 */
	public EmailException() {
		super();
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 * @param cause 异常的原因
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public EmailException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 * @param cause 异常的原因
	 */
	public EmailException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 */
	public EmailException(String message) {
		super(message);
		
	}

	/**
	 * 
	 * @param cause 异常的原因
	 */
	public EmailException(Throwable cause) {
		super(cause);
		
	}
      
}

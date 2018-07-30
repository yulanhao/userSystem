package com.lingnan.usersystem.common.exception;

/**
 * service 异常类
 * @author haoge
 *
 */
public class ServiceException extends RuntimeException{

	/**
	 * 默认的构造方法
	 */
	public ServiceException() {
		super();
		
	}

	/**
	 * 有参构造
	 * @param message 异常的详细信息
	 * @param cause  异常的原因
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public ServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * 有参构造
	 * @param message 异常的详细信息
	 * @param cause 异常的原因
	 */
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * 有参构造
	 * @param message 异常的详细信息
	 */
	public ServiceException(String message) {
		super(message);
		
	}

	/**
	 * 有参构造
	 * @param cause 异常的原因
	 */
	public ServiceException(Throwable cause) {
		super(cause);
		
	}
	
}

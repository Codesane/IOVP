package com.preprocessor.api;

/**
 * Created by felix on 8/16/15.
 */
public interface Result<T> {

	String getMessage();

	int getStatusCode();

	boolean isSuccessful();

	T getResult();
}
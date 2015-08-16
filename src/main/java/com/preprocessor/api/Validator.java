package com.preprocessor.api;

/**
 * Created by felix on 8/16/15.
 */
public interface Validator<R, T> {
	R validate(Validate<T> validate);
}
package com.preprocessor.api;

/**
 * Created by felix on 8/15/15.
 */
@FunctionalInterface
public interface Validate<T> {
	void validate(T value);
}
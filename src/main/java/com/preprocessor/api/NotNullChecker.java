package com.preprocessor.api;

/**
 * Created by felix on 8/16/15.
 */
public interface NotNullChecker<R> {
	R notNull(String parameterName);
}
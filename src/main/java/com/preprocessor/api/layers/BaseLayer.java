package com.preprocessor.api.layers;

import com.preprocessor.api.ResourceProvider;
import com.preprocessor.api.Validator;

/**
 *
 */
public interface BaseLayer<R, A> {

	/**
	 *
	 * */
	R notNull(String parameterName);

	/**
	 *
	 * */
	R validate(Validator<A> validate);
}
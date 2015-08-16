package com.preprocessor.api;

/**
 * Created by felix on 8/15/15.
 */
public interface Pipeline<M> {

	/**
	 *
	 * */
	<A> UniParameterizedLayer<M, A> with(A value);

	/**
	 *
	 * */
	<A> UniParameterizedLayer<M, A> with(Provider<A, M> provider);

	/**
	 *
	 * */
	M getModel();
}
package com.preprocessor.api;

import com.preprocessor.api.layers.MonoParameterizedLayer;

/**
 * Created by felix on 8/15/15.
 */
public interface Pipeline<M> {

	/**
	 *
	 * */
	<A> MonoParameterizedLayer<M, A> with(A value);

	/**
	 *
	 * */
	<A> MonoParameterizedLayer<M, A> with(Provider<A, M> provider);

	/**
	 *
	 * */
	M getModel();
}
package com.preprocessor.impl;

import com.preprocessor.api.Pipeline;
import com.preprocessor.api.Provider;
import com.preprocessor.api.MonoParameterizedLayer;

/**
 * Created by felix on 8/16/15.
 */
public class SimplePipeline<M> implements Pipeline<M> {

	private M model;

	public SimplePipeline(M model) {
		this.model = model;
	}

	@Override
	public <A> MonoParameterizedLayer<M, A> with(A value) {
		return new FirstLayer<>(this, value);
	}

	@Override
	public <A> MonoParameterizedLayer<M, A> with(Provider<A, M> provider) {
		return new FirstLayer<>(this, provider.provide(this.model));
	}

	@Override
	public M getModel() {
		return this.model;
	}
}
package com.preprocessor.impl;

import com.preprocessor.api.DiParameterizedLayer;
import com.preprocessor.api.MonoParameterizedLayer;
import com.preprocessor.api.Pipeline;
import com.preprocessor.api.Validate;
import com.preprocessor.transformers.DiTransformer;

/**
 * Created by felix on 8/16/15.
 */
public class SecondLayer<M, A, B> implements DiParameterizedLayer<M, A, B> {

	private final Pipeline<M> pipeline;

	private final A value1;
	private final B value2;

	public SecondLayer(Pipeline<M> pipeline, A value1, B value2) {
		this.pipeline = pipeline;

		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public <V> MonoParameterizedLayer<M, V> transform(DiTransformer<V, A, B> transformer) {
		return new FirstLayer<>(this.pipeline, transformer.transform(this.value1, this.value2));
	}

	@Override
	public DiParameterizedLayer<M, A, B> notNull(String parameterName) {
		return null;
	}


	@Override
	public DiParameterizedLayer<M, A, B> validate(Validate<B> validate) {
		validate.validate(value2);
		return this;
	}
}
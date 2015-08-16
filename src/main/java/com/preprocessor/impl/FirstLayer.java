package com.preprocessor.impl;

import com.preprocessor.api.*;
import com.preprocessor.transformers.UniTransformer;

import java.util.Objects;

/**
 * Created by felix on 8/16/15.
 */
public class FirstLayer<M, A> implements UniParameterizedLayer<M, A> {

	private final Pipeline<M> root;

	private final A value1;

	public FirstLayer(Pipeline<M> root, A value) {
		this.root = root;

		this.value1 = value;
	}

	@Override
	public <B> DiParameterizedLayer<M, A, B> withResourceProvider(ResourceProvider<B> resourceProvider) {
		return new SecondLayer<>(this.root, this.value1, resourceProvider.provideResource());
	}

	@Override
	public UniParameterizedLayer<M, A> validate(Validate<A> validate) {
		validate.validate(this.value1);

		return this;
	}

	@Override
	public <R> ValueApplier<M, R> transform(UniTransformer<R, A> transformer) {
		return new ValueApplier<>(this.root, transformer.transform(this.value1));
	}

	@Override
	public <B> DiParameterizedLayer<M, A, B> with(B value) {
		return new SecondLayer<>(this.root, this.value1, value);
	}

	@Override
	public UniParameterizedLayer<M, A> notNull(String parameterName) {
		Objects.requireNonNull(parameterName);

		if(this.value1 == null) {
			throw new PipelineException(new FinalResult("Value failed nullcheck", 1));
		}

		return this;
	}
}

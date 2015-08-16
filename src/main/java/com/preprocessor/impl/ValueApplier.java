package com.preprocessor.impl;

import com.preprocessor.api.Applier;
import com.preprocessor.api.Pipeline;

/**
 * Created by felix on 8/16/15.
 */
public class ValueApplier<M, T> implements Applier<M, T> {

	private final T value;

	private final Pipeline<M> pipeline;

	public ValueApplier(Pipeline<M> pipeline, T value) {
		this.pipeline = pipeline;
		this.value = value;
	}

	@Override
	public Pipeline<M> apply(ApplierFunc<M, T> applier) {
		applier.apply(this.pipeline.getModel(), this.value);
		return this.pipeline;
	}
}
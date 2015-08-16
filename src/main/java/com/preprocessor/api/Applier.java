package com.preprocessor.api;

/**
 * Created by felix on 8/15/15.
 */
@FunctionalInterface
public interface Applier<M, T> {
	Pipeline<M> apply(ApplierFunc<M, T> applyFunc);

	interface ApplierFunc<M, V> {
		void apply(M model, V value);
	}
}

package com.preprocessor.transformers;

/**
 * Created by felix on 8/16/15.
 */
@FunctionalInterface
public interface MonoTransformer<R, A> {
	R transform(A p1);
}
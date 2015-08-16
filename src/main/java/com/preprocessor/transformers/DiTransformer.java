package com.preprocessor.transformers;

/**
 * Created by felix on 8/16/15.
 */
@FunctionalInterface
public interface DiTransformer<R, A, B> {
	R transform(A p1, B p2);
}
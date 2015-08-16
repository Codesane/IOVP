package com.preprocessor.api;

/**
 * Created by felix on 8/16/15.
 */
@FunctionalInterface
public interface Applier<M, V> {
	void apply(M model, V value);
}
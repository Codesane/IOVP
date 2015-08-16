package com.preprocessor.api;

/**
 * Created by felix on 8/15/15.
 */
@FunctionalInterface
public interface Provider<P, M> {
	P provide(M model);
}
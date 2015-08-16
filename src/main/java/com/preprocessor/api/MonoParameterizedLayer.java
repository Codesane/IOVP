package com.preprocessor.api;

import com.preprocessor.transformers.MonoTransformer;

/**
 * Created by felix on 8/15/15.
 */
public interface MonoParameterizedLayer<M, A> extends CompositeUniformLayer<MonoParameterizedLayer<M, A>, A> {

	Pipeline<M> apply(Applier<M, A> applyFunc);

	<V> MonoParameterizedLayer<M, V> transform(MonoTransformer<V, A> transformer);

	<B> DiParameterizedLayer<M, A, B> with(B value);

	<B> DiParameterizedLayer<M, A, B> withResourceProvider(ResourceProvider<B> resourceProvider);
}
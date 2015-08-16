package com.preprocessor.api;

import com.preprocessor.transformers.UniTransformer;

/**
 * Created by felix on 8/15/15.
 */
public interface UniParameterizedLayer<M, A> extends CompositeUniformLayer<UniParameterizedLayer<M, A>, A> {

	<R> Applier<M, R> transform(UniTransformer<R, A> transformer);

	<B> DiParameterizedLayer<M, A, B> with(B value);

	<B> DiParameterizedLayer<M, A, B> withResourceProvider(ResourceProvider<B> resourceProvider);
}
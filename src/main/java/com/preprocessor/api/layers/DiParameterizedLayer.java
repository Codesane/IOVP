package com.preprocessor.api.layers;

import com.preprocessor.transformers.DiTransformer;

/**
 * Created by felix on 8/15/15.
 */
public interface DiParameterizedLayer<M, A, B> extends BaseLayer<DiParameterizedLayer<M, A, B>, B> {

	<V> MonoParameterizedLayer<M, V> transform(DiTransformer<V, A, B> transformer);
}
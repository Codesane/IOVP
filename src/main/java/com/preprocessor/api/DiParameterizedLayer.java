package com.preprocessor.api;

import com.preprocessor.transformers.DiTransformer;

/**
 * Created by felix on 8/15/15.
 */
public interface DiParameterizedLayer<M, A, B> extends NotNullChecker<DiParameterizedLayer<M, A, B>>,
											Validator<DiParameterizedLayer<M, A, B>, B>{

	<R> Applier<M, R> transform(DiTransformer<R, A, B> transformer);
}
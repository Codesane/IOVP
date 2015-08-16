package com.preprocessor.impl;

import com.preprocessor.api.Result;

/**
 * Created by felix on 8/16/15.
 */
public class PipelineException extends RuntimeException {

	private final Result res;

	public PipelineException(Result res) {
		this.res = res;
	}

	public Result getRes() {
		return res;
	}
}

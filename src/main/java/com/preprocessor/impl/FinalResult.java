package com.preprocessor.impl;

import com.preprocessor.api.Result;

/**
 * Created by felix on 8/16/15.
 */
public class FinalResult<R> implements Result<R> {

	private final R res;

	private String message;

	private int statusCode;

	private FinalResult(R res, String message, int statusCode) {
		this.res = res;
		this.message = message;
		this.statusCode = statusCode;
	}

	public FinalResult(String message, int statusCode) {
		this(null, message, statusCode);
	}

	public FinalResult(R res) {
		this(res, null, 0);
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public int getStatusCode() {
		return this.statusCode;
	}

	@Override
	public boolean isSuccessful() {
		return this.res != null;
	}

	@Override
	public R getResult() {
		return this.res;
	}
}
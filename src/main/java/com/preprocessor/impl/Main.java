package com.preprocessor.impl;

import com.preprocessor.api.ResourceProvider;

/**
 * Created by felix on 8/15/15.
 */
public class Main {

	public Main() {

		Long startTime = 123L;
		Long endTime = System.currentTimeMillis();

		try {
			new SimplePipeline<>(new MyPojo())
					.with(startTime)
					.notNull("startTime")
					.withResourceProvider(new MyResourceProvider())
					.notNull("endTime")
					.transform(Interval::new)
					.apply(MyPojo::setInterval);

		} catch(PipelineException e) {
			System.out.println(e.getRes().getMessage());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	class MyResourceProvider implements ResourceProvider<Long> {
		@Override
		public Long provideResource() {
			return 123L;
		}
	}

	class MyPojo {

		private Interval interval;

		public MyPojo() {}

		public Interval getInterval() {
			return interval;
		}

		public void setInterval(Interval interval) {
			this.interval = interval;
		}
	}

	class Interval {

		private final long startTime;

		private final long endTime;

		public Interval(long t1, long t2) {
			this.startTime = t1;
			this.endTime = t2;
		}

		public long getStartTime() {
			return startTime;
		}

		public long getEndTime() {
			return endTime;
		}

		@Override
		public String toString() {
			return "Interval{" +
					"startTime=" + startTime +
					", endTime=" + endTime +
					'}';
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
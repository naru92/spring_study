package hello.advanced.trace.hellotrace;


import org.junit.jupiter.api.*;

import hello.advanced.trace.*;


/*
* @author 강나루
* @version 0, 로그추적기 테스트코드
* @see None
*/


public class HelloTraceV1Test {
	
	@Test
	void begin_end() {
		HelloTraceV1 trace = new HelloTraceV1();
		TraceStatus status = trace.begin("hello");
		trace.end(status);
	}
	
	@Test
	void begin_excetion() {
		HelloTraceV1 trace = new HelloTraceV1();
		TraceStatus status = trace.begin("hello");
		trace.exception(status, new IllegalStateException());
	}
}

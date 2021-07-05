package com.zleying.flink;

import org.apache.flink.api.common.state.StateTtlConfig;
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment;

public class FlinkStateTest {
    public static void main(String[] args) {
        StreamExecutionEnvironment executionEnvironment = StreamExecutionEnvironment.getExecutionEnvironment();
        StateTtlConfig.newBuilder();


    }
}

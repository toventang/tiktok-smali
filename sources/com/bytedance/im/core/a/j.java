package com.bytedance.im.core.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class j implements Serializable {
    @c(a = "batch_query_enable_and_query_limit")
    public int batchQueryEnableAndQueryLimit;
    @c(a = "full_info_optimize_enable")
    public int fullInfoOptimizeEnable;
    @c(a = "init_conv_list_pull_async_enable")
    public int initConvListPullAsyncEnable;

    static {
        Covode.recordClassIndex(22621);
    }

    public String toString() {
        return "OptimizeConvListPullConfig{init_conv_list_pull_async_enable:" + this.initConvListPullAsyncEnable + ", full_info_optimize_enable:" + this.fullInfoOptimizeEnable + ", batch_query_enable_and_query_limit:" + this.batchQueryEnableAndQueryLimit + "}";
    }
}

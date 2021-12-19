package com.ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final class t implements RejectedExecutionHandler {
    static {
        Covode.recordClassIndex(41200);
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        a.b(3, null, "Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString() + " Pending tasks: " + threadPoolExecutor.getQueue());
    }
}

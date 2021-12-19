package com.bytedance.ies.xbridge.base.runtime.depend;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

public interface IHostThreadPoolExecutorDepend {
    static {
        Covode.recordClassIndex(21430);
    }

    ExecutorService getNormalThreadExecutor();
}

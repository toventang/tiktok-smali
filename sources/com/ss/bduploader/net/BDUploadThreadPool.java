package com.ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BDUploadThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;

    static {
        Covode.recordClassIndex(100684);
    }

    public static int getPoolSize() {
        MethodCollector.i(206);
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        int poolSize = mExecutorInstance.getPoolSize();
        MethodCollector.o(206);
        return poolSize;
    }

    public static void shutdown() {
        MethodCollector.i(217);
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
        MethodCollector.o(217);
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        MethodCollector.i(14);
        if (mExecutorInstance == null) {
            synchronized (BDUploadThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 300, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(14);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = mExecutorInstance;
        MethodCollector.o(14);
        return threadPoolExecutor;
    }

    public static Future addExecuteTask(Runnable runnable) {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.submit(runnable);
    }
}

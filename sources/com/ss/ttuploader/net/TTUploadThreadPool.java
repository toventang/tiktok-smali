package com.ss.ttuploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TTUploadThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;

    static {
        Covode.recordClassIndex(101435);
    }

    public static int getPoolSize() {
        MethodCollector.i(3368);
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        int poolSize = mExecutorInstance.getPoolSize();
        MethodCollector.o(3368);
        return poolSize;
    }

    public static void shutdown() {
        MethodCollector.i(3370);
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
        MethodCollector.o(3370);
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        MethodCollector.i(3360);
        if (mExecutorInstance == null) {
            synchronized (TTUploadThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new ThreadPoolExecutor(3, Integer.MAX_VALUE, 300, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3360);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = mExecutorInstance;
        MethodCollector.o(3360);
        return threadPoolExecutor;
    }

    public static Future addExecuteTask(Runnable runnable) {
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        return mExecutorInstance.submit(runnable);
    }
}

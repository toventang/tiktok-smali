package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AVMDLThreadPool {
    private static volatile ThreadPoolExecutor mExecutorInstance;
    private static Deque<AsyncRunnable> mReadyRunnables = new ArrayDeque();
    private static Deque<AsyncRunnable> mRunningRunnables = new ArrayDeque();

    public static class AsyncRunnable implements Runnable {
        private Runnable mRunnable;

        static {
            Covode.recordClassIndex(101149);
        }

        public void run() {
            this.mRunnable.run();
            AVMDLThreadPool._finished(this);
        }

        public AsyncRunnable(Runnable runnable) {
            this.mRunnable = runnable;
        }
    }

    static {
        Covode.recordClassIndex(101148);
    }

    public static int getPoolSize() {
        MethodCollector.i(1764);
        if (mExecutorInstance == null) {
            getExecutorInstance();
        }
        int poolSize = mExecutorInstance.getPoolSize();
        MethodCollector.o(1764);
        return poolSize;
    }

    public static void shutdown() {
        MethodCollector.i(1766);
        if (mExecutorInstance != null) {
            mExecutorInstance.shutdown();
        }
        MethodCollector.o(1766);
    }

    private static void _promoteRunnable() {
        MethodCollector.i(1768);
        if (mReadyRunnables.size() > 0) {
            Iterator<AsyncRunnable> it = mReadyRunnables.iterator();
            if (it.hasNext()) {
                AsyncRunnable next = it.next();
                it.remove();
                mRunningRunnables.add(next);
                mExecutorInstance.execute(next);
            }
        }
        MethodCollector.o(1768);
    }

    public static ThreadPoolExecutor getExecutorInstance() {
        MethodCollector.i(1756);
        if (mExecutorInstance == null) {
            synchronized (AVMDLThreadPool.class) {
                try {
                    if (mExecutorInstance == null) {
                        mExecutorInstance = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1756);
                    throw th;
                }
            }
        }
        ThreadPoolExecutor threadPoolExecutor = mExecutorInstance;
        MethodCollector.o(1756);
        return threadPoolExecutor;
    }

    public static synchronized void _finished(AsyncRunnable asyncRunnable) {
        synchronized (AVMDLThreadPool.class) {
            MethodCollector.i(1767);
            mRunningRunnables.remove(asyncRunnable);
            _promoteRunnable();
            MethodCollector.o(1767);
        }
    }

    public static void setExecutorInstance(ThreadPoolExecutor threadPoolExecutor) {
        MethodCollector.i(1750);
        synchronized (AVMDLThreadPool.class) {
            try {
                mExecutorInstance = threadPoolExecutor;
            } finally {
                MethodCollector.o(1750);
            }
        }
    }

    public static synchronized Future addExecuteTask(Runnable runnable) {
        synchronized (AVMDLThreadPool.class) {
            MethodCollector.i(1760);
            if (runnable == null) {
                MethodCollector.o(1760);
                return null;
            }
            if (mExecutorInstance == null) {
                getExecutorInstance();
            }
            AVMDLLog.d("AVMDLThreadPool", "addExecuteTask,cur thread num:" + getPoolSize());
            AsyncRunnable asyncRunnable = new AsyncRunnable(runnable);
            if (mRunningRunnables.size() >= 64) {
                mReadyRunnables.add(asyncRunnable);
                MethodCollector.o(1760);
                return null;
            }
            mRunningRunnables.add(asyncRunnable);
            Future<?> submit = mExecutorInstance.submit(asyncRunnable);
            MethodCollector.o(1760);
            return submit;
        }
    }
}

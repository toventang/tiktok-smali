package com.ss.avframework.utils;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicBoolean;

public class SafeHandlerThread extends HandlerThread {
    private long mAliveTimeMs = 0;
    public IDispatchInterceptMainException mDispatch;
    private boolean mEnableSafeMode;
    protected SafeHandler mHandler;
    private boolean mHasStart;
    public final Object mLockFence = new Object();
    private AtomicBoolean mLocked = new AtomicBoolean(false);
    public boolean mQuiting;
    private final Runnable mReleaseRunnable = new Runnable() {
        /* class com.ss.avframework.utils.SafeHandlerThread.AnonymousClass1 */

        static {
            Covode.recordClassIndex(100597);
        }

        public void run() {
            MethodCollector.i(12439);
            if (SafeHandlerThread.this.isLocked() || SafeHandlerThread.this.mReleased) {
                MethodCollector.o(12439);
                return;
            }
            synchronized (SafeHandlerThread.this.mLockFence) {
                try {
                    if (!SafeHandlerThread.this.isLocked()) {
                        SafeHandlerThread.this.mReleased = true;
                        Runnable runnable = SafeHandlerThread.this.mReleaseRunnableOuter;
                        if (runnable != null) {
                            runnable.run();
                        }
                        SafeHandlerThread.this.release();
                    }
                } finally {
                    MethodCollector.o(12439);
                }
            }
        }
    };
    public Runnable mReleaseRunnableOuter;
    public volatile boolean mReleased;

    public interface IDispatchInterceptMainException {
        static {
            Covode.recordClassIndex(100600);
        }

        boolean dispatchInterceptMainException(String str, Throwable th);
    }

    static {
        Covode.recordClassIndex(100596);
    }

    public boolean isLocked() {
        return this.mLocked.get();
    }

    public SafeHandlerThread lock() {
        return lock(null);
    }

    public boolean quit() {
        this.mQuiting = true;
        return super.quit();
    }

    public boolean quitSafely() {
        this.mQuiting = true;
        return super.quitSafely();
    }

    private SafeHandler getHandlerInner() {
        if (this.mHandler == null) {
            this.mHandler = new SafeHandler(getLooper());
        }
        return this.mHandler;
    }

    public synchronized Handler getHandler() {
        SafeHandler handlerInner;
        MethodCollector.i(14205);
        handlerInner = getHandlerInner();
        MethodCollector.o(14205);
        return handlerInner;
    }

    public synchronized void start() {
        MethodCollector.i(13670);
        synchronized (this) {
            try {
                if (!this.mHasStart) {
                    this.mHasStart = true;
                    super.start();
                }
            } finally {
                MethodCollector.o(13670);
            }
        }
    }

    public void release() {
        AVLog.ioi("SafeHandlerThread", "Release thread:" + getName());
        int i2 = Build.VERSION.SDK_INT;
        try {
            quitSafely();
        } catch (Throwable unused) {
            super.quit();
        }
    }

    public static class SafeHandler extends Handler {
        private Handler.Callback mCallback;

        static {
            Covode.recordClassIndex(100601);
        }

        SafeHandler(Looper looper) {
            super(looper);
        }

        /* access modifiers changed from: package-private */
        public void setHandlerCallback(Handler.Callback callback) {
            this.mCallback = callback;
        }

        public void handleMessage(Message message) {
            Handler.Callback callback = this.mCallback;
            if (callback != null) {
                callback.handleMessage(message);
            }
        }
    }

    public void setAliveTimeMs(long j2) {
        this.mAliveTimeMs = j2;
    }

    public void post(Message message) {
        getHandler().sendMessage(message);
    }

    public void removeCallbacks(Runnable runnable) {
        getHandler().removeCallbacks(runnable);
    }

    public boolean post(int i2) {
        return getHandler().sendEmptyMessage(i2);
    }

    public boolean postAtFrontOfQueue(Runnable runnable) {
        return getHandler().postAtFrontOfQueue(runnable);
    }

    public void setHandlerCallback(Handler.Callback callback) {
        SafeHandler handlerInner = getHandlerInner();
        if (handlerInner != null) {
            handlerInner.setHandlerCallback(callback);
        }
    }

    public SafeHandlerThread(String str) {
        super(str);
    }

    public synchronized void enableSafeMode(IDispatchInterceptMainException iDispatchInterceptMainException) {
        MethodCollector.i(14206);
        if (!this.mEnableSafeMode || this.mDispatch == null) {
            this.mEnableSafeMode = true;
            this.mDispatch = iDispatchInterceptMainException;
            getHandler().post(new Runnable() {
                /* class com.ss.avframework.utils.SafeHandlerThread.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(100599);
                }

                public void run() {
                    String str;
                    MethodCollector.i(13574);
                    while (!SafeHandlerThread.this.mQuiting) {
                        try {
                            Looper.loop();
                        } catch (Throwable th) {
                            boolean dispatchInterceptMainException = SafeHandlerThread.this.mDispatch.dispatchInterceptMainException(SafeHandlerThread.this.getName(), th);
                            if (dispatchInterceptMainException) {
                                str = "";
                            } else {
                                str = "Crash!! ";
                            }
                            String str2 = str + "ReportError: thread-" + Thread.currentThread().getName() + ", message-" + th.getMessage();
                            AVLog.e("SafeHandlerThread", str2);
                            if (AVLog.isLogKibanaDeviceSet()) {
                                AVLog.logKibana(6, "SafeHandlerThread", str2, th);
                            }
                            if (!dispatchInterceptMainException) {
                                try {
                                    Thread.sleep(1000);
                                } catch (Exception unused) {
                                }
                                MethodCollector.o(13574);
                                throw th;
                            }
                        }
                    }
                    MethodCollector.o(13574);
                }
            });
            MethodCollector.o(14206);
            return;
        }
        MethodCollector.o(14206);
    }

    public void setThreadName(final String str) {
        if (!post(new Runnable() {
            /* class com.ss.avframework.utils.SafeHandlerThread.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100598);
            }

            public void run() {
                SafeHandlerThread.this.setName(str);
            }
        })) {
            AVLog.logKibana(6, "SafeHandlerThread", "Set name failed.current:" + getName() + ",new:" + str, null);
        }
    }

    public void unlock(Runnable runnable) {
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (this.mAliveTimeMs > 0) {
            this.mReleaseRunnableOuter = runnable;
            getHandlerInner().postDelayed(this.mReleaseRunnable, this.mAliveTimeMs);
        }
        this.mLocked.set(false);
    }

    public SafeHandlerThread lock(Handler.Callback callback) {
        MethodCollector.i(14170);
        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
        if (!isLocked() && !this.mReleased) {
            synchronized (this.mLockFence) {
                try {
                    if (!this.mReleased) {
                        getHandlerInner().removeCallbacks(this.mReleaseRunnable);
                        this.mLocked.set(true);
                        setHandlerCallback(callback);
                        return this;
                    }
                } finally {
                    MethodCollector.o(14170);
                }
            }
        }
        MethodCollector.o(14170);
        return null;
    }

    public boolean post(Runnable runnable) {
        return getHandler().post(runnable);
    }

    public boolean postDelayed(Runnable runnable, long j2) {
        return getHandler().postDelayed(runnable, j2);
    }

    public boolean post(int i2, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i2, obj));
    }

    public boolean post(int i2, int i3, int i4, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i2, i3, i4, obj));
    }
}

package com.lynx.tasm.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SystemThread {
    private Thread mAndroidThread;
    public long mNativeThread;

    static {
        Covode.recordClassIndex(34870);
    }

    public static native void nativeRun(long j2);

    public void join() {
        MethodCollector.i(13368);
        try {
            this.mAndroidThread.join();
            MethodCollector.o(13368);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            MethodCollector.o(13368);
        }
    }

    public void stop() {
        Looper myLooper = Looper.myLooper();
        if (Thread.currentThread() == this.mAndroidThread && myLooper != null) {
            myLooper.quit();
        }
    }

    public static void attachMainThread(final long j2) {
        MethodCollector.i(13291);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            nativeRun(j2);
            MethodCollector.o(13291);
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            /* class com.lynx.tasm.base.SystemThread.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34872);
            }

            public final void run() {
                MethodCollector.i(12110);
                SystemThread.nativeRun(j2);
                MethodCollector.o(12110);
            }
        });
        MethodCollector.o(13291);
    }

    private void createAndroidThread(String str, int i2) {
        MethodCollector.i(13216);
        Thread thread = new Thread(new Runnable() {
            /* class com.lynx.tasm.base.SystemThread.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34871);
            }

            public final void run() {
                MethodCollector.i(12945);
                Looper.prepare();
                SystemThread.nativeRun(SystemThread.this.mNativeThread);
                Looper.loop();
                MethodCollector.o(12945);
            }
        }, str);
        this.mAndroidThread = thread;
        thread.setPriority(i2);
        this.mAndroidThread.start();
        MethodCollector.o(13216);
    }

    public static SystemThread create(long j2, String str, int i2) {
        return new SystemThread(j2, str, i2);
    }

    private SystemThread(long j2, String str, int i2) {
        this.mNativeThread = j2;
        createAndroidThread(str, i2);
    }
}

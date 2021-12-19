package com.ss.bytertc.engine.adapter;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class VideoSinkTask extends HandlerThread {
    private Handler mHandler;
    private Object mLock = new Object();

    static {
        Covode.recordClassIndex(100836);
    }

    public VideoSinkTask() {
        super("VideoSinkTaskManager", 0);
    }

    public void exit() {
        MethodCollector.i(8776);
        synchronized (this.mLock) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                quitSafely();
                this.mHandler = null;
            } finally {
                MethodCollector.o(8776);
            }
        }
    }

    public void init() {
        MethodCollector.i(8771);
        synchronized (this.mLock) {
            try {
                start();
                this.mHandler = new Handler(getLooper());
            } finally {
                MethodCollector.o(8771);
            }
        }
    }

    public void post(Runnable runnable) {
        MethodCollector.i(8772);
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } finally {
                MethodCollector.o(8772);
            }
        }
    }

    public void postDelayed(Runnable runnable, long j2) {
        MethodCollector.i(8774);
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.postDelayed(runnable, j2);
                }
            } finally {
                MethodCollector.o(8774);
            }
        }
    }
}

package com.ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class SafeVerityCallbackManager {
    private static final Object LOCK = new Object();
    private static volatile SafeVerityCallbackManager sInstance;
    private SafeVerityCallback mCallback;

    private SafeVerityCallbackManager() {
    }

    static {
        Covode.recordClassIndex(79728);
    }

    public static SafeVerityCallbackManager getInstance() {
        MethodCollector.i(12666);
        if (sInstance == null) {
            synchronized (SafeVerityCallbackManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SafeVerityCallbackManager();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12666);
                    throw th;
                }
            }
        }
        SafeVerityCallbackManager safeVerityCallbackManager = sInstance;
        MethodCollector.o(12666);
        return safeVerityCallbackManager;
    }

    public void notifyResult(SafeVerityResponse safeVerityResponse) {
        MethodCollector.i(12668);
        synchronized (LOCK) {
            try {
                SafeVerityCallback safeVerityCallback = this.mCallback;
                if (safeVerityCallback != null) {
                    safeVerityCallback.onComplete(safeVerityResponse);
                    this.mCallback = null;
                }
            } finally {
                MethodCollector.o(12668);
            }
        }
    }

    public void register(SafeVerityCallback safeVerityCallback) {
        MethodCollector.i(12667);
        if (safeVerityCallback == null) {
            MethodCollector.o(12667);
            return;
        }
        synchronized (LOCK) {
            try {
                this.mCallback = safeVerityCallback;
            } finally {
                MethodCollector.o(12667);
            }
        }
    }
}

package com.ss.bytertc.engine.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AppMonitor implements Application.ActivityLifecycleCallbacks {
    private static AppMonitor INSTANCE;
    private List<Callback> mCallbacks = new CopyOnWriteArrayList();

    public interface Callback {
        static {
            Covode.recordClassIndex(101034);
        }

        void callback(int i2);
    }

    static {
        Covode.recordClassIndex(101033);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        notifyCallback(0);
    }

    public void onActivityResumed(Activity activity) {
        notifyCallback(1);
    }

    private AppMonitor(Context context) {
        registerLifecycle(context);
    }

    public static Context com_ss_bytertc_engine_utils_AppMonitor_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private void registerLifecycle(Context context) {
        ((Application) com_ss_bytertc_engine_utils_AppMonitor_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context)).registerActivityLifecycleCallbacks(this);
    }

    public AppMonitor unRegister(Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            return this;
        }
        this.mCallbacks.remove(callback);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void notifyCallback(int i2) {
        for (Callback callback : this.mCallbacks) {
            callback.callback(i2);
        }
    }

    public boolean release(Context context) {
        if (context == null) {
            return false;
        }
        ((Application) com_ss_bytertc_engine_utils_AppMonitor_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context)).unregisterActivityLifecycleCallbacks(this);
        this.mCallbacks.clear();
        INSTANCE = null;
        return true;
    }

    public static AppMonitor get(Context context) {
        MethodCollector.i(9966);
        if (INSTANCE == null) {
            synchronized (AppMonitor.class) {
                try {
                    if (INSTANCE == null) {
                        INSTANCE = new AppMonitor(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9966);
                    throw th;
                }
            }
        }
        AppMonitor appMonitor = INSTANCE;
        MethodCollector.o(9966);
        return appMonitor;
    }

    public AppMonitor register(Context context, Callback callback) {
        if (!this.mCallbacks.contains(callback)) {
            this.mCallbacks.add(callback);
        }
        notifyCallback(CommonUtils.isInForeground(context) ? 1 : 0);
        return this;
    }
}

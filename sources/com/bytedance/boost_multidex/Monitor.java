package com.bytedance.boost_multidex;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.lancet.m;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Monitor {
    private static Monitor sMonitor;
    private ScheduledExecutorService mExecutor = com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool(1);
    private String mProcessName;

    static {
        Covode.recordClassIndex(15652);
    }

    public static int com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    public static int com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    public static int com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2, Throwable th) {
        return 0;
    }

    static Monitor get() {
        return sMonitor;
    }

    static void init(Monitor monitor) {
        if (monitor == null) {
            monitor = new Monitor();
        }
        sMonitor = monitor;
    }

    /* access modifiers changed from: protected */
    public void doAfterInstall(final Runnable runnable) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
            /* class com.bytedance.boost_multidex.Monitor.AnonymousClass1 */

            static {
                Covode.recordClassIndex(15653);
            }

            public boolean queueIdle() {
                Monitor.this.getExecutor().schedule(runnable, 5000, TimeUnit.MILLISECONDS);
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void doBeforeHandleOpt() {
        MethodCollector.i(6743);
        try {
            Thread.sleep(10000);
            MethodCollector.o(6743);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            MethodCollector.o(6743);
        }
    }

    public ScheduledExecutorService getExecutor() {
        return this.mExecutor;
    }

    /* access modifiers changed from: package-private */
    public String getProcessName() {
        return this.mProcessName;
    }

    /* access modifiers changed from: protected */
    public boolean isEnableNativeCheckSum() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
        com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_d("BoostMultiDex", str);
    }

    /* access modifiers changed from: protected */
    public void logError(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str, Throwable th) {
        com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_e("BoostMultiDex", str, th);
    }

    /* access modifiers changed from: protected */
    public void logErrorAfterInstall(String str, Throwable th) {
        com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_e("BoostMultiDex", str, th);
    }

    /* access modifiers changed from: protected */
    public void logInfo(String str) {
        com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_i("BoostMultiDex", str);
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str) {
        com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_w("BoostMultiDex", str);
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str, Throwable th) {
        com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LogLancet_w("BoostMultiDex", str, th);
    }

    /* access modifiers changed from: protected */
    public void reportAfterInstall(long j2, long j3, long j4, String str) {
    }

    public Monitor setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.mExecutor = scheduledExecutorService;
        return this;
    }

    public Monitor setProcessName(String str) {
        this.mProcessName = str;
        return this;
    }

    public static ScheduledExecutorService com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_thread_ThreadPoolLancet_newScheduledThreadPool(int i2) {
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = i2;
        return (ScheduledExecutorService) g.a(a2.a());
    }

    public static void com_bytedance_boost_multidex_Monitor_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }
}

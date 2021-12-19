package com.bytedance.android.livesdk.s;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;

public final class d extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final e f21100a;

    /* renamed from: b  reason: collision with root package name */
    public int f21101b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21102c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21103d;

    /* renamed from: e  reason: collision with root package name */
    private final Class[] f21104e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f21105f = new Handler();

    /* renamed from: g  reason: collision with root package name */
    private int f21106g;

    static {
        Covode.recordClassIndex(12464);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.f21106g++;
    }

    public final void onActivityStopped(Activity activity) {
        int i2 = this.f21106g - 1;
        this.f21106g = i2;
        if (i2 == 0) {
            this.f21100a.a();
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f21101b--;
        this.f21105f.postDelayed(new Runnable() {
            /* class com.bytedance.android.livesdk.s.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(12465);
            }

            public final void run() {
                if (d.this.f21101b == 0) {
                    d.this.f21102c = true;
                    d.this.f21100a.a();
                }
            }
        }, 300);
    }

    public final void onActivityResumed(Activity activity) {
        this.f21101b++;
        Class[] clsArr = this.f21104e;
        if (clsArr != null) {
            int length = clsArr.length;
            int i2 = 0;
            while (i2 < length && !clsArr[i2].isInstance(activity)) {
                i2++;
            }
        }
        if (this.f21102c) {
            this.f21102c = false;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(a(intent, "reason"))) {
            this.f21100a.a();
        }
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.s.d.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }

    public d(Context context, boolean z, Class[] clsArr, e eVar) {
        this.f21103d = z;
        this.f21104e = clsArr;
        this.f21100a = eVar;
        ((Application) context).registerActivityLifecycleCallbacks(this);
        b(context, this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }
}

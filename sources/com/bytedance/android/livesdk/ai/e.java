package com.bytedance.android.livesdk.ai;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.depend.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class e extends BroadcastReceiver implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f13763d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f13764a;

    /* renamed from: b  reason: collision with root package name */
    public Context f13765b;

    /* renamed from: c  reason: collision with root package name */
    public b f13766c;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<Context> f13767e;

    static {
        Covode.recordClassIndex(7659);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7660);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.b
    public final void a(boolean z) {
        this.f13764a = z;
    }

    public final void onActivityDestroyed(Activity activity) {
        l.d(activity, "");
        b bVar = this.f13766c;
        if (bVar != null) {
            bVar.f(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        l.d(activity, "");
        b bVar = this.f13766c;
        if (bVar != null) {
            bVar.d(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        l.d(activity, "");
        b bVar = this.f13766c;
        if (bVar != null) {
            bVar.c(activity);
        }
    }

    public final void onActivityStarted(Activity activity) {
        l.d(activity, "");
        b bVar = this.f13766c;
        if (bVar != null) {
            bVar.b(activity);
        }
    }

    public final void onActivityStopped(Activity activity) {
        b bVar;
        l.d(activity, "");
        if (this.f13764a && (bVar = this.f13766c) != null) {
            Intent intent = activity.getIntent();
            l.b(intent, "");
            bVar.a(activity, intent);
        }
        b bVar2 = this.f13766c;
        if (bVar2 != null) {
            bVar2.e(activity);
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        l.d(activity, "");
        b bVar = this.f13766c;
        if (bVar != null) {
            bVar.a(activity);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.d(activity, "");
        l.d(bundle, "");
        b bVar = this.f13766c;
        if (bVar != null) {
            bVar.a(activity, bundle);
        }
    }

    public e(Context context, b bVar) {
        l.d(context, "");
        this.f13765b = context;
        this.f13766c = bVar;
        Context applicationContext = this.f13765b.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        WeakReference<Context> weakReference = new WeakReference<>(applicationContext);
        this.f13767e = weakReference;
        Context context2 = weakReference.get();
        if (context2 != null) {
            b(context2, this, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
    }

    public final void onReceive(Context context, Intent intent) {
        b bVar;
        l.d(intent, "");
        String action = intent.getAction();
        if (action != null && l.a((Object) action, (Object) "android.intent.action.CLOSE_SYSTEM_DIALOGS") && m.a(a(intent, "reason"), "homekey") && (bVar = this.f13766c) != null) {
            bVar.a(context, intent);
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ai.e.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}

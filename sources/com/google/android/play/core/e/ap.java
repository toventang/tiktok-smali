package com.google.android.play.core.e;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.google.android.play.core.b.b;
import com.google.android.play.core.c.c;

public final class ap extends c<f> {

    /* renamed from: a  reason: collision with root package name */
    private static ap f53247a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f53248b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final aa f53249c;

    static {
        Covode.recordClassIndex(32910);
    }

    private ap(Context context, aa aaVar) {
        super(new b("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f53249c = aaVar;
    }

    public static synchronized ap a(Context context) {
        ap apVar;
        synchronized (ap.class) {
            MethodCollector.i(9979);
            if (f53247a == null) {
                f53247a = new ap(context, ah.f53232a);
            }
            apVar = f53247a;
            MethodCollector.o(9979);
        }
        return apVar;
    }

    @Override // com.google.android.play.core.c.c
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        Context context2 = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null) {
            if (context2 != null) {
                bundleExtra.setClassLoader(context2.getClassLoader());
            }
            f a2 = f.a(bundleExtra);
            this.f53183d.a("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
            ab a3 = this.f53249c.a();
            if (a2.b() != 3 || a3 == null) {
                a(a2);
            } else {
                a3.a(a2.k(), new an(this, a2, intent, context));
            }
        }
    }
}

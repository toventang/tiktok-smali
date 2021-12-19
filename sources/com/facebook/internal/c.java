package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.facebook.a.m;
import com.facebook.internal.a.b.a;

public class c extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static c f48596a;

    /* renamed from: b  reason: collision with root package name */
    private Context f48597b;

    static {
        Covode.recordClassIndex(29301);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (!a.a(this)) {
            try {
                if (!a.a(this)) {
                    try {
                        LocalBroadcastManager.getInstance(this.f48597b).unregisterReceiver(this);
                    } catch (Throwable th) {
                        a.a(th, this);
                    }
                }
                super.finalize();
            } catch (Throwable th2) {
                a.a(th2, this);
            }
        }
    }

    private c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f48597b = applicationContext;
    }

    public static c a(Context context) {
        if (a.a(c.class)) {
            return null;
        }
        try {
            c cVar = f48596a;
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(context);
            f48596a = cVar2;
            if (!a.a(cVar2)) {
                try {
                    LocalBroadcastManager.getInstance(cVar2.f48597b).registerReceiver(cVar2, new IntentFilter("com.parse.bolts.measurement_event"));
                } catch (Throwable th) {
                    a.a(th, cVar2);
                }
            }
            return f48596a;
        } catch (Throwable th2) {
            a.a(th2, c.class);
            return null;
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!a.a(this)) {
            try {
                m mVar = new m(context);
                a(intent, "event_name");
                Bundle bundleExtra = intent.getBundleExtra("event_args");
                Context context2 = BadParcelableCrashOptimizer.getContext();
                if (!(bundleExtra == null || context2 == null)) {
                    bundleExtra.setClassLoader(context2.getClassLoader());
                }
                Bundle bundle = new Bundle();
                for (String str : bundleExtra.keySet()) {
                    bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) a(bundleExtra, str));
                }
                mVar.a();
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }
}

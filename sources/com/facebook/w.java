package com.facebook;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.ad;
import com.facebook.internal.ae;

public final class w {

    /* renamed from: c  reason: collision with root package name */
    private static volatile w f49233c;

    /* renamed from: a  reason: collision with root package name */
    final v f49234a;

    /* renamed from: b  reason: collision with root package name */
    public Profile f49235b;

    /* renamed from: d  reason: collision with root package name */
    private final LocalBroadcastManager f49236d;

    static {
        Covode.recordClassIndex(30783);
    }

    public static w a() {
        MethodCollector.i(3831);
        if (f49233c == null) {
            synchronized (w.class) {
                try {
                    if (f49233c == null) {
                        ae.a();
                        f49233c = new w(LocalBroadcastManager.getInstance(m.f48921g), new v());
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3831);
                    throw th;
                }
            }
        }
        w wVar = f49233c;
        MethodCollector.o(3831);
        return wVar;
    }

    private w(LocalBroadcastManager localBroadcastManager, v vVar) {
        ae.a(localBroadcastManager, "localBroadcastManager");
        ae.a(vVar, "profileCache");
        this.f49236d = localBroadcastManager;
        this.f49234a = vVar;
    }

    private void a(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f49236d.sendBroadcast(intent);
    }

    /* access modifiers changed from: package-private */
    public final void a(Profile profile, boolean z) {
        Profile profile2 = this.f49235b;
        this.f49235b = profile;
        if (z) {
            if (profile != null) {
                this.f49234a.a(profile);
            } else {
                this.f49234a.b();
            }
        }
        if (!ad.a(profile2, profile)) {
            a(profile2, profile);
        }
    }
}

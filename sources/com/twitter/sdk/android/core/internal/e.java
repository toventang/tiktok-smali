package com.twitter.sdk.android.core.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.twitter.sdk.android.core.k;

/* access modifiers changed from: package-private */
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f155964a;

    static {
        Covode.recordClassIndex(103631);
    }

    @Override // com.twitter.sdk.android.core.internal.f
    public final b a() {
        if (a(this.f155964a)) {
            return new b(b(), c());
        }
        return null;
    }

    private String b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(d(), new Object[0]);
        } catch (Exception unused) {
            k.c().c();
            return null;
        }
    }

    private boolean c() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(d(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            k.c().c();
            return false;
        }
    }

    private Object d() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.f155964a);
        } catch (Exception unused) {
            k.c().c();
            return null;
        }
    }

    e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f155964a = applicationContext;
    }

    private static boolean a(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.f").getMethod("a", Context.class).invoke(null, context)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }
}

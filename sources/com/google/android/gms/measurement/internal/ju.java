package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class ju {

    /* renamed from: a  reason: collision with root package name */
    final Context f51964a;

    static {
        Covode.recordClassIndex(32351);
    }

    public ju(Context context) {
        r.a(context);
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        r.a(applicationContext);
        this.f51964a = applicationContext;
    }
}

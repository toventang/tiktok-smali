package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.zzae;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class gh {

    /* renamed from: a  reason: collision with root package name */
    final Context f51674a;

    /* renamed from: b  reason: collision with root package name */
    String f51675b;

    /* renamed from: c  reason: collision with root package name */
    String f51676c;

    /* renamed from: d  reason: collision with root package name */
    String f51677d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f51678e;

    /* renamed from: f  reason: collision with root package name */
    long f51679f;

    /* renamed from: g  reason: collision with root package name */
    zzae f51680g;

    /* renamed from: h  reason: collision with root package name */
    boolean f51681h = true;

    /* renamed from: i  reason: collision with root package name */
    Long f51682i;

    static {
        Covode.recordClassIndex(32256);
    }

    public gh(Context context, zzae zzae, Long l2) {
        r.a(context);
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        r.a(applicationContext);
        this.f51674a = applicationContext;
        this.f51682i = l2;
        if (zzae != null) {
            this.f51680g = zzae;
            this.f51675b = zzae.f51303f;
            this.f51676c = zzae.f51302e;
            this.f51677d = zzae.f51301d;
            this.f51681h = zzae.f51300c;
            this.f51679f = zzae.f51299b;
            if (zzae.f51304g != null) {
                this.f51678e = Boolean.valueOf(zzae.f51304g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}

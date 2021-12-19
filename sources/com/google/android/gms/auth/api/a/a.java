package com.google.android.gms.auth.api.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.internal.b.g;

public abstract class a extends h<Object> {

    /* renamed from: i  reason: collision with root package name */
    private static final a.g<g> f49698i;

    /* renamed from: j  reason: collision with root package name */
    private static final a.AbstractC1206a<g, Object> f49699j;

    /* renamed from: k  reason: collision with root package name */
    private static final com.google.android.gms.common.api.a<Object> f49700k;

    static {
        Covode.recordClassIndex(31052);
        a.g<g> gVar = new a.g<>();
        f49698i = gVar;
        b bVar = new b();
        f49699j = bVar;
        f49700k = new com.google.android.gms.common.api.a<>("SmsRetriever.API", bVar, gVar);
    }

    public a(Context context) {
        super(context, f49700k, (a.d) null, new com.google.android.gms.common.api.internal.a());
    }

    public abstract com.google.android.gms.c.h<Void> a();
}

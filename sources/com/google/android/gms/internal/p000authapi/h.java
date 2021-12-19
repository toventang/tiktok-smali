package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.identity.f;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.internal.d;

/* renamed from: com.google.android.gms.internal.auth-api.h  reason: invalid package */
final class h extends a.AbstractC1206a<k, f> {
    static {
        Covode.recordClassIndex(31521);
    }

    h() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.m] */
    @Override // com.google.android.gms.common.api.a.AbstractC1206a
    public final /* synthetic */ k a(Context context, Looper looper, d dVar, f fVar, e eVar, m mVar) {
        return new k(context, looper, fVar, dVar, eVar, mVar);
    }
}

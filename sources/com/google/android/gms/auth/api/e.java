package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.p000authapi.z;

final class e extends a.AbstractC1206a<z, a.C1203a> {
    static {
        Covode.recordClassIndex(31078);
    }

    e() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC1206a
    public final /* synthetic */ z a(Context context, Looper looper, d dVar, a.C1203a aVar, i.b bVar, i.c cVar) {
        return new z(context, looper, dVar, aVar, bVar, cVar);
    }
}

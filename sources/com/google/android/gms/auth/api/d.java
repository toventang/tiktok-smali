package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.c.b;

final class d extends a.AbstractC1206a<b, c> {
    static {
        Covode.recordClassIndex(31077);
    }

    d() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC1206a
    public final /* synthetic */ b a(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, c cVar, i.b bVar, i.c cVar2) {
        return new b(context, looper, dVar, cVar, bVar, cVar2);
    }
}

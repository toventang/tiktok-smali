package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;

final class b extends a.AbstractC1206a<com.google.android.gms.signin.internal.a, a> {
    static {
        Covode.recordClassIndex(32394);
    }

    b() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.d, java.lang.Object, com.google.android.gms.common.api.i$b, com.google.android.gms.common.api.i$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC1206a
    public final /* synthetic */ com.google.android.gms.signin.internal.a a(Context context, Looper looper, d dVar, a aVar, i.b bVar, i.c cVar) {
        return new com.google.android.gms.signin.internal.a(context, looper, dVar, bVar, cVar);
    }
}

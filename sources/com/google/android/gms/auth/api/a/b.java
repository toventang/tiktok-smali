package com.google.android.gms.auth.api.a;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.internal.b.g;

final class b extends a.AbstractC1206a<g, Object> {
    static {
        Covode.recordClassIndex(31053);
    }

    b() {
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    @Override // com.google.android.gms.common.api.a.AbstractC1206a
    public final /* synthetic */ g a(Context context, Looper looper, d dVar, Object obj, i.b bVar, i.c cVar) {
        return new g(context, looper, dVar, bVar, cVar);
    }
}

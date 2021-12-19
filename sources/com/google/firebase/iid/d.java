package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.a;
import com.google.android.gms.c.h;
import com.google.android.gms.common.util.k;

final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54456a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f54457b;

    static {
        Covode.recordClassIndex(33800);
    }

    d(Context context, Intent intent) {
        this.f54456a = context;
        this.f54457b = intent;
    }

    @Override // com.google.android.gms.c.a
    public final Object a(h hVar) {
        Context context = this.f54456a;
        Intent intent = this.f54457b;
        if (!k.e() || ((Integer) hVar.d()).intValue() != 402) {
            return hVar;
        }
        return b.a(context, intent).a(g.f54460a, f.f54459a);
    }
}

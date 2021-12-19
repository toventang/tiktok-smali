package com.google.firebase.iid;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.a;
import com.google.android.gms.c.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ai implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ah f54399a;

    /* renamed from: b  reason: collision with root package name */
    private final Pair f54400b;

    static {
        Covode.recordClassIndex(33777);
    }

    ai(ah ahVar, Pair pair) {
        this.f54399a = ahVar;
        this.f54400b = pair;
    }

    @Override // com.google.android.gms.c.a
    public final Object a(h hVar) {
        return this.f54399a.a(this.f54400b, hVar);
    }
}

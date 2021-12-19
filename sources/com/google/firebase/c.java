package com.google.firebase;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.d.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f54298a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f54299b;

    static {
        Covode.recordClassIndex(33709);
    }

    c(b bVar, Context context) {
        this.f54298a = bVar;
        this.f54299b = context;
    }

    @Override // com.google.firebase.d.a
    public final Object a() {
        b bVar = this.f54298a;
        return new com.google.firebase.e.a(this.f54299b, bVar.h(), (com.google.firebase.b.c) bVar.f54283c.a(com.google.firebase.b.c.class));
    }
}

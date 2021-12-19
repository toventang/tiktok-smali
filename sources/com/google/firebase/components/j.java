package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.d.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f54327a;

    /* renamed from: b  reason: collision with root package name */
    private final b f54328b;

    static {
        Covode.recordClassIndex(33728);
    }

    j(i iVar, b bVar) {
        this.f54327a = iVar;
        this.f54328b = bVar;
    }

    @Override // com.google.firebase.d.a
    public final Object a() {
        i iVar = this.f54327a;
        b bVar = this.f54328b;
        return bVar.f54307c.a(new v(bVar, iVar));
    }
}

package com.ss.android.ugc.aweme.awemeservice.a;

import com.bytedance.covode.number.Covode;
import com.google.c.b.m;
import com.google.c.b.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements m {

    /* renamed from: a  reason: collision with root package name */
    private final g f67645a;

    static {
        Covode.recordClassIndex(41647);
    }

    i(g gVar) {
        this.f67645a = gVar;
    }

    @Override // com.google.c.b.m
    public final void a(n nVar) {
        g gVar = this.f67645a;
        if (nVar.getValue() != null) {
            gVar.a((String) nVar.getKey(), (Aweme) nVar.getValue());
        }
    }
}

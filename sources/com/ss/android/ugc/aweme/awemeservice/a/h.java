package com.ss.android.ugc.aweme.awemeservice.a;

import com.bytedance.covode.number.Covode;
import com.google.c.b.m;
import com.google.c.b.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements m {

    /* renamed from: a  reason: collision with root package name */
    private final g f67644a;

    static {
        Covode.recordClassIndex(41646);
    }

    h(g gVar) {
        this.f67644a = gVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.google.c.b.b<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.c.b.m
    public final void a(n nVar) {
        g gVar = this.f67644a;
        gVar.f67636a.a((String) nVar.getKey(), (Aweme) nVar.getValue());
        gVar.a((String) nVar.getKey(), (Aweme) nVar.getValue());
    }
}

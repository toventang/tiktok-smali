package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a.e;
import com.ss.android.ugc.aweme.share.s;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class h implements i {

    /* renamed from: a  reason: collision with root package name */
    private final SharePackage f94932a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a.C3238a f94933b;

    static {
        Covode.recordClassIndex(60212);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.i
    public final e a(f fVar) {
        l.d(fVar, "");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.i
    public final SharePackage a() {
        return this.f94932a;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.i
    public final List<g> b(f fVar) {
        l.d(fVar, "");
        List<com.ss.android.ugc.aweme.sharer.ui.h> list = this.f94933b.f124261c;
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new k(new com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.e(t.ch_(), t.b()), new c(t, fVar, this)));
        }
        return arrayList;
    }

    public h(SharePackage sharePackage, s.a.C3238a aVar) {
        l.d(sharePackage, "");
        l.d(aVar, "");
        this.f94932a = sharePackage;
        this.f94933b = aVar;
    }
}

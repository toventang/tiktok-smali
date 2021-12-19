package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import f.a.v;

final /* synthetic */ class be implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f124999a;

    /* renamed from: b  reason: collision with root package name */
    private final v f125000b;

    static {
        Covode.recordClassIndex(82111);
    }

    be(ShortVideoContext shortVideoContext, v vVar) {
        this.f124999a = shortVideoContext;
        this.f125000b = vVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
    public final void a(d dVar) {
        ShortVideoContext shortVideoContext = this.f124999a;
        v vVar = this.f125000b;
        shortVideoContext.aw = dVar;
        vVar.a(j.fromNullable(dVar));
        vVar.a();
    }
}

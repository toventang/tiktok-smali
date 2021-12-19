package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;
import f.a.v;

final /* synthetic */ class t implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private final ShortVideoContext f121928a;

    /* renamed from: b  reason: collision with root package name */
    private final v f121929b;

    static {
        Covode.recordClassIndex(79940);
    }

    t(ShortVideoContext shortVideoContext, v vVar) {
        this.f121928a = shortVideoContext;
        this.f121929b = vVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a
    public final void a(d dVar) {
        ShortVideoContext shortVideoContext = this.f121928a;
        v vVar = this.f121929b;
        shortVideoContext.aw = dVar;
        vVar.a(j.fromNullable(dVar));
        vVar.a();
    }
}

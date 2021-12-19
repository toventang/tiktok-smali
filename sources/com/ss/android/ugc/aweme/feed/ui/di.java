package com.ss.android.ugc.aweme.feed.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import f.a.d.k;

final /* synthetic */ class di implements k {

    /* renamed from: a  reason: collision with root package name */
    private final dg f94595a;

    static {
        Covode.recordClassIndex(60041);
    }

    di(dg dgVar) {
        this.f94595a = dgVar;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        Aweme aweme = (Aweme) obj;
        return aweme.getExposeSharer() != null && !dg.a(aweme.getExposeSharer());
    }
}

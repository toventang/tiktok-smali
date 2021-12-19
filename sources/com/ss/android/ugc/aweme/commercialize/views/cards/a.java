package com.ss.android.ugc.aweme.commercialize.views.cards;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements m {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeRawAd f76033a;

    static {
        Covode.recordClassIndex(46899);
    }

    a(AwemeRawAd awemeRawAd) {
        this.f76033a = awemeRawAd;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        AwemeRawAd awemeRawAd = this.f76033a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(awemeRawAd) : bVar.a(awemeRawAd);
    }
}

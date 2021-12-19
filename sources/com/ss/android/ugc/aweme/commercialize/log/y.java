package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.a.m;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements m {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeRawAd f74840a;

    static {
        Covode.recordClassIndex(46132);
    }

    y(AwemeRawAd awemeRawAd) {
        this.f74840a = awemeRawAd;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        AwemeRawAd awemeRawAd = this.f74840a;
        f.b bVar = (f.b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.b(awemeRawAd) : bVar.a(awemeRawAd);
    }
}

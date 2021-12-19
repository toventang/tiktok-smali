package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import f.a.d.g;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final o f91941a;

    static {
        Covode.recordClassIndex(57893);
    }

    d(o oVar) {
        this.f91941a = oVar;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return c.a(this.f91941a, (aweme_v2_feed_response) obj);
    }
}

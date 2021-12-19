package com.ss.android.ugc.aweme.discover.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.a.b;

final /* synthetic */ class t implements b {

    /* renamed from: a  reason: collision with root package name */
    static final b f80590a = new t();

    static {
        Covode.recordClassIndex(50134);
    }

    private t() {
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            return aweme.getAid();
        }
        return null;
    }
}

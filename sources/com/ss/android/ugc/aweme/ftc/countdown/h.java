package com.ss.android.ugc.aweme.ftc.countdown;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class h extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f98388a = new h();

    static {
        Covode.recordClassIndex(62567);
    }

    h() {
        super(FTCCountdownState.class, "maxDuration", "getMaxDuration()J", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Long.valueOf(((FTCCountdownState) obj).getMaxDuration());
    }
}

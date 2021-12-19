package com.ss.android.ugc.aweme.shoutouts.player;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class d extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f133281a = new d();

    static {
        Covode.recordClassIndex(87172);
    }

    d() {
        super(ShoutoutsPlayState.class, "progress", "getProgress()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((ShoutoutsPlayState) obj).getProgress());
    }
}

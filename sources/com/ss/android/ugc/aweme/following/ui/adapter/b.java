package com.ss.android.ugc.aweme.following.ui.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notificationlive.ResponseState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f96437a = new b();

    static {
        Covode.recordClassIndex(61079);
    }

    b() {
        super(ResponseState.class, "pushState", "getPushState()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getPushState());
    }
}

package com.ss.android.ugc.aweme.notificationlive.ui.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notificationlive.ResponseState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class c extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f114448a = new c();

    static {
        Covode.recordClassIndex(73641);
    }

    c() {
        super(ResponseState.class, "pushState", "getPushState()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getPushState());
    }
}

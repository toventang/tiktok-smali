package com.ss.android.ugc.aweme.notificationlive.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notificationlive.ResponseState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class f extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f114454a = new f();

    static {
        Covode.recordClassIndex(73647);
    }

    f() {
        super(ResponseState.class, "pushState", "getPushState()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getPushState());
    }
}

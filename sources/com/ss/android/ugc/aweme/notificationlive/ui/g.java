package com.ss.android.ugc.aweme.notificationlive.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notificationlive.ResponseState;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class g extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f114455a = new g();

    static {
        Covode.recordClassIndex(73648);
    }

    g() {
        super(ResponseState.class, "statusCode", "getStatusCode()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getStatusCode());
    }
}

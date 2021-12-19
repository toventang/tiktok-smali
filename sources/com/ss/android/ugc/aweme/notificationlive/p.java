package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import h.f.b.y;
import h.k.k;

final /* synthetic */ class p extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final k f114357a = new p();

    static {
        Covode.recordClassIndex(73546);
    }

    p() {
        super(ResponseState.class, "statusCode", "getStatusCode()I", 0);
    }

    @Override // h.k.k, h.f.b.y
    public final Object get(Object obj) {
        return Integer.valueOf(((ResponseState) obj).getStatusCode());
    }
}

package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.c;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.covode.number.Covode;
import f.a.ab;

public final class d {
    static {
        Covode.recordClassIndex(8289);
    }

    public static ab<c<e>> a(long j2, long j3) {
        return a((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class), j2, j3);
    }

    private static ab<c<e>> a(LinkApi linkApi, long j2, long j3) {
        return linkApi.getList(j2, j3, 4).c(e.f14933a);
    }
}

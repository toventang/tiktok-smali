package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MultiPlusFeedRoomListProvider f18635a;

    static {
        Covode.recordClassIndex(10439);
    }

    d(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider) {
        this.f18635a = multiPlusFeedRoomListProvider;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18635a.f18614d = false;
        a.a("MultiPlusFeedRoomListProvider", (Throwable) obj);
    }
}

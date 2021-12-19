package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.core.c.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MultiPlusFeedRoomListProvider f18633a;

    static {
        Covode.recordClassIndex(10437);
    }

    b(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider) {
        this.f18633a = multiPlusFeedRoomListProvider;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = this.f18633a;
        a.a("MultiPlusFeedRoomListProvider", (Throwable) obj);
        multiPlusFeedRoomListProvider.f18615e = false;
    }
}

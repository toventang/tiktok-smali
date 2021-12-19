package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements g.c {

    /* renamed from: a  reason: collision with root package name */
    private final RoomPlayer f15310a;

    static {
        Covode.recordClassIndex(8464);
    }

    t(RoomPlayer roomPlayer) {
        this.f15310a = roomPlayer;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g.c
    public final void a(g.b bVar, Object obj) {
        this.f15310a.lambda$doStartPlayByMultiPullStreamData$1$RoomPlayer(bVar, obj);
    }
}

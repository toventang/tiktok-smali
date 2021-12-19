package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements g.c {

    /* renamed from: a  reason: collision with root package name */
    private final RoomPlayer f15309a;

    static {
        Covode.recordClassIndex(8463);
    }

    s(RoomPlayer roomPlayer) {
        this.f15309a = roomPlayer;
    }

    @Override // com.bytedance.android.livesdkapi.depend.d.g.c
    public final void a(g.b bVar, Object obj) {
        this.f15309a.lambda$doStartPlayByStreamUrl$0$RoomPlayer(bVar, obj);
    }
}

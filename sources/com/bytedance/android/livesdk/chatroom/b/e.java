package com.bytedance.android.livesdk.chatroom.b;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f14955a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f14956b;

    /* renamed from: c  reason: collision with root package name */
    private final a f14957c;

    static {
        Covode.recordClassIndex(8301);
    }

    e(c cVar, Room room, a aVar) {
        this.f14955a = cVar;
        this.f14956b = room;
        this.f14957c = aVar;
    }

    public final void run() {
        this.f14955a.addFollowGuideMessage(this.f14956b, this.f14957c);
    }
}

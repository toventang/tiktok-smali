package com.bytedance.android.livesdk.chatroom.b;

import com.bytedance.android.livesdk.model.message.t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c f14952a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f14953b;

    /* renamed from: c  reason: collision with root package name */
    private final t f14954c;

    static {
        Covode.recordClassIndex(8300);
    }

    d(c cVar, Room room, t tVar) {
        this.f14952a = cVar;
        this.f14953b = room;
        this.f14954c = tVar;
    }

    public final void run() {
        c cVar = this.f14952a;
        Room room = this.f14953b;
        t tVar = this.f14954c;
        if (!c.a(room)) {
            cVar.add(tVar);
        }
        cVar.followGuideRunnable = null;
    }
}

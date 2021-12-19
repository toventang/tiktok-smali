package com.bytedance.android.live.liveinteract.multilive.a.d;

import com.bytedance.android.live.liveinteract.multilive.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f11523a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f11524b;

    static {
        Covode.recordClassIndex(6229);
    }

    h(a aVar, Room room) {
        this.f11523a = aVar;
        this.f11524b = room;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f11523a;
        Room room = this.f11524b;
        aVar.d();
        aVar.n = false;
        if (a.c()) {
            a.a(room, aVar.f11510j, false);
        }
    }
}

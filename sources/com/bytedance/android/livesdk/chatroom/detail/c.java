package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f15232a;

    static {
        Covode.recordClassIndex(8435);
    }

    c(b bVar) {
        this.f15232a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f15232a;
        d dVar = (d) obj;
        if (!bVar.f15229c) {
            return;
        }
        if (dVar == null) {
            bVar.a(0, "invalid room data _ response is null");
            return;
        }
        Room room = (Room) dVar.data;
        bVar.f15230d = room;
        bVar.f15229c = false;
        bVar.f15228b.a(room);
    }
}

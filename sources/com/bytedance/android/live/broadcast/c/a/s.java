package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

final /* synthetic */ class s implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long f7824a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f7825b;

    static {
        Covode.recordClassIndex(3871);
    }

    s(long j2, Room room) {
        this.f7824a = j2;
        this.f7825b = room;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        long j2 = this.f7824a;
        Room room = this.f7825b;
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j2));
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
        }
        c.a(d.a("service_sticker_report_status"), 1, hashMap);
    }
}

package com.bytedance.android.live.broadcast.c.a;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long f7822a;

    /* renamed from: b  reason: collision with root package name */
    private final Room f7823b;

    static {
        Covode.recordClassIndex(3870);
    }

    r(long j2, Room room) {
        this.f7822a = j2;
        this.f7823b = room;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        long j2 = this.f7822a;
        Room room = this.f7823b;
        HashMap hashMap = new HashMap();
        hashMap.put("response", obj != null ? obj.toString() : "no response");
        hashMap.put("room_id", Long.valueOf(j2));
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
        }
        c.a(d.a("service_sticker_report_status"), 0, hashMap);
    }
}

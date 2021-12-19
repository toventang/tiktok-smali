package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.live.a.a.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.a.b;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

final /* synthetic */ class aj implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ag f22730a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22731b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f22732c;

    static {
        Covode.recordClassIndex(13400);
    }

    aj(ag agVar, long j2, Room room) {
        this.f22730a = agVar;
        this.f22731b = j2;
        this.f22732c = room;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ag agVar = this.f22730a;
        long j2 = this.f22731b;
        Room room = this.f22732c;
        Throwable th = (Throwable) obj;
        agVar.b();
        agVar.f22701b = false;
        long id = room.getId();
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(id));
        hashMap.put("prop_id", Long.valueOf(j2));
        if (th instanceof a) {
            hashMap.put("error_code", Integer.valueOf(((a) th).getErrorCode()));
        } else {
            hashMap.put("error_code", 0);
        }
        hashMap.put("error_msg", th.getMessage());
        c.a(d.a("ttlive_prop_send_status"), 1, 0, hashMap);
        c.a(d.b("ttlive_prop_send_status"), 1, hashMap);
        com.bytedance.android.livesdk.ab.a.a.a();
        com.bytedance.android.livesdk.ab.a.a.a(b.Gift.info, "ttlive_prop_send_status", hashMap);
        agVar.a();
    }
}

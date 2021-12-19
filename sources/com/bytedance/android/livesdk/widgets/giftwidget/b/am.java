package com.bytedance.android.livesdk.widgets.giftwidget.b;

import com.bytedance.android.live.a.a.a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.service.c.a.e;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import f.a.d.f;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class am implements f {

    /* renamed from: a  reason: collision with root package name */
    private final ag f22739a;

    /* renamed from: b  reason: collision with root package name */
    private final d f22740b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f22741c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22742d;

    static {
        Covode.recordClassIndex(13403);
    }

    am(ag agVar, d dVar, Room room, long j2) {
        this.f22739a = agVar;
        this.f22740b = dVar;
        this.f22741c = room;
        this.f22742d = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String message;
        String message2;
        String message3;
        ag agVar = this.f22739a;
        d dVar = this.f22740b;
        Room room = this.f22741c;
        long j2 = this.f22742d;
        Throwable th = (Throwable) obj;
        if (dVar.s) {
            long j3 = dVar.f21286b;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
            User user = (User) u.a().b().a();
            hashMap.put("user_id", String.valueOf(user.getId()));
            hashMap2.put("user_id", String.valueOf(user.getId()));
            hashMap.put("gift_id", String.valueOf(j3));
            hashMap2.put("gift_id", String.valueOf(j3));
            if (room2 != null) {
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap2.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap2.put("room_id", String.valueOf(room2.getId()));
            }
            if (th != null) {
                if (th instanceof a) {
                    a aVar = (a) th;
                    hashMap.put("error_code", String.valueOf(aVar.getErrorCode()));
                    hashMap2.put("error_code", String.valueOf(aVar.getErrorCode()));
                }
                hashMap.put("error_msg", th.getMessage());
                hashMap2.put("error_msg", th.getMessage());
            }
            c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_fast_gift_send"), 1, hashMap2);
            c.a(com.bytedance.android.livesdk.ab.d.d.b("ttlive_fast_gift_send"), 1, hashMap2);
            com.bytedance.android.livesdk.ab.a.a.a();
            com.bytedance.android.livesdk.ab.a.a.a(b.Gift.info, "ttlive_fast_gift_send", hashMap);
            b.a.a("ttlive_fast_gift_send").a((Map<String, String>) hashMap).a().b();
        }
        boolean z = th instanceof com.bytedance.android.live.a.a.b.a;
        if (z) {
            message = String.valueOf(((a) th).getErrorCode());
        } else {
            message = th.getMessage();
        }
        e.a(message, dVar.f21294j, dVar.t);
        long j4 = dVar.r;
        if (z) {
            message2 = String.valueOf(((a) th).getErrorCode());
        } else {
            message2 = th.getMessage();
        }
        e.a(j4, message2, th.getMessage(), dVar.f21294j, dVar.t);
        agVar.f22701b = false;
        agVar.b();
        agVar.f22704e.a((Exception) th, dVar);
        com.bytedance.android.livesdk.service.c.g.a.a(dVar.f21286b, room.getId(), th);
        com.bytedance.android.livesdk.service.c.g.a.a(th);
        long j5 = dVar.r;
        String aVar2 = dVar.f21285a.toString();
        if (z) {
            message3 = String.valueOf(((a) th).getErrorCode());
        } else {
            message3 = th.getMessage();
        }
        com.bytedance.android.livesdk.service.c.f.c.a(j5, null, aVar2, j2, message3, th.getMessage());
    }
}

package com.bytedance.android.livesdk.service.c.a;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.service.a.c;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f21351a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(12581);
    }

    private static boolean a() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return false;
        }
        long ownerUserId = room.getOwnerUserId();
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        if (ownerUserId == b2.c()) {
            return true;
        }
        return false;
    }

    public static final void a(long j2) {
        b.a.a("livesdk_gift_panel_load_duration").a().b("live").c("click").d("live_detail").a("duration", String.valueOf(j2)).b();
    }

    public static final void a(String str, boolean z, String str2, String str3) {
        String str4;
        String str5;
        b a2 = b.a.a("gift_panel_show").a();
        if (str == null) {
            str = "icon";
        }
        b a3 = a2.a("gift_enter_from", str).a("send_gift_scene", a.b().getDesc());
        if (z) {
            str4 = "portrait";
        } else {
            str4 = "landscape";
        }
        b a4 = a3.a("room_orientation", str4).a("hashtag_type", str2).a("hashtag_id", str3);
        if (a()) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        a4.a("is_anchor", str5).a("gift_dialog_request_id", c.f21167a).a("timestamp", com.bytedance.android.livesdk.utils.a.a.a()).b();
    }
}

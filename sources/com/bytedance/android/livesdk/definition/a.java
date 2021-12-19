package com.bytedance.android.livesdk.definition;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.i.a.d;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(9392);
    }

    public static final void a() {
        b a2 = b.a.a("livesdk_live_anchor_definition_selection_select_success");
        f b2 = u.a().b();
        l.b(b2, "");
        a2.a("anchor_id", b2.c()).a("screen_share").b();
    }

    static final String b() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null || room.getOwner() == null) {
            return "";
        }
        User owner = room.getOwner();
        l.b(owner, "");
        return String.valueOf(owner.getId());
    }

    public static final void a(String str, String str2, String str3) {
        String g2;
        String str4 = "";
        l.d(str, str4);
        l.d(str2, str4);
        l.d(str3, str4);
        com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
        l.b(fVar, str4);
        EnterRoomLinkSession a2 = fVar.a();
        l.b(a2, str4);
        String str5 = a2.f23354b.f23299c.E;
        if (str5 == null) {
            str5 = str4;
        }
        com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(d.class);
        l.b(a3, str4);
        k b2 = ((d) a3).getLivePlayControllerManager().b(str5);
        if (!(b2 == null || (g2 = b2.g()) == null)) {
            str4 = g2;
        }
        b.a.a("livesdk_live_definition_selection_btn_show").a("anchor_id", b()).a("room_id", str).a("room_orientation", str3).a("current_definition", str4).a(str2).b();
    }

    public static final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        l.d(str6, "");
        l.d(str7, "");
        b.a.a("livesdk_live_definition_selection_select_success").a("anchor_id", b()).a("room_id", str).a("room_orientation", str3).a("current_definition", str7).a("duration", str4).a("previous_definition", str5).a("switch_type", str6).a(str2).b();
    }
}

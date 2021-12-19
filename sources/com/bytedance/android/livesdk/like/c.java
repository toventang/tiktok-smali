package com.bytedance.android.livesdk.like;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f18330a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(10318);
    }

    public static final void a(Room room, b bVar) {
        String str;
        l.d(room, "");
        l.d(bVar, "");
        if (bVar.n()) {
            String str2 = "disabled_due_to_landscape_mode";
            String str3 = "enabled";
            if (bVar.k()) {
                str = "disabled_due_to_clear_screen";
            } else if (!bVar.l()) {
                str = str2;
            } else {
                str = str3;
            }
            if (bVar.m()) {
                str2 = str3;
            }
            if (!bVar.o()) {
                str3 = "disabled_due_to_being_audience_and_mic_room";
            }
            long id = room.getId();
            f b2 = u.a().b();
            l.b(b2, "");
            a(id, b2.c(), room.getOwnerUserId(), "enabled", str, str2, str3);
        }
    }

    public static final void a(long j2, long j3, long j4, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", j2);
        jSONObject.put("user_id", j3);
        jSONObject.put("anchor_id", j4);
        jSONObject.put("overall_state", str);
        jSONObject.put("send_state", str2);
        jSONObject.put("receive_state", str3);
        jSONObject.put("progress_effect_state", str4);
        a.a(3, "ttlive_like", jSONObject.toString());
    }
}

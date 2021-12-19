package com.bytedance.android.live.liveinteract.match.c;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.platform.common.g.d;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.model.message.am;
import com.bytedance.android.livesdk.model.message.an;
import com.bytedance.android.livesdk.model.message.b.h;
import com.bytedance.android.livesdk.model.message.b.n;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a extends d {

    /* renamed from: a */
    public static long f10797a = System.currentTimeMillis();

    /* renamed from: b */
    public static long f10798b = System.currentTimeMillis();

    /* renamed from: c */
    public static long f10799c = System.currentTimeMillis();

    /* renamed from: d */
    public static long f10800d = System.currentTimeMillis();

    /* renamed from: e */
    public static long f10801e = System.currentTimeMillis();

    /* renamed from: f */
    public static long f10802f = System.currentTimeMillis();

    /* renamed from: g */
    public static final a f10803g = new a();

    /* renamed from: i */
    private static final String f10804i = "ttlive_client_anchor_match_icon_monitor";

    /* renamed from: j */
    private static long f10805j = System.currentTimeMillis();

    /* renamed from: k */
    private static long f10806k = System.currentTimeMillis();

    private a() {
    }

    public static final void a(Map<Long, h> map, am amVar, boolean z) {
        l.d(map, "");
        l.d(amVar, "");
        Map<Long, n> map2 = amVar.f19162f;
        long j2 = b.a.a().f9941f;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            com.bytedance.android.live.core.c.a.b("battle monitor monitorScoreJump  room is null");
            return;
        }
        long ownerUserId = room.getOwnerUserId();
        h hVar = map.get(Long.valueOf(j2));
        long j3 = 0;
        long j4 = hVar != null ? hVar.f19269c : 0;
        n nVar = map2.get(Long.valueOf(j2));
        if (j4 >= (nVar != null ? (long) nVar.f19284a : 0)) {
            h hVar2 = map.get(Long.valueOf(ownerUserId));
            long j5 = hVar2 != null ? hVar2.f19269c : 0;
            n nVar2 = map2.get(Long.valueOf(ownerUserId));
            if (j5 >= (nVar2 != null ? (long) nVar2.f19284a : 0)) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.livesdkapi.h.b bVar = amVar.O;
        com.bytedance.android.live.core.d.a.a(jSONObject, "msg_id", bVar.f23212d);
        com.bytedance.android.live.core.d.a.a(jSONObject, "create_time", bVar.f23209a);
        com.bytedance.android.live.core.d.a.a(jSONObject, "source", "finish");
        n nVar3 = map2.get(Long.valueOf(j2));
        com.bytedance.android.live.core.d.a.a(jSONObject, "current_score_other", nVar3 != null ? (long) nVar3.f19284a : 0);
        h hVar3 = map.get(Long.valueOf(j2));
        com.bytedance.android.live.core.d.a.a(jSONObject, "new_score_other", hVar3 != null ? hVar3.f19269c : 0);
        h hVar4 = map.get(Long.valueOf(ownerUserId));
        com.bytedance.android.live.core.d.a.a(jSONObject, "new_score", hVar4 != null ? hVar4.f19269c : 0);
        n nVar4 = map2.get(Long.valueOf(ownerUserId));
        if (nVar4 != null) {
            j3 = (long) nVar4.f19284a;
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "current_score", j3);
        if (z) {
            a("pk_finish_score_jump", jSONObject);
        } else {
            b("pk_finish_score_jump", jSONObject);
        }
    }

    public static final void a(boolean z, String str, Map<String, ? extends Object> map) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        com.bytedance.android.live.core.d.a.a(jSONObject, "scene", str);
        a(f10803g, "reject_request", jSONObject, z, 8);
        f10805j = System.currentTimeMillis();
    }

    public static final void a(boolean z, String str, Throwable th, Map<String, ? extends Object> map) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        a(jSONObject, th);
        com.bytedance.android.live.core.d.a.a(jSONObject, "scene", str);
        com.bytedance.android.live.core.d.a.a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - f10805j);
        a("reject_failed", jSONObject, z, 1);
    }

    public static final void a(boolean z, an anVar) {
        l.d(anVar, "");
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, anVar);
        if (z) {
            long j2 = 0;
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.n > 0) {
                j2 = System.currentTimeMillis() - com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.n;
            }
            com.bytedance.android.live.core.d.a.a(jSONObject, "cost", j2);
            a(f10803g, "open_message", jSONObject, false, 12);
            return;
        }
        f10803g.a("open_message", jSONObject, 0);
    }

    public static final void a(boolean z, long j2) {
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "count", j2);
        if (z) {
            a(f10803g, "battle_start", jSONObject, false, 12);
        } else {
            f10803g.a("battle_start", jSONObject, 0);
        }
    }

    public final void a(String str, JSONObject jSONObject, int i2) {
        d(jSONObject);
        com.bytedance.android.live.core.d.a.a(jSONObject, "event_id", str);
        c.a("ttlive_client_audience_battle_monitor", i2, jSONObject);
    }

    private static void a(JSONObject jSONObject, com.bytedance.android.live.liveinteract.match.b.b.b bVar) {
        String str;
        long j2;
        String str2;
        b a2 = b.a.a();
        f b2 = u.a().b();
        com.bytedance.android.live.base.model.user.b a3 = b2 != null ? b2.a() : null;
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "room_id", str);
        if (!jSONObject.has("channel_id")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "channel_id", a2.f9940e);
        }
        if (!jSONObject.has("battle_id")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "battle_id", bVar.b());
        }
        long id = a3 != null ? a3.getId() : 0;
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "current_user_id", id);
        com.bytedance.android.live.core.d.a.a(jSONObject, "current_anchor_id", j2);
        if (!jSONObject.has("guest_anchor_id")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "guest_anchor_id", a2.f9941f);
        }
        if (!jSONObject.has("role_type")) {
            if (id <= 0 || j2 <= 0 || id != j2) {
                str2 = "audience";
            } else {
                str2 = bVar.f10679c ? "inviter" : "invitee";
            }
            com.bytedance.android.live.core.d.a.a(jSONObject, "role_type", str2);
        }
        if (!jSONObject.has("battle_time")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "battle_time", bVar.f10684h);
        }
        if (!jSONObject.has("punish_time")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "punish_time", bVar.f10685i);
        }
        c(jSONObject);
    }

    public static final void b() {
        a("rematch_click", new JSONObject(), false, 1);
    }

    public static final void a() {
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "event_id", "battle_icon_show");
        com.bytedance.android.live.core.d.a.a(jSONObject, "channel_id", b.a.a().f9940e);
        a((Throwable) null, jSONObject);
        a(jSONObject);
    }

    static {
        Covode.recordClassIndex(5775);
    }

    public static final void a(JSONObject jSONObject) {
        c.a(f10804i, 0, jSONObject);
    }

    private static /* synthetic */ void d(JSONObject jSONObject) {
        a(jSONObject, com.bytedance.android.live.liveinteract.match.b.b.a.f10674a);
    }

    public static final void a(String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "scene", str);
        f10803g.a("battle_info_request", jSONObject, 0);
        f10806k = System.currentTimeMillis();
    }

    public static final void b(String str, JSONObject jSONObject) {
        d(jSONObject);
        com.bytedance.android.live.core.d.a.a(jSONObject, "event_id", str);
        c.a("ttlive_client_battle_audience_score_monitor", 0, jSONObject);
    }

    public static final void a(int i2, String str) {
        l.d(str, "");
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "selection", str);
        a(f10803g, "reply_click", jSONObject, z, 8);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.live.core.d.a.a(jSONObject, "response", str2);
        com.bytedance.android.live.core.d.a.a(jSONObject, "scene", str);
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - f10806k);
        f10803g.a("battle_info_succeed", jSONObject, 0);
    }

    public static final void a(String str, Throwable th) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, th);
        com.bytedance.android.live.core.d.a.a(jSONObject, "scene", str);
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - f10806k);
        f10803g.a("battle_info_failed", jSONObject, 1);
    }

    public static final void a(String str, JSONObject jSONObject) {
        d(jSONObject);
        com.bytedance.android.live.core.d.a.a(jSONObject, "event_id", str);
        c.a("ttlive_client_battle_anchor_score_monitor", 0, jSONObject);
    }

    public static final void b(boolean z, String str, Map<String, ? extends Object> map) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        com.bytedance.android.live.core.d.a.a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        com.bytedance.android.live.core.d.a.a(jSONObject, "scene", str);
        com.bytedance.android.live.core.d.a.a(jSONObject, "cost", System.currentTimeMillis() - f10805j);
        a(f10803g, "reject_succeed", jSONObject, z, 8);
    }

    public static void a(String str, JSONObject jSONObject, boolean z, int i2) {
        com.bytedance.android.live.liveinteract.match.b.b.b bVar;
        if (z) {
            bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10675b;
        } else {
            bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
        }
        if (!jSONObject.has("invite_type")) {
            com.bytedance.android.live.core.d.a.a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        }
        a(jSONObject, bVar);
        com.bytedance.android.live.core.d.a.a(jSONObject, "event_id", str);
        c.a("ttlive_client_anchor_battle_monitor", i2, jSONObject);
    }

    public static /* synthetic */ void a(a aVar, String str, JSONObject jSONObject, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        a(str, jSONObject, z, 0);
    }
}

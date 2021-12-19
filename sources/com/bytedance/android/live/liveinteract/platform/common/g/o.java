package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multilive.b.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f11996a = new o();

    /* renamed from: b  reason: collision with root package name */
    private static String f11997b = "";

    private o() {
    }

    static {
        Covode.recordClassIndex(6542);
    }

    public static final void a(String str) {
        l.d(str, "");
        f11997b = str;
    }

    private static void a(Map<String, String> map) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            l.b(idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", e.d());
            map.put("enter_from_merge", e.a());
            map.put("action_type", e.e());
        }
    }

    private static void a(String str, Map<String, String> map) {
        b.a.a(str).a().a(map).b();
    }

    public static final void a(int i2, n nVar) {
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("enter_from", f11997b);
        hashMap.put("guest_cnt", String.valueOf(i2));
        hashMap.put("layout_setting", a.a(nVar).getFirst());
        hashMap.put("window_setting", a.a(nVar).getSecond());
        a("livesdk_anchor_guest_connection_invite_list_show", hashMap);
    }

    public static final void a(long j2, n nVar) {
        HashMap hashMap = new HashMap();
        a(hashMap);
        hashMap.put("enter_from", f11997b);
        hashMap.put("guest_id", String.valueOf(j2));
        hashMap.put("layout_setting", a.a(nVar).getFirst());
        hashMap.put("window_setting", a.a(nVar).getSecond());
        a("livesdk_anchor_guest_connection_invite_show", hashMap);
    }
}

package com.bytedance.android.live.liveinteract.platform.common.g;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.multilive.b.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.e;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static long f12040a;

    /* renamed from: b  reason: collision with root package name */
    public static String f12041b;

    /* renamed from: c  reason: collision with root package name */
    public static String f12042c;

    /* renamed from: d  reason: collision with root package name */
    public static final z f12043d = new z();

    /* renamed from: e  reason: collision with root package name */
    private static long f12044e;

    /* renamed from: f  reason: collision with root package name */
    private static String f12045f;

    private z() {
    }

    static {
        Covode.recordClassIndex(6563);
    }

    public static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            l.b(idStr, "");
            hashMap.put("room_id", idStr);
            f b2 = u.a().b();
            l.b(b2, "");
            hashMap.put("user_id", String.valueOf(b2.c()));
            hashMap.put("live_room_mode", String.valueOf(room.liveRoomMode));
            hashMap.put("enter_method", e.d());
            hashMap.put("enter_from_merge", e.a());
            hashMap.put("action_type", e.e());
        }
        hashMap.put("guest_cnt", String.valueOf(d.a().u));
        return hashMap;
    }

    public static void a(String str) {
        if (str == null) {
            f12042c = null;
        } else if (!l.a((Object) f12042c, (Object) "live_over")) {
            f12042c = str;
        }
    }

    public static void b(String str) {
        if (str == null) {
            f12045f = null;
        } else if (!l.a((Object) f12045f, (Object) "live_over")) {
            f12045f = str;
        }
    }

    public static final void c(String str) {
        int i2;
        f12044e = SystemClock.uptimeMillis();
        Map<String, String> a2 = a();
        if (str == null) {
            str = "connection_start";
        }
        a2.put("trigger", str);
        b(null);
        a.a(a2, a.b());
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = a.f11749a;
        if (aVar != null) {
            i2 = aVar.f11302l;
        } else {
            i2 = 0;
        }
        a2.put("guest_cnt", String.valueOf(i2));
        a("livesdk_guest_connection_status_view_start", a2);
    }

    public static final void d(String str) {
        if (f12044e > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - f12044e;
            Map<String, String> a2 = a();
            if (str == null && (str = f12045f) == null) {
                str = "live_over";
            }
            a2.put("trigger", str);
            b(null);
            a.a(a2, a.c());
            a2.put("duration", String.valueOf(uptimeMillis));
            a("livesdk_guest_connection_status_view_duration", a2);
            f12044e = 0;
        }
    }

    public static void a(String str, Map<String, String> map) {
        b.a.a(str).a().a(map).b();
    }
}

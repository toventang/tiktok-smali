package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.f.b.l;
import org.json.JSONObject;

public final class v extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12028a = d.a("ttlive_client_linkmic_anchor_connect_status");

    /* renamed from: b  reason: collision with root package name */
    public static final v f12029b = new v();

    /* renamed from: c  reason: collision with root package name */
    private static final String f12030c = d.b("ttlive_client_linkmic_anchor_connect_status");

    /* renamed from: d  reason: collision with root package name */
    private static final String f12031d = d.a("ttlive_client_guest_link_status");

    /* renamed from: e  reason: collision with root package name */
    private static final String f12032e = d.b("ttlive_client_guest_link_status");

    /* renamed from: f  reason: collision with root package name */
    private static final String f12033f = "ttlive_client_anchor_link_icon_monitor";

    private v() {
    }

    static {
        Covode.recordClassIndex(6558);
    }

    public static void a() {
        String str;
        long j2;
        JSONObject jSONObject = new JSONObject();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j3 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        a.a(jSONObject, "room_id", str);
        a.a(jSONObject, "anchor_id", j2);
        f b2 = u.a().b();
        if (b2 != null) {
            j3 = b2.c();
        }
        a.a(jSONObject, "current_user_id", j3);
        c.a("ttlive_linkmic_anchor_no_show_entrance_with_no_byte_plugin", 0, jSONObject);
    }

    public static final void b() {
        String str;
        long j2;
        JSONObject jSONObject = new JSONObject();
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j3 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                l.b();
            }
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        a.a(jSONObject, "room_id", str);
        a.a(jSONObject, "anchor_id", j2);
        f b2 = u.a().b();
        if (b2 != null) {
            j3 = b2.c();
        }
        a.a(jSONObject, "current_user_id", j3);
        c.a("ttlive_linkmic_audience_no_show_entrance_with_no_byte_plugin", 0, jSONObject);
    }

    private static final void f(JSONObject jSONObject) {
        c.a(f12033f, 0, jSONObject);
    }

    public static final void d(JSONObject jSONObject) {
        l.d(jSONObject, "");
        c.b(f12031d, 0, jSONObject);
    }

    public static final void e(JSONObject jSONObject) {
        l.d(jSONObject, "");
        c.b(f12031d, 1, jSONObject);
        c.a(f12032e, 1, jSONObject);
    }

    public static final void a(JSONObject jSONObject) {
        l.d(jSONObject, "");
        c.b(f12028a, 1, jSONObject);
        c.a(f12030c, 1, jSONObject);
    }

    public static final void a(int i2, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a(i2, false, jSONObject);
        a.a(jSONObject, "sei", str);
        c.a("ttlive_client_linkmic_audience_sei", 0, jSONObject);
    }

    public static final void b(long j2, long j3) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "icon_type", j2);
        a.a(jSONObject, "event_id", "link_icon_show");
        a.a(jSONObject, "permission_status", j3);
        a((Throwable) null, jSONObject);
        f(jSONObject);
    }

    public static final void a(long j2, long j3) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "icon_type", j2);
        a.a(jSONObject, "show_error_type", "bundle");
        a.a(jSONObject, "event_id", "link_icon_show_error");
        a.a(jSONObject, "permission_status", j3);
        a((Throwable) null, jSONObject);
        f(jSONObject);
    }

    public static final void a(String str, Throwable th) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "show_error_type", "permission");
        a.a(jSONObject, "event_id", "link_icon_show_error");
        a.a(jSONObject, "permission_type", str);
        a(th, jSONObject);
        f(jSONObject);
    }

    public static final void a(int i2, String str, int i3, String str2) {
        l.d(str2, "");
        JSONObject jSONObject = new JSONObject();
        a(i2, true, jSONObject);
        a.a(jSONObject, "sei", str2);
        if (str == null) {
            str = "";
        }
        a.a(jSONObject, "link_mic_id", str);
        a.a(jSONObject, "region_size", (long) i3);
        c.a("ttlive_client_linkmic_anchor_sei", 0, jSONObject);
    }
}

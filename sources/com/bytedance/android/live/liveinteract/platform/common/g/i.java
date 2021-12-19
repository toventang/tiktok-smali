package com.bytedance.android.live.liveinteract.platform.common.g;

import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.livesdk.b.a.d;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class i extends d {

    /* renamed from: a */
    public static long f11971a = System.currentTimeMillis();

    /* renamed from: b */
    public static boolean f11972b;

    /* renamed from: c */
    public static long f11973c = System.currentTimeMillis();

    /* renamed from: d */
    public static long f11974d = System.currentTimeMillis();

    /* renamed from: e */
    public static long f11975e = System.currentTimeMillis();

    /* renamed from: f */
    public static long f11976f = System.currentTimeMillis();

    /* renamed from: g */
    public static long f11977g = System.currentTimeMillis();

    /* renamed from: i */
    public static long f11978i = System.currentTimeMillis();

    /* renamed from: j */
    public static final i f11979j = new i();

    /* renamed from: k */
    private static long f11980k = System.currentTimeMillis();

    /* renamed from: l */
    private static long f11981l = System.currentTimeMillis();

    /* renamed from: m */
    private static long f11982m = System.currentTimeMillis();

    private static String h(boolean z) {
        return z ? "ttlive_client_guest_link_anchor_monitor" : "ttlive_client_guest_link_audience_monitor";
    }

    private static String i(boolean z) {
        return z ? "ttlive_client_multi_live_anchor_monitor" : "ttlive_client_multi_live_audience_monitor";
    }

    private i() {
    }

    public static final void a(List<? extends e> list) {
        l.d(list, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "response", list.toString());
        a.a(jSONObject, "cost", System.currentTimeMillis() - f11980k);
        a(true, "list_succeed", jSONObject, 0);
    }

    public static final void a(Throwable th) {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, th);
        a.a(jSONObject, "cost", System.currentTimeMillis() - f11980k);
        a(true, "list_failed", jSONObject, 1);
    }

    public static final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        d a2 = d.a();
        l.b(a2, "");
        a.a(jSONObject, "rtc_ext_info", a2.f14187h);
        a(z, "rtc_join_channel_start", jSONObject, 0);
    }

    public static final void a(boolean z, long j2, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "guest_user_id", j2);
        a.a(jSONObject, "guest_linkmic_id", str);
        a(jSONObject, Long.valueOf(j2), str);
        a(z, "rtc_user_joined", jSONObject, 0);
    }

    public static final void a(boolean z, int i2, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "error_code", 104L);
        a.a(jSONObject, "error_msg", (long) i2);
        a.a(jSONObject, "error_detail", str);
        a(z, "rtc_error", jSONObject, 0);
        v.e(e.a(jSONObject));
    }

    public static final void a(List<d.C0210d> list, d.b bVar, boolean z) {
        l.d(list, "");
        l.d(bVar, "");
        try {
            if (!(bVar != d.b.NONE)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (z) {
                JSONObject jSONObject = new JSONObject();
                a.a(jSONObject, "source", bVar.getContent());
                a.a(jSONObject, "user_list", list.toString());
                a(true, "refresh_user_list", jSONObject, 0);
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } catch (Exception unused) {
        }
    }

    public static final void a(boolean z, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "request_source", str);
        a(z, "rtc_stop", jSONObject, 0);
    }

    public static final void a(aj ajVar, long j2, String str, long j3) {
        l.d(ajVar, "");
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, ajVar);
        a(jSONObject, Long.valueOf(j2), str);
        a.a(jSONObject, "guest_user_id", j2);
        a.a(jSONObject, "guest_linkmic_id", str);
        a.a(jSONObject, "reply_status", j3);
        a(jSONObject, Long.valueOf(j2), str);
        a(true, "reply_message", jSONObject, 0);
    }

    public static final void a(Throwable th, long j2, long j3, String str) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "error_code", 101L);
        a.a(jSONObject, "reply_status", j2);
        a.a(jSONObject, "cost", System.currentTimeMillis() - f11981l);
        a(jSONObject, th);
        a(jSONObject, Long.valueOf(j3), str);
        a(false, "reply_failed", jSONObject, 1);
    }

    public static final void a(String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, StringSet.type, str);
        a(false, "leave_click", jSONObject, 0);
    }

    public static final void a(String str, HashMap<String, Object> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "request_source", str);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            a(jSONObject, entry.getKey(), entry.getValue());
        }
        a(false, "leave_request", jSONObject, 0);
        f11982m = System.currentTimeMillis();
    }

    public static final void a(String str, Throwable th, HashMap<String, Object> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "request_source", str);
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            a(jSONObject, entry.getKey(), entry.getValue());
        }
        a(jSONObject, th);
        a.a(jSONObject, "cost", System.currentTimeMillis() - f11982m);
        a(false, "leave_failed", jSONObject, 1);
    }

    public static final void a(boolean z, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        a.a(jSONObject, "msg_id", str);
        if (str2 == null) {
            str2 = "";
        }
        a.a(jSONObject, "msg", str2);
        a(z, "multilive_rtc_message_send", jSONObject, 0);
    }

    public static final void a(boolean z, String str, String str2, long j2) {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        a.a(jSONObject, "msg_id", str);
        a.a(jSONObject, "cost", j2);
        if (str2 == null) {
            str2 = "";
        }
        a.a(jSONObject, "msg", str2);
        a(z, "multilive_rtc_message_received", jSONObject, 0);
    }

    public static final void a(boolean z, HashMap<String, Object> hashMap) {
        l.d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            a(jSONObject, entry.getKey(), entry.getValue());
        }
        a(z, "multilive_rtc_message_send_fail", jSONObject, 0);
    }

    public static void a(JSONObject jSONObject, Long l2, String str) {
        a.a(jSONObject, "remote_user_id", l2 != null ? l2.longValue() : 0);
        a.a(jSONObject, "remote_linkmic_id", str);
    }

    public static void a(boolean z, String str, JSONObject jSONObject, int i2) {
        a.a(jSONObject, "event_id", str);
        if (!z) {
            a.a(jSONObject, "join_channel_removed", String.valueOf(MultiLiveServerAutoJoinChannel.INSTANCE.getValue() ? 1 : 0));
        }
        a(z, jSONObject);
        a.a(jSONObject, "report_id", String.valueOf(com.bytedance.android.livesdk.b.a.d.a().r));
        com.bytedance.android.livesdk.b.a.d.a().r++;
        c.a(g(z), i2, jSONObject);
    }

    public static final void a(String str, boolean z) {
        l.d(str, "");
        long a2 = g.a.f14199a.a(str);
        long j2 = 0;
        if (a2 > 0) {
            JSONObject jSONObject = new JSONObject();
            a.a(jSONObject, "guest_user_id", a2);
            a.a(jSONObject, "guest_linkmic_id", str);
            a(jSONObject, Long.valueOf(a2), str);
            long b2 = com.bytedance.android.livesdk.b.a.d.a().b(a2);
            int i2 = 1;
            if (!com.bytedance.android.livesdk.b.a.d.a().p) {
                j2 = System.currentTimeMillis() - b2;
                com.bytedance.android.livesdk.b.a.d.a().p = true;
            } else {
                i2 = 0;
            }
            a.a(jSONObject, "cost", j2);
            a.a(jSONObject, "first_joined", String.valueOf(i2));
            a(z, "rtc_first_remote_video", jSONObject, 0);
        }
    }

    public static final void c() {
        a(true, "disconnect_popup_show", new JSONObject(), 0);
    }

    public static final void e() {
        a(false, "camera_preview_view_show", new JSONObject(), 0);
    }

    public static final void f() {
        a(false, "apply_click", new JSONObject(), 0);
    }

    public static final void h() {
        a(false, "leave_popup_show", new JSONObject(), 0);
    }

    public static final void a() {
        a(true, "list_request", new JSONObject(), 0);
        f11980k = System.currentTimeMillis();
    }

    public static final void b() {
        a(false, "join_channel_request", new JSONObject(), 0);
        f11974d = System.currentTimeMillis();
    }

    public static final void g() {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "support_vendor", "12");
        a(false, "apply_request", jSONObject, 0);
        f11978i = System.currentTimeMillis();
    }

    static {
        Covode.recordClassIndex(6536);
    }

    public static final void d(boolean z) {
        a(z, "rtc_push_stream", new JSONObject(), 0);
    }

    private static String g(boolean z) {
        if (f11972b) {
            return i(z);
        }
        return h(z);
    }

    public static final void e(boolean z) {
        a(z, "rtc_offline", new JSONObject(), 0);
    }

    public static final void f(boolean z) {
        a(z, "multilive_rtc_message_send_succeed", new JSONObject(), 0);
    }

    public static final void a(int i2) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, StringSet.type, String.valueOf(i2));
        a(true, "disconnect_popup_click", jSONObject, 0);
    }

    public static final void b(int i2) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, StringSet.type, String.valueOf(i2));
        a(false, "leave_popup_click", jSONObject, 0);
    }

    public static final void c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        long j2 = com.bytedance.android.livesdk.b.a.d.a().f14189j;
        if (j2 > 0) {
            a.a(jSONObject, "cost", System.currentTimeMillis() - j2);
        }
        a(z, "rtc_join_channel_succeed", jSONObject, 0);
    }

    public static final void c(String str, boolean z) {
        int i2;
        l.d(str, "");
        long a2 = g.a.f14199a.a(str);
        long j2 = 0;
        if (a2 > 0) {
            JSONObject jSONObject = new JSONObject();
            a.a(jSONObject, "guest_user_id", a2);
            a.a(jSONObject, "guest_linkmic_id", str);
            a(jSONObject, Long.valueOf(a2), str);
            long b2 = com.bytedance.android.livesdk.b.a.d.a().b(a2);
            if (b2 > 0) {
                j2 = System.currentTimeMillis() - b2;
                i2 = 1;
            } else {
                i2 = 0;
            }
            a.a(jSONObject, "cost", j2);
            a.a(jSONObject, "first_joined", String.valueOf(i2));
            a(z, "rtc_first_remote_audio", jSONObject, 0);
        }
    }

    public static final void b(String str, HashMap<String, Object> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
            a(jSONObject, entry.getKey(), entry.getValue());
        }
        a.a(jSONObject, "cost", System.currentTimeMillis() - f11982m);
        a.a(jSONObject, "request_source", str);
        a(false, "leave_succeed", jSONObject, 0);
    }

    public static final void a(long j2, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "guest_user_id", j2);
        a.a(jSONObject, "guest_linkmic_id", str);
        a(jSONObject, Long.valueOf(j2), str);
        a(true, "cancel_invite", jSONObject, 0);
    }

    public static final void b(String str, boolean z) {
        long j2;
        l.d(str, "");
        long a2 = g.a.f14199a.a(str);
        if (a2 > 0) {
            JSONObject jSONObject = new JSONObject();
            a.a(jSONObject, "guest_user_id", a2);
            a.a(jSONObject, "guest_linkmic_id", str);
            a(jSONObject, Long.valueOf(a2), str);
            long b2 = com.bytedance.android.livesdk.b.a.d.a().b(a2);
            int i2 = 1;
            if (!com.bytedance.android.livesdk.b.a.d.a().q) {
                j2 = System.currentTimeMillis() - b2;
                com.bytedance.android.livesdk.b.a.d.a().q = true;
            } else {
                j2 = 0;
                i2 = 0;
            }
            a.a(jSONObject, "cost", j2);
            a.a(jSONObject, "first_joined", String.valueOf(i2));
            a(z, "rtc_first_frame_render", jSONObject, 0);
            if (b2 > 0) {
                c.a("ttlive_client_guest_link_first_frame", j2, e.a(jSONObject));
                v.d(e.a(jSONObject));
            }
        }
    }

    public static final void a(LinkApi.e eVar, Throwable th) {
        l.d(eVar, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "turn_on_source", eVar.value);
        a(jSONObject, th);
        a.a(jSONObject, "cost", System.currentTimeMillis() - f11971a);
        a(true, "init_failed", jSONObject, 1);
    }

    public static final void a(int i2, long j2, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "status", String.valueOf(i2));
        a.a(jSONObject, "guest_user_id", j2);
        a.a(jSONObject, "guest_linkmic_id", str);
        a(jSONObject, Long.valueOf(j2), str);
        a(true, "agree_guest_click", jSONObject, 0);
    }

    public static final void b(long j2, long j3, String str) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "reply_status", j2);
        a.a(jSONObject, "cost", System.currentTimeMillis() - f11981l);
        a(jSONObject, Long.valueOf(j3), str);
        a(false, "reply_succeed", jSONObject, 0);
    }

    public static final void a(long j2, long j3, String str) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "reply_status", j2);
        a.a(jSONObject, "guest_linkmic_id", str);
        a(jSONObject, Long.valueOf(j3), str);
        a(false, "reply_request", jSONObject, 0);
        f11981l = System.currentTimeMillis();
    }

    public static final void b(boolean z, long j2, String str) {
        l.d(str, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "guest_user_id", j2);
        a.a(jSONObject, "guest_linkmic_id", str);
        a(jSONObject, Long.valueOf(j2), str);
        a(z, "rtc_user_leaved", jSONObject, 0);
    }

    public static final void a(aj ajVar, long j2, long j3) {
        l.d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, ajVar);
        a.a(jSONObject, "message_available_time", ajVar.f());
        a.a(jSONObject, "at_least_available_time", j2);
        a.a(jSONObject, "limit_time", j3);
        a.a(jSONObject, "remote_linkmic_id", ajVar.f19143i.f19577g.f19597h);
        a(false, "permit_message_delay", jSONObject, 0);
    }
}

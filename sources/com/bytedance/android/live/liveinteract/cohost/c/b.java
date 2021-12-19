package com.bytedance.android.live.liveinteract.cohost.c;

import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.platform.common.g.d;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class b extends d {

    /* renamed from: a */
    public static long f10206a = System.currentTimeMillis();

    /* renamed from: b */
    static long f10207b = System.currentTimeMillis();

    /* renamed from: c */
    static long f10208c = System.currentTimeMillis();

    /* renamed from: d */
    static long f10209d = System.currentTimeMillis();

    /* renamed from: e */
    public static final b f10210e = new b();

    private b() {
    }

    public static void a(String str, JSONObject jSONObject, int i2) {
        b(jSONObject);
        a.a(jSONObject, "event_id", str);
        if (jSONObject.optLong("channel_id") > 0) {
            a.a(jSONObject, "report_id", String.valueOf(b.a.a().X));
            b.a.a().X++;
        }
        c.a("ttlive_client_anchor_link_mic_monitor", i2, jSONObject);
    }

    public static final void a() {
        a("reply_error", new JSONObject(), 0);
    }

    public static final void c() {
        a("rtc_stop", new JSONObject(), 0);
    }

    public static final void b() {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "rtc_ext_info", b.a.a().v);
        a("rtc_join_channel_start", jSONObject, 0);
    }

    static {
        Covode.recordClassIndex(5370);
    }

    public static final void a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "push_stream_advance", String.valueOf(z));
        a("rtc_push_stream", jSONObject, 0);
    }

    private static final String a(com.bytedance.android.livesdk.model.message.d.c.d dVar) {
        if (dVar == null) {
            return "unknow";
        }
        int i2 = dVar.f19536b;
        if (i2 == 1) {
            return w.a(m.FOLLOW_INVITE);
        }
        if (i2 == 2) {
            return w.a(m.RECOMMEND_INVITE);
        }
        if (i2 != 3) {
            return w.a(m.NONE);
        }
        return w.a(m.RANDOM_LINK_MIC_INVITE);
    }

    public static final void b(aj ajVar) {
        l.d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, ajVar);
        a("cancel_message", jSONObject, 0);
    }

    public static final void a(aj ajVar) {
        long j2;
        long j3;
        com.bytedance.android.livesdk.model.message.d.k.c cVar;
        com.bytedance.android.livesdk.model.message.d.k.b bVar;
        String valueOf;
        String str = "";
        l.d(ajVar, str);
        JSONObject jSONObject = new JSONObject();
        com.bytedance.android.livesdk.model.message.d.k.a aVar = ajVar.f19143i;
        if (aVar != null) {
            j2 = (long) aVar.f19579i;
        } else {
            j2 = -1;
        }
        a.a(jSONObject, "reply_status", j2);
        com.bytedance.android.livesdk.model.message.d.k.a aVar2 = ajVar.f19143i;
        if (!(aVar2 == null || (bVar = aVar2.f19580j) == null || (valueOf = String.valueOf(bVar.f19589f)) == null)) {
            str = valueOf;
        }
        a.a(jSONObject, "VENDOR", str);
        com.bytedance.android.livesdk.model.message.d.k.a aVar3 = ajVar.f19143i;
        if (aVar3 == null || (cVar = aVar3.f19574d) == null) {
            j3 = 0;
        } else {
            j3 = cVar.f19591b;
        }
        a.a(jSONObject, "LINK_MIC_ID", j3);
        a(jSONObject, ajVar);
        a("reply_message", jSONObject, 0);
    }

    public static final void a(int i2, Map<String, ? extends Object> map) {
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "reply_status", String.valueOf(i2));
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        a("reply_request", jSONObject, 0);
        f10207b = System.currentTimeMillis();
    }

    public static final void a(aj ajVar, com.bytedance.android.livesdk.model.message.d.c.d dVar) {
        String str;
        long j2;
        l.d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, ajVar);
        com.bytedance.android.livesdk.model.message.d.c.c cVar = ajVar.f19142h;
        if (cVar != null) {
            str = String.valueOf(cVar.f19527e);
        } else {
            str = null;
        }
        a.a(jSONObject, "vendor", str);
        a.a(jSONObject, "message_from", String.valueOf(ajVar.getMessageFrom()));
        com.bytedance.android.livesdk.model.message.d.c.c cVar2 = ajVar.f19142h;
        if (cVar2 != null) {
            j2 = cVar2.f19523a;
        } else {
            j2 = 0;
        }
        a.a(jSONObject, "guest_user_id", j2);
        a.a(jSONObject, "message_expired_time", ajVar.u);
        a.a(jSONObject, "message_available_time", ajVar.f());
        a.a(jSONObject, "message", e.a.f9628b.b(ajVar));
        a.a(jSONObject, "invitee_list", a(dVar));
        a("invite_message", jSONObject, 0);
    }

    public static final void a(int i2, com.bytedance.android.live.network.response.d<?> dVar, Map<String, ? extends Object> map) {
        l.d(dVar, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "answer", String.valueOf(i2));
        a.a(jSONObject, "cost", System.currentTimeMillis() - f10207b);
        a(jSONObject, dVar);
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        a("reply_succeed", jSONObject, 0);
    }

    public static final void a(aj ajVar, long j2, long j3, com.bytedance.android.livesdk.model.message.d.c.d dVar) {
        String str;
        long j4;
        l.d(ajVar, "");
        JSONObject jSONObject = new JSONObject();
        a.a(jSONObject, "channel_id", ajVar.f19140f);
        com.bytedance.android.livesdk.model.message.d.c.c cVar = ajVar.f19142h;
        if (cVar != null) {
            str = String.valueOf(cVar.f19527e);
        } else {
            str = null;
        }
        a.a(jSONObject, "vendor", str);
        com.bytedance.android.livesdk.model.message.d.c.c cVar2 = ajVar.f19142h;
        if (cVar2 != null) {
            j4 = cVar2.f19523a;
        } else {
            j4 = 0;
        }
        a.a(jSONObject, "guest_user_id", j4);
        a.a(jSONObject, "message_available_time", ajVar.f());
        a.a(jSONObject, "at_least_available_time", j2);
        a.a(jSONObject, "limit_time", j3);
        a.a(jSONObject, "invitee_list", a(dVar));
        a("invite_message_delay", jSONObject, 0);
    }
}

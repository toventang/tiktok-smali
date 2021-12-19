package com.bytedance.android.live.broadcast.d;

import com.bytedance.android.live.broadcast.api.c.c;
import com.bytedance.android.live.broadcast.api.c.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f7832a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f7833b;

    /* renamed from: c  reason: collision with root package name */
    public static long f7834c;

    /* renamed from: d  reason: collision with root package name */
    public static long f7835d;

    /* renamed from: e  reason: collision with root package name */
    public static long f7836e;

    /* renamed from: f  reason: collision with root package name */
    public static long f7837f;

    /* renamed from: g  reason: collision with root package name */
    public static long f7838g;

    /* renamed from: h  reason: collision with root package name */
    public static long f7839h;

    /* renamed from: i  reason: collision with root package name */
    public static int f7840i;

    /* renamed from: j  reason: collision with root package name */
    public static int f7841j;

    /* renamed from: k  reason: collision with root package name */
    public static int f7842k;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f7843l;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f7844m;
    public static int n;
    public static final a o = new a();

    private a() {
    }

    /* renamed from: com.bytedance.android.live.broadcast.d.a$a  reason: collision with other inner class name */
    public static final class RunnableC0112a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final String f7845a;

        static {
            Covode.recordClassIndex(3877);
        }

        public final void run() {
            com.bytedance.android.livesdk.ab.a a2 = c.a.a(this.f7845a);
            a2.f13426c = true;
            a2.a();
        }

        public RunnableC0112a(String str) {
            l.d(str, "");
            this.f7845a = str;
        }
    }

    static {
        Covode.recordClassIndex(3876);
    }

    public static void a() {
        d.b(c.a.a("ttlive_create_room_success_all").b("duration", Long.valueOf(System.currentTimeMillis() - f7832a))).a();
        f7832a = System.currentTimeMillis();
        f7835d = System.currentTimeMillis();
    }

    public static void b() {
        f7838g = System.currentTimeMillis();
        d.b(c.a.a("ttlive_broadcast_created_all").b("click_start_live", Long.valueOf(f7834c)).b("create_room_success", Long.valueOf(f7835d)).b("video_page_create", Long.valueOf(f7836e)).b("video_page_create_success", Long.valueOf(f7837f)).b("video_page_camera_first_show", Long.valueOf(f7838g))).a();
    }

    public static void a(i iVar) {
        l.d(iVar, "");
        if (iVar == i.VIDEO) {
            com.bytedance.android.livesdk.ab.a a2 = c.a.a("ttlive_click_start_video_live_all");
            a2.f13426c = true;
            d.b(a2).a();
        } else if (iVar == i.THIRD_PARTY) {
            com.bytedance.android.livesdk.ab.a a3 = c.a.a("ttlive_click_start_obs_live_all");
            a3.f13426c = true;
            d.b(a3).a();
        }
        f7832a = System.currentTimeMillis();
        f7834c = System.currentTimeMillis();
    }

    public static void a(Exception exc, boolean z, String str) {
        int i2;
        String message;
        String str2;
        l.d(exc, "");
        long currentTimeMillis = System.currentTimeMillis() - f7834c;
        int i3 = -1;
        if (exc instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc;
            i3 = aVar.getErrorCode();
            message = aVar.getErrorMsg();
            b.a.a("livesdk_create_room").a("error_code", "0").a("error_msg", "").a("duration", currentTimeMillis).b();
            i2 = -1;
        } else {
            if (exc instanceof com.bytedance.android.live.base.model.b.a) {
                i2 = ((com.bytedance.android.live.base.model.b.a) exc).getStatusCode();
            } else {
                i2 = -1;
            }
            message = exc.getMessage();
        }
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "error_code", (long) i3);
        c.a(jSONObject, "error_msg", message);
        c.a(jSONObject, "status_code", (long) i2);
        if (z) {
            str2 = DataType.AUDIO;
        } else {
            str2 = "video";
        }
        c.a(jSONObject, "media_type", str2);
        c.a(jSONObject, "live_permission_source", str);
        com.bytedance.android.live.core.d.c.b("ttlive_create_room_all", 1, jSONObject);
        com.bytedance.android.live.core.d.c.a("ttlive_create_room_error", 1, jSONObject);
        com.bytedance.android.livesdk.ab.a.a.a();
        com.bytedance.android.livesdk.ab.a.a.a(com.bytedance.android.livesdk.ab.a.b.Room.info, "ttlive_create_room", 1, jSONObject);
        b.a.a("livesdk_create_room").a("error_code", i3).a("error_msg", message).a("duration", currentTimeMillis).b();
    }
}

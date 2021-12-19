package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import b.i;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.metrics.b.a;
import com.ss.android.ugc.aweme.video.b.q;
import org.json.JSONObject;

public class am {

    /* renamed from: a */
    static volatile boolean f91907a;

    /* renamed from: b */
    private static volatile boolean f91908b;

    static {
        Covode.recordClassIndex(57851);
    }

    private static void a() {
        MethodCollector.i(8897);
        if (!f91908b) {
            synchronized (am.class) {
                try {
                    if (!f91908b) {
                        f91908b = true;
                        f.d().d(ao.f91913a);
                        s.a(ap.f91914a);
                    }
                } finally {
                    MethodCollector.o(8897);
                }
            }
            return;
        }
        MethodCollector.o(8897);
    }

    public static void a(boolean z) {
        if (z) {
            a();
        }
        if (f91907a != z) {
            f91907a = z;
        }
    }

    public static void a(String str, String str2) {
        if (f91907a && !TextUtils.isEmpty(str)) {
            i.b(new an(s.b(), s.f93858b.name(), str, str2), r.a());
        }
    }

    static final /* synthetic */ Object a(String str, String str2, String str3, String str4) {
        JSONObject a2 = new s().a("top_activity", str).a("feed_tab", str2).a("err_code", str3).a("play_sess", String.valueOf(str4)).a();
        try {
            a2.put("preloader_type", q.b());
        } catch (Exception e2) {
            b.a(e2);
        }
        r.onEvent(MobClick.obtain().setEventName("video_prepare_error").setLabelName("perf_monitor").setJsonObject(a2));
        r.a("video_prepare_error", a2);
        a.a("video_prepare_error", a2);
        com.ss.android.ugc.aweme.bm.b.b("video_prepare_error", a2);
        return null;
    }
}

package com.ss.android.ugc.aweme.discover.ui.intermediate;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.a;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static long f82595a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static final b f82596b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static long f82597c = -1;

    private b() {
    }

    static {
        Covode.recordClassIndex(51423);
    }

    public static void a(long j2, boolean z) {
        String str;
        if (f82597c <= 0) {
            f82597c = j2;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", j2 - f82595a);
            if (z) {
                str = "lynx";
            } else {
                str = "";
            }
            jSONObject.put("fe_flag", str);
            a.a("search_transfer_firstscreen_time_monitor", jSONObject);
        }
    }
}

package com.bytedance.android.live.core.f.a;

import android.net.Uri;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ab.d.d;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f9041a;

    /* renamed from: b  reason: collision with root package name */
    private final long f9042b;

    static {
        Covode.recordClassIndex(4602);
    }

    e(Uri uri, long j2) {
        this.f9041a = uri;
        this.f9042b = j2;
    }

    public final void run() {
        Uri uri = this.f9041a;
        long j2 = this.f9042b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri);
        } catch (JSONException unused) {
        }
        c.c("hotsoon_image_load_error_rate", 0, jSONObject);
        if (j2 > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j2);
                jSONObject2.put("url", uri);
            } catch (JSONException unused2) {
            }
            c.a("hotsoon_image_load_duration", "hotsoon_image_load", jSONObject2);
            float f2 = (float) j2;
            if (c.a() != null && !LiveEnableSlardarSetting.INSTANCE.isDisable()) {
                c.a().a("hotsoon_image_load", "load_time", f2);
            }
            a.a(3, "image_monitor", "no cache = " + uri + " duration = " + j2);
        }
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("url", uri2);
        c.a(d.a("ttlive_image_load_status"), 0, j2, hashMap);
    }
}

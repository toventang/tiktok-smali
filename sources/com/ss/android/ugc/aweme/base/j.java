package com.ss.android.ugc.aweme.base;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f68140a;

    /* renamed from: b  reason: collision with root package name */
    private final long f68141b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f68142c;

    static {
        Covode.recordClassIndex(41982);
    }

    j(Uri uri, long j2, boolean z) {
        this.f68140a = uri;
        this.f68141b = j2;
        this.f68142c = z;
    }

    public final void run() {
        Uri uri = this.f68140a;
        long j2 = this.f68141b;
        boolean z = this.f68142c;
        String uri2 = uri != null ? uri.toString() : null;
        if (!TextUtils.isEmpty(uri2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", uri2);
                jSONObject.put("fromNetwork", z);
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty("")) {
                    jSONObject.put("caller_id", "");
                }
                jSONObject.put("duration", j2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            b.a("aweme_image_load_error_rate", 0, jSONObject);
            if (j2 > 0) {
                o.a("aweme_image_load", "load_time", (float) j2);
            }
        }
    }
}

package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.a;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final Runnable f91939a = new b();

    static {
        Covode.recordClassIndex(57891);
    }

    private b() {
    }

    public final void run() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", -2);
            jSONObject.put("errorCode", -101);
            a.a("cache_feed_request_response", jSONObject);
        } catch (Exception unused) {
        }
    }
}

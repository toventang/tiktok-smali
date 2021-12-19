package com.ss.android.ugc.aweme.base;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.facebook.imagepipeline.o.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.services.ImageUserServiceImpl;
import org.json.JSONObject;

final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f68138a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f68139b;

    static {
        Covode.recordClassIndex(41981);
    }

    i(b bVar, Throwable th) {
        this.f68138a = bVar;
        this.f68139b = th;
    }

    public final void run() {
        int i2;
        b bVar = this.f68138a;
        Throwable th = this.f68139b;
        Uri uri = bVar.mSourceUri;
        Context a2 = d.a();
        String uri2 = uri != null ? uri.toString() : null;
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = g.a();
        }
        if (j.f107229h) {
            JSONObject jSONObject = new JSONObject();
            try {
                String th2 = th.toString();
                jSONObject.put("errorDesc", th2);
                jSONObject.put("url", uri2);
                jSONObject.put("userId", ImageUserServiceImpl.createImageUserServicebyMonsterPlugin(false).getCurrentUserId());
                if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                    j.f107227f = NetworkUtils.getNetworkAccessType(a2);
                }
                jSONObject.put("networkType", j.f107227f);
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty("")) {
                    jSONObject.put("caller_id", "");
                }
                o.b("aweme_image_load_log", "image_error", jSONObject);
                if (!TextUtils.isEmpty(th2)) {
                    if (!th2.contains("canceled")) {
                        if (!th2.contains("Canceled")) {
                            if (th2.contains("network not available")) {
                                i2 = 3;
                                com.bytedance.apm.b.a("aweme_image_load_error_rate", i2, jSONObject);
                            }
                        }
                    }
                    i2 = 2;
                    com.bytedance.apm.b.a("aweme_image_load_error_rate", i2, jSONObject);
                }
                i2 = 1;
                com.bytedance.apm.b.a("aweme_image_load_error_rate", i2, jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}

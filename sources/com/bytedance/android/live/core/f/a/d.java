package com.bytedance.android.live.core.f.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.o.b;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.lancet.j;
import java.util.HashMap;
import org.json.JSONObject;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f9039a;

    /* renamed from: b  reason: collision with root package name */
    private final b f9040b;

    static {
        Covode.recordClassIndex(4601);
    }

    d(Throwable th, b bVar) {
        this.f9039a = th;
        this.f9040b = bVar;
    }

    public final void run() {
        Throwable th = this.f9039a;
        b bVar = this.f9040b;
        Context e2 = y.e();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c.a();
        }
        if (j.f107229h) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errorDesc", th.toString());
                jSONObject.put("url", bVar.mSourceUri);
                jSONObject.put("userId", ((IHostUser) a.a(IHostUser.class)).getCurUserId());
                if (TextUtils.isEmpty(j.f107227f) || !j.b() || j.c()) {
                    j.f107227f = NetworkUtils.getNetworkAccessType(e2);
                }
                jSONObject.put("networkType", j.f107227f);
                c.a("hotsoon_image_load_log", "image_error", jSONObject);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            c.c("hotsoon_image_load_error_rate", 1, jSONObject);
            String uri = bVar.mSourceUri.toString();
            String th2 = th.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("url", uri);
            hashMap.put("error_msg", th2);
            c.a(com.bytedance.android.livesdk.ab.d.d.a("ttlive_image_load_status"), 1, 0, hashMap);
            c.a(com.bytedance.android.livesdk.ab.d.d.b("ttlive_image_load_status"), 1, 0, hashMap);
        }
    }
}

package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ies.ugc.aweme.rich.a.d;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.common.q;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class SendLogMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69150b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69151c = "sendLog";

    static {
        Covode.recordClassIndex(42643);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42644);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69151c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendLogMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
        a(a.f69188a);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        long j2;
        boolean z;
        l.d(jSONObject, "");
        l.d(aVar, "");
        e();
        if (jSONObject == null) {
            aVar.a(0, "");
            return;
        }
        String optString = jSONObject.optString("eventName");
        String optString2 = jSONObject.optString("labelName");
        String optString3 = jSONObject.optString("value");
        String optString4 = jSONObject.optString("extValue");
        JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
        long j3 = 0;
        if (!TextUtils.isEmpty(optString3)) {
            j2 = Long.parseLong(optString3);
        } else {
            j2 = 0;
        }
        if (!TextUtils.isEmpty(optString4)) {
            j3 = Long.parseLong(optString4);
        }
        if (optJSONObject == null || !optJSONObject.has("is_ad_event") || (!TextUtils.equals("1", optJSONObject.optString("is_ad_event")) && optJSONObject.optInt("is_ad_event") != 1 && !optJSONObject.optBoolean("is_ad_event"))) {
            z = false;
        } else {
            z = true;
        }
        if (e() != null) {
            if (!z) {
                q.a(e(), optString, optString2, j2, j3, optJSONObject);
            } else if (TextUtils.equals("click", optString2)) {
                j.a(optString, optString3, j3, optJSONObject);
                optJSONObject.put("has_v3", 1);
                q.a(e(), optString, optString2, j2, j3, optJSONObject);
            } else {
                l.b(optString, "");
                l.b(optString2, "");
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a(optString, optString2, String.valueOf(j2), "", String.valueOf(j3));
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    l.b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a2.b(next, optJSONObject.opt(next));
                    }
                }
                a2.c();
                if (d.b()) {
                    q.a(e(), optString, optString2, j2, j3, optJSONObject);
                } else if (d.a()) {
                    if (optJSONObject != null) {
                        try {
                            optJSONObject.put("_ad_staging_flag", "1");
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                    q.a(e(), optString, optString2, j2, j3, optJSONObject);
                }
            }
            aVar.a(new o());
            return;
        }
        aVar.a(0, "");
    }
}

package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.ies.ugc.aweme.rich.a.d;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class SendLogMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91167a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57373);
    }

    private SendLogMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57374);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ SendLogMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public SendLogMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        long j2;
        boolean z;
        if (jSONObject != null) {
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
            if (this.mContextRef != null) {
                if (!z) {
                    q.a((Context) this.mContextRef.get(), optString, optString2, j2, j3, optJSONObject);
                } else if (TextUtils.equals("click", optString2)) {
                    j.a(optString, optString3, j3, optJSONObject);
                    optJSONObject.put("has_v3", 1);
                    q.a((Context) this.mContextRef.get(), optString, optString2, j2, j3, optJSONObject);
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
                        q.a((Context) this.mContextRef.get(), optString, optString2, j2, j3, optJSONObject);
                    } else if (d.a()) {
                        if (optJSONObject != null) {
                            try {
                                optJSONObject.put("_ad_staging_flag", "1");
                            } catch (JSONException e2) {
                                e2.printStackTrace();
                            }
                        }
                        q.a((Context) this.mContextRef.get(), optString, optString2, j2, j3, optJSONObject);
                    }
                }
                if (aVar != null) {
                    aVar.a(new o());
                }
            } else if (aVar != null) {
                aVar.a(0, "");
            }
        } else if (aVar != null) {
            aVar.a(0, "");
        }
    }
}

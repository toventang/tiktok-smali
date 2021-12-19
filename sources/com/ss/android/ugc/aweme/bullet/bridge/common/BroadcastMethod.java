package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.shoutouts.b;
import com.ss.android.ugc.aweme.shoutouts.g;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONException;
import org.json.JSONObject;

public final class BroadcastMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68953b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68954c = "broadcast";

    static {
        Covode.recordClassIndex(42506);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42507);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(JSONObject jSONObject) {
            l.d(jSONObject, "");
            try {
                if ("shoutouts_coins_setting".equals(jSONObject.optString("eventName"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("buyer_payment");
                    g gVar = (g) new f().a(jSONObject2.toString(), g.class);
                    com.ss.android.ugc.aweme.shoutouts.a aVar = (com.ss.android.ugc.aweme.shoutouts.a) new f().a(jSONObject3.toString(), com.ss.android.ugc.aweme.shoutouts.a.class);
                    l.b(gVar, "");
                    l.b(aVar, "");
                    c.a(new b(gVar, aVar));
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68954c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            l.d(jSONObject, "");
            a("notification", jSONObject);
            com.ss.android.ugc.aweme.fe.method.BroadcastMethod.a(e(), jSONObject, null, g());
            a.a(jSONObject);
            aVar.a("");
        } catch (JSONException e2) {
            aVar.a(-1, "");
            e2.printStackTrace();
        }
    }
}

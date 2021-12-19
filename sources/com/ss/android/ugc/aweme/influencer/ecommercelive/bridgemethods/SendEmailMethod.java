package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class SendEmailMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f104519b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f104520c = "sendEMailTo";

    static {
        Covode.recordClassIndex(66951);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66952);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f104520c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendEmailMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("email");
        String optString2 = jSONObject.optString("subject");
        String optString3 = jSONObject.optString("content");
        Context e2 = e();
        if (e2 != null) {
            l.b(optString, "");
            l.b(optString2, "");
            l.b(optString3, "");
            c.a(e2, new String[]{optString}, optString2, optString3);
            aVar.a((Object) null);
            return;
        }
        aVar.a(0, null);
    }
}

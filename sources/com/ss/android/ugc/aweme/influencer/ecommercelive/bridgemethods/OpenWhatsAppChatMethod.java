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

public final class OpenWhatsAppChatMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f104516b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f104517c = "routeToWhatsapp";

    static {
        Covode.recordClassIndex(66947);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66948);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f104517c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenWhatsAppChatMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("phone");
        String optString2 = jSONObject.optString("text");
        Context e2 = e();
        if (e2 != null) {
            l.b(optString, "");
            if (b.a(e2, optString, optString2)) {
                aVar.a((Object) null);
            } else {
                aVar.a(0, null);
            }
        } else {
            aVar.a(0, null);
        }
    }
}

package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.event.g;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class MessageTipMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68910b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68911c = "messageTip";

    static {
        Covode.recordClassIndex(42465);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42466);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68911c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageTipMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("func");
        if (jSONObject.has("msg")) {
            new com.ss.android.ugc.aweme.tux.a.i.a(e()).a(jSONObject.getString("msg")).a();
            if (aVar != null) {
                aVar.a((Object) null);
            }
        } else if (aVar != null) {
            aVar.a(-1, "empty msg");
        }
        l.b(optString, "");
        c.a(new g(optString, jSONObject));
    }
}

package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.google.gson.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.common.q;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class SendLogV3Method extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69152b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69153c = "sendLogV3";

    static {
        Covode.recordClassIndex(42645);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42646);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69153c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendLogV3Method(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        if (jSONObject == null) {
            aVar.a(0, "");
            return;
        }
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (TextUtils.isEmpty(optString) || optJSONObject == null) {
            aVar.a(0, "");
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString2 = optJSONObject.optString(next);
            keys.remove();
            l.b(next, "");
            l.b(optString2, "");
            hashMap.put(next, optString2);
        }
        q.a(optString, hashMap);
        aVar.a(new o());
    }
}

package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdkapi.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import h.f.b.l;
import org.json.JSONObject;

public final class g extends f<JSONObject, JSONObject> implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14679a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f14680b = 1;

    static {
        Covode.recordClassIndex(8149);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(8150);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.b.b
    public final boolean a() {
        if (this.f14680b != 1) {
            return true;
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, com.bytedance.ies.web.jsbridge2.g gVar) {
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        this.f14680b = jSONObject2.optInt("setViewClosable", 1);
        return null;
    }
}

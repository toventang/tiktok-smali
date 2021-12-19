package com.ss.android.ugc.aweme.bullet.bridge.framework;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.a.d;
import h.f.b.l;
import org.json.JSONObject;

public final class BulletGetAppInfoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69070b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69071c = "uniAppInfo";

    /* renamed from: d  reason: collision with root package name */
    private k.a f69072d = k.a.PUBLIC;

    static {
        Covode.recordClassIndex(42590);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42591);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69072d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69071c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69072d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulletGetAppInfoMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        JSONObject jSONObject2 = new JSONObject();
        String optString = jSONObject.optString("permissionGroup");
        this.f32005a.c(com.bytedance.ies.web.a.a.class);
        for (T t : d.a(optString).entrySet()) {
            jSONObject2.put((String) t.getKey(), t.getValue());
        }
        aVar.a((Object) jSONObject2);
    }
}

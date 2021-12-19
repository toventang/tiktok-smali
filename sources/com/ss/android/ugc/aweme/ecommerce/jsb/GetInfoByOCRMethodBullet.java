package com.ss.android.ugc.aweme.ecommerce.jsb;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class GetInfoByOCRMethodBullet extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86125b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f86126c = "pipo.getInfoByOcr";

    /* renamed from: d  reason: collision with root package name */
    private k.a f86127d = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(53888);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53889);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f86127d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f86126c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f86127d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetInfoByOCRMethodBullet(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        GetInfoByOCRMethod.a.b(jSONObject, null, aVar);
    }
}

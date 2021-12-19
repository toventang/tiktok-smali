package com.ss.android.ugc.aweme.ecommerce.jsb;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class UpdateNonceMethodBullet extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86143b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f86144c = "pipo.updateNonce";

    /* renamed from: d  reason: collision with root package name */
    private k.a f86145d = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(53901);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53902);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f86145d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f86144c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f86145d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateNonceMethodBullet(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        UpdateNonceMethod.a.a(jSONObject, null, aVar);
    }
}

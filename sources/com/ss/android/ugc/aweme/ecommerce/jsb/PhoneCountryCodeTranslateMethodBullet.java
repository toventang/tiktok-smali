package com.ss.android.ugc.aweme.ecommerce.jsb;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.a;
import h.f.b.l;
import org.json.JSONObject;

public final class PhoneCountryCodeTranslateMethodBullet extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f86133b = "phoneCountryCodeTranslate";

    /* renamed from: c  reason: collision with root package name */
    private k.a f86134c = k.a.PROTECT;

    static {
        Covode.recordClassIndex(53895);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f86134c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f86133b;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f86134c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhoneCountryCodeTranslateMethodBullet(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        aVar.a((Object) a.C2072a.a(jSONObject));
    }
}

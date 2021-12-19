package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import h.f.b.l;
import org.json.JSONObject;

public final class VerificationCheckMethodBullet extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f86150b = "verificationCheck";

    /* renamed from: c  reason: collision with root package name */
    private k.a f86151c = k.a.PROTECT;

    static {
        Covode.recordClassIndex(53906);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f86151c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f86150b;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f86151c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerificationCheckMethodBullet(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public static final class a extends com.ss.android.ugc.aweme.secapi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f86152a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f86153b;

        static {
            Covode.recordClassIndex(53907);
        }

        a(int i2, BaseBridgeMethod.a aVar) {
            this.f86152a = i2;
            this.f86153b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a(boolean z, int i2) {
            BaseBridgeMethod.a aVar = this.f86153b;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", z);
            aVar.a((Object) jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        int optInt = jSONObject.optInt("verifyCode");
        Context e2 = e();
        if (!(e2 instanceof Activity)) {
            e2 = null;
        }
        Activity activity = (Activity) e2;
        if (activity != null) {
            SecApiImpl.a().popCaptcha(activity, optInt, new a(optInt, aVar));
        }
    }
}

package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.net.Uri;
import androidx.browser.a.c;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.utils.hw;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenThirdPartyAppMethodBullet extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86130b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f86131c = "openThirdPartyApp";

    /* renamed from: d  reason: collision with root package name */
    private k.a f86132d = k.a.PROTECT;

    static {
        Covode.recordClassIndex(53892);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53893);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f86132d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f86131c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f86132d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenThirdPartyAppMethodBullet(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("url");
        String optString2 = jSONObject.optString("packageName");
        if (hw.a(d.a(), optString2)) {
            try {
                c.a aVar2 = new c.a();
                aVar2.a().f1776a.setPackage(optString2);
                aVar2.a().a(e(), Uri.parse(optString));
                aVar.a((Object) new JSONObject());
            } catch (Exception e2) {
                aVar.a(-1, e2.toString());
            }
        } else {
            aVar.a(-1, "app not installed");
        }
    }
}

package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.jsb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenHybridMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f73888b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f73889c = "openHybrid";

    static {
        Covode.recordClassIndex(45520);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45521);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f73889c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHybridMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        boolean z;
        String str;
        String queryParameter;
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("schema");
        if (jSONObject.optInt("is_ad") == 1) {
            z = true;
        } else {
            z = false;
        }
        String optString2 = jSONObject.optString("param");
        int i2 = a.f73892a[h().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            l.b(optString2, "");
            if (optString != null) {
                Context e2 = e();
                if (e2 instanceof Activity) {
                    Bundle bundle = new Bundle();
                    Uri parse = Uri.parse(optString);
                    if (!(parse == null || (queryParameter = parse.getQueryParameter("access_key")) == null)) {
                        l.b(queryParameter, "");
                        if (queryParameter.length() > 0) {
                            bundle.putString("access_key", queryParameter);
                        }
                    }
                    if (z) {
                        str = AdLandPagePreloadServiceImpl.f().e();
                        bundle.putString("bundle_extra_param", optString2);
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.bullet.b.a(e2, optString, str, bundle);
                }
            }
            aVar.a(null, 1, null);
            return;
        }
        aVar.a(-1, "The container is not any of these three - Web/RN/Lynx");
    }
}

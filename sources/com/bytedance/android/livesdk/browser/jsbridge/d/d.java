package com.bytedance.android.livesdk.browser.jsbridge.d;

import android.content.Context;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d implements com.bytedance.ies.web.a.d {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<Context> f14468a;

    /* renamed from: b  reason: collision with root package name */
    private IWalletService f14469b = ((IWalletService) a.a(IWalletService.class));

    static {
        Covode.recordClassIndex(8021);
    }

    public d(WeakReference<Context> weakReference) {
        this.f14468a = weakReference;
    }

    private static int a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return 0;
        }
        try {
            if (a.a(IWalletService.class) != null) {
                String optString = jSONObject.optString(StringSet.type);
                JSONObject optJSONObject = jSONObject.optJSONObject("args");
                if (optJSONObject != null) {
                    optJSONObject.optString("order_id");
                    optJSONObject.optString("channel_id");
                    optJSONObject.optString("product_id");
                    optJSONObject.optInt("real_count");
                    com.bytedance.android.live.core.c.a.b("Unknown pay way: ".concat(String.valueOf(optString)));
                }
            }
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (hVar != null && hVar.f35533d != null) {
            jSONObject.put("code", a(hVar.f35533d));
        }
    }
}

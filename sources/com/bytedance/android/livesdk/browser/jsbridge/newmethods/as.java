package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.h;
import com.bytedance.android.livesdk.browser.jsbridge.a.b;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.b.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import org.json.JSONObject;

public final class as extends f<JSONObject, Object> {
    static {
        Covode.recordClassIndex(8076);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(JSONObject jSONObject, g gVar) {
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (jSONObject2 == null) {
            return null;
        }
        if (gVar.f35646a instanceof c) {
            String optString = jSONObject2.optString("diamond");
            if (!TextUtils.isEmpty(optString)) {
                Bundle bundle = new Bundle();
                bundle.putString("KEY_REQUEST_PAGE", "h5");
                ((IWalletService) a.a(IWalletService.class)).getConsumeDialog(p.a(gVar.f35646a), bundle, jSONObject2, new IWalletService.a() {
                    /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.as.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(8077);
                    }

                    @Override // com.bytedance.android.live.wallet.IWalletService.a
                    public final void b(Dialog dialog, h hVar) {
                    }

                    @Override // com.bytedance.android.live.wallet.IWalletService.a
                    public final void a(Dialog dialog, h hVar) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("status", "success");
                            jSONObject.put("code", "1");
                        } catch (Exception e2) {
                            com.bytedance.android.live.core.c.a.a("PackagePurchaseMethod", e2);
                        }
                        com.bytedance.android.livesdk.browser.c.g.b().a("H5_payStatus", jSONObject);
                    }
                }, optString).show();
            }
        } else {
            b bVar = new b(jSONObject2, jSONObject2.getString("diamond"));
            try {
                str = Uri.parse(gVar.f35647b).getQueryParameter("event_page");
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("PackagePurchaseMethod", e2);
                str = "";
            }
            bVar.f14445c = str;
            com.bytedance.android.livesdk.an.a.a().a(bVar);
        }
        return null;
    }
}

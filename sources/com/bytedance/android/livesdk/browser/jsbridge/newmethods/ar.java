package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.f;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import org.json.JSONObject;

public final class ar extends f<JSONObject, JSONObject> {
    static {
        Covode.recordClassIndex(8075);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.f
    public final /* synthetic */ JSONObject invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(gVar, "");
        String optString = jSONObject2.optString("iap_id", "");
        if (m.a(optString)) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", optString);
        Context context = ((IHostContext) a.a(IHostContext.class)).context();
        l.b(context, "");
        intent.setData(appendQueryParameter.appendQueryParameter("package", context.getApplicationInfo().packageName).build());
        intent.setPackage("com.android.vending");
        Context context2 = gVar.f35646a;
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context2);
        context2.startActivity(intent);
        return null;
    }
}

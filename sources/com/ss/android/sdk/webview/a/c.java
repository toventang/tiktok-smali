package com.ss.android.sdk.webview.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.common.util.f;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f60168a;

    static {
        Covode.recordClassIndex(37165);
    }

    public c(WeakReference<Context> weakReference) {
        this.f60168a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = hVar.f35533d;
        int i2 = -1;
        if (jSONObject2 == null) {
            jSONObject.put("installed", -1);
            return;
        }
        String optString = jSONObject2.optString("pkg_name");
        String optString2 = jSONObject2.optString("open_url");
        Context a2 = com.ss.android.sdk.webview.d.a(this.f60168a);
        if (a2 != null) {
            if (!TextUtils.isEmpty(optString)) {
                if (f.b(a2, optString)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
            if (!TextUtils.isEmpty(optString2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(optString2));
                if (f.a(a2, intent)) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
        }
        jSONObject.put("installed", i2);
    }
}

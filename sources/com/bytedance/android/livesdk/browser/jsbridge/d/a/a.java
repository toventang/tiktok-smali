package com.bytedance.android.livesdk.browser.jsbridge.d.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.browser.jsbridge.d.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class a extends f {

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.android.livesdk.browser.d.a f14460b;

    static {
        Covode.recordClassIndex(8015);
    }

    @Override // com.bytedance.ies.web.a.d, com.bytedance.android.livesdk.browser.jsbridge.d.f
    public final void call(h hVar, JSONObject jSONObject) {
        super.call(hVar, jSONObject);
        if (TextUtils.equals(hVar.f35533d.optString(StringSet.type), "gift_panel")) {
            this.f14460b.dismissAllowingStateLoss();
        }
    }

    public a(WeakReference<Context> weakReference, com.bytedance.android.livesdk.browser.d.a aVar, final String str) {
        super(weakReference, new b() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.d.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(8016);
            }

            @Override // com.bytedance.android.livesdk.browser.c.b
            public final String d() {
                return str;
            }
        });
        this.f14460b = aVar;
    }
}

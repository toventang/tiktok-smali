package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class v implements d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f145051a;

    static {
        Covode.recordClassIndex(94844);
    }

    public v(WeakReference<Context> weakReference) {
        this.f145051a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (com.ss.android.sdk.webview.d.a(this.f145051a) != null) {
            r.a("qr_code_scan_enter", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "h5").f66730a);
            JSONObject jSONObject2 = null;
            if (hVar.f35533d.has("args")) {
                jSONObject2 = hVar.f35533d.getJSONObject("args");
            }
            QRCodePermissionActivity.a(com.ss.android.sdk.webview.d.a(this.f145051a));
            if (jSONObject2 != null && jSONObject2.has("should_close_self") && jSONObject2.getBoolean("should_close_self")) {
                Context a2 = com.ss.android.sdk.webview.d.a(this.f145051a);
                if (a2 instanceof Activity) {
                    ((Activity) a2).finish();
                }
            }
        }
    }
}

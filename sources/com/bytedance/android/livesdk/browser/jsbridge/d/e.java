package com.bytedance.android.livesdk.browser.jsbridge.d;

import android.content.Context;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f14470a;

    static {
        Covode.recordClassIndex(8022);
    }

    public e(WeakReference<Context> weakReference) {
        this.f14470a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        androidx.fragment.app.e a2 = p.a(this.f14470a.get());
        if (a2 != null) {
            ((IHostApp) a.a(IHostApp.class)).startBindPhoneDialogFragment(a2, "", "", new m() {
                /* class com.bytedance.android.livesdk.browser.jsbridge.d.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(8023);
                }
            });
            jSONObject.put("code", 1);
            return;
        }
        jSONObject.put("code", 0);
    }
}

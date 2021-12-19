package com.bytedance.android.livesdk.browser.jsbridge.d;

import android.content.Context;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.bytedance.ies.web.jsbridge2.y;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f14463a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<y> f14464b;

    /* renamed from: c  reason: collision with root package name */
    private String f14465c;

    /* renamed from: d  reason: collision with root package name */
    private IWalletService f14466d = ((IWalletService) a.a(IWalletService.class));

    static {
        Covode.recordClassIndex(8018);
    }

    public b(WeakReference<Context> weakReference, y yVar) {
        this.f14463a = weakReference;
        this.f14464b = new WeakReference<>(yVar);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (hVar != null && hVar.f35533d != null) {
            hVar.f35538i = false;
            this.f14465c = hVar.f35531b;
            hVar.f35533d.optJSONObject("args").optString("auth_info");
        }
    }
}

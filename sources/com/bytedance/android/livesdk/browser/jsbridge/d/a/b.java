package com.bytedance.android.livesdk.browser.jsbridge.d.a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<Context> f14462a;

    static {
        Covode.recordClassIndex(8017);
    }

    public b(WeakReference<Context> weakReference) {
        this.f14462a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (this.f14462a.get() != null) {
            ((IHostAction) a.a(IHostAction.class)).handleSchema(this.f14462a.get(), "sslocal://openRecord?enter_from=direct_shoot&tab=live", new Bundle());
        }
    }
}

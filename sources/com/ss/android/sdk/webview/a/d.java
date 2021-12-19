package com.ss.android.sdk.webview.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class d implements com.bytedance.ies.web.a.d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f60169a;

    static {
        Covode.recordClassIndex(37166);
    }

    public d(WeakReference<Context> weakReference) {
        this.f60169a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        jSONObject.put("code", 0);
    }
}

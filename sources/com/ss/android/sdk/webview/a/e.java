package com.ss.android.sdk.webview.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public String f60170a;

    /* renamed from: b  reason: collision with root package name */
    public String f60171b;

    /* renamed from: c  reason: collision with root package name */
    public a f60172c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Context> f60173d;

    static {
        Covode.recordClassIndex(37167);
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
    }

    public e(a aVar, WeakReference<Context> weakReference) {
        this.f60172c = aVar;
        this.f60173d = weakReference;
    }
}

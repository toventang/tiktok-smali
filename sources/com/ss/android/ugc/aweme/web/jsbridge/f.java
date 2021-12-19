package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import com.ss.android.sdk.webview.a.g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class f extends g {

    /* renamed from: b  reason: collision with root package name */
    private a f145031b;

    static {
        Covode.recordClassIndex(94827);
    }

    public f(a aVar, WeakReference<Context> weakReference) {
        super(weakReference);
        this.f145031b = aVar;
    }

    @Override // com.ss.android.sdk.webview.a.g, com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        String string = hVar.f35533d.getString(StringSet.type);
        hVar.f35532c = "open";
        hVar.f35533d.put(StringSet.type, string);
        hVar.f35538i = false;
        a(hVar.f35533d);
    }
}

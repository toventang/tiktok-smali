package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.miniapp_api.b;
import com.ss.android.ugc.aweme.miniapp_api.model.a.a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f145044a;

    static {
        Covode.recordClassIndex(94833);
    }

    public k(WeakReference<Context> weakReference) {
        this.f145044a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if ((com.ss.android.sdk.webview.d.a(this.f145044a.get()) instanceof CrossPlatformActivity) && hVar.f35533d != null) {
            int optInt = hVar.f35533d.optInt("status");
            String optString = jSONObject.optString("msg");
            a.C2809a aVar = new a.C2809a();
            aVar.f109668b = optInt;
            aVar.f109667a = "game_pay";
            aVar.f109669c = optString;
            b.a().f109665b = aVar.a();
        }
    }
}

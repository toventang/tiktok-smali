package com.ss.android.sdk.webview.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private a f60167a;

    public interface a {
        static {
            Covode.recordClassIndex(37164);
        }

        void a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(37163);
    }

    public b(a aVar) {
        this.f60167a = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        a aVar = this.f60167a;
        if (aVar != null) {
            aVar.a(jSONObject);
        }
    }
}

package com.ss.android.sdk.webview.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import org.json.JSONObject;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1308a f60166a;

    /* renamed from: com.ss.android.sdk.webview.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1308a {
        static {
            Covode.recordClassIndex(37162);
        }

        void b(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(37161);
    }

    public a(AbstractC1308a aVar) {
        this.f60166a = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        AbstractC1308a aVar = this.f60166a;
        if (aVar != null) {
            aVar.b(jSONObject);
        }
    }
}

package com.bytedance.android.livesdk.browser.jsbridge.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.d;
import com.bytedance.ies.web.a.h;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f14467a;

    public interface a {
        static {
            Covode.recordClassIndex(8020);
        }

        void b(String str);

        void b(String str, Object obj);

        void g();

        void h();
    }

    static {
        Covode.recordClassIndex(8019);
    }

    public c(WeakReference<a> weakReference) {
        this.f14467a = weakReference;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        if (hVar.f35533d != null) {
            a aVar = this.f14467a.get();
            String optString = hVar.f35533d.optString(StringSet.type);
            optString.hashCode();
            if (optString.equals("charge")) {
                aVar.b(com.bytedance.android.livesdk.ab.d.d.a("ttlive_charge_open_fe_detail"));
            } else if (optString.equals("cashdesk")) {
                aVar.b(com.bytedance.android.livesdk.ab.d.d.a("ttlive_charge_open_check_fe_detail"));
            }
            if (hVar.f35533d.has("args")) {
                JSONObject optJSONObject = hVar.f35533d.optJSONObject("args");
                if (optJSONObject.has("first_loaded")) {
                    aVar.g();
                }
                if (optJSONObject.has("blank_duration")) {
                    aVar.b("blank_duration", Long.valueOf(optJSONObject.optLong("blank_duration")));
                    aVar.h();
                }
                if (optJSONObject.has("interactive_duration")) {
                    aVar.b("interactive_duration", Long.valueOf(optJSONObject.optLong("interactive_duration")));
                }
                if (optJSONObject.has("finished_duration")) {
                    aVar.b("finished_duration", Long.valueOf(optJSONObject.optLong("finished_duration")));
                }
            }
        }
    }
}

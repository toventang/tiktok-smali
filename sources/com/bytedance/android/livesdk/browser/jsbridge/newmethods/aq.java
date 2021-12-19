package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.ai;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import h.f.b.l;
import org.json.JSONObject;

public final class aq extends e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14512a;

    static {
        Covode.recordClassIndex(8073);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
    }

    @Override // com.bytedance.ies.web.jsbridge2.c
    public final ai getPermissionGroup() {
        return ai.PRIVATE;
    }

    public static final class a implements IHostAction.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aq f14513a;

        static {
            Covode.recordClassIndex(8074);
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostAction.b
        public final void a() {
            if (!this.f14513a.f14512a) {
                this.f14513a.finishWithFailure();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(aq aqVar) {
            this.f14513a = aqVar;
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostAction.b
        public final void a(String str, String str2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneCode", str);
            jSONObject.put("shortCountryName", str2);
            this.f14513a.f14512a = true;
            this.f14513a.finishWithResult(jSONObject);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        l.d(jSONObject, "");
        l.d(gVar, "");
        ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).openRegionListPage(p.a(gVar.f35646a), new a(this));
    }
}

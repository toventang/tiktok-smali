package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.l.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import f.a.aa;
import f.a.b.b;
import f.a.e.e.f.w;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class au extends e<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    a f14515a;

    /* renamed from: b  reason: collision with root package name */
    private b f14516b;

    static {
        Covode.recordClassIndex(8079);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        b bVar = this.f14516b;
        if (bVar != null) {
            bVar.dispose();
        }
        a aVar = this.f14515a;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        String string = jSONObject2.getString(StringSet.type);
        JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
        string.hashCode();
        if (string.equals("show")) {
            a aVar = this.f14515a;
            if (aVar != null) {
                aVar.dismiss();
            }
            a.C0382a aVar2 = new a.C0382a(gVar.f35646a);
            aVar2.f18266c = false;
            aVar2.f18265b = jSONObject3.getString("message");
            a a2 = aVar2.a();
            this.f14515a = a2;
            a2.setCancelable(false);
            this.f14515a.show();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aa a3 = f.a.h.a.a(f.a.k.a.f158005b);
            f.a.e.b.b.a((Object) timeUnit, "unit is null");
            f.a.e.b.b.a((Object) a3, "scheduler is null");
            this.f14516b = f.a.h.a.a(new w(timeUnit, a3)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new av(this), aw.f14518a);
        } else if (string.equals("dismiss")) {
            b bVar = this.f14516b;
            if (bVar != null) {
                bVar.dispose();
            }
            a aVar3 = this.f14515a;
            if (aVar3 != null) {
                aVar3.dismiss();
            }
            this.f14516b = null;
            this.f14515a = null;
        }
        finishWithSuccess();
    }
}

package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenPhoneAreaMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f69019b = "choosePhoneArea";

    /* renamed from: c  reason: collision with root package name */
    private k.a f69020c = k.a.PRIVATE;

    static {
        Covode.recordClassIndex(42561);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69020c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69019b;
    }

    public static final class a implements ax {
        final /* synthetic */ BaseBridgeMethod.a $iReturn;

        static {
            Covode.recordClassIndex(42562);
        }

        @Override // com.ss.android.ugc.aweme.ax
        public final void onExit() {
        }

        a(BaseBridgeMethod.a aVar) {
            this.$iReturn = aVar;
        }

        @Override // com.ss.android.ugc.aweme.ax
        public final void onChanged(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("phoneCode", str);
            jSONObject.put("shortCountryName", str2);
            jSONObject.put("code", 1);
            BaseBridgeMethod.a aVar = this.$iReturn;
            if (aVar != null) {
                aVar.a(jSONObject);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69020c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenPhoneAreaMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        a aVar2 = new a(aVar);
        bo b2 = com.ss.android.ugc.aweme.account.b.b();
        Context e2 = e();
        if (!(e2 instanceof Activity)) {
            e2 = null;
        }
        b2.openCountryListActivity((Activity) e2, aVar2);
    }
}

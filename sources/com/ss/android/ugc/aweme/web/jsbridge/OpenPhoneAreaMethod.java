package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenPhoneAreaMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(94779);
    }

    private OpenPhoneAreaMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ OpenPhoneAreaMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class a implements ax {
        final /* synthetic */ BaseCommonJavaMethod.a $iReturn;

        static {
            Covode.recordClassIndex(94780);
        }

        @Override // com.ss.android.ugc.aweme.ax
        public final void onExit() {
        }

        a(BaseCommonJavaMethod.a aVar) {
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
            BaseCommonJavaMethod.a aVar = this.$iReturn;
            if (aVar != null) {
                aVar.a(jSONObject);
            }
        }
    }

    public OpenPhoneAreaMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        a aVar2 = new a(aVar);
        if (this.mContextRef.get() != null) {
            b.b().openCountryListActivity((Activity) this.mContextRef.get(), aVar2);
        }
    }
}

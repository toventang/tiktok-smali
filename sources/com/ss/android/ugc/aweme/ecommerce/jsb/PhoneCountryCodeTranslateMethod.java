package com.ss.android.ugc.aweme.ecommerce.jsb;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.jsb.a;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class PhoneCountryCodeTranslateMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(53894);
    }

    private PhoneCountryCodeTranslateMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ PhoneCountryCodeTranslateMethod() {
        this((a) null);
    }

    public PhoneCountryCodeTranslateMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (aVar != null) {
            aVar.a((Object) a.C2072a.a(jSONObject));
        }
    }
}

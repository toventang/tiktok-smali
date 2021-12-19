package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class GetSettingsMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57279);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public GetSettingsMethod() {
    }

    public GetSettingsMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        try {
            aVar.a((Object) new JSONObject(CrossPlatformLegacyServiceImpl.f().e()));
        } catch (Exception unused) {
            aVar.a(-1, "");
        }
    }
}

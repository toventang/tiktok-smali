package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class SetNativeItemMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57377);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public SetNativeItemMethod() {
    }

    public SetNativeItemMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        try {
            if (e.a.f91018a.a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.a((Object) null);
            } else {
                aVar.a(-1, "");
            }
        } catch (Exception e2) {
            aVar.a(-1, "");
            e2.printStackTrace();
        }
    }
}

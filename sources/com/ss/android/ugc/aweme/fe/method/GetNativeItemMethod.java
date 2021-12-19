package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class GetNativeItemMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57278);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public GetNativeItemMethod() {
    }

    public GetNativeItemMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        try {
            String a2 = e.a.f91018a.a(jSONObject.getString("key"), "");
            if (!TextUtils.isEmpty(a2)) {
                aVar.a(a2);
            } else {
                aVar.a(-1, "value is null");
            }
        } catch (Exception e2) {
            aVar.a(-1, e2.getMessage());
            e2.printStackTrace();
        }
    }
}

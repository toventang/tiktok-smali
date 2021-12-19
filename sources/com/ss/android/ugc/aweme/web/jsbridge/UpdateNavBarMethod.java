package com.ss.android.ugc.aweme.web.jsbridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.crossplatform.b.a;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.d.a.c;
import org.json.JSONObject;

public final class UpdateNavBarMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(94789);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("topbar_type", "");
        } else {
            str = null;
        }
        c.a(new a(str));
        if (aVar != null) {
            aVar.a((Object) null);
        }
    }
}

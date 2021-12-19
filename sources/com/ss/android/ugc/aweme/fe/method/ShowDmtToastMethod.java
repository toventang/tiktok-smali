package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.tux.a.i.a;
import h.f.b.l;
import org.json.JSONObject;

public final class ShowDmtToastMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57392);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("msg");
            l.b(optString, "");
            Context actContext = getActContext();
            if (actContext != null) {
                new a(actContext).a(optString).a();
            }
        } else if (aVar != null) {
            aVar.a(0, "no params found");
        }
    }
}

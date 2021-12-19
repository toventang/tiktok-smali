package com.ss.android.ugc.aweme.web.jsbridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.hw;
import org.json.JSONObject;

public class IsAppInstalledMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(94772);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public IsAppInstalledMethod() {
    }

    public IsAppInstalledMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String string = jSONObject.getString("packageName");
        if (hw.a(d.a(), string)) {
            aVar.a((Object) new JSONObject());
        } else {
            aVar.a(-1, string);
        }
    }
}

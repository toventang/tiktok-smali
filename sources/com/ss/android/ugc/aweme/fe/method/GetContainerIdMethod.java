package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.k;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class GetContainerIdMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57276);
    }

    private GetContainerIdMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ GetContainerIdMethod() {
        this((a) null);
    }

    public GetContainerIdMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            k b2 = b();
            if (b2 == null || (str = b2.bz_()) == null) {
                str = "";
            }
            jSONObject2.put("container_id", str);
            aVar.a((Object) jSONObject2);
        }
    }
}

package com.ss.android.ugc.aweme.web.jsbridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.d.a.c;
import java.util.HashMap;
import org.json.JSONObject;

public class AsyncGoodsEditInfoMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(94759);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        a aVar2;
        String optString = jSONObject.optString("draftId");
        String optString2 = jSONObject.optString("title");
        HashMap hashMap = new HashMap();
        hashMap.put("shop_draft_id", optString);
        if (!optString.isEmpty()) {
            aVar2 = new a(ab.SHOP.getTYPE(), new f().b(hashMap), optString2, "", 1);
        } else {
            aVar2 = null;
        }
        c.a(new com.ss.android.ugc.aweme.commercialize.b.a(aVar2));
    }
}

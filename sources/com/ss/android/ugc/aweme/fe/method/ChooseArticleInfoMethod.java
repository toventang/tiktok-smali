package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.d.a.c;
import org.json.JSONObject;

public class ChooseArticleInfoMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57253);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public ChooseArticleInfoMethod(a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject == null) {
            aVar.a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("data");
        if (TextUtils.isEmpty(optString)) {
            aVar.a(0, "no data in params");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(optString);
        String optString2 = jSONObject2.optString("article_title");
        if (TextUtils.isEmpty(optString2)) {
            aVar.a(0, "no article_title in data");
        } else if (TextUtils.isEmpty(jSONObject2.optString("micro_app_id"))) {
            aVar.a(0, "no micro_app_id in data");
        } else {
            if (this.mContextRef != null) {
                c.a(new com.ss.android.ugc.aweme.commercialize.b.a(new com.ss.android.ugc.aweme.common.a(ab.ARTICLE.getTYPE(), optString, optString2, "", 1)));
            }
            aVar.a((Object) 1);
        }
    }
}

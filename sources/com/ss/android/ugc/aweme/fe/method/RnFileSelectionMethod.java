package com.ss.android.ugc.aweme.fe.method;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public class RnFileSelectionMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    private a f91149a;

    /* renamed from: b  reason: collision with root package name */
    private BaseCommonJavaMethod.a f91150b;

    static {
        Covode.recordClassIndex(57361);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        this.f91150b = aVar;
        this.f91149a.a(jSONObject);
    }
}

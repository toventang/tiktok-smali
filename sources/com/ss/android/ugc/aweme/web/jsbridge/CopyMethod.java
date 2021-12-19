package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class CopyMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<Context> f144923a;

    static {
        Covode.recordClassIndex(94764);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public CopyMethod(a aVar, WeakReference<Context> weakReference) {
        super(aVar);
        this.f144923a = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        aVar.a(0, "clip board manager not supported");
    }
}

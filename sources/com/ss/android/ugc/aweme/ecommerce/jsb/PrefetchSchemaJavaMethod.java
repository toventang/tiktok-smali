package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.jsb.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

public final class PrefetchSchemaJavaMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public final a f86137a;

    static {
        Covode.recordClassIndex(53897);
    }

    private PrefetchSchemaJavaMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ PrefetchSchemaJavaMethod() {
        this((a) null);
    }

    public PrefetchSchemaJavaMethod(a aVar) {
        super(aVar);
        this.f86137a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Context context;
        WebView webView;
        if (aVar != null) {
            a aVar2 = this.f86137a;
            if (aVar2 == null || (webView = aVar2.f35513d) == null) {
                context = null;
            } else {
                context = webView.getContext();
            }
            aVar.a((Object) b.a.a(jSONObject, context));
        }
    }
}

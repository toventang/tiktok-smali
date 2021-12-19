package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import androidx.browser.a.c;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.utils.hw;
import org.json.JSONObject;

public final class OpenThirdPartyAppMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86128b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f86129a;

    static {
        Covode.recordClassIndex(53890);
    }

    private OpenThirdPartyAppMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53891);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenThirdPartyAppMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public OpenThirdPartyAppMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f86129a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        Context context;
        String str;
        WebView webView;
        com.bytedance.ies.web.a.a aVar2 = this.f86129a;
        String str2 = null;
        if (aVar2 == null || (webView = aVar2.f35513d) == null) {
            context = null;
        } else {
            context = webView.getContext();
        }
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            if (jSONObject != null) {
                str = jSONObject.optString("url");
                str2 = jSONObject.optString("packageName");
            } else {
                str = null;
            }
            if (hw.a(d.a(), str2)) {
                try {
                    c.a aVar3 = new c.a();
                    aVar3.a().f1776a.setPackage(str2);
                    aVar3.a().a(activity, Uri.parse(str));
                    if (aVar != null) {
                        aVar.a((Object) new JSONObject());
                    }
                } catch (Exception e2) {
                    if (aVar != null) {
                        aVar.a(-1, e2.toString());
                    }
                }
            } else if (aVar != null) {
                aVar.a(-1, "app not installed");
            }
        }
    }
}

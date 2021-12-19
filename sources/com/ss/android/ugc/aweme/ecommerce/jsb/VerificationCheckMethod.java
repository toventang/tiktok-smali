package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import org.json.JSONObject;

public final class VerificationCheckMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86146b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f86147a;

    static {
        Covode.recordClassIndex(53903);
    }

    private VerificationCheckMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(53904);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ VerificationCheckMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public VerificationCheckMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f86147a = aVar;
    }

    public static final class b extends com.ss.android.ugc.aweme.secapi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f86148a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f86149b;

        static {
            Covode.recordClassIndex(53905);
        }

        b(int i2, BaseCommonJavaMethod.a aVar) {
            this.f86148a = i2;
            this.f86149b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a(boolean z, int i2) {
            BaseCommonJavaMethod.a aVar = this.f86149b;
            if (aVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z);
                aVar.a((Object) jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        int i2;
        Context context;
        WebView webView;
        if (jSONObject != null) {
            i2 = jSONObject.optInt("verifyCode");
        } else {
            i2 = -1;
        }
        com.bytedance.ies.web.a.a aVar2 = this.f86147a;
        Activity activity = null;
        if (aVar2 == null || (webView = aVar2.f35513d) == null) {
            context = null;
        } else {
            context = webView.getContext();
        }
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            SecApiImpl.a().popCaptcha(activity2, i2, new b(i2, aVar));
        }
    }
}

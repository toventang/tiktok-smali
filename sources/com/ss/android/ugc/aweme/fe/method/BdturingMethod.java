package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class BdturingMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91025a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57248);
    }

    private BdturingMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57249);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ BdturingMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public BdturingMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    public static final class b extends com.ss.android.ugc.aweme.secapi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f91026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f91027b;

        static {
            Covode.recordClassIndex(57250);
        }

        b(String str, BaseCommonJavaMethod.a aVar) {
            this.f91026a = str;
            this.f91027b = aVar;
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a(boolean z, int i2) {
            BaseCommonJavaMethod.a aVar = this.f91027b;
            if (aVar != null) {
                aVar.a(Integer.valueOf(i2));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String str;
        Context context;
        if (jSONObject == null || (str = jSONObject.optString("decision")) == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            WeakReference weakReference = this.mContextRef;
            Activity activity = null;
            if (weakReference != null) {
                context = (Context) weakReference.get();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = context;
            }
            Activity activity2 = activity;
            if (activity2 != null) {
                SecApiImpl.a().popCaptchaV2(activity2, str, new b(str, aVar));
            }
        } else if (aVar != null) {
            aVar.a((Object) 1);
        }
    }
}

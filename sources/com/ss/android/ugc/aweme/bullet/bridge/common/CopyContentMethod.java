package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.utils.av;
import h.f.b.l;
import org.json.JSONObject;

public final class CopyContentMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f68957b = "copyContent";

    static {
        Covode.recordClassIndex(42510);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68957b;
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f68958a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f68959b;

        static {
            Covode.recordClassIndex(42511);
        }

        a(Context context, String str) {
            this.f68958a = context;
            this.f68959b = str;
        }

        public final void run() {
            for (Context context = this.f68958a; context != null; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        new b(activity).a(this.f68959b).b();
                        return;
                    }
                    return;
                } else if (!(context instanceof ContextWrapper)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CopyContentMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        Context e2 = e();
        if (e2 != null) {
            String optString = jSONObject.optString("content");
            String optString2 = jSONObject.optString("toastMsg");
            if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0) {
                aVar.a(-1, "content or toastMsg is empty");
                return;
            }
            try {
                av.a(optString, optString, e2, PrivacyCert.Builder.Companion.with("bpea-217").usage("").tag("CopyContentMethod_handle").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
            } catch (Exception e3) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e3);
            }
            new Handler(Looper.getMainLooper()).post(new a(e2, optString2));
            aVar.a((Object) null);
        }
    }
}

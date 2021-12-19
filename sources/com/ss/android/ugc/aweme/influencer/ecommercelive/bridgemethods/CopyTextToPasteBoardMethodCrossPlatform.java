package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class CopyTextToPasteBoardMethodCrossPlatform extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104510a = new a((byte) 0);

    static {
        Covode.recordClassIndex(66939);
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66940);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public CopyTextToPasteBoardMethodCrossPlatform(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("copied_text");
        Context actContext = getActContext();
        if (actContext != null) {
            l.b(optString, "");
            a.a(actContext, optString, PrivacyCert.Builder.Companion.with("bpea-225").usage("On the product promotion page, ecommerce creators can copy the merchant’s contact information to the clipboard. ").tag("clipToCopyMerchantInformation").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
            aVar.a((Object) null);
            return;
        }
        aVar.a(0, null);
    }
}

package com.ss.android.ugc.aweme.influencer.ecommercelive.bridgemethods;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.av;

public final class a {
    static {
        Covode.recordClassIndex(66955);
    }

    public static final void a(Context context, String str, PrivacyCert privacyCert) {
        try {
            av.a("label", str, context, privacyCert);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }
}

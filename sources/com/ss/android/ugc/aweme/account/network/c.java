package com.ss.android.ugc.aweme.account.network;

import android.text.TextUtils;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.n;
import com.ss.android.ugc.aweme.services.interceptor.TwoStepAuthenticationInterceptor;
import java.util.Map;

public final class c {
    static {
        Covode.recordClassIndex(40098);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("/passport/")) {
            return false;
        }
        return true;
    }

    public static Map<String, String> a(int i2, String str, String str2, Map<String, String> map) {
        TwoStepAuthenticationInterceptor twoStepAuthenticationInterceptor;
        if (!n.f63503a.contains(Integer.valueOf(i2)) || (twoStepAuthenticationInterceptor = new TwoStepAuthenticationInterceptor()) == null) {
            return new a();
        }
        return twoStepAuthenticationInterceptor.tryToIntercept(str, null, str2, i2, map);
    }
}

package com.ss.android.ugc.aweme.net.h.a.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.token.d;
import com.ss.android.ugc.aweme.logger.a;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public final class c extends d {
    static {
        Covode.recordClassIndex(72191);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.h.a.a.d
    public final Response a(Interceptor.Chain chain) {
        long currentTimeMillis = System.currentTimeMillis();
        Request request = chain.request();
        Map a2 = d.a(request.url().toString());
        if (a2 != null && !a2.isEmpty()) {
            Request.Builder builder = null;
            for (Map.Entry entry : a2.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue()) && !TextUtils.equals(request.header((String) entry.getKey()), (CharSequence) entry.getValue())) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    request.header(str);
                    if (builder == null) {
                        builder = request.newBuilder();
                    }
                    builder.header(str, str2);
                }
            }
            if (builder != null) {
                request = builder.build();
            }
        }
        a.b.f109011a.a("ensure_tt_token_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        return chain.proceed(request);
    }
}

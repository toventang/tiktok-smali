package com.ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.c.a;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.u;
import com.ss.android.token.d;
import com.ss.android.ugc.aweme.experiment.cx;
import com.ss.android.ugc.aweme.logger.a;
import java.util.ArrayList;
import java.util.Map;

public class EnsureTTTokenCronetInterceptor extends FeedBaseCronetInterceptor {
    static {
        Covode.recordClassIndex(72234);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    public final u a(a.AbstractC1036a aVar) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        Request a2 = aVar.a();
        Map a3 = d.a(a2.getUrl());
        if (a3 != null && !a3.isEmpty()) {
            ArrayList arrayList = null;
            for (Map.Entry entry : a3.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    b firstHeader = a2.getFirstHeader((String) entry.getKey());
                    if (firstHeader != null) {
                        str = firstHeader.f42472b;
                    } else {
                        str = "";
                    }
                    if (!TextUtils.equals(str, (CharSequence) entry.getValue())) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        b firstHeader2 = a2.getFirstHeader(str2);
                        if (arrayList == null) {
                            arrayList = new ArrayList(a2.getHeaders());
                        }
                        if (firstHeader2 != null) {
                            arrayList.remove(firstHeader2);
                        }
                        arrayList.add(new b(str2, str3));
                    }
                }
            }
            if (arrayList != null) {
                Request.a newBuilder = a2.newBuilder();
                newBuilder.f42460c = arrayList;
                a2 = newBuilder.a();
            }
        }
        a.b.f109011a.a("ensure_tt_token_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        System.currentTimeMillis();
        if (cx.f89739d) {
            a.b.f109011a.a("feed_preload_ensuretttoken_interceptor", false);
            a.b.f109011a.b("feed_preload_ensuretttoken_interceptor", false);
        }
        return aVar.a(a2);
    }
}

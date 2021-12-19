package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.b;

public class AVApiImpl implements AVApi {
    static {
        Covode.recordClassIndex(81946);
    }

    @Override // com.ss.android.ugc.aweme.tools.AVApi
    public final String a() {
        return Api.f66569d;
    }

    public static AVApi b() {
        Object a2 = b.a(AVApi.class, false);
        if (a2 != null) {
            return (AVApi) a2;
        }
        return new AVApiImpl();
    }

    @Override // com.ss.android.ugc.aweme.tools.AVApi
    public final <T> T a(String str, Class<T> cls) {
        return (T) Api.a(str, cls, (String) null, (e) null);
    }
}

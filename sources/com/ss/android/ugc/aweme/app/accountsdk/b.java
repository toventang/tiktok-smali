package com.ss.android.ugc.aweme.app.accountsdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.b.c;
import com.google.gson.f;
import com.ss.android.http.a.b.d;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.bq;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.l;
import java.util.List;

public final class b implements bq {
    static {
        Covode.recordClassIndex(40901);
    }

    @Override // com.ss.android.ugc.aweme.bq
    public final f a() {
        f b2 = GsonHolder.c().b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.bq
    public final int a(Context context, Throwable th) {
        l.d(context, "");
        l.d(th, "");
        if (!(th instanceof c)) {
            return 0;
        }
        if (((c) th).getStatusCode() == 503) {
            return -19;
        }
        return -16;
    }

    @Override // com.ss.android.ugc.aweme.bq
    public final <T> T a(String str, int i2, String str2, Class<T> cls, String str3, List<? extends d> list) {
        l.d(str, "");
        l.d(str2, "");
        l.d(cls, "");
        l.d(str3, "");
        return list != null ? (T) Api.a(str, i2, str2, (Class) cls, str3, (List<d>) list) : (T) Api.a(str, i2, str2, cls, str3);
    }
}

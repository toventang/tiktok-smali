package com.ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.share.m.g;
import f.a.n;
import h.f.b.l;

public abstract class j implements ShareExtService {
    static {
        Covode.recordClassIndex(81448);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        if (context != null && g.a(context) != null) {
            d.a(g.a(context), "share_command", 0).edit().putString("command", str).apply();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final n<String> a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        if ((str3 == null || str3.length() == 0) && str3 != null) {
            n<String> a2 = n.a("");
            l.b(a2, "");
            return a2;
        }
        if (str3 == null) {
            l.b();
        }
        return com.ss.android.ugc.aweme.share.m.l.a(str, str2, str3);
    }
}

package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.egg.b.a;
import com.ss.android.ugc.aweme.commercialize.egg.b.b;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import h.f.b.l;

public final class m implements b {
    static {
        Covode.recordClassIndex(45427);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.b.b
    public final com.ss.android.ugc.aweme.commercialize.egg.e.b a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        return new a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.b.b
    public final boolean b(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        return w.a(context, str, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.b.b
    public final boolean a(Context context, String str, String str2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        return w.a(context, str, str2);
    }
}

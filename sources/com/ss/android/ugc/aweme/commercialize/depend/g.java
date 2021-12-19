package com.ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.j.b;
import com.ss.android.ugc.aweme.commercialize.playfun.i;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class g implements i {
    static {
        Covode.recordClassIndex(45421);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.playfun.i
    public final boolean a(Context context, Aweme aweme, b bVar) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(bVar, "");
        return w.a(context, aweme, 49, bVar);
    }
}

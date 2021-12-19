package com.ss.android.ugc.aweme.discover.viewmodel;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.b;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(51609);
    }

    public static final void a(Intent intent, b bVar) {
        l.d(intent, "");
        intent.putExtra("search_enter_param", bVar);
    }
}

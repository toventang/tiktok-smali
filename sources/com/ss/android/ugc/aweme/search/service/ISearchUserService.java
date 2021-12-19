package com.ss.android.ugc.aweme.search.service;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.model.g;
import com.ss.android.ugc.aweme.search.model.h;

public interface ISearchUserService {
    static {
        Covode.recordClassIndex(79208);
    }

    i<h> a(g gVar);

    String a(Context context, Integer num);

    String a(Context context, String str);

    boolean a();

    h b(g gVar);
}

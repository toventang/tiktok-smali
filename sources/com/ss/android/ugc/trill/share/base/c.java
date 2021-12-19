package com.ss.android.ugc.trill.share.base;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(99063);
    }

    public static final boolean a(Context context, Aweme aweme, String str) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        if (!com.ss.android.ugc.aweme.share.d.c.b()) {
            return false;
        }
        if (!com.ss.android.ugc.aweme.share.d.c.a() || !com.ss.android.ugc.aweme.share.d.c.b(str)) {
            new a(d.a()).a(context.getString(R.string.bvh)).a();
            return true;
        }
        new a(d.a()).a(context.getString(R.string.bvi)).a();
        return true;
    }
}

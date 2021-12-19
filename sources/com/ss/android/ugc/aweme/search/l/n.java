package com.ss.android.ugc.aweme.search.l;

import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.d.d;
import h.f.b.l;
import java.util.Objects;

public final class n {
    static {
        Covode.recordClassIndex(79117);
    }

    public static final d a(Context context) {
        l.d(context, "");
        if (context instanceof d) {
            return (d) context;
        }
        if (!(context instanceof MutableContextWrapper)) {
            return null;
        }
        MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context;
        if (!(mutableContextWrapper.getBaseContext() instanceof d)) {
            return null;
        }
        Context baseContext = mutableContextWrapper.getBaseContext();
        Objects.requireNonNull(baseContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ainflate.AsyncInflaterOwner");
        return (d) baseContext;
    }
}

package com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(66381);
    }

    public static final <T extends ac> T a(Context context, Class<T> cls) {
        l.d(cls, "");
        if (!(context instanceof e)) {
            return null;
        }
        return (T) ae.a((e) context, (ad.b) null).a(cls);
    }
}

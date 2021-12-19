package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.a;
import h.f.b.l;

public final class cy {
    static {
        Covode.recordClassIndex(93410);
    }

    public static final Fragment a(Activity activity) {
        Fragment rootFragment;
        l.d(activity, "");
        if (!(activity instanceof a)) {
            activity = null;
        }
        a aVar = (a) activity;
        if (aVar == null || (rootFragment = aVar.getRootFragment()) == null) {
            return null;
        }
        return rootFragment;
    }
}

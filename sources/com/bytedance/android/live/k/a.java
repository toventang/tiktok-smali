package com.bytedance.android.live.k;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public interface a extends com.bytedance.android.live.base.a {
    static {
        Covode.recordClassIndex(5123);
    }

    Fragment getAddModeratorFragment();

    Fragment getModeratorListFragment();
}

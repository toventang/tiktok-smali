package com.bytedance.android.livesdk.ad;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.k.a;
import com.bytedance.covode.number.Covode;

public class j implements a {
    static {
        Covode.recordClassIndex(7593);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.k.a
    public Fragment getAddModeratorFragment() {
        return new g();
    }

    @Override // com.bytedance.android.live.k.a
    public Fragment getModeratorListFragment() {
        return new i();
    }
}

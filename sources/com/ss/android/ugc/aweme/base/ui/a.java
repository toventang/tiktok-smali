package com.ss.android.ugc.aweme.base.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.ScrollableViewPager;

public class a implements ScrollableViewPager.a {
    static {
        Covode.recordClassIndex(42072);
    }

    @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a
    public boolean a(int i2) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.ui.ScrollableViewPager.a
    public final boolean a(float f2, float f3) {
        if (Math.abs(f2) <= ((float) f68317b) || Math.abs(f2) <= Math.abs(f3)) {
            return false;
        }
        return true;
    }
}

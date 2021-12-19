package com.bytedance.android.live.effect.d;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.google.android.material.tabs.TabLayout;
import h.f.b.l;

final class d extends TabLayout.h {
    static {
        Covode.recordClassIndex(4982);
    }

    @Override // com.google.android.material.tabs.TabLayout.h, com.google.android.material.tabs.TabLayout.b
    public final void a(TabLayout.f fVar) {
        super.a(fVar);
        f.b(fVar);
    }

    @Override // com.google.android.material.tabs.TabLayout.h, com.google.android.material.tabs.TabLayout.b
    public final void b(TabLayout.f fVar) {
        super.b(fVar);
        f.a(fVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ViewPager viewPager) {
        super(viewPager);
        l.d(viewPager, "");
    }
}

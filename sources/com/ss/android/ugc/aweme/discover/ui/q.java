package com.ss.android.ugc.aweme.discover.ui;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;

public final class q implements ViewPager.e {

    /* renamed from: a  reason: collision with root package name */
    public final r f82632a;

    static {
        Covode.recordClassIndex(51459);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrolled(int i2, float f2, int i3) {
    }

    public q(r rVar) {
        l.d(rVar, "");
        this.f82632a = rVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageSelected(int i2) {
        boolean z;
        int i3 = 0;
        for (T t : this.f82632a.f82634a) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            T t2 = t;
            if (i3 != i2) {
                z = true;
            } else {
                z = false;
            }
            t2.a(z, false);
            i3 = i4;
        }
        this.f82632a.c(i2);
        l b2 = this.f82632a.b(i2);
        if (b2 != null) {
            this.f82632a.a(b2, false);
        }
    }
}

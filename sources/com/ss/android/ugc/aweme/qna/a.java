package com.ss.android.ugc.aweme.qna;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a implements ViewPager.e {

    /* renamed from: a  reason: collision with root package name */
    public final b f119185a;

    static {
        Covode.recordClassIndex(77409);
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrolled(int i2, float f2, int i3) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageSelected(int i2) {
        this.f119185a.b(i2);
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f119185a = bVar;
    }
}

package com.ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import h.f.a.b;
import h.f.b.l;
import h.p;
import h.z;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public b<? super ViewGroup, ? extends p<? extends View, ? extends View>> f135111a;

    /* renamed from: b  reason: collision with root package name */
    public b<? super ViewPager, z> f135112b;

    /* renamed from: c  reason: collision with root package name */
    public b<? super TabLayout, z> f135113c;

    /* renamed from: d  reason: collision with root package name */
    public Interpolator f135114d;

    static {
        Covode.recordClassIndex(88330);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f135111a, gVar.f135111a) && l.a(this.f135112b, gVar.f135112b) && l.a(this.f135113c, gVar.f135113c) && l.a(this.f135114d, gVar.f135114d);
    }

    public final int hashCode() {
        b<? super ViewGroup, ? extends p<? extends View, ? extends View>> bVar = this.f135111a;
        int i2 = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        b<? super ViewPager, z> bVar2 = this.f135112b;
        int hashCode2 = (hashCode + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        b<? super TabLayout, z> bVar3 = this.f135113c;
        int hashCode3 = (hashCode2 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        Interpolator interpolator = this.f135114d;
        if (interpolator != null) {
            i2 = interpolator.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "StickerContentViewConfig(emptyRetryView=" + this.f135111a + ", viewPagerConfig=" + this.f135112b + ", tabLayoutConfig=" + this.f135113c + ", interpolator=" + this.f135114d + ")";
    }

    public /* synthetic */ g() {
        this(new a());
    }

    private g(Interpolator interpolator) {
        l.d(interpolator, "");
        this.f135111a = null;
        this.f135112b = null;
        this.f135113c = null;
        this.f135114d = interpolator;
    }
}

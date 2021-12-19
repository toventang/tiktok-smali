package com.ss.android.ugc.aweme.following.ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.a.p;
import h.a.n;
import java.util.List;

public final class c extends l {

    /* renamed from: a  reason: collision with root package name */
    public final i f96438a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Fragment> f96439b;

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f96440c;

    static {
        Covode.recordClassIndex(61080);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f96439b.size();
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        return this.f96439b.get(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return this.f96440c.get(i2);
    }

    public final void c(int i2) {
        boolean z;
        int i3 = 0;
        for (T t : this.f96439b) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                n.a();
            }
            T t2 = t;
            if (t2 instanceof p) {
                T t3 = t2;
                if (i3 != i2) {
                    z = true;
                } else {
                    z = false;
                }
                t3.a(z);
            }
            i3 = i4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(i iVar, List<Fragment> list, List<String> list2) {
        super(iVar);
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(list2, "");
        this.f96438a = iVar;
        this.f96439b = list;
        this.f96440c = list2;
    }
}

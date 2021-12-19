package com.ss.android.ugc.aweme.comment.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.b;
import com.ss.android.ugc.aweme.comment.f.f;
import java.util.List;

public final class e<T extends b> extends l {

    /* renamed from: a  reason: collision with root package name */
    public List<T> f71356a;

    /* renamed from: b  reason: collision with root package name */
    public List<Integer> f71357b;

    /* renamed from: c  reason: collision with root package name */
    private i f71358c;

    static {
        Covode.recordClassIndex(43931);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f71356a.size();
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        return this.f71356a.get(i2);
    }

    @Override // androidx.fragment.app.l
    public final long b(int i2) {
        return (long) this.f71357b.get(i2).intValue();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        if (this.f71356a.contains(obj)) {
            return this.f71356a.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        T t = this.f71356a.get(i2);
        if (t instanceof f) {
            return ((f) t).d();
        }
        return "";
    }

    public e(i iVar, List<T> list, List<Integer> list2) {
        super(iVar);
        this.f71358c = iVar;
        this.f71356a = list;
        this.f71357b = list2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        n a2 = this.f71358c.a();
        a2.a((Fragment) obj);
        a2.c();
    }
}

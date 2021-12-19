package com.ss.android.ugc.aweme.lego.c;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public abstract class b<T> extends PagerAdapter {

    /* renamed from: d  reason: collision with root package name */
    protected SparseArray<T> f107462d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    protected T f107463e;

    static {
        Covode.recordClassIndex(68774);
    }

    /* access modifiers changed from: protected */
    public abstract T a(int i2);

    /* access modifiers changed from: protected */
    public abstract T b(ViewGroup viewGroup, int i2);

    public boolean b(int i2) {
        if (this.f107462d.get(i2) != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f107463e = b(viewGroup, i2);
    }
}

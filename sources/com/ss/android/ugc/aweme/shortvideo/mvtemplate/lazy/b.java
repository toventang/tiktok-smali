package com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public abstract class b<T> extends PagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    protected SparseArray<T> f129363b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    protected T f129364c;

    static {
        Covode.recordClassIndex(84910);
    }

    /* access modifiers changed from: protected */
    public abstract T a(int i2);

    /* access modifiers changed from: protected */
    public abstract T a(ViewGroup viewGroup, int i2);

    public final boolean b(int i2) {
        if (this.f129363b.get(i2) != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f129364c = a(viewGroup, i2);
    }
}

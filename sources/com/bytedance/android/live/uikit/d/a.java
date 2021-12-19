package com.bytedance.android.live.uikit.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;

public abstract class a extends PagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    protected final LinkedList<View> f12900b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    protected final LayoutInflater f12901c;

    /* renamed from: d  reason: collision with root package name */
    protected final Context f12902d;

    static {
        Covode.recordClassIndex(7160);
    }

    /* access modifiers changed from: protected */
    public abstract View a(int i2, View view, ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public a(Context context, LayoutInflater layoutInflater) {
        this.f12901c = layoutInflater;
        this.f12902d = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        View view;
        if (!this.f12900b.isEmpty()) {
            view = this.f12900b.removeFirst();
        } else {
            view = null;
        }
        View a2 = a(i2, view, viewGroup);
        viewGroup.addView(a2);
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f12900b.add(view);
        }
    }
}

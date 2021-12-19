package com.bytedance.ies.uikit.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;

public abstract class a extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    protected final LinkedList<View> f35474a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    protected final LayoutInflater f35475b;

    /* renamed from: c  reason: collision with root package name */
    protected final Context f35476c;

    static {
        Covode.recordClassIndex(21209);
    }

    /* access modifiers changed from: protected */
    public abstract View a(int i2, View view, ViewGroup viewGroup);

    public void a(View view) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public a(Context context, LayoutInflater layoutInflater) {
        this.f35475b = layoutInflater;
        this.f35476c = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        View view;
        if (!this.f35474a.isEmpty()) {
            view = this.f35474a.removeFirst();
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
            this.f35474a.add(view);
            a(view);
        }
    }
}

package com.ss.android.ugc.aweme.commerce.sdk.b.b.a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.d;
import com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e;
import com.ss.android.ugc.aweme.ecommerce.gallery.view.a.c;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a.a {

    /* renamed from: a  reason: collision with root package name */
    public e f73492a;

    /* renamed from: d  reason: collision with root package name */
    private int f73493d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<FrameLayout> f73494e = new SparseArray<>();

    static {
        Covode.recordClassIndex(45233);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        d transConfig = this.f73492a.getTransConfig();
        if (transConfig == null || transConfig.t == null) {
            return this.f85986b;
        }
        return this.f85986b + 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.gallery.transfer.a.a
    public final c a(int i2) {
        FrameLayout frameLayout = this.f73494e.get(i2);
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = frameLayout.getChildAt(i3);
                if (childAt instanceof ImageView) {
                    return (c) childAt;
                }
            }
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        View view;
        MethodCollector.i(5800);
        l.d(viewGroup, "");
        FrameLayout frameLayout = this.f73494e.get(i2);
        if (frameLayout == null) {
            d transConfig = this.f73492a.getTransConfig();
            if (transConfig != null) {
                view = transConfig.t;
            } else {
                view = null;
            }
            if (view == null || i2 != this.f85986b) {
                Context context = viewGroup.getContext();
                d transConfig2 = this.f73492a.getTransConfig();
                c cVar = new c(context);
                l.b(transConfig2, "");
                cVar.setDuration(transConfig2.f85998d);
                cVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
                cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                cVar.setOnScaleListener(this.f73492a.getOnScaleListener());
                frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(cVar);
                if (transConfig2.f85999e) {
                    this.f73492a.c().a(cVar, i2);
                }
                this.f73494e.put(i2, frameLayout);
                if (i2 == this.f73493d && this.f85987c != null) {
                    this.f85987c.a();
                }
            } else {
                Context context2 = viewGroup.getContext();
                d transConfig3 = this.f73492a.getTransConfig();
                frameLayout = new FrameLayout(context2);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                l.b(transConfig3, "");
                frameLayout.addView(transConfig3.t);
                this.f73494e.put(i2, frameLayout);
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(frameLayout);
        }
        try {
            viewGroup.addView(frameLayout);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(5800);
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(5686);
        l.d(viewGroup, "");
        l.d(obj, "");
        viewGroup.removeView((View) obj);
        MethodCollector.o(5686);
    }

    public a(e eVar, int i2, int i3) {
        l.d(eVar, "");
        this.f73492a = eVar;
        this.f85986b = i2;
        int i4 = i3 + 1;
        i4 = i4 == this.f85986b ? i3 - 1 : i4;
        this.f73493d = i4;
        if (i4 < 0) {
            this.f73493d = 0;
        }
    }
}

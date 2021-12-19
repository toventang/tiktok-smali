package com.bytedance.android.livesdk.chatroom.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.a;
import com.bytedance.android.c.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class as extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f15914a;

    static {
        Covode.recordClassIndex(8797);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f15914a.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.c.a.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public as(List<? extends c> list) {
        l.d(list, "");
        this.f15914a = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return l.a(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        MethodCollector.i(1686);
        l.d(viewGroup, "");
        c cVar = this.f15914a.get(i2);
        l.d(viewGroup, "");
        if (cVar.f6827f == null) {
            View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bbu, viewGroup, false);
            l.b(a2, "");
            cVar.f6827f = a2;
            View view = cVar.f6827f;
            if (view == null) {
                l.a("view");
            }
            View findViewById = view.findViewById(R.id.bq3);
            l.b(findViewById, "");
            cVar.f6831j = findViewById;
            View view2 = cVar.f6831j;
            if (view2 == null) {
                l.a("deleteView");
            }
            view2.setOnClickListener(new c.b(cVar));
            View view3 = cVar.f6827f;
            if (view3 == null) {
                l.a("view");
            }
            ViewGroup viewGroup2 = (ViewGroup) view3.findViewById(R.id.bq2);
            l.b(viewGroup2, "");
            viewGroup2.addView(cVar.a(viewGroup2), -1, -1);
        }
        View view4 = cVar.f6827f;
        if (view4 == null) {
            l.a("view");
        }
        viewGroup.addView(view4, -1, -1);
        MethodCollector.o(1686);
        return view4;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        MethodCollector.i(1687);
        l.d(viewGroup, "");
        l.d(obj, "");
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view != null) {
            viewGroup.removeView(view);
            MethodCollector.o(1687);
            return;
        }
        MethodCollector.o(1687);
    }
}

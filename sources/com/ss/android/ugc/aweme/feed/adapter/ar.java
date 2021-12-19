package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.widget.d;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.LinkedList;

public abstract class ar extends PagerAdapter {
    protected final LinkedList<View>[] r;
    protected final LayoutInflater s;
    protected final Context t;
    public final int u = 17;

    static {
        Covode.recordClassIndex(57693);
    }

    /* access modifiers changed from: protected */
    public abstract View a(int i2, View view, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public abstract int b(int i2);

    /* access modifiers changed from: protected */
    public abstract int b(View view);

    /* access modifiers changed from: protected */
    public void c(View view) {
    }

    public void e(View view) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* access modifiers changed from: protected */
    public int a(int i2) {
        int b2 = b(i2);
        if (b2 >= 0 && b2 < this.u) {
            return b2;
        }
        a.a(new Exception("getItemViewType must return a number which is form 0 to " + (this.u - 1)));
        return 0;
    }

    public ar(Context context, LayoutInflater layoutInflater) {
        this.s = layoutInflater;
        this.t = context;
        LinkedList<View>[] linkedListArr = new LinkedList[17];
        int i2 = 0;
        do {
            linkedListArr[i2] = new LinkedList<>();
            i2++;
        } while (i2 < 17);
        this.r = linkedListArr;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        View view;
        int a2 = a(i2);
        if (!this.r[a2].isEmpty()) {
            view = this.r[a2].removeFirst();
        } else {
            view = null;
        }
        View a3 = a(i2, view, viewGroup);
        if (a3.getParent() != null) {
            try {
                ((ViewGroup) a3.getParent()).removeView(a3);
            } catch (Exception e2) {
                b.a(e2);
                a.a("", e2);
            }
        }
        if (a3.getParent() != viewGroup) {
            viewGroup.addView(a3);
        }
        c(a3);
        return a3;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            try {
                viewGroup.removeView(view);
                d.a("destroyItem removeView");
            } catch (Exception e2) {
                a.a("", e2);
            }
            this.r[b(view)].add(view);
            e(view);
        }
    }
}

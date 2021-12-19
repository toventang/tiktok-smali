package com.ss.android.ugc.aweme.shortvideo.ui;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.Objects;

public final class q extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    static Field f131886a;

    /* renamed from: b  reason: collision with root package name */
    PagerAdapter f131887b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f131888c = true;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void notifyDataSetChanged() {
        this.f131887b.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        return this.f131887b.saveState();
    }

    static {
        Covode.recordClassIndex(86415);
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f131886a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void a() {
        try {
            Object obj = f131886a.get(this);
            Object obj2 = f131886a.get(this.f131887b);
            if (obj == null && obj2 != null) {
                f131886a.set(this.f131887b, null);
            }
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        try {
            f131886a.set(this.f131887b, f131886a.get(this));
            if (!this.f131888c || this.f131887b.getCount() == 1) {
                return this.f131887b.getCount();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(View view) {
        this.f131887b.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        return this.f131887b.getPageTitle(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float getPageWidth(int i2) {
        return this.f131887b.getPageWidth(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f131887b.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f131887b.unregisterDataSetObserver(dataSetObserver);
    }

    public q(PagerAdapter pagerAdapter) {
        Objects.requireNonNull(pagerAdapter);
        this.f131887b = pagerAdapter;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        this.f131887b.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(View view) {
        a();
        this.f131887b.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(ViewGroup viewGroup) {
        a();
        this.f131887b.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return this.f131887b.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f131887b.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(View view, int i2) {
        int count = this.f131887b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f131887b.instantiateItem(view, i2 % count);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i2) {
        int count = this.f131887b.getCount();
        if (count == 0) {
            return null;
        }
        return this.f131887b.instantiateItem(viewGroup, i2 % count);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(View view, int i2, Object obj) {
        this.f131887b.setPrimaryItem(view, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(View view, int i2, Object obj) {
        int count = this.f131887b.getCount();
        if (count != 0) {
            this.f131887b.destroyItem(view, i2 / count, obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f131887b.setPrimaryItem(viewGroup, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        int count = this.f131887b.getCount();
        if (count != 0) {
            this.f131887b.destroyItem(viewGroup, i2 / count, obj);
        }
    }
}

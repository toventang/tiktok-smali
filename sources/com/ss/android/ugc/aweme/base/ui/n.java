package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import dmt.viewpager.DmtViewPager;

public class n extends DmtViewPager {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f68386a;

    /* renamed from: b  reason: collision with root package name */
    private int f68387b;

    /* renamed from: c  reason: collision with root package name */
    private b f68388c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.c.a<ViewPager.e, a> f68389d = new androidx.c.a<>();

    static {
        Covode.recordClassIndex(42102);
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setOnPageChangeListener(ViewPager.e eVar) {
    }

    /* access modifiers changed from: package-private */
    public static class b extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        PagerAdapter f68392a;

        /* renamed from: b  reason: collision with root package name */
        DataSetObserver f68393b;

        static {
            Covode.recordClassIndex(42104);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f68392a.getCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void notifyDataSetChanged() {
            this.f68392a.notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Parcelable saveState() {
            return this.f68392a.saveState();
        }

        private int a(int i2) {
            return (getCount() - i2) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void finishUpdate(ViewGroup viewGroup) {
            this.f68392a.finishUpdate(viewGroup);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f68392a.registerDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void startUpdate(ViewGroup viewGroup) {
            this.f68392a.startUpdate(viewGroup);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            try {
                this.f68392a.unregisterDataSetObserver(dataSetObserver);
            } catch (Throwable unused) {
            }
        }

        b(PagerAdapter pagerAdapter) {
            AnonymousClass1 r0 = new DataSetObserver() {
                /* class com.ss.android.ugc.aweme.base.ui.n.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(42105);
                }

                public final void onInvalidated() {
                    onChanged();
                }

                public final void onChanged() {
                    b.super.notifyDataSetChanged();
                }
            };
            this.f68393b = r0;
            this.f68392a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(r0);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i2) {
            return this.f68392a.getPageTitle(a(i2));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final float getPageWidth(int i2) {
            return this.f68392a.getPageWidth(a(i2));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            int itemPosition = this.f68392a.getItemPosition(obj);
            if (itemPosition == -1 || itemPosition == -2) {
                return itemPosition;
            }
            return a(itemPosition);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return this.f68392a.isViewFromObject(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f68392a.restoreState(parcelable, classLoader);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            return this.f68392a.instantiateItem(viewGroup, a(i2));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            this.f68392a.destroyItem(viewGroup, a(i2), obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
            this.f68392a.setPrimaryItem(viewGroup, a(i2), obj);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public int getCurrentItem() {
        return super.getCurrentItem();
    }

    @Override // dmt.viewpager.DmtViewPager
    public PagerAdapter getAdapter() {
        PagerAdapter adapter = super.getAdapter();
        if (adapter instanceof b) {
            return ((b) adapter).f68392a;
        }
        return adapter;
    }

    public int getCurrentItemCompat() {
        return a(getCurrentItem());
    }

    public final boolean a() {
        int i2 = this.f68387b;
        if (i2 == 1) {
            return false;
        }
        if (this.f68386a || i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setCurrentItem(int i2) {
        super.setCurrentItem(a(i2));
    }

    class a implements ViewPager.e {

        /* renamed from: a  reason: collision with root package name */
        ViewPager.e f68390a;

        static {
            Covode.recordClassIndex(42103);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            ViewPager.e eVar = this.f68390a;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            ViewPager.e eVar = this.f68390a;
            if (eVar != null) {
                eVar.onPageSelected(n.this.a(i2));
            }
        }

        a(ViewPager.e eVar) {
            this.f68390a = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            if (this.f68390a != null) {
                int a2 = n.this.a(i2);
                if (n.this.a()) {
                    float f3 = ((float) a2) - f2;
                    a2 = (int) f3;
                    f2 = f3 - ((float) a2);
                }
                this.f68390a.onPageScrolled(a2, f2, i3);
            }
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public final void a(ViewPager.e eVar) {
        a aVar = new a(eVar);
        this.f68389d.put(eVar, aVar);
        super.a(aVar);
    }

    @Override // dmt.viewpager.DmtViewPager
    public final void b(ViewPager.e eVar) {
        a remove = this.f68389d.remove(eVar);
        if (remove != null) {
            super.b(remove);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public n(Context context) {
        super(context);
        this.f68386a = a(context);
    }

    private static boolean a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final int a(int i2) {
        int count;
        if (!a()) {
            return i2;
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            count = 0;
        } else {
            count = adapter.getCount();
        }
        if (i2 < 0 || i2 >= count) {
            return i2;
        }
        return (count - i2) - 1;
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        b bVar = this.f68388c;
        if (bVar != null) {
            try {
                bVar.f68392a.unregisterDataSetObserver(bVar.f68393b);
            } catch (Throwable unused) {
            }
            this.f68388c = null;
        }
        if (a() && pagerAdapter != null) {
            b bVar2 = new b(pagerAdapter);
            this.f68388c = bVar2;
            pagerAdapter = bVar2;
        }
        super.setAdapter(pagerAdapter);
        if (a()) {
            a(0, false);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public final void a(int i2, boolean z) {
        super.a(a(i2), z);
    }

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68386a = a(context);
    }
}

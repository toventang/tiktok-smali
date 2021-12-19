package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.d.e;
import androidx.core.d.f;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    public boolean f144521a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f144522b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f144523c = false;

    /* renamed from: d  reason: collision with root package name */
    public View f144524d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f144525e;

    /* renamed from: f  reason: collision with root package name */
    private int f144526f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<ViewPager.e, b> f144527g = new HashMap<>();

    static {
        Covode.recordClassIndex(94592);
    }

    public final boolean a() {
        if (this.f144526f == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        f fVar = (f) super.getAdapter();
        if (fVar == null) {
            return null;
        }
        return fVar.f144610a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f144526f, (byte) 0);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = e.a(new f<SavedState>() {
            /* class com.ss.android.ugc.aweme.views.RtlViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94594);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // androidx.core.d.f
            public final /* bridge */ /* synthetic */ SavedState[] a(int i2) {
                return new SavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // androidx.core.d.f
            public final /* synthetic */ SavedState a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader, (byte) 0);
            }
        });

        /* renamed from: a  reason: collision with root package name */
        public final Parcelable f144528a;

        /* renamed from: b  reason: collision with root package name */
        public final int f144529b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(94593);
        }

        private SavedState(Parcelable parcelable, int i2) {
            this.f144528a = parcelable;
            this.f144529b = i2;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f144528a, i2);
            parcel.writeInt(this.f144529b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f144528a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f144529b = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, byte b2) {
            this(parcel, classLoader);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i2, byte b2) {
            this(parcelable, i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !a()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getCount();
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.f144525e = z;
    }

    public void setDynamicContentHeightEnabled(boolean z) {
        this.f144523c = z;
    }

    public void setSmoothScrollEnabled(boolean z) {
        this.f144522b = z;
    }

    public void setSwipeable(boolean z) {
        this.f144521a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.e eVar) {
        b bVar = new b(eVar);
        this.f144527g.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f144521a || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.e eVar) {
        super.removeOnPageChangeListener(this.f144527g.get(eVar));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.e eVar) {
        super.setOnPageChangeListener(new b(eVar));
    }

    class a extends f {
        static {
            Covode.recordClassIndex(94595);
        }

        @Override // androidx.fragment.app.l, com.ss.android.ugc.aweme.views.f
        public final Fragment a(int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.a(i2);
        }

        @Override // androidx.fragment.app.l
        public final long b(int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.b(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.views.f
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!RtlViewPager.this.a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.views.f
        public final CharSequence getPageTitle(int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.getPageTitle(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.views.f
        public final float getPageWidth(int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.getPageWidth(i2);
        }

        a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.views.f
        public final Object instantiateItem(View view, int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.instantiateItem(view, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l, com.ss.android.ugc.aweme.views.f
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.instantiateItem(viewGroup, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.views.f
        public final void destroyItem(View view, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.destroyItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.views.f
        public final void setPrimaryItem(View view, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.setPrimaryItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l, com.ss.android.ugc.aweme.views.f
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            super.destroyItem(viewGroup, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l, com.ss.android.ugc.aweme.views.f
        public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.setPrimaryItem(viewGroup, i2, obj);
        }
    }

    class b implements ViewPager.e {

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager.e f144532b;

        static {
            Covode.recordClassIndex(94596);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.a() && adapter != null) {
                i2 = (adapter.getCount() - i2) - 1;
            }
            this.f144532b.onPageSelected(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f144532b.onPageScrollStateChanged(i2);
            if (RtlViewPager.this.f144525e && i2 == 0 && !RtlViewPager.this.a() && RtlViewPager.this.getCurrentItem() == 0 && RtlViewPager.this.getScrollX() > 0) {
                RtlViewPager.this.setScrollX(0);
            }
        }

        b(ViewPager.e eVar) {
            this.f144532b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (!RtlViewPager.this.a() || adapter == null) {
                this.f144532b.onPageScrolled(i2, f2, i3);
                return;
            }
            int count = adapter.getCount();
            if (i2 == count - 1 && f2 == 0.0f) {
                i2--;
                i3 = RtlViewPager.this.getWidth();
                f2 = 1.0f;
            }
            this.f144532b.onPageScrolled((count - (i2 + 1)) - 1, 1.0f - f2, RtlViewPager.this.getWidth() - i3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f144526f = savedState.f144529b;
        super.onRestoreInstanceState(savedState.f144528a);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i2) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && a()) {
            i2 = (adapter.getCount() - i2) - 1;
        }
        if (this.f144522b) {
            super.setCurrentItem(i2);
        } else {
            super.setCurrentItem(i2, false);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        int i3 = 0;
        int i4 = 1;
        if (i2 != 1) {
            i4 = 0;
        }
        if (i4 != this.f144526f) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i3 = getCurrentItem();
            }
            this.f144526f = i4;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i3);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f144521a || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            if (motionEvent.getAction() == 1) {
                motionEvent.setAction(3);
                if (!this.f144521a || !super.onTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getChildDrawingOrder(int i2, int i3) {
        try {
            return super.getChildDrawingOrder(i2, i3);
        } catch (IndexOutOfBoundsException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i2, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        boolean z2 = true;
        if (adapter != null && a()) {
            i2 = (adapter.getCount() - i2) - 1;
        }
        if (!this.f144522b || !z) {
            z2 = false;
        }
        super.setCurrentItem(i2, z2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        if (this.f144523c && this.f144524d != null && mode != 1073741824) {
            this.f144524d.measure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            i3 = View.MeasureSpec.makeMeasureSpec(this.f144524d.getMeasuredHeight(), 1073741824);
        } else if (View.MeasureSpec.getMode(i3) == 0) {
            int i4 = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                childAt.measure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i4) {
                    i4 = measuredHeight;
                }
            }
            i3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        super.onMeasure(i2, i3);
    }
}

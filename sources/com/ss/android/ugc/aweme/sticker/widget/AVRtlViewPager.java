package com.ss.android.ugc.aweme.sticker.widget;

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

public class AVRtlViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    public boolean f136661a;

    /* renamed from: b  reason: collision with root package name */
    private int f136662b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<ViewPager.e, b> f136663c = new HashMap<>();

    static {
        Covode.recordClassIndex(89250);
    }

    public final boolean a() {
        if (this.f136662b == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        a aVar = (a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f136673a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f136662b, (byte) 0);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = e.a(new f<SavedState>() {
            /* class com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(89252);
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
        public final Parcelable f136664a;

        /* renamed from: b  reason: collision with root package name */
        public final int f136665b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(89251);
        }

        private SavedState(Parcelable parcelable, int i2) {
            this.f136664a = parcelable;
            this.f136665b = i2;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f136664a, i2);
            parcel.writeInt(this.f136665b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f136664a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f136665b = parcel.readInt();
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
        this.f136661a = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.e eVar) {
        b bVar = new b(eVar);
        this.f136663c.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.e eVar) {
        super.removeOnPageChangeListener(this.f136663c.get(eVar));
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

    class a extends a {
        static {
            Covode.recordClassIndex(89253);
        }

        @Override // androidx.fragment.app.l, com.ss.android.ugc.aweme.sticker.widget.a
        public final Fragment a(int i2) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.a(i2);
        }

        @Override // androidx.fragment.app.l
        public final long b(int i2) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.b(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.sticker.widget.a
        public final int getItemPosition(Object obj) {
            int itemPosition = super.getItemPosition(obj);
            if (!AVRtlViewPager.this.a()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.sticker.widget.a
        public final CharSequence getPageTitle(int i2) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.getPageTitle(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.sticker.widget.a
        public final float getPageWidth(int i2) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.getPageWidth(i2);
        }

        a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.sticker.widget.a
        public final Object instantiateItem(View view, int i2) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.instantiateItem(view, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l, com.ss.android.ugc.aweme.sticker.widget.a
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.instantiateItem(viewGroup, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.sticker.widget.a
        public final void destroyItem(View view, int i2, Object obj) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.destroyItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.sticker.widget.a
        public final void setPrimaryItem(View view, int i2, Object obj) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.setPrimaryItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l, com.ss.android.ugc.aweme.sticker.widget.a
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            super.destroyItem(viewGroup, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l, com.ss.android.ugc.aweme.sticker.widget.a
        public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
            if (AVRtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.setPrimaryItem(viewGroup, i2, obj);
        }
    }

    class b implements ViewPager.e {

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager.e f136668b;

        static {
            Covode.recordClassIndex(89254);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            PagerAdapter adapter = AVRtlViewPager.super.getAdapter();
            if (AVRtlViewPager.this.a() && adapter != null) {
                i2 = (adapter.getCount() - i2) - 1;
            }
            this.f136668b.onPageSelected(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f136668b.onPageScrollStateChanged(i2);
            if (AVRtlViewPager.this.f136661a && i2 == 0 && !AVRtlViewPager.this.a() && AVRtlViewPager.this.getCurrentItem() == 0 && AVRtlViewPager.this.getScrollX() > 0) {
                AVRtlViewPager.this.setScrollX(0);
            }
        }

        b(ViewPager.e eVar) {
            this.f136668b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            PagerAdapter adapter = AVRtlViewPager.super.getAdapter();
            if (!AVRtlViewPager.this.a() || adapter == null) {
                this.f136668b.onPageScrolled(i2, f2, i3);
                return;
            }
            int count = adapter.getCount();
            if (i2 == count - 1 && f2 == 0.0f) {
                i2--;
                i3 = AVRtlViewPager.this.getWidth();
                f2 = 1.0f;
            }
            this.f136668b.onPageScrolled((count - (i2 + 1)) - 1, 1.0f - f2, AVRtlViewPager.this.getWidth() - i3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f136662b = savedState.f136665b;
        super.onRestoreInstanceState(savedState.f136664a);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            motionEvent.setAction(3);
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i2) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && a()) {
            i2 = (adapter.getCount() - i2) - 1;
        }
        super.setCurrentItem(i2);
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        int i3 = 0;
        int i4 = 1;
        if (i2 != 1) {
            i4 = 0;
        }
        if (i4 != this.f136662b) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i3 = getCurrentItem();
            }
            this.f136662b = i4;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i3);
            }
        }
    }

    public AVRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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

    @Override // androidx.viewpager.widget.ViewPager
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i3) == 0) {
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

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i2, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && a()) {
            i2 = (adapter.getCount() - i2) - 1;
        }
        super.setCurrentItem(i2, z);
    }
}

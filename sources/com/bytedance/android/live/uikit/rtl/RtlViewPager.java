package com.bytedance.android.live.uikit.rtl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.d.e;
import androidx.core.d.f;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class RtlViewPager extends ViewPager {

    /* renamed from: a  reason: collision with root package name */
    private int f12924a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<ViewPager.e, b> f12925b = new HashMap<>();

    static {
        Covode.recordClassIndex(7173);
    }

    public final boolean a() {
        if (this.f12924a == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f12925b.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        a aVar = (a) super.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f12931a;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f12924a, (byte) 0);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = e.a(new f<SavedState>() {
            /* class com.bytedance.android.live.uikit.rtl.RtlViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7175);
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
        public final Parcelable f12926a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12927b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(7174);
        }

        private SavedState(Parcelable parcelable, int i2) {
            this.f12926a = parcelable;
            this.f12927b = i2;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f12926a, i2);
            parcel.writeInt(this.f12927b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f12926a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f12927b = parcel.readInt();
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

    class b implements ViewPager.e {

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager.e f12930b;

        static {
            Covode.recordClassIndex(7177);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f12930b.onPageScrollStateChanged(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.a() && adapter != null) {
                i2 = (adapter.getCount() - i2) - 1;
            }
            this.f12930b.onPageSelected(i2);
        }

        public b(ViewPager.e eVar) {
            this.f12930b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            int width = RtlViewPager.this.getWidth();
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.a() && adapter != null) {
                int count = adapter.getCount();
                float f3 = (float) width;
                int pageWidth = ((int) ((1.0f - adapter.getPageWidth(i2)) * f3)) + i3;
                while (i2 < count && pageWidth > 0) {
                    i2++;
                    pageWidth -= (int) (adapter.getPageWidth(i2) * f3);
                }
                i2 = (count - i2) - 1;
                i3 = -pageWidth;
                f2 = ((float) i3) / (f3 * adapter.getPageWidth(i2));
            }
            this.f12930b.onPageScrolled(i2, f2, i3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.e eVar) {
        b bVar = new b(eVar);
        this.f12925b.put(eVar, bVar);
        super.addOnPageChangeListener(bVar);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.e eVar) {
        b remove = this.f12925b.remove(eVar);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new a(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.e eVar) {
        super.setOnPageChangeListener(new b(eVar));
    }

    class a extends a {
        static {
            Covode.recordClassIndex(7176);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
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

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final CharSequence getPageTitle(int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.getPageTitle(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final float getPageWidth(int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.getPageWidth(i2);
        }

        public a(PagerAdapter pagerAdapter) {
            super(pagerAdapter);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final Object instantiateItem(View view, int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.instantiateItem(view, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.instantiateItem(viewGroup, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final void destroyItem(View view, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.destroyItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final void setPrimaryItem(View view, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.setPrimaryItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.destroyItem(viewGroup, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.rtl.a
        public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
            if (RtlViewPager.this.a()) {
                i2 = (getCount() - i2) - 1;
            }
            super.setPrimaryItem(viewGroup, i2, obj);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f12924a = savedState.f12927b;
        super.onRestoreInstanceState(savedState.f12926a);
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
        if (i4 != this.f12924a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i3 = getCurrentItem();
            }
            this.f12924a = i4;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i3);
            }
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
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

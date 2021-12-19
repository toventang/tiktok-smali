package dmt.viewpager;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.d.e;
import androidx.core.d.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public class DmtRtlViewPager extends DmtViewPager {

    /* renamed from: a  reason: collision with root package name */
    private int f157003a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<ViewPager.e, c> f157004b = new HashMap<>();

    static {
        Covode.recordClassIndex(104268);
    }

    static class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        final b f157007a;

        static {
            Covode.recordClassIndex(104271);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            b bVar = this.f157007a;
            if (bVar != null) {
                bVar.a();
            }
        }

        private a(b bVar) {
            this.f157007a = bVar;
        }

        /* synthetic */ a(b bVar, byte b2) {
            this(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends l {

        /* renamed from: a  reason: collision with root package name */
        public final PagerAdapter f157008a;

        static {
            Covode.recordClassIndex(104272);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            super.notifyDataSetChanged();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.f157008a.getCount();
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final Parcelable saveState() {
            return this.f157008a.saveState();
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final void finishUpdate(ViewGroup viewGroup) {
            this.f157008a.finishUpdate(viewGroup);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final void startUpdate(ViewGroup viewGroup) {
            this.f157008a.startUpdate(viewGroup);
        }

        @Override // androidx.fragment.app.l
        public final Fragment a(int i2) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            return ((l) this.f157008a).a(i2);
        }

        @Override // androidx.fragment.app.l
        public final long b(int i2) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            return super.b(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            int itemPosition = this.f157008a.getItemPosition(obj);
            if (!DmtRtlViewPager.this.b()) {
                return itemPosition;
            }
            if (itemPosition == -1 || itemPosition == -2) {
                return -2;
            }
            return (getCount() - itemPosition) - 1;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final CharSequence getPageTitle(int i2) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            return this.f157008a.getPageTitle(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final float getPageWidth(int i2) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            return this.f157008a.getPageWidth(i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final boolean isViewFromObject(View view, Object obj) {
            return this.f157008a.isViewFromObject(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
            this.f157008a.restoreState(parcelable, classLoader);
        }

        b(PagerAdapter pagerAdapter) {
            super(null);
            this.f157008a = pagerAdapter;
            pagerAdapter.registerDataSetObserver(new a(this, (byte) 0));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(View view, int i2) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            return this.f157008a.instantiateItem(view, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            return this.f157008a.instantiateItem(viewGroup, i2);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(View view, int i2, Object obj) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            this.f157008a.destroyItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void setPrimaryItem(View view, int i2, Object obj) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            this.f157008a.setPrimaryItem(view, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            this.f157008a.destroyItem(viewGroup, i2, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
        public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
            if (DmtRtlViewPager.this.b()) {
                i2 = (getCount() - i2) - 1;
            }
            this.f157008a.setPrimaryItem(viewGroup, i2, obj);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public PagerAdapter getAdapter() {
        b bVar = (b) super.getAdapter();
        if (bVar == null) {
            return null;
        }
        return bVar.f157008a;
    }

    @Override // dmt.viewpager.DmtViewPager
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f157003a, (byte) 0);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = e.a(new f<SavedState>() {
            /* class dmt.viewpager.DmtRtlViewPager.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(104270);
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
        public final Parcelable f157005a;

        /* renamed from: b  reason: collision with root package name */
        public final int f157006b;

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(104269);
        }

        private SavedState(Parcelable parcelable, int i2) {
            this.f157005a = parcelable;
            this.f157006b = i2;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f157005a, i2);
            parcel.writeInt(this.f157006b);
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f157005a = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f157006b = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, ClassLoader classLoader, byte b2) {
            this(parcel, classLoader);
        }

        /* synthetic */ SavedState(Parcelable parcelable, int i2, byte b2) {
            this(parcelable, i2);
        }
    }

    public final boolean b() {
        if (this.f157003a == 1) {
            return true;
        }
        return false;
    }

    @Override // dmt.viewpager.DmtViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter == null || !b()) {
            return currentItem;
        }
        return (adapter.getCount() - currentItem) - 1;
    }

    class c implements ViewPager.e {

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager.e f157011b;

        static {
            Covode.recordClassIndex(104273);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrollStateChanged(int i2) {
            this.f157011b.onPageScrollStateChanged(i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageSelected(int i2) {
            PagerAdapter adapter = DmtRtlViewPager.super.getAdapter();
            if (DmtRtlViewPager.this.b() && adapter != null) {
                i2 = (adapter.getCount() - i2) - 1;
            }
            this.f157011b.onPageSelected(i2);
        }

        c(ViewPager.e eVar) {
            this.f157011b = eVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.e
        public final void onPageScrolled(int i2, float f2, int i3) {
            PagerAdapter adapter = DmtRtlViewPager.super.getAdapter();
            if (!DmtRtlViewPager.this.b() || adapter == null) {
                this.f157011b.onPageScrolled(i2, f2, i3);
                return;
            }
            int count = adapter.getCount();
            if (i2 == count - 1 && f2 == 0.0f) {
                i2--;
                i3 = DmtRtlViewPager.this.getWidth();
                f2 = 1.0f;
            }
            this.f157011b.onPageScrolled((count - (i2 + 1)) - 1, 1.0f - f2, DmtRtlViewPager.this.getWidth() - i3);
        }
    }

    @Override // dmt.viewpager.DmtViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public DmtRtlViewPager(Context context) {
        super(context);
    }

    @Override // dmt.viewpager.DmtViewPager
    public final void a(ViewPager.e eVar) {
        c cVar = new c(eVar);
        this.f157004b.put(eVar, cVar);
        super.a(cVar);
    }

    @Override // dmt.viewpager.DmtViewPager
    public final void b(ViewPager.e eVar) {
        super.b(this.f157004b.get(eVar));
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new b(pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // dmt.viewpager.DmtViewPager
    public void setOnPageChangeListener(ViewPager.e eVar) {
        super.setOnPageChangeListener(new c(eVar));
    }

    @Override // dmt.viewpager.DmtViewPager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f157003a = savedState.f157006b;
        super.onRestoreInstanceState(savedState.f157005a);
    }

    @Override // dmt.viewpager.DmtViewPager
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

    @Override // dmt.viewpager.DmtViewPager
    public void setCurrentItem(int i2) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && b()) {
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
        if (i4 != this.f157003a) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i3 = getCurrentItem();
            }
            this.f157003a = i4;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i3);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // dmt.viewpager.DmtViewPager
    public int getChildDrawingOrder(int i2, int i3) {
        try {
            return super.getChildDrawingOrder(i2, i3);
        } catch (IndexOutOfBoundsException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public DmtRtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // dmt.viewpager.DmtViewPager
    public final void a(int i2, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && b()) {
            i2 = (adapter.getCount() - i2) - 1;
        }
        super.a(i2, z);
    }

    /* access modifiers changed from: protected */
    @Override // dmt.viewpager.DmtViewPager
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
}

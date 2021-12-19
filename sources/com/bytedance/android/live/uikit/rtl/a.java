package com.bytedance.android.live.uikit.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public class a extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final PagerAdapter f12931a;

    static {
        Covode.recordClassIndex(7178);
    }

    /* renamed from: com.bytedance.android.live.uikit.rtl.a$a  reason: collision with other inner class name */
    static class C0270a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        final a f12932a;

        static {
            Covode.recordClassIndex(7179);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            a aVar = this.f12932a;
            if (aVar != null) {
                aVar.a();
            }
        }

        private C0270a(a aVar) {
            this.f12932a = aVar;
        }

        /* synthetic */ C0270a(a aVar, byte b2) {
            this(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f12931a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f12931a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return this.f12931a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(View view) {
        this.f12931a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return this.f12931a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i2) {
        return this.f12931a.getPageTitle(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i2) {
        return this.f12931a.getPageWidth(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12931a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(View view) {
        this.f12931a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f12931a.unregisterDataSetObserver(dataSetObserver);
    }

    public a(PagerAdapter pagerAdapter) {
        this.f12931a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C0270a(this, (byte) 0));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        this.f12931a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        this.f12931a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(View view, int i2) {
        return this.f12931a.instantiateItem(view, i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return this.f12931a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f12931a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        return this.f12931a.instantiateItem(viewGroup, i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i2, Object obj) {
        this.f12931a.destroyItem(view, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(View view, int i2, Object obj) {
        this.f12931a.setPrimaryItem(view, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f12931a.destroyItem(viewGroup, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f12931a.setPrimaryItem(viewGroup, i2, obj);
    }
}

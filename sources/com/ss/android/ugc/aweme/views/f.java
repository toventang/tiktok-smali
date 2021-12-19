package com.ss.android.ugc.aweme.views;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final PagerAdapter f144610a;

    static {
        Covode.recordClassIndex(94625);
    }

    static class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        private final f f144611a;

        static {
            Covode.recordClassIndex(94626);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            f fVar = this.f144611a;
            if (fVar != null) {
                fVar.a();
            }
        }

        private a(f fVar) {
            this.f144611a = fVar;
        }

        /* synthetic */ a(f fVar, byte b2) {
            this(fVar);
        }
    }

    public final void a() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f144610a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f144610a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public Parcelable saveState() {
        return this.f144610a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(View view) {
        this.f144610a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return this.f144610a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i2) {
        return this.f144610a.getPageTitle(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i2) {
        return this.f144610a.getPageWidth(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f144610a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(View view) {
        this.f144610a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f144610a.unregisterDataSetObserver(dataSetObserver);
    }

    public f(PagerAdapter pagerAdapter) {
        super(null);
        this.f144610a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new a(this, (byte) 0));
    }

    @Override // androidx.fragment.app.l
    public Fragment a(int i2) {
        return ((l) this.f144610a).a(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void finishUpdate(ViewGroup viewGroup) {
        this.f144610a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void startUpdate(ViewGroup viewGroup) {
        this.f144610a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(View view, int i2) {
        return this.f144610a.instantiateItem(view, i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public boolean isViewFromObject(View view, Object obj) {
        return this.f144610a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f144610a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        return this.f144610a.instantiateItem(viewGroup, i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i2, Object obj) {
        this.f144610a.destroyItem(view, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(View view, int i2, Object obj) {
        this.f144610a.setPrimaryItem(view, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f144610a.destroyItem(viewGroup, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f144610a.setPrimaryItem(viewGroup, i2, obj);
    }
}

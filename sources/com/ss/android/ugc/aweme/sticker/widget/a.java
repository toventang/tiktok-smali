package com.ss.android.ugc.aweme.sticker.widget;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public class a extends l {

    /* renamed from: a  reason: collision with root package name */
    public final PagerAdapter f136673a;

    static {
        Covode.recordClassIndex(89259);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.a$a  reason: collision with other inner class name */
    static class C3566a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        final a f136674a;

        static {
            Covode.recordClassIndex(89260);
        }

        public final void onInvalidated() {
            onChanged();
        }

        public final void onChanged() {
            a aVar = this.f136674a;
            if (aVar != null) {
                aVar.a();
            }
        }

        private C3566a(a aVar) {
            this.f136674a = aVar;
        }

        /* synthetic */ C3566a(a aVar, byte b2) {
            this(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        super.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f136673a.getCount();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        this.f136673a.notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public Parcelable saveState() {
        return this.f136673a.saveState();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(View view) {
        this.f136673a.finishUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        return this.f136673a.getItemPosition(obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i2) {
        return this.f136673a.getPageTitle(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public float getPageWidth(int i2) {
        return this.f136673a.getPageWidth(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.f136673a.registerDataSetObserver(dataSetObserver);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(View view) {
        this.f136673a.startUpdate(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.f136673a.unregisterDataSetObserver(dataSetObserver);
    }

    public a(PagerAdapter pagerAdapter) {
        super(null);
        this.f136673a = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new C3566a(this, (byte) 0));
    }

    @Override // androidx.fragment.app.l
    public Fragment a(int i2) {
        return ((l) this.f136673a).a(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void finishUpdate(ViewGroup viewGroup) {
        this.f136673a.finishUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void startUpdate(ViewGroup viewGroup) {
        this.f136673a.startUpdate(viewGroup);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(View view, int i2) {
        return this.f136673a.instantiateItem(view, i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public boolean isViewFromObject(View view, Object obj) {
        return this.f136673a.isViewFromObject(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        this.f136673a.restoreState(parcelable, classLoader);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        return this.f136673a.instantiateItem(viewGroup, i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(View view, int i2, Object obj) {
        this.f136673a.destroyItem(view, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(View view, int i2, Object obj) {
        this.f136673a.setPrimaryItem(view, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f136673a.destroyItem(viewGroup, i2, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f136673a.setPrimaryItem(viewGroup, i2, obj);
    }
}

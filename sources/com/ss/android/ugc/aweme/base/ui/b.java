package com.ss.android.ugc.aweme.base.ui;

import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.a.a;

public abstract class b extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    protected final i f68358a;

    /* renamed from: b  reason: collision with root package name */
    protected n f68359b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f68360c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray<String> f68361d = new SparseArray<>();

    static {
        Covode.recordClassIndex(42088);
    }

    public abstract Fragment a(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
    }

    public b(i iVar) {
        this.f68358a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        n nVar = this.f68359b;
        if (nVar != null) {
            try {
                nVar.c();
                this.f68359b = null;
                this.f68358a.b();
            } catch (IllegalStateException e2) {
                a.a(6, "FragmentPagerAdapter", "finishUpdate ->".concat(String.valueOf(e2)));
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    private static String a(int i2, int i3) {
        return "android:switcher:" + i2 + ":" + String.valueOf((long) i3);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.f68359b == null) {
            this.f68359b = this.f68358a.a();
        }
        String a2 = a(viewGroup.getId(), i2);
        Fragment a3 = this.f68358a.a(a2);
        if (a3 != null) {
            this.f68359b.e(a3);
        } else {
            a3 = a(i2);
            if (a3 == this.f68360c) {
                this.f68359b.a(viewGroup.getId(), a3, a2);
                this.f68361d.put(i2, a2);
            }
        }
        if (a3 != this.f68360c) {
            a3.setMenuVisibility(false);
            a3.setUserVisibleHint(false);
        }
        return a3;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (this.f68359b == null) {
            this.f68359b = this.f68358a.a();
        }
        this.f68359b.d((Fragment) obj);
        this.f68361d.remove(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f68360c) {
            boolean isEmpty = TextUtils.isEmpty(fragment.getTag());
            boolean z = !TextUtils.equals(fragment.getTag(), this.f68361d.get(i2, ""));
            if (isEmpty || z) {
                String a2 = a(viewGroup.getId(), i2);
                if (this.f68359b == null) {
                    this.f68359b = this.f68358a.a();
                }
                Fragment a3 = this.f68358a.a(a2);
                if (a3 != null) {
                    this.f68359b.c(a3);
                } else {
                    this.f68359b.a(viewGroup.getId(), fragment, a2);
                }
                this.f68361d.put(i2, a2);
            }
            Fragment fragment2 = this.f68360c;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f68360c.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f68360c = fragment;
        }
    }
}

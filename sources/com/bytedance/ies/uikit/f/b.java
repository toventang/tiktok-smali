package com.bytedance.ies.uikit.f;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public abstract class b extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    protected final i f35477a;

    /* renamed from: b  reason: collision with root package name */
    protected n f35478b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f35479c;

    static {
        Covode.recordClassIndex(21210);
    }

    public abstract Fragment a(int i2);

    public long b(int i2) {
        return (long) i2;
    }

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
        this.f35477a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        n nVar = this.f35478b;
        if (nVar != null) {
            try {
                nVar.c();
                this.f35478b = null;
                this.f35477a.b();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
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

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.f35478b == null) {
            this.f35478b = this.f35477a.a();
        }
        b(i2);
        String str = "android:switcher:" + viewGroup.getId() + ":" + String.valueOf(b(i2));
        Fragment a2 = this.f35477a.a(str);
        if (a2 != null) {
            this.f35478b.e(a2);
        } else {
            a2 = a(i2);
            this.f35478b.a(viewGroup.getId(), a2, str);
        }
        if (a2 != this.f35479c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (this.f35478b == null) {
            this.f35478b = this.f35477a.a();
        }
        this.f35478b.d((Fragment) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f35479c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f35479c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f35479c = fragment;
        }
    }
}

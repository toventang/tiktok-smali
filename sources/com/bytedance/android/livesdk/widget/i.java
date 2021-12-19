package com.bytedance.android.livesdk.widget;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public abstract class i extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.fragment.app.i f22619a;

    /* renamed from: b  reason: collision with root package name */
    private n f22620b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f22621c;

    static {
        Covode.recordClassIndex(13360);
    }

    public abstract Fragment a(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public i(androidx.fragment.app.i iVar) {
        this.f22619a = iVar;
    }

    public String c(int i2) {
        return String.valueOf(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        n nVar = this.f22620b;
        if (nVar != null) {
            try {
                nVar.e();
                this.f22619a.b();
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
            } catch (NullPointerException e3) {
                e3.printStackTrace();
            } finally {
                this.f22620b = null;
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    private static String a(int i2, String str) {
        return "android:switcher:" + i2 + ":" + str;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.f22620b == null) {
            this.f22620b = this.f22619a.a();
        }
        String c2 = c(i2);
        Fragment a2 = this.f22619a.a(a(viewGroup.getId(), c2));
        if (a2 != null) {
            this.f22620b.e(a2);
        } else {
            a2 = a(i2);
            this.f22620b.a(viewGroup.getId(), a2, a(viewGroup.getId(), c2));
        }
        if (a2 != this.f22621c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (this.f22620b == null) {
            this.f22620b = this.f22619a.a();
        }
        this.f22620b.a((Fragment) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f22621c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f22621c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f22621c = fragment;
        }
    }
}

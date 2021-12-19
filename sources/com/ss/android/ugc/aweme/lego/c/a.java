package com.ss.android.ugc.aweme.lego.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;

public abstract class a extends b<Fragment> {

    /* renamed from: a  reason: collision with root package name */
    private i f107459a;

    /* renamed from: b  reason: collision with root package name */
    private n f107460b;

    /* renamed from: com.ss.android.ugc.aweme.lego.c.a$a  reason: collision with other inner class name */
    public interface AbstractC2762a {
        static {
            Covode.recordClassIndex(68773);
        }
    }

    static {
        Covode.recordClassIndex(68772);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
    }

    public a(i iVar) {
        this.f107459a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        n nVar = this.f107460b;
        if (nVar != null) {
            nVar.c();
            this.f107460b = null;
            this.f107459a.b();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    private static String a(int i2, long j2) {
        return "android:switcher:" + i2 + ':' + j2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Fragment b(ViewGroup viewGroup, int i2) {
        Fragment fragment = (Fragment) this.f107462d.get(i2);
        if (fragment == null) {
            return null;
        }
        String a2 = a(viewGroup.getId(), (long) i2);
        if (this.f107459a.a(a2) == null) {
            if (this.f107460b == null) {
                this.f107460b = this.f107459a.a();
            }
            this.f107460b.a(viewGroup.getId(), fragment, a2);
            this.f107462d.remove(i2);
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.f107460b == null) {
            this.f107460b = this.f107459a.a();
        }
        String a2 = a(viewGroup.getId(), (long) i2);
        Fragment a3 = this.f107459a.a(a2);
        if (a3 == null) {
            a3 = (Fragment) a(i2);
            if (a3 instanceof AbstractC2762a) {
                this.f107462d.put(i2, a3);
            } else {
                this.f107460b.a(viewGroup.getId(), a3, a2);
            }
        } else {
            this.f107460b.e(a3);
        }
        if (this.f107463e != a3) {
            a3.setUserVisibleHint(false);
            a3.setMenuVisibility(false);
        }
        return a3;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (this.f107460b == null) {
            this.f107460b = this.f107459a.a();
        }
        if (this.f107459a.a(a(viewGroup.getId(), (long) i2)) != null) {
            this.f107462d.remove(i2);
        } else {
            this.f107460b.d((Fragment) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.ss.android.ugc.aweme.lego.c.b
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        if (b(i2)) {
            startUpdate(viewGroup);
            b(viewGroup, i2);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f107463e) {
            if (this.f107463e != null) {
                ((Fragment) this.f107463e).setUserVisibleHint(false);
                ((Fragment) this.f107463e).setMenuVisibility(false);
            }
            if (fragment != null) {
                fragment.setUserVisibleHint(true);
                fragment.setMenuVisibility(true);
            }
            this.f107463e = fragment;
        }
    }
}

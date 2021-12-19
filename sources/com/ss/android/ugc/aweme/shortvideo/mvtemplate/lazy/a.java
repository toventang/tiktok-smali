package com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.covode.number.Covode;

public abstract class a extends b<Fragment> {

    /* renamed from: a  reason: collision with root package name */
    private i f129361a;

    /* renamed from: d  reason: collision with root package name */
    private n f129362d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.a$a  reason: collision with other inner class name */
    public interface AbstractC3368a {
        static {
            Covode.recordClassIndex(84909);
        }
    }

    static {
        Covode.recordClassIndex(84908);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
    }

    public a(i iVar) {
        this.f129361a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        n nVar = this.f129362d;
        if (nVar != null) {
            nVar.c();
            this.f129362d = null;
            this.f129361a.b();
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
    /* renamed from: b */
    public Fragment a(ViewGroup viewGroup, int i2) {
        Fragment fragment = (Fragment) this.f129363b.get(i2);
        if (fragment == null) {
            return null;
        }
        String a2 = a(viewGroup.getId(), (long) i2);
        if (this.f129361a.a(a2) == null) {
            if (this.f129362d == null) {
                this.f129362d = this.f129361a.a();
            }
            this.f129362d.a(viewGroup.getId(), fragment, a2);
            this.f129363b.remove(i2);
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.f129362d == null) {
            this.f129362d = this.f129361a.a();
        }
        String a2 = a(viewGroup.getId(), (long) i2);
        Fragment a3 = this.f129361a.a(a2);
        if (a3 == null) {
            a3 = (Fragment) a(i2);
            if (a3 instanceof AbstractC3368a) {
                this.f129363b.put(i2, a3);
            } else {
                this.f129362d.a(viewGroup.getId(), a3, a2);
            }
        } else {
            this.f129362d.e(a3);
        }
        if (this.f129364c != a3) {
            a3.setUserVisibleHint(false);
            a3.setMenuVisibility(false);
        }
        return a3;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (this.f129362d == null) {
            this.f129362d = this.f129361a.a();
        }
        if (this.f129361a.a(a(viewGroup.getId(), (long) i2)) != null) {
            this.f129363b.remove(i2);
        } else {
            this.f129362d.d((Fragment) obj);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.b, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        if (b(i2)) {
            startUpdate(viewGroup);
            a(viewGroup, i2);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f129364c) {
            if (this.f129364c != null) {
                ((Fragment) this.f129364c).setUserVisibleHint(false);
                ((Fragment) this.f129364c).setMenuVisibility(false);
            }
            if (fragment != null) {
                fragment.setUserVisibleHint(true);
                fragment.setMenuVisibility(true);
            }
            this.f129364c = fragment;
        }
    }
}

package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

public abstract class l extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final i f2983a;

    /* renamed from: b  reason: collision with root package name */
    private n f2984b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f2985c;

    static {
        Covode.recordClassIndex(1067);
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

    public l(i iVar) {
        this.f2983a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        n nVar = this.f2984b;
        if (nVar != null) {
            nVar.e();
            this.f2984b = null;
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

    private static String a(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        if (this.f2984b == null) {
            this.f2984b = this.f2983a.a();
        }
        long b2 = b(i2);
        Fragment a2 = this.f2983a.a(a(viewGroup.getId(), b2));
        if (a2 != null) {
            this.f2984b.e(a2);
        } else {
            a2 = a(i2);
            this.f2984b.a(viewGroup.getId(), a2, a(viewGroup.getId(), b2));
        }
        if (a2 != this.f2985c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        if (this.f2984b == null) {
            this.f2984b = this.f2983a.a();
        }
        this.f2984b.d((Fragment) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2985c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f2985c.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f2985c = fragment;
        }
    }
}

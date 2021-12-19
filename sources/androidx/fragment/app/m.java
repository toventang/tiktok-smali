package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public abstract class m extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final i f2986a;

    /* renamed from: b  reason: collision with root package name */
    private n f2987b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<Fragment.SavedState> f2988c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<Fragment> f2989d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private Fragment f2990e = null;

    static {
        Covode.recordClassIndex(1068);
    }

    public abstract Fragment a(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f2988c.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f2988c.size()];
            this.f2988c.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i2 = 0; i2 < this.f2989d.size(); i2++) {
            Fragment fragment = this.f2989d.get(i2);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f2986a.a(bundle, "f".concat(String.valueOf(i2)), fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        n nVar = this.f2987b;
        if (nVar != null) {
            nVar.e();
            this.f2987b = null;
        }
    }

    public m(i iVar) {
        this.f2986a = iVar;
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

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f2989d.size() > i2 && (fragment = this.f2989d.get(i2)) != null) {
            return fragment;
        }
        if (this.f2987b == null) {
            this.f2987b = this.f2986a.a();
        }
        Fragment a2 = a(i2);
        if (this.f2988c.size() > i2 && (savedState = this.f2988c.get(i2)) != null) {
            a2.setInitialSavedState(savedState);
        }
        while (this.f2989d.size() <= i2) {
            this.f2989d.add(null);
        }
        a2.setMenuVisibility(false);
        a2.setUserVisibleHint(false);
        this.f2989d.set(i2, a2);
        this.f2987b.a(viewGroup.getId(), a2);
        return a2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f2988c.clear();
            this.f2989d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f2988c.add(parcelable2);
                }
            }
            for (T t : bundle.keySet()) {
                if (t.startsWith("f")) {
                    int parseInt = Integer.parseInt(t.substring(1));
                    Fragment a2 = this.f2986a.a(bundle, t);
                    if (a2 != null) {
                        while (this.f2989d.size() <= parseInt) {
                            this.f2989d.add(null);
                        }
                        a2.setMenuVisibility(false);
                        this.f2989d.set(parseInt, a2);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f2990e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f2990e.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f2990e = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f2987b == null) {
            this.f2987b = this.f2986a.a();
        }
        while (this.f2988c.size() <= i2) {
            this.f2988c.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f2988c;
        if (fragment.isAdded()) {
            savedState = this.f2986a.a(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i2, savedState);
        this.f2989d.set(i2, null);
        this.f2987b.a(fragment);
    }
}

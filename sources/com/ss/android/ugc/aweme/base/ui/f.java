package com.ss.android.ugc.aweme.base.ui;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.f.b;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class f<T extends Fragment> extends b {

    /* renamed from: c  reason: collision with root package name */
    protected final int f68365c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<Integer, T> f68366d;

    static {
        Covode.recordClassIndex(42093);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    /* access modifiers changed from: protected */
    public void a(HashMap<Integer, T> hashMap) {
    }

    /* access modifiers changed from: protected */
    public abstract T c(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f68365c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        HashMap<Integer, T> hashMap = this.f68366d;
        if (hashMap != null) {
            hashMap.clear();
            a(this.f68366d);
        }
        super.notifyDataSetChanged();
    }

    @Override // com.bytedance.ies.uikit.f.b
    public final Fragment a(int i2) {
        T c2 = c(i2);
        if (c2 != null) {
            return c2;
        }
        throw new UnsupportedOperationException("createFragment(position=" + i2 + " does not return a Fragment),check the code to be sure that method createFragment has override all position");
    }

    public f(i iVar, int i2) {
        super(iVar);
        this.f68365c = i2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
        this.f68366d = linkedHashMap;
        a(linkedHashMap);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.ss.android.ugc.aweme.base.ui.f<T extends androidx.fragment.app.Fragment> */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.uikit.f.b, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        Object instantiateItem = super.instantiateItem(viewGroup, i2);
        Fragment fragment = (Fragment) instantiateItem;
        a(fragment);
        this.f68366d.put(Integer.valueOf(i2), fragment);
        a(this.f68366d);
        return instantiateItem;
    }
}

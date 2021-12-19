package com.ss.android.ugc.aweme.discover.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class k<T extends Fragment> extends a {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, T> f80560a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f80561b;

    static {
        Covode.recordClassIndex(50118);
    }

    /* access modifiers changed from: protected */
    public abstract Fragment d(int i2);

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f80561b;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void notifyDataSetChanged() {
        HashMap<Integer, T> hashMap = this.f80560a;
        if (hashMap != null) {
            hashMap.clear();
        }
        super.notifyDataSetChanged();
    }

    public final Fragment c(int i2) {
        HashMap<Integer, T> hashMap = this.f80560a;
        if (hashMap == null || hashMap.size() == 0) {
            return null;
        }
        return this.f80560a.get(Integer.valueOf(i2));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.lego.c.b
    public final /* synthetic */ Fragment a(int i2) {
        Fragment d2 = d(i2);
        if (d2 != null) {
            return d2;
        }
        throw new UnsupportedOperationException("createFragment(position=" + i2 + " No Fragment instance returned),Check the code to ensure that the createFragment method covers all positions");
    }

    public k(i iVar, int i2) {
        super(iVar);
        this.f80561b = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.discover.adapter.a, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        Object instantiateItem = super.instantiateItem(viewGroup, i2);
        this.f80560a.put(Integer.valueOf(i2), instantiateItem);
        return instantiateItem;
    }
}

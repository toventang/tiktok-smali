package com.bytedance.android.live.effect.d;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.m;
import com.bytedance.android.live.effect.api.a;
import com.bytedance.android.live.effect.c.e;
import com.bytedance.android.live.effect.e.c;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f9754a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f9755b = new ArrayList();

    static {
        Covode.recordClassIndex(4969);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        l.d(obj, "");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f9755b.size() + 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(i iVar) {
        super(iVar);
        l.d(iVar, "");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        if (i2 == this.f9755b.size()) {
            return a.f9641f;
        }
        return this.f9755b.get(i2);
    }

    @Override // androidx.fragment.app.m
    public final Fragment a(int i2) {
        if (i2 == this.f9755b.size()) {
            return new e();
        }
        String str = this.f9755b.get(i2);
        l.d(str, "");
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putString("live_effect_panel_name", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    public final void a(List<com.bytedance.android.live.effect.model.e<com.bytedance.android.livesdkapi.depend.model.a>> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f9889a);
        }
        ArrayList arrayList2 = arrayList;
        boolean z = !l.a(this.f9755b, arrayList2);
        this.f9755b.clear();
        this.f9755b.addAll(arrayList2);
        if (z) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.m
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        Object obj2;
        l.d(viewGroup, "");
        l.d(obj, "");
        if (!l.a(this.f9754a, obj)) {
            if (!(obj instanceof Fragment)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            this.f9754a = (Fragment) obj2;
        }
        super.setPrimaryItem(viewGroup, i2, obj);
    }
}

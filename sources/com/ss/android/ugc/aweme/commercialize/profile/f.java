package com.ss.android.ugc.aweme.commercialize.profile;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.b;
import h.a.n;
import java.util.List;

public final class f<T extends b> extends l {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends T> f75169a;

    static {
        Covode.recordClassIndex(46362);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f75169a.size();
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        return (Fragment) this.f75169a.get(i2);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        h.f.b.l.d(obj, "");
        if (n.a((Iterable) this.f75169a, obj)) {
            return n.a((List) this.f75169a, obj);
        }
        return -2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(i iVar, List<? extends T> list) {
        super(iVar);
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(list, "");
        this.f75169a = list;
    }
}

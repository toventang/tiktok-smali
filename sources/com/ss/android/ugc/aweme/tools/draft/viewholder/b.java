package com.ss.android.ugc.aweme.tools.draft.viewholder;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.draft.d.a;
import com.ss.android.ugc.aweme.tools.draft.d.m;
import h.f.b.l;
import java.util.List;

public final class b extends j.a {

    /* renamed from: a  reason: collision with root package name */
    public List<a> f139911a;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f139912b;

    static {
        Covode.recordClassIndex(91432);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f139911a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f139912b.size();
    }

    public b(List<a> list, List<a> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f139911a = list;
        this.f139912b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final Object a(int i2, int i3) {
        return super.a(i2, i3);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        return l.a(this.f139911a.get(i2), this.f139912b.get(i3));
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        a aVar = this.f139911a.get(i2);
        a aVar2 = this.f139912b.get(i3);
        if (!(aVar instanceof m) || !(aVar2 instanceof m)) {
            return l.a(aVar, aVar2);
        }
        m mVar = (m) aVar;
        m mVar2 = (m) aVar2;
        if (!l.a((Object) mVar.f139481d, (Object) mVar2.f139481d) || mVar.f139483f != mVar2.f139483f || !l.a((Object) mVar.f139485h, (Object) mVar2.f139485h) || !l.a((Object) mVar.f139512i, (Object) mVar2.f139512i)) {
            return false;
        }
        return true;
    }
}

package com.ss.android.ugc.aweme.utils;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class bu extends j.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<?> f142721a;

    /* renamed from: b  reason: collision with root package name */
    private final List<?> f142722b;

    static {
        Covode.recordClassIndex(93364);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f142722b.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f142721a.size();
    }

    public bu(List<?> list, List<?> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f142722b = list;
        this.f142721a = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        return l.a(this.f142722b.get(i2), this.f142721a.get(i3));
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        return l.a(this.f142722b.get(i2), this.f142721a.get(i3));
    }
}

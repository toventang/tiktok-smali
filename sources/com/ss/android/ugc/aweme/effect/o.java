package com.ss.android.ugc.aweme.effect;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class o extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<EffectModel> f88954a;

    /* renamed from: b  reason: collision with root package name */
    private final List<EffectModel> f88955b;

    static {
        Covode.recordClassIndex(55947);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f88954a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f88955b.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectModel> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.effect.EffectModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public o(List<? extends EffectModel> list, List<? extends EffectModel> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f88954a = list;
        this.f88955b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        return l.a((Object) this.f88954a.get(i2).name, (Object) this.f88955b.get(i3).name);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        return l.a(this.f88954a.get(i2), this.f88955b.get(i3));
    }
}

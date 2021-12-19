package com.bytedance.android.live.effect.e;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class a extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.bytedance.android.livesdkapi.depend.model.a> f9788a;

    /* renamed from: b  reason: collision with root package name */
    private final List<com.bytedance.android.livesdkapi.depend.model.a> f9789b;

    static {
        Covode.recordClassIndex(4990);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f9788a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f9789b.size();
    }

    public a(List<com.bytedance.android.livesdkapi.depend.model.a> list, List<com.bytedance.android.livesdkapi.depend.model.a> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f9788a = list;
        this.f9789b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        return l.a((Object) this.f9788a.get(i2).f22997c, (Object) this.f9789b.get(i3).f22997c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    @Override // androidx.recyclerview.widget.j.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.e.a.c(int, int):boolean");
    }
}

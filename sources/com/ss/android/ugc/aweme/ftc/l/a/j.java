package com.ss.android.ugc.aweme.ftc.l.a;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.recorder.n.b;
import h.f.b.l;
import java.util.List;

public final class j extends j.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f98735a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f98736b;

    static {
        Covode.recordClassIndex(62790);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f98735a.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f98736b.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.n.b> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.n.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(List<? extends b> list, List<? extends b> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f98735a = list;
        this.f98736b = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        if (this.f98735a.get(i2).f148158a == this.f98736b.get(i3).f148158a) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        if (this.f98735a.get(i2).f148169l != this.f98736b.get(i3).f148169l || !l.a(this.f98735a.get(i2), this.f98736b.get(i3))) {
            return false;
        }
        return true;
    }
}

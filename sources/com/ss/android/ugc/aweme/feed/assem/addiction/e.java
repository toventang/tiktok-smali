package com.ss.android.ugc.aweme.feed.assem.addiction;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a f91998a;

    static {
        Covode.recordClassIndex(57934);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && l.a(this.f91998a, ((e) obj).f91998a);
        }
        return true;
    }

    public final int hashCode() {
        a aVar = this.f91998a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VideoAntiAddictionState(data=" + this.f91998a + ")";
    }

    public /* synthetic */ e() {
        this(null);
    }

    public e(a aVar) {
        this.f91998a = aVar;
    }
}

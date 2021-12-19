package com.ss.android.ugc.aweme.mix.mixdetail.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f110150a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Aweme> f110151b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f110152c;

    static {
        Covode.recordClassIndex(70698);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f110150a, eVar.f110150a) && l.a(this.f110151b, eVar.f110151b) && this.f110152c == eVar.f110152c;
    }

    public final int hashCode() {
        Integer num = this.f110150a;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Aweme> list = this.f110151b;
        if (list != null) {
            i2 = list.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f110152c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "PanelState(event=" + this.f110150a + ", list=" + this.f110151b + ", hasMore=" + this.f110152c + ")";
    }

    private /* synthetic */ e() {
        this(null, null, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Integer num, List<? extends Aweme> list, boolean z) {
        this.f110150a = num;
        this.f110151b = list;
        this.f110152c = z;
    }
}

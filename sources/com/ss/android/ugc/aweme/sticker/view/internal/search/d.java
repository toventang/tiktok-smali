package com.ss.android.ugc.aweme.sticker.view.internal.search;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<Effect> f136524a;

    static {
        Covode.recordClassIndex(89173);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f136524a, ((d) obj).f136524a);
        }
        return true;
    }

    public final int hashCode() {
        List<Effect> list = this.f136524a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RecommendTrendData(effectId=" + this.f136524a + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends Effect> list) {
        l.d(list, "");
        this.f136524a = list;
    }
}

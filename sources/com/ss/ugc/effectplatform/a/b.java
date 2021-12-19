package com.ss.ugc.effectplatform.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.model.Effect;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Effect f153427a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f153428b;

    /* renamed from: c  reason: collision with root package name */
    public final String f153429c;

    static {
        Covode.recordClassIndex(102308);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f153427a, bVar.f153427a) && l.a(this.f153428b, bVar.f153428b) && l.a(this.f153429c, bVar.f153429c);
    }

    public final int hashCode() {
        Effect effect = this.f153427a;
        int i2 = 0;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        List<String> list = this.f153428b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.f153429c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EffectFetcherArguments(effect=" + this.f153427a + ", downloadUrl=" + this.f153428b + ", effectDir=" + this.f153429c + ")";
    }

    public b(Effect effect, List<String> list, String str) {
        l.c(effect, "");
        this.f153427a = effect;
        this.f153428b = list;
        this.f153429c = str;
    }
}

package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f9889a;

    /* renamed from: b  reason: collision with root package name */
    public final List<T> f9890b;

    static {
        Covode.recordClassIndex(5064);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f9889a, eVar.f9889a) && l.a(this.f9890b, eVar.f9890b);
    }

    public final int hashCode() {
        String str = this.f9889a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<T> list = this.f9890b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "LiveEffectPanel(panelName=" + this.f9889a + ", effectList=" + this.f9890b + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, List<? extends T> list) {
        l.d(str, "");
        l.d(list, "");
        this.f9889a = str;
        this.f9890b = list;
    }
}

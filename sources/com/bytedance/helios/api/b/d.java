package com.bytedance.helios.api.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f30649a;

    /* renamed from: b  reason: collision with root package name */
    public String f30650b;

    /* renamed from: c  reason: collision with root package name */
    public Pair<Boolean, Object> f30651c;

    /* renamed from: d  reason: collision with root package name */
    public Object f30652d;

    /* renamed from: e  reason: collision with root package name */
    public Object f30653e;

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f30654f;

    /* renamed from: g  reason: collision with root package name */
    public Set<Object> f30655g;

    static {
        Covode.recordClassIndex(17807);
    }

    public d() {
        this(null, null, null, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f30649a, dVar.f30649a) && l.a(this.f30650b, dVar.f30650b) && l.a(this.f30651c, dVar.f30651c) && l.a(this.f30652d, dVar.f30652d) && l.a(this.f30653e, dVar.f30653e) && l.a(this.f30654f, dVar.f30654f) && l.a(this.f30655g, dVar.f30655g);
    }

    public final int hashCode() {
        Object[] objArr = this.f30649a;
        int i2 = 0;
        int hashCode = (objArr != null ? Arrays.hashCode(objArr) : 0) * 31;
        String str = this.f30650b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Pair<Boolean, Object> pair = this.f30651c;
        int hashCode3 = (hashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        Object obj = this.f30652d;
        int hashCode4 = (hashCode3 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f30653e;
        int hashCode5 = (hashCode4 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Set<String> set = this.f30654f;
        int hashCode6 = (hashCode5 + (set != null ? set.hashCode() : 0)) * 31;
        Set<Object> set2 = this.f30655g;
        if (set2 != null) {
            i2 = set2.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "ControlExtra(parameters=" + Arrays.toString(this.f30649a) + ", returnType=" + this.f30650b + ", interceptResult=" + this.f30651c + ", apiInfo=" + this.f30652d + ", controlConfig=" + this.f30653e + ", eventRuleNames=" + this.f30654f + ", hitControlConfigs=" + this.f30655g + ")";
    }

    public final void a(Pair<Boolean, Object> pair) {
        l.c(pair, "");
        this.f30651c = pair;
    }

    private d(Object[] objArr, Pair<Boolean, Object> pair, Set<String> set, Set<Object> set2) {
        l.c(pair, "");
        l.c(set, "");
        l.c(set2, "");
        this.f30649a = objArr;
        this.f30650b = null;
        this.f30651c = pair;
        this.f30652d = null;
        this.f30653e = null;
        this.f30654f = set;
        this.f30655g = set2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object[] objArr, Pair pair, Set set, Set set2, int i2) {
        this((i2 & 1) != 0 ? null : objArr, (i2 & 4) != 0 ? new Pair(false, null) : pair, (i2 & 32) != 0 ? new LinkedHashSet() : set, (i2 & 64) != 0 ? new LinkedHashSet() : set2);
    }
}

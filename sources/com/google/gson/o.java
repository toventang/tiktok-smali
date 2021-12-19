package com.google.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.internal.g;
import java.util.Map;

public final class o extends l {

    /* renamed from: a  reason: collision with root package name */
    public final g<String, l> f54898a = new g<>();

    static {
        Covode.recordClassIndex(34060);
    }

    public final int hashCode() {
        return this.f54898a.hashCode();
    }

    /* renamed from: a */
    public final o i() {
        o oVar = new o();
        for (Map.Entry<String, l> entry : this.f54898a.entrySet()) {
            oVar.a(entry.getKey(), entry.getValue().i());
        }
        return oVar;
    }

    public final boolean b(String str) {
        return this.f54898a.containsKey(str);
    }

    private static l a(Object obj) {
        if (obj == null) {
            return n.f54897a;
        }
        return new r(obj);
    }

    public final l c(String str) {
        return this.f54898a.get(str);
    }

    public final r d(String str) {
        return (r) this.f54898a.get(str);
    }

    public final i e(String str) {
        return (i) this.f54898a.get(str);
    }

    public final o f(String str) {
        return (o) this.f54898a.get(str);
    }

    public final l a(String str) {
        return this.f54898a.remove(str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o) || !((o) obj).f54898a.equals(this.f54898a)) {
            return false;
        }
        return true;
    }

    public final void a(String str, Boolean bool) {
        a(str, a(bool));
    }

    public final void a(String str, l lVar) {
        if (lVar == null) {
            lVar = n.f54897a;
        }
        this.f54898a.put(str, lVar);
    }

    public final void a(String str, Character ch) {
        a(str, a(ch));
    }

    public final void a(String str, Number number) {
        a(str, a(number));
    }

    public final void a(String str, String str2) {
        a(str, a((Object) str2));
    }
}

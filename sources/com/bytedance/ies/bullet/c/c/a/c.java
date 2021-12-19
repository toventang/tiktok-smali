package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.q;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f31999a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f32000b;

    /* renamed from: c  reason: collision with root package name */
    public final q.a f32001c;

    /* renamed from: d  reason: collision with root package name */
    public final b<Throwable, z> f32002d;

    static {
        Covode.recordClassIndex(18726);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f31999a, cVar.f31999a) && l.a(this.f32000b, cVar.f32000b) && l.a(this.f32001c, cVar.f32001c) && l.a(this.f32002d, cVar.f32002d);
    }

    public final int hashCode() {
        String str = this.f31999a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.f32000b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        q.a aVar = this.f32001c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b<Throwable, z> bVar = this.f32002d;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "BridgeHandleUnit(funcName=" + this.f31999a + ", params=" + this.f32000b + ", callback=" + this.f32001c + ", reject=" + this.f32002d + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.Throwable, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(String str, Object obj, q.a aVar, b<? super Throwable, z> bVar) {
        l.c(str, "");
        l.c(obj, "");
        l.c(aVar, "");
        l.c(bVar, "");
        this.f31999a = str;
        this.f32000b = obj;
        this.f32001c = aVar;
        this.f32002d = bVar;
    }
}

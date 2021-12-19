package com.bytedance.helios.api.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.b.f;
import h.f.b.l;
import java.util.Map;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Thread f30706a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f30707b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30708c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, String> f30709d;

    static {
        Covode.recordClassIndex(17827);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f30706a, bVar.f30706a) && l.a(this.f30707b, bVar.f30707b) && l.a(this.f30708c, bVar.f30708c) && l.a(this.f30709d, bVar.f30709d);
    }

    public final int hashCode() {
        Thread thread = this.f30706a;
        int i2 = 0;
        int hashCode = (thread != null ? thread.hashCode() : 0) * 31;
        Throwable th = this.f30707b;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        String str = this.f30708c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Map<String, String> map = this.f30709d;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ExceptionEvent(thread=" + this.f30706a + ", e=" + this.f30707b + ", label=" + this.f30708c + ", data=" + this.f30709d + ")";
    }

    public b(Thread thread, Throwable th, String str, Map<String, String> map) {
        l.c(th, "");
        l.c(str, "");
        this.f30706a = thread;
        this.f30707b = th;
        this.f30708c = str;
        this.f30709d = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Thread thread, Throwable th, String str, Map map, int i2) {
        this((i2 & 1) != 0 ? null : thread, th, str, (i2 & 8) != 0 ? null : map);
    }
}

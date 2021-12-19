package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f26606a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f26607b;

    /* renamed from: c  reason: collision with root package name */
    public String f26608c;

    static {
        Covode.recordClassIndex(15667);
    }

    public final String toString() {
        return "CheckResult(code=" + this.f26607b + ", msg='" + this.f26608c + "', extraMap=" + this.f26606a + ')';
    }

    public final void a(String str, Object obj) {
        l.c(str, "");
        this.f26606a.put(str, obj);
    }

    public h(int i2, String str) {
        l.c(str, "");
        this.f26607b = i2;
        this.f26608c = str;
    }
}

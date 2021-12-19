package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f26600a;

    /* renamed from: b  reason: collision with root package name */
    public String[] f26601b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f26602c;

    /* renamed from: d  reason: collision with root package name */
    public l f26603d = new l();

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Object> f26604e = new LinkedHashMap();

    static {
        Covode.recordClassIndex(15665);
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("[entryToken:").append(this.f26600a).append(";entryDataTypes:");
        String[] strArr = this.f26601b;
        if (strArr != null) {
            str = Arrays.toString(strArr);
            l.a((Object) str, "");
        } else {
            str = null;
        }
        return append.append(str).append(";entryCategory:").append(this.f26602c).append(";entryExtraInfo:").append(this.f26604e).append(']').toString();
    }

    public final void a(String str, String str2) {
        l.c(str, "");
        this.f26604e.put(str, str2);
    }
}

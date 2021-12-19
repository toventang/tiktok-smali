package com.bytedance.frameworks.baselib.network.http.g;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f29377a;

    /* renamed from: b  reason: collision with root package name */
    public String f29378b;

    static {
        Covode.recordClassIndex(17126);
    }

    public final String toString() {
        return a();
    }

    public h() {
        this.f29377a = new LinkedHashMap();
        this.f29378b = null;
    }

    public final String a() {
        if (this.f29377a.isEmpty()) {
            return this.f29378b;
        }
        String a2 = i.a(this.f29377a, "UTF-8");
        String str = this.f29378b;
        if (str == null || str.length() == 0) {
            return a2;
        }
        if (this.f29378b.indexOf(63) >= 0) {
            return this.f29378b + "&" + a2;
        }
        return this.f29378b + "?" + a2;
    }

    public h(String str) {
        this.f29377a = new LinkedHashMap();
        this.f29378b = str;
    }

    public final void a(String str, int i2) {
        List<String> list = this.f29377a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(i2));
        this.f29377a.put(str, list);
    }

    public final void a(String str, long j2) {
        List<String> list = this.f29377a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(j2));
        this.f29377a.put(str, list);
    }

    public final void a(String str, String str2) {
        List<String> list = this.f29377a.get(str);
        if (list == null) {
            list = new LinkedList<>();
        }
        list.add(String.valueOf(str2));
        this.f29377a.put(str, list);
    }
}

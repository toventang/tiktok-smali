package com.toutiao.proxyserver.net;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f154930a;

    /* renamed from: b  reason: collision with root package name */
    public final String f154931b;

    static {
        Covode.recordClassIndex(103173);
    }

    public final String toString() {
        return "HttpHeader{name='" + this.f154930a + '\'' + ", value='" + this.f154931b + '\'' + '}';
    }

    public c(String str, String str2) {
        String trim = str.trim();
        String trim2 = str2.trim();
        if (trim.length() == 0 || trim2.length() == 0) {
            throw new IllegalArgumentException("name and value can't be empty");
        }
        this.f154930a = trim;
        this.f154931b = trim2;
    }
}

package com.google.b.a.d.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.d.a.a.a.a.a;
import com.google.b.a.d.h;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class c extends h {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f53571b;

    /* renamed from: c  reason: collision with root package name */
    private final a f53572c;

    /* renamed from: d  reason: collision with root package name */
    private final SSLSocketFactory f53573d;

    /* renamed from: e  reason: collision with root package name */
    private final HostnameVerifier f53574e;

    public c() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(33146);
        String[] strArr = {a.f28514d, "GET", "HEAD", a.f28515e, "POST", a.f28513c, "TRACE"};
        f53571b = strArr;
        Arrays.sort(strArr);
    }

    private c(byte b2) {
        this.f53572c = new b();
        this.f53573d = null;
        this.f53574e = null;
    }
}

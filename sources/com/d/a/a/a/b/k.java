package com.d.a.a.a.b;

import com.bytedance.covode.number.Covode;
import com.d.a.a.a.e.d;
import java.net.URL;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final String f46352a;

    /* renamed from: b  reason: collision with root package name */
    public final URL f46353b;

    /* renamed from: c  reason: collision with root package name */
    public final String f46354c;

    static {
        Covode.recordClassIndex(28308);
    }

    private k(String str, URL url, String str2) {
        this.f46352a = str;
        this.f46353b = url;
        this.f46354c = str2;
    }

    public static k a(String str, URL url, String str2) {
        d.a(str, "VendorKey is null or empty");
        d.a(url, "ResourceURL is null");
        d.a(str2, "VerificationParameters is null or empty");
        return new k(str, url, str2);
    }
}

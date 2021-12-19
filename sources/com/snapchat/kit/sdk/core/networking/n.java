package com.snapchat.kit.sdk.core.networking;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import okhttp3.CertificatePinner;

/* access modifiers changed from: package-private */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f57275a = Arrays.asList("sha256/1XUWswVGCeFUaI5FKrhY7R+dIrDXIzTtDy/WDGcjAoY=", "sha256/8ca6Zwz8iOTfUpc8rkIPCgid1HQUT+WAbEIAZOFZEik=", "sha256/uUwZgwDOxcBXrQcntwu+kYFpkiVkOaezL0WYEZ3anJc=", "sha256/I/Lt/z7ekCWanjD0Cvj5EqXls2lOaThEA0H2Bg4BT/o=", "sha256/Wd8xe/qfTwq3ylFNd3IpaqLHZbh2ZNCLluVzmeNkcpw=", "sha256/O4rGMvpV1NfGyWRRTZ6v92jubDQNBdwlK+E35oZJ9qo=", "sha256/i7WTqTvh0OioIruIfFR4kMPnBqrS2rdiVPl/s2uC/CY=", "sha256/WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=", "sha256/r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=", "sha256/Fe7TOVlLME+M+Ee0dzcdjW/sYfTbKwGvWJ58U7Ncrkw=");

    static {
        Covode.recordClassIndex(35801);
    }

    static synchronized CertificatePinner a() {
        synchronized (n.class) {
            MethodCollector.i(5090);
            CertificatePinner.Builder builder = new CertificatePinner.Builder();
            try {
                String host = Uri.parse("https://api.snapkit.com").getHost();
                if (TextUtils.isEmpty(host)) {
                    CertificatePinner build = builder.build();
                    MethodCollector.o(5090);
                    return build;
                }
                Iterator<String> it = f57275a.iterator();
                while (it.hasNext()) {
                    builder.add(host, it.next());
                }
                CertificatePinner build2 = builder.build();
                MethodCollector.o(5090);
                return build2;
            } catch (NullPointerException unused) {
                CertificatePinner build3 = builder.build();
                MethodCollector.o(5090);
                return build3;
            }
        }
    }
}

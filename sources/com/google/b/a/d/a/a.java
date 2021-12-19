package com.google.b.a.d.a;

import com.bytedance.covode.number.Covode;
import com.google.b.a.d.h;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class a extends h {

    /* renamed from: b  reason: collision with root package name */
    public final HttpClient f53569b;

    static {
        Covode.recordClassIndex(33142);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a() {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.b.a.d.a.a.<init>():void");
    }

    private a(HttpClient httpClient) {
        this.f53569b = httpClient;
        HttpParams params = httpClient.getParams();
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter("http.protocol.handle-redirects", false);
    }
}

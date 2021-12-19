package com.twitter.sdk.android.core;

import com.bytedance.covode.number.Covode;
import okhttp3.Headers;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public int f156190a;

    /* renamed from: b  reason: collision with root package name */
    public int f156191b;

    /* renamed from: c  reason: collision with root package name */
    public long f156192c;

    static {
        Covode.recordClassIndex(103738);
    }

    t(Headers headers) {
        if (headers != null) {
            for (int i2 = 0; i2 < headers.size(); i2++) {
                if ("x-rate-limit-limit".equals(headers.name(i2))) {
                    this.f156190a = Integer.valueOf(headers.value(i2)).intValue();
                } else if ("x-rate-limit-remaining".equals(headers.name(i2))) {
                    this.f156191b = Integer.valueOf(headers.value(i2)).intValue();
                } else if ("x-rate-limit-reset".equals(headers.name(i2))) {
                    this.f156192c = Long.valueOf(headers.value(i2)).longValue();
                }
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }
}

package com.twitter.sdk.android.core.internal;

import com.bytedance.covode.number.Covode;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final String f156021a;

    static {
        Covode.recordClassIndex(103662);
    }

    public q() {
        this("https://api.twitter.com");
    }

    private q(String str) {
        this.f156021a = str;
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt > 31 && charAt < 127) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}

package com.ss.android.ugc.aweme.metrics.a;

import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109467a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(70094);
    }

    public static final String a(String str, String str2) {
        if (str != null && str.length() != 0) {
            return str;
        }
        if (str2 == null || str2.length() == 0) {
            return "";
        }
        return str2;
    }
}

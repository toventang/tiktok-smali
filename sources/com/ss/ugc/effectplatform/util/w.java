package com.ss.ugc.effectplatform.util;

import com.bytedance.covode.number.Covode;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f153995a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(102692);
    }

    public static long a(String str) {
        long j2 = -1;
        if (str == null || str.length() == 0) {
            return -1;
        }
        try {
            j2 = Long.parseLong(str);
            return j2;
        } catch (Exception unused) {
            return j2;
        }
    }
}

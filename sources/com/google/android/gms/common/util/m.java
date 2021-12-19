package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f50515a = Pattern.compile("\\$\\{(.*?)\\}");

    static {
        Covode.recordClassIndex(31475);
    }

    public static boolean a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}

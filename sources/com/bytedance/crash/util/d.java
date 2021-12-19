package com.bytedance.crash.util;

import com.bytedance.covode.number.Covode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static DateFormat f27989a;

    /* renamed from: b  reason: collision with root package name */
    private static DateFormat f27990b;

    static {
        Covode.recordClassIndex(16376);
    }

    public static DateFormat a() {
        if (f27990b == null) {
            f27990b = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss", Locale.getDefault());
        }
        return f27990b;
    }
}

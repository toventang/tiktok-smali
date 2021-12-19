package com.bytedance.android.live.core.f;

import com.a;
import com.bytedance.covode.number.Covode;
import java.text.SimpleDateFormat;
import java.util.Locale;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static SimpleDateFormat f9063a = new SimpleDateFormat("HH:mm:ss");

    /* renamed from: b  reason: collision with root package name */
    private static SimpleDateFormat f9064b = new SimpleDateFormat("HH:mm:ss SSS");

    /* renamed from: c  reason: collision with root package name */
    private static SimpleDateFormat f9065c = new SimpleDateFormat("HH:mm:ss.SSS");

    static {
        Covode.recordClassIndex(4640);
    }

    public static String a(String str, Object... objArr) {
        try {
            return a.a(Locale.US, str, objArr);
        } catch (Exception unused) {
            return "";
        }
    }
}

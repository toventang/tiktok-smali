package com.google.firebase.installations;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.a.d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final long f54590a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f54591b = Pattern.compile("\\AA[\\w-]{38}\\z");

    o() {
    }

    public static long a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    static {
        Covode.recordClassIndex(33868);
    }

    public static boolean a(d dVar) {
        if (!TextUtils.isEmpty(dVar.c()) && dVar.f() + dVar.e() >= a() + f54590a) {
            return false;
        }
        return true;
    }
}

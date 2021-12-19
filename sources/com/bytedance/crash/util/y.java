package com.bytedance.crash.util;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final CharSequence f28021a = "amigo";

    /* renamed from: b  reason: collision with root package name */
    public static final CharSequence f28022b = "funtouch";

    /* renamed from: c  reason: collision with root package name */
    private static final CharSequence f28023c = "sony";

    static {
        Covode.recordClassIndex(16407);
    }

    public static boolean a() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }
}

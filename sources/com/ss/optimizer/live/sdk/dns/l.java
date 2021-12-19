package com.ss.optimizer.live.sdk.dns;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
public abstract class l implements Callable<k> {

    /* renamed from: b  reason: collision with root package name */
    private static Pattern f151763b;

    /* renamed from: a  reason: collision with root package name */
    protected final String f151764a;

    static {
        Covode.recordClassIndex(101219);
    }

    l(String str) {
        this.f151764a = str;
    }

    static boolean a(String str) {
        if (f151763b == null) {
            f151763b = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
        }
        if (TextUtils.isEmpty(str) || str.length() < 7 || str.length() > 15 || !f151763b.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}

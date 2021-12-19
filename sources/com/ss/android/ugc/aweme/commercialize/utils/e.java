package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Set<String> f75756a;

    /* renamed from: b  reason: collision with root package name */
    public static Set<Long> f75757b;

    /* renamed from: c  reason: collision with root package name */
    public static long f75758c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f75759d = new e();

    private e() {
    }

    public static final int a() {
        return f75756a.size() + 1;
    }

    public static final long b() {
        if (f75758c != 0) {
            return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - f75758c);
        }
        return -1;
    }

    static {
        Covode.recordClassIndex(46729);
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        l.b(synchronizedSet, "");
        f75756a = synchronizedSet;
        Set<Long> synchronizedSet2 = Collections.synchronizedSet(new LinkedHashSet());
        l.b(synchronizedSet2, "");
        f75757b = synchronizedSet2;
    }

    public static final void a(int i2) {
        if (i2 != 2) {
            f75756a.clear();
            f75757b.clear();
        }
    }
}

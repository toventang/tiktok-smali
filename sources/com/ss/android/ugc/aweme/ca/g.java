package com.ss.android.ugc.aweme.ca;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final List<Runnable> f69604a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final g f69605b = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(42939);
    }

    public static void a() {
        Iterator<T> it = f69604a.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        f69604a.clear();
    }

    public static void a(Runnable runnable) {
        l.d(runnable, "");
        f69604a.add(runnable);
    }
}

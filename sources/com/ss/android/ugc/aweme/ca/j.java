package com.ss.android.ugc.aweme.ca;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.bu;
import h.f.b.l;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<Runnable> f69612a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static int f69613b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static final j f69614c = new j();

    /* renamed from: d  reason: collision with root package name */
    private static final CopyOnWriteArrayList<Runnable> f69615d = new CopyOnWriteArrayList<>();

    private j() {
    }

    public static void c() {
        f69613b--;
    }

    public static boolean a() {
        if (bu.a() != 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(42944);
    }

    public static void b() {
        Iterator<T> it = f69615d.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        f69615d.clear();
    }

    private static void b(Runnable runnable) {
        l.d(runnable, "");
        f69615d.add(runnable);
    }

    private static void c(Runnable runnable) {
        l.d(runnable, "");
        f69612a.add(runnable);
    }

    public static void a(Runnable runnable) {
        l.d(runnable, "");
        if (bu.g()) {
            b(runnable);
        } else if (!bu.h() || f69613b == 0) {
            runnable.run();
        } else {
            c(runnable);
        }
    }
}

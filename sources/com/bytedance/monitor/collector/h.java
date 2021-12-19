package com.bytedance.monitor.collector;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.common.utility.i;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArrayList;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<a> f41518a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public static a f41519b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f41520c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f41521d = false;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f41522e;

    /* renamed from: f  reason: collision with root package name */
    private static Printer f41523f;

    /* renamed from: g  reason: collision with root package name */
    private static long f41524g = 0;

    /* renamed from: h  reason: collision with root package name */
    private static int f41525h = 0;

    public interface a {
        static {
            Covode.recordClassIndex(25417);
        }

        void a(long j2);
    }

    static {
        Covode.recordClassIndex(25415);
    }

    public static void a() {
        if (!o.f41576a && !f41522e) {
            f41522e = true;
            f41523f = new Printer() {
                /* class com.bytedance.monitor.collector.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25416);
                }

                public final void println(String str) {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.charAt(0) == '>') {
                            h.a(true, str);
                        } else if (str.charAt(0) == '<') {
                            h.a(false, str);
                        }
                    }
                }
            };
            i.a();
            i.a(f41523f);
        }
    }

    public static void a(a aVar) {
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f41518a;
        synchronized (copyOnWriteArrayList) {
            copyOnWriteArrayList.add(aVar);
        }
    }

    public static void a(boolean z, String str) {
        a aVar;
        a aVar2;
        long nanoTime = System.nanoTime();
        a.f41431b = nanoTime / 1000000;
        a.f41432c = SystemClock.currentThreadTimeMillis();
        if (z && (aVar2 = f41519b) != null && aVar2.a()) {
            f41519b.a(str);
        }
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f41518a;
        for (int i2 = 0; i2 < copyOnWriteArrayList.size(); i2++) {
            a aVar3 = copyOnWriteArrayList.get(i2);
            if (aVar3 == null || !aVar3.a()) {
                if (!z && aVar3.f41433d) {
                    aVar3.b("");
                }
            } else if (z) {
                if (!aVar3.f41433d) {
                    aVar3.a(str);
                }
            } else if (aVar3.f41433d) {
                aVar3.b(str);
            }
        }
        if (!z && (aVar = f41519b) != null && aVar.a()) {
            f41519b.b("");
        }
        if (f41521d) {
            f41524g += System.nanoTime() - nanoTime;
            int i3 = f41525h;
            f41525h = i3 + 1;
            if (i3 >= 1000) {
                if (f41520c != null) {
                    f41520c.a(f41524g);
                }
                f41525h = 0;
                f41524g = 0;
                f41521d = false;
            }
        }
    }
}

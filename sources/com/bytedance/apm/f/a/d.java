package com.bytedance.apm.f.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f24942a;

    /* renamed from: b  reason: collision with root package name */
    public static a f24943b = a.NONE;

    /* renamed from: c  reason: collision with root package name */
    public static long f24944c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f24945d;

    /* renamed from: e  reason: collision with root package name */
    public static String f24946e = "";

    /* renamed from: f  reason: collision with root package name */
    private static long f24947f = 8000;

    /* renamed from: g  reason: collision with root package name */
    private static ExecutorService f24948g;

    public enum a {
        NONE,
        SLEEP,
        NOT_SLEEP,
        DISK_SLEEP;

        static {
            Covode.recordClassIndex(14575);
        }
    }

    static {
        Covode.recordClassIndex(14573);
        AnonymousClass1 r2 = new ThreadFactory() {
            /* class com.bytedance.apm.f.a.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14574);
            }

            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("launch_sleep_detector");
                return thread;
            }
        };
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        a2.f79178g = r2;
        f24948g = g.a(a2.a());
    }
}

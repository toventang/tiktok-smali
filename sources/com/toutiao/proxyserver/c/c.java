package com.toutiao.proxyserver.c;

import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class c {

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f154807e;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<Map<String, a>> f154808a;

    /* renamed from: b  reason: collision with root package name */
    public final d f154809b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f154810c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingDeque());

    /* renamed from: d  reason: collision with root package name */
    public volatile SQLiteStatement f154811d;

    static {
        Covode.recordClassIndex(103113);
    }

    public final void b(final int i2) {
        Map<String, a> map = this.f154808a.get(i2);
        if (map != null) {
            map.clear();
        }
        this.f154810c.execute(new Runnable() {
            /* class com.toutiao.proxyserver.c.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(103115);
            }

            public final void run() {
                MethodCollector.i(12999);
                try {
                    c.this.f154809b.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i2)});
                    MethodCollector.o(12999);
                } catch (Throwable unused) {
                    MethodCollector.o(12999);
                }
            }
        });
    }

    public static c a(Context context) {
        MethodCollector.i(9449);
        if (f154807e == null) {
            synchronized (c.class) {
                try {
                    if (f154807e == null) {
                        f154807e = new c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9449);
                    throw th;
                }
            }
        }
        c cVar = f154807e;
        MethodCollector.o(9449);
        return cVar;
    }

    private c(Context context) {
        SparseArray<Map<String, a>> sparseArray = new SparseArray<>(2);
        this.f154808a = sparseArray;
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f154809b = new d(applicationContext);
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    public static String a(int i2) {
        if (i2 <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i2 << 1);
        sb.append("?");
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        if (r4 != null) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.toutiao.proxyserver.c.a a(java.lang.String r18, int r19) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.c.c.a(java.lang.String, int):com.toutiao.proxyserver.c.a");
    }
}

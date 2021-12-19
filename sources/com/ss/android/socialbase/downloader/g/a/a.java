package com.ss.android.socialbase.downloader.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.k.g;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f60497a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, c> f60498b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, d> f60499c;

    static {
        Covode.recordClassIndex(37391);
    }

    /* renamed from: com.ss.android.socialbase.downloader.g.a.a$a  reason: collision with other inner class name */
    public static final class C1331a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60500a = new a((byte) 0);

        static {
            Covode.recordClassIndex(37392);
        }
    }

    private a() {
        this.f60498b = new HashMap();
        this.f60499c = new LinkedHashMap(3);
        this.f60497a = 3;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final c a(String str, List<HttpHeader> list) {
        c remove;
        MethodCollector.i(13082);
        synchronized (this.f60498b) {
            try {
                remove = this.f60498b.remove(str);
            } catch (Throwable th) {
                MethodCollector.o(13082);
                throw th;
            }
        }
        if (remove != null) {
            if (g.a(remove.f60506a, list)) {
                try {
                    remove.c();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                if (System.currentTimeMillis() - remove.f60508c < b.f60504d && remove.f60510e) {
                    MethodCollector.o(13082);
                    return remove;
                }
            }
            try {
                remove.b();
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(13082);
        return null;
    }

    public final d b(String str, List<HttpHeader> list) {
        d remove;
        MethodCollector.i(13083);
        synchronized (this.f60499c) {
            try {
                remove = this.f60499c.remove(str);
            } catch (Throwable th) {
                MethodCollector.o(13083);
                throw th;
            }
        }
        if (remove != null) {
            if (g.a(remove.f60515b, list)) {
                try {
                    remove.e();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                if (System.currentTimeMillis() - remove.f60516c < b.f60503c && remove.f()) {
                    MethodCollector.o(13083);
                    return remove;
                }
            }
            try {
                remove.d();
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(13083);
        return null;
    }
}

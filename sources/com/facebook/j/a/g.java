package com.facebook.j.a;

import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

final class g {

    /* renamed from: a  reason: collision with root package name */
    public static g f48748a;

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<byte[]> f48749b = new ThreadLocal<byte[]>() {
        /* class com.facebook.j.a.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(29383);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final /* bridge */ /* synthetic */ byte[] initialValue() {
            return new byte[512];
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private static long f48750c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static f f48751d = new f();

    /* renamed from: e  reason: collision with root package name */
    private static a f48752e = new a();

    /* renamed from: f  reason: collision with root package name */
    private String f48753f;

    static {
        Covode.recordClassIndex(29382);
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            MethodCollector.i(1672);
            if (f48748a == null) {
                f48748a = new g("/proc/net/xt_qtaguid/stats");
            }
            gVar = f48748a;
            MethodCollector.o(1672);
        }
        return gVar;
    }

    private g(String str) {
        this.f48753f = str;
    }

    public final long a(int i2) {
        MethodCollector.i(1674);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        long j2 = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f48753f);
            f fVar = f48751d;
            fVar.f48744a = fileInputStream;
            fVar.f48746c = 0;
            fVar.f48745b = 0;
            byte[] bArr = f48749b.get();
            try {
                f48751d.a();
                while (true) {
                    int a2 = f48751d.a(bArr);
                    if (a2 == -1) {
                        break;
                    }
                    try {
                        a aVar = f48752e;
                        aVar.f48720a = bArr;
                        aVar.f48721b = 0;
                        aVar.f48722c = a2;
                        aVar.f48724e = false;
                        a aVar2 = f48752e;
                        aVar2.a();
                        aVar2.f48723d = ' ';
                        aVar2.f48724e = true;
                        f48752e.c();
                        if (!f48752e.a("lo")) {
                            f48752e.c();
                            if (f48752e.b() == i2) {
                                f48752e.c();
                                j2 += (long) f48752e.b();
                            }
                        }
                    } catch (NumberFormatException | NoSuchElementException unused) {
                    }
                }
                fileInputStream.close();
                long j3 = f48750c;
                if (j3 == -1) {
                    f48750c = j2;
                    return -1;
                }
                long j4 = j2 - j3;
                f48750c = j2;
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                MethodCollector.o(1674);
                return j4;
            } catch (Throwable th) {
                fileInputStream.close();
                MethodCollector.o(1674);
                throw th;
            }
        } catch (IOException unused2) {
            return -1;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            MethodCollector.o(1674);
        }
    }
}

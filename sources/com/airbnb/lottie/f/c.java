package com.airbnb.lottie.f;

import android.content.Context;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.l;
import com.airbnb.lottie.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5550a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5551b;

    /* renamed from: c  reason: collision with root package name */
    private final b f5552c;

    static {
        Covode.recordClassIndex(2315);
    }

    private m<e> b() {
        return new m<>(new Callable<l<e>>() {
            /* class com.airbnb.lottie.f.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(2316);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ l<e> call() {
                return c.this.a();
            }
        });
    }

    public final l<e> a() {
        l<e> a2;
        V v;
        MethodCollector.i(5059);
        androidx.core.g.e<a, InputStream> a3 = this.f5552c.a();
        if (a3 != null) {
            F f2 = a3.f2397a;
            S s = a3.f2398b;
            if (f2 == a.Zip) {
                a2 = f.a(new ZipInputStream(s), this.f5551b);
            } else {
                a2 = f.a(s, this.f5551b, true);
            }
            if (!(a2.f5748a == null || (v = a2.f5748a) == null)) {
                l<e> lVar = new l<>((e) v);
                MethodCollector.o(5059);
                return lVar;
            }
        }
        l<e> c2 = c();
        MethodCollector.o(5059);
        return c2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[Catch:{ IOException -> 0x019c }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097 A[Catch:{ IOException -> 0x019c }, LOOP:0: B:28:0x0091->B:30:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.airbnb.lottie.l<com.airbnb.lottie.e> c() {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.f.c.c():com.airbnb.lottie.l");
    }

    public static m<e> a(Context context, String str) {
        return new c(context, str).b();
    }

    public c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f5550a = applicationContext;
        this.f5551b = str;
        this.f5552c = new b(applicationContext, str);
    }
}

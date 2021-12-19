package com.bytedance.lynx.hybrid.resource.e;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.resource.d.e;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f41143a = new a();

    private a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.resource.e.a$a  reason: collision with other inner class name */
    public static final class CallableC1003a<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f41144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f41145b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41146c;

        static {
            Covode.recordClassIndex(25212);
        }

        CallableC1003a(e eVar, j jVar, String str) {
            this.f41144a = eVar;
            this.f41145b = jVar;
            this.f41146c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            a.a(this.f41144a, this.f41145b, false, this.f41146c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f41147a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f41148b;

        static {
            Covode.recordClassIndex(25213);
        }

        b(e eVar, j jVar) {
            this.f41147a = eVar;
            this.f41148b = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            a.a(this.f41147a, this.f41148b, true, null);
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(25211);
    }

    public static void a(e eVar, j jVar) {
        l.c(eVar, "");
        l.c(jVar, "");
        i.a(new b(eVar, jVar), i.f4824a);
    }

    public static void a(e eVar, j jVar, String str) {
        l.c(eVar, "");
        l.c(jVar, "");
        l.c(str, "");
        i.a(new CallableC1003a(eVar, jVar, str), i.f4824a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        if (r1 != 4) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.lynx.hybrid.resource.d.e r7, com.bytedance.lynx.hybrid.resource.config.j r8, boolean r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.e.a.a(com.bytedance.lynx.hybrid.resource.d.e, com.bytedance.lynx.hybrid.resource.config.j, boolean, java.lang.String):void");
    }
}

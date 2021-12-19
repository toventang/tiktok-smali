package com.ss.android.ugc.aweme.shortvideo.util;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.agilelogger.c.b;
import com.ss.android.agilelogger.e;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Set;

public final class bk {

    /* renamed from: a  reason: collision with root package name */
    public static final bk f132262a = new bk();

    /* renamed from: b  reason: collision with root package name */
    private static final h f132263b = i.a((h.f.a.a) a.f132266a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f132264c = i.a((h.f.a.a) c.f132268a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f132265d = i.a((h.f.a.a) b.f132267a);

    private static boolean a() {
        return ((Boolean) f132263b.getValue()).booleanValue();
    }

    private static Set<String> b() {
        return (Set) f132264c.getValue();
    }

    private static com.ss.android.agilelogger.b.a c() {
        return (com.ss.android.agilelogger.b.a) f132265d.getValue();
    }

    private bk() {
    }

    static final class b extends m implements h.f.a.a<com.ss.android.agilelogger.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f132267a = new b();

        static {
            Covode.recordClassIndex(86626);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.agilelogger.b.a invoke() {
            return new com.ss.android.agilelogger.b.a();
        }
    }

    static final class c extends m implements h.f.a.a<Set<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f132268a = new c();

        static {
            Covode.recordClassIndex(86627);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Set<String> invoke() {
            return a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0054 A[Catch:{ NameNotFoundException -> 0x0062 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.Set<java.lang.String> a() {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.bk.c.a():java.util.Set");
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f132266a = new a();

        static {
            Covode.recordClassIndex(86625);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(l.a((Object) "__ies_tools_android_opt_test__", (Object) d.s));
        }
    }

    static {
        Covode.recordClassIndex(86624);
    }

    public static final void a(int i2, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (!a()) {
            return;
        }
        if (!(!b().isEmpty()) || b().contains(str)) {
            Thread currentThread = Thread.currentThread();
            l.b(currentThread, "");
            e a2 = e.a(i2, str, "", currentThread.getId(), l.a(Looper.myLooper(), Looper.getMainLooper()));
            a2.f59116g = b.a.MSG;
            a2.f59117h = str2;
            c();
        }
    }
}

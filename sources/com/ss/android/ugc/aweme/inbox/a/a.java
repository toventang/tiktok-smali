package com.ss.android.ugc.aweme.inbox.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.a.b;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f104012a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final int f104013b = 1;

    /* renamed from: c  reason: collision with root package name */
    private static final int f104014c = 2;

    /* renamed from: d  reason: collision with root package name */
    private static final int f104015d = 3;

    /* renamed from: e  reason: collision with root package name */
    private static final int f104016e = 4;

    /* renamed from: f  reason: collision with root package name */
    private static final h f104017f = i.a((h.f.a.a) c.f104020a);

    public static int a() {
        return ((Number) f104017f.getValue()).intValue();
    }

    private a() {
    }

    public static b.a b() {
        b.a aVar = (b.a) b.f104022b.getValue();
        l.b(aVar, "");
        return aVar;
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f104020a = new c();

        static {
            Covode.recordClassIndex(66618);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "inbox_reverse_notification", 0));
        }
    }

    public static boolean c() {
        if (a() == f104013b || a() == f104014c || a() == f104016e) {
            return true;
        }
        return false;
    }

    public static boolean d() {
        if (a() == f104013b || a() == f104016e || a() == f104015d) {
            return true;
        }
        return false;
    }

    public static boolean e() {
        if (a() == f104013b || a() == f104014c) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(66615);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.a.a$a  reason: collision with other inner class name */
    public static final class C2644a extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2644a f104018a = new C2644a();

        static {
            Covode.recordClassIndex(66616);
        }

        C2644a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(b.a().contains(Integer.valueOf(num.intValue())));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<Integer, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104019a = new b();

        static {
            Covode.recordClassIndex(66617);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Integer num) {
            return Boolean.valueOf(a.b().f104025a.contains(Integer.valueOf(num.intValue())));
        }
    }

    public static void a(List<Integer> list) {
        l.d(list, "");
        int a2 = a();
        if (a2 == f104013b || a2 == f104016e) {
            list.clear();
        } else if (a2 == f104014c) {
            n.a((List) list, (h.f.a.b) C2644a.f104018a);
        } else if (a2 == f104015d) {
            n.a((List) list, (h.f.a.b) b.f104019a);
        }
    }

    public static boolean a(int i2) {
        if (a() == f104013b || a() == f104016e) {
            return true;
        }
        if (a() == f104015d && b().f104025a.contains(Integer.valueOf(i2))) {
            return true;
        }
        if (a() != f104014c || !b.a().contains(Integer.valueOf(i2))) {
            return false;
        }
        return true;
    }
}

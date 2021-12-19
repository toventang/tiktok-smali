package com.ss.android.ugc.aweme.geofencing.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.geofencing.api.TranslatedRegionApi;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static List<com.ss.android.ugc.aweme.geofencing.c.a> f99038a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public static final a f99039b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h.h f99040c = h.i.a((h.f.a.a) C2415a.f99041a);

    public static f.a.b.a a() {
        return (f.a.b.a) f99040c.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.b.a$a  reason: collision with other inner class name */
    static final class C2415a extends m implements h.f.a.a<f.a.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2415a f99041a = new C2415a();

        static {
            Covode.recordClassIndex(62970);
        }

        C2415a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f.a.b.a invoke() {
            return new f.a.b.a();
        }
    }

    static {
        Covode.recordClassIndex(62969);
    }

    public static void b() {
        if (f99038a.isEmpty()) {
            a().a(TranslatedRegionApi.a.a().getTranslatedRegions().c(f.f99046a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(g.f99047a).d(h.f99048a).e(i.f99049a));
        }
        b.a(f99038a);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f99042a = new b();

        static {
            Covode.recordClassIndex(62971);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.geofencing.c.b bVar = (com.ss.android.ugc.aweme.geofencing.c.b) obj;
            l.d(bVar, "");
            return bVar.f99051a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f99044a = new d();

        static {
            Covode.recordClassIndex(62973);
        }

        d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            return b.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f99045a = new e();

        static {
            Covode.recordClassIndex(62974);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            l.b(list, "");
            a.f99038a = n.g((Iterable) list);
        }
    }

    static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final f f99046a = new f();

        static {
            Covode.recordClassIndex(62975);
        }

        f() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.geofencing.c.b bVar = (com.ss.android.ugc.aweme.geofencing.c.b) obj;
            l.d(bVar, "");
            return bVar.f99051a;
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f99047a = new g();

        static {
            Covode.recordClassIndex(62976);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            l.b(list, "");
            b.a(n.g((Iterable) list));
        }
    }

    static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final h f99048a = new h();

        static {
            Covode.recordClassIndex(62977);
        }

        h() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            return b.a();
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f99049a = new i();

        static {
            Covode.recordClassIndex(62978);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            l.b(list, "");
            a.f99038a = n.g((Iterable) list);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f99043a;

        static {
            Covode.recordClassIndex(62972);
        }

        c(h.f.a.a aVar) {
            this.f99043a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            this.f99043a.invoke();
            l.b(list, "");
            b.a(n.g((Iterable) list));
        }
    }

    public static List<com.ss.android.ugc.aweme.geofencing.c.a> a(List<String> list) {
        if (list == null) {
            return z.INSTANCE;
        }
        List<com.ss.android.ugc.aweme.geofencing.c.a> a2 = b.a();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            ListIterator<com.ss.android.ugc.aweme.geofencing.c.a> listIterator = a2.listIterator(a2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                com.ss.android.ugc.aweme.geofencing.c.a previous = listIterator.previous();
                if (l.a((Object) previous.getCode(), (Object) t)) {
                    if (previous != null) {
                        arrayList.add(previous);
                    }
                }
            }
        }
        return arrayList;
    }

    public static void a(h.f.a.a<h.z> aVar) {
        l.d(aVar, "");
        if (!f99038a.isEmpty()) {
            aVar.invoke();
        } else {
            a().a(TranslatedRegionApi.a.a().getTranslatedRegions().c(b.f99042a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new c(aVar)).d(d.f99044a).e(e.f99045a));
        }
    }
}

package f.a.k;

import com.bytedance.covode.number.Covode;
import f.a.aa;
import f.a.e.g.o;
import f.a.e.g.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final aa f158004a;

    /* renamed from: b  reason: collision with root package name */
    public static final aa f158005b;

    /* renamed from: c  reason: collision with root package name */
    public static final aa f158006c;

    /* renamed from: d  reason: collision with root package name */
    public static final aa f158007d = p.f157912a;

    /* renamed from: e  reason: collision with root package name */
    public static final aa f158008e;

    static final class b implements Callable<aa> {
        static {
            Covode.recordClassIndex(104909);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ aa call() {
            return C4176a.f158009a;
        }
    }

    static final class c implements Callable<aa> {
        static {
            Covode.recordClassIndex(104910);
        }

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ aa call() {
            return d.f158010a;
        }
    }

    static final class f implements Callable<aa> {
        static {
            Covode.recordClassIndex(104913);
        }

        f() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ aa call() {
            return e.f158011a;
        }
    }

    static final class h implements Callable<aa> {
        static {
            Covode.recordClassIndex(104915);
        }

        h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ aa call() {
            return g.f158012a;
        }
    }

    /* renamed from: f.a.k.a$a  reason: collision with other inner class name */
    static final class C4176a {

        /* renamed from: a  reason: collision with root package name */
        static final aa f158009a = new f.a.e.g.b();

        static {
            Covode.recordClassIndex(104908);
        }
    }

    static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final aa f158010a = new f.a.e.g.f();

        static {
            Covode.recordClassIndex(104911);
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        static final aa f158011a = new f.a.e.g.g();

        static {
            Covode.recordClassIndex(104912);
        }
    }

    static final class g {

        /* renamed from: a  reason: collision with root package name */
        static final aa f158012a = new o();

        static {
            Covode.recordClassIndex(104914);
        }
    }

    static {
        aa a2;
        aa a3;
        aa a4;
        aa a5;
        Covode.recordClassIndex(104907);
        h hVar = new h();
        f.a.e.b.b.a((Object) hVar, "Scheduler Callable can't be null");
        f.a.d.g<? super Callable<aa>, ? extends aa> gVar = f.a.h.a.f157965d;
        if (gVar == null) {
            a2 = f.a.h.a.a(hVar);
        } else {
            a2 = f.a.h.a.a(gVar, (Callable<aa>) hVar);
        }
        f158004a = a2;
        b bVar = new b();
        f.a.e.b.b.a((Object) bVar, "Scheduler Callable can't be null");
        f.a.d.g<? super Callable<aa>, ? extends aa> gVar2 = f.a.h.a.f157964c;
        if (gVar2 == null) {
            a3 = f.a.h.a.a(bVar);
        } else {
            a3 = f.a.h.a.a(gVar2, (Callable<aa>) bVar);
        }
        f158005b = a3;
        c cVar = new c();
        f.a.e.b.b.a((Object) cVar, "Scheduler Callable can't be null");
        f.a.d.g<? super Callable<aa>, ? extends aa> gVar3 = f.a.h.a.f157966e;
        if (gVar3 == null) {
            a4 = f.a.h.a.a(cVar);
        } else {
            a4 = f.a.h.a.a(gVar3, (Callable<aa>) cVar);
        }
        f158006c = a4;
        f fVar = new f();
        f.a.e.b.b.a((Object) fVar, "Scheduler Callable can't be null");
        f.a.d.g<? super Callable<aa>, ? extends aa> gVar4 = f.a.h.a.f157967f;
        if (gVar4 == null) {
            a5 = f.a.h.a.a(fVar);
        } else {
            a5 = f.a.h.a.a(gVar4, (Callable<aa>) fVar);
        }
        f158008e = a5;
    }

    public static aa a(Executor executor) {
        return new f.a.e.g.d(executor);
    }
}

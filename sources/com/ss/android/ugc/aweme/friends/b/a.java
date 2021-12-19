package com.ss.android.ugc.aweme.friends.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.n;
import com.ss.android.ugc.aweme.experiment.fa;
import com.ss.android.ugc.aweme.friends.g;
import com.ss.android.ugc.aweme.friends.model.LocalContact;
import com.ss.android.ugc.aweme.recommend.f;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.r;
import h.z;
import java.security.MessageDigest;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cu;

public final class a implements n, g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f96820a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f96821b = i.a((h.f.a.a) C2334a.f96826a);

    /* renamed from: c  reason: collision with root package name */
    private static final MessageDigest f96822c = MessageDigest.getInstance("SHA-256");

    /* renamed from: d  reason: collision with root package name */
    private static boolean f96823d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f96824e;

    /* renamed from: f  reason: collision with root package name */
    private static final ConcurrentHashMap<String, LocalContact> f96825f = new ConcurrentHashMap<>();

    private a() {
    }

    @Override // com.ss.android.ugc.aweme.common.n
    public final boolean a() {
        return f96823d;
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.b.a$a  reason: collision with other inner class name */
    static final class C2334a extends m implements h.f.a.a<am> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2334a f96826a = new C2334a();

        static {
            Covode.recordClassIndex(61433);
        }

        C2334a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ am invoke() {
            return an.a(cu.a().plus(bf.f159041b));
        }
    }

    static {
        Covode.recordClassIndex(61432);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0064 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.common.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b() {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.b.a.b():java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.common.n
    public final LocalContact a(String str) {
        LocalContact localContact;
        MethodCollector.i(10728);
        l.d(str, "");
        synchronized (this) {
            try {
                localContact = f96825f.get(str);
            } finally {
                MethodCollector.o(10728);
            }
        }
        return localContact;
    }

    static final class b extends k implements h.f.a.m<am, d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(61434);
        }

        b(d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                a aVar2 = a.f96820a;
                this.label = 1;
                if (aVar2.b() == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.g
    public final void a(f fVar) {
        l.d(fVar, "");
        if (fVar == f.CONTACT && com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c() && fa.f90019a) {
            bz unused = kotlinx.coroutines.i.a((am) f96821b.getValue(), bf.f159041b, null, new b(null), 2);
            com.ss.android.ugc.aweme.friends.service.a.f97047a.b(this);
        }
    }
}

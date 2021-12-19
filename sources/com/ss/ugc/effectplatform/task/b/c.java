package com.ss.ugc.effectplatform.task.b;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.a.c.f;
import com.ss.ugc.effectplatform.util.k;
import d.a.d.a.g;
import d.a.d.a.j;
import h.f.a.m;
import h.f.b.ab;
import h.f.b.i;
import h.f.b.l;
import h.m.p;
import h.z;

public final class c implements d.a.f.c<f, String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f153793b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f153794a = null;

    /* renamed from: c  reason: collision with root package name */
    private final String f153795c;

    /* renamed from: d  reason: collision with root package name */
    private final String f153796d;

    /* renamed from: e  reason: collision with root package name */
    private String f153797e;

    static {
        Covode.recordClassIndex(102578);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102579);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class b extends i implements m<Integer, Long, z> {
        static {
            Covode.recordClassIndex(102580);
        }

        b(c cVar) {
            super(2, cVar);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "onProgress";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "onProgress(IJ)V";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(c.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Long l2) {
            ((c) this.receiver).a(num.intValue(), l2.longValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ugc.effectplatform.task.b.c$c  reason: collision with other inner class name */
    public static final /* synthetic */ class C4095c extends i implements m<Integer, Long, z> {
        static {
            Covode.recordClassIndex(102581);
        }

        C4095c(c cVar) {
            super(2, cVar);
        }

        @Override // h.f.b.c, h.k.b
        public final String getName() {
            return "onProgress";
        }

        @Override // h.f.b.c
        public final String getSignature() {
            return "onProgress(IJ)V";
        }

        @Override // h.f.b.c
        public final h.k.d getOwner() {
            return ab.a(c.class);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, Long l2) {
            ((c) this.receiver).a(num.intValue(), l2.longValue());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: private */
    public String a(f fVar) {
        g gVar;
        boolean z;
        l.c(fVar, "");
        if (!d.a.d.a.d.f(this.f153795c)) {
            d.a.d.a.d.e(this.f153795c);
        }
        String a2 = k.a(this.f153796d, "_tmp");
        com.ss.ugc.effectplatform.e.b bVar = new com.ss.ugc.effectplatform.e.b(fVar.f153441b);
        if (a2 != null) {
            if (d.a.d.a.d.f(a2)) {
                d.a.d.a.d.g(a2);
            }
            gVar = d.a.d.a.d.a(a2, false);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            String str = this.f153797e;
            if (str == null || p.a((CharSequence) str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                k.a(bVar, gVar, fVar.f153442c, new b(this));
                d.a.d.a.d.a((d.a.d.a.k) bVar);
                if (k.a(a2, this.f153796d, false)) {
                    return this.f153796d;
                }
                d.a.e.b.a("FileWriterPipeLine", "file rename failed", null);
                throw new j("FileWriter error");
            }
            String b2 = k.b(bVar, gVar, fVar.f153442c, new C4095c(this));
            d.a.d.a.d.a((d.a.d.a.k) bVar);
            if (l.a((Object) b2, (Object) this.f153797e) && k.a(a2, this.f153796d, false)) {
                return this.f153796d;
            }
            d.a.e.b.a("FileWriterPipeLine", "md5 check failed", null);
            throw new com.ss.ugc.effectplatform.f.c("MD5 not match");
        }
        throw new j("FileWriter error");
    }

    public final void a(int i2, long j2) {
        d.a.g.f.a(new d(this, i2, j2));
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f153798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f153799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f153800c;

        static {
            Covode.recordClassIndex(102582);
        }

        public final void run() {
        }

        d(c cVar, int i2, long j2) {
            this.f153798a = cVar;
            this.f153799b = i2;
            this.f153800c = j2;
        }
    }

    public c(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        this.f153795c = str;
        this.f153796d = str2;
        this.f153797e = str3;
    }
}

package com.ss.android.ugc.aweme.filter.repository.internal.main;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.a.p;
import com.ss.android.ugc.aweme.filter.repository.internal.e;
import com.ss.android.ugc.aweme.filter.repository.internal.f;
import com.ss.android.ugc.aweme.filter.repository.internal.i;
import com.ss.android.ugc.aweme.filter.repository.internal.j;
import com.ss.android.ugc.aweme.filter.repository.internal.l;
import com.ss.android.ugc.aweme.filter.repository.internal.m;
import com.ss.android.ugc.tools.b.a.d;
import java.io.File;

public final class h implements p {

    /* renamed from: a  reason: collision with root package name */
    public q<l> f95688a;

    /* renamed from: b  reason: collision with root package name */
    public q<e> f95689b;

    /* renamed from: c  reason: collision with root package name */
    public q<com.ss.android.ugc.tools.h.a.l> f95690c;

    /* renamed from: d  reason: collision with root package name */
    public q<j> f95691d;

    /* renamed from: e  reason: collision with root package name */
    public q<m> f95692e;

    /* renamed from: f  reason: collision with root package name */
    private q<com.ss.android.ugc.aweme.filter.repository.internal.h> f95693f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f95694g;

    /* renamed from: h  reason: collision with root package name */
    private Boolean f95695h;

    /* renamed from: i  reason: collision with root package name */
    private q<i> f95696i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f95697j;

    /* renamed from: k  reason: collision with root package name */
    private final q<d> f95698k;

    /* renamed from: l  reason: collision with root package name */
    private final q<String> f95699l;

    static {
        Covode.recordClassIndex(60640);
    }

    public static final class a implements q<com.ss.android.ugc.tools.h.a.l> {

        /* renamed from: a  reason: collision with root package name */
        private final h.h f95700a = h.i.a((h.f.a.a) C2310a.f95701a);

        static {
            Covode.recordClassIndex(60641);
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.h$a$a  reason: collision with other inner class name */
        static final class C2310a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.tools.h.b.a.h> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2310a f95701a = new C2310a();

            static {
                Covode.recordClassIndex(60642);
            }

            C2310a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.ss.android.ugc.tools.h.b.a.h invoke() {
                return new com.ss.android.ugc.tools.h.b.a.h();
            }
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.c.a.q
        public final /* synthetic */ com.ss.android.ugc.tools.h.a.l b() {
            return (com.ss.android.ugc.tools.h.b.a.h) this.f95700a.getValue();
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.p
    public final o a() {
        l lVar;
        e eVar;
        int i2;
        com.ss.android.ugc.aweme.filter.repository.internal.h hVar;
        i iVar;
        boolean z;
        q<l> qVar = this.f95688a;
        if (qVar == null || (lVar = qVar.b()) == null) {
            String absolutePath = new File(com.ss.android.ugc.tools.utils.i.b(this.f95697j), "filters").getAbsolutePath();
            h.f.b.l.b(absolutePath, "");
            lVar = new e(new d(absolutePath));
        }
        q<m> qVar2 = this.f95692e;
        if (qVar2 != null) {
            m b2 = qVar2.b();
            h.f.b.l.b(b2, "");
            lVar.a(b2);
        }
        q<e> qVar3 = this.f95689b;
        if (qVar3 == null || (eVar = qVar3.b()) == null) {
            eVar = f.f95590a;
        }
        q qVar4 = this.f95690c;
        if (qVar4 == null) {
            qVar4 = new a();
        }
        Integer num = this.f95694g;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 3;
        }
        com.ss.android.ugc.aweme.filter.repository.internal.a.a aVar = new com.ss.android.ugc.aweme.filter.repository.internal.a.a(lVar, eVar, qVar4, i2);
        q<j> qVar5 = this.f95691d;
        if (qVar5 != null) {
            j b3 = qVar5.b();
            h.f.b.l.b(b3, "");
            j jVar = b3;
            h.f.b.l.d(jVar, "");
            aVar.f95564c = jVar;
        }
        f fVar = new f(eVar, aVar, lVar);
        q<com.ss.android.ugc.aweme.filter.repository.internal.h> qVar6 = this.f95693f;
        if (qVar6 == null || (hVar = qVar6.b()) == null) {
            hVar = new c(new j(eVar), new k(this.f95698k, this.f95699l));
        }
        q<i> qVar7 = this.f95696i;
        if (qVar7 == null || (iVar = qVar7.b()) == null) {
            iVar = new i();
        }
        Boolean bool = this.f95695h;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        return new g(lVar, aVar, eVar, hVar, fVar, iVar, z);
    }

    public h(Context context, q<d> qVar, q<String> qVar2) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(qVar, "");
        h.f.b.l.d(qVar2, "");
        this.f95697j = context;
        this.f95698k = qVar;
        this.f95699l = qVar2;
    }
}

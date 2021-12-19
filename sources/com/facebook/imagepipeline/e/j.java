package com.facebook.imagepipeline.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.k;
import com.facebook.common.g.h;
import com.facebook.common.g.i;
import com.facebook.common.l.b;
import com.facebook.imagepipeline.d.f;
import com.facebook.imagepipeline.d.p;
import com.facebook.imagepipeline.e.i;
import com.facebook.imagepipeline.g.e;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f47888a;

    /* renamed from: b  reason: collision with root package name */
    public final b.a f47889b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f47890c;

    /* renamed from: d  reason: collision with root package name */
    public final com.facebook.common.l.b f47891d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f47892e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f47893f;

    /* renamed from: g  reason: collision with root package name */
    public final int f47894g;

    /* renamed from: h  reason: collision with root package name */
    public final int f47895h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f47896i;

    /* renamed from: j  reason: collision with root package name */
    public final int f47897j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f47898k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f47899l;

    /* renamed from: m  reason: collision with root package name */
    public final c f47900m;
    public final k<Boolean> n;
    public final boolean o;
    public final boolean p;

    public interface c {
        static {
            Covode.recordClassIndex(28990);
        }

        m a(Context context, com.facebook.common.g.a aVar, com.facebook.imagepipeline.g.c cVar, e eVar, boolean z, boolean z2, boolean z3, e eVar2, i iVar, p<com.facebook.c.a.e, com.facebook.imagepipeline.j.c> pVar, p<com.facebook.c.a.e, h> pVar2, com.facebook.imagepipeline.d.e eVar3, com.facebook.imagepipeline.d.e eVar4, f fVar, com.facebook.imagepipeline.c.f fVar2, int i2, int i3, boolean z4, int i4);
    }

    static {
        Covode.recordClassIndex(28987);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f47901a;

        /* renamed from: b  reason: collision with root package name */
        public b.a f47902b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f47903c;

        /* renamed from: d  reason: collision with root package name */
        public com.facebook.common.l.b f47904d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f47905e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f47906f;

        /* renamed from: g  reason: collision with root package name */
        public int f47907g;

        /* renamed from: h  reason: collision with root package name */
        public int f47908h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f47909i;

        /* renamed from: j  reason: collision with root package name */
        public int f47910j = 2048;

        /* renamed from: k  reason: collision with root package name */
        public boolean f47911k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f47912l;

        /* renamed from: m  reason: collision with root package name */
        public c f47913m;
        public k<Boolean> n;
        public boolean o;
        public boolean p;
        private final i.a q;

        static {
            Covode.recordClassIndex(28988);
        }

        public final i.a a() {
            this.p = true;
            return this.q;
        }

        public a(i.a aVar) {
            this.q = aVar;
        }
    }

    private j(a aVar) {
        this.f47888a = aVar.f47901a;
        this.f47889b = aVar.f47902b;
        this.f47890c = aVar.f47903c;
        this.f47891d = aVar.f47904d;
        this.f47892e = aVar.f47905e;
        this.f47893f = aVar.f47906f;
        this.f47894g = aVar.f47907g;
        this.f47895h = aVar.f47908h;
        this.f47896i = aVar.f47909i;
        this.f47897j = aVar.f47910j;
        this.f47898k = aVar.f47911k;
        this.f47899l = aVar.f47912l;
        if (aVar.f47913m == null) {
            this.f47900m = new b();
        } else {
            this.f47900m = aVar.f47913m;
        }
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
    }

    /* synthetic */ j(a aVar, byte b2) {
        this(aVar);
    }

    public static class b implements c {
        static {
            Covode.recordClassIndex(28989);
        }

        @Override // com.facebook.imagepipeline.e.j.c
        public final m a(Context context, com.facebook.common.g.a aVar, com.facebook.imagepipeline.g.c cVar, e eVar, boolean z, boolean z2, boolean z3, e eVar2, com.facebook.common.g.i iVar, p<com.facebook.c.a.e, com.facebook.imagepipeline.j.c> pVar, p<com.facebook.c.a.e, h> pVar2, com.facebook.imagepipeline.d.e eVar3, com.facebook.imagepipeline.d.e eVar4, f fVar, com.facebook.imagepipeline.c.f fVar2, int i2, int i3, boolean z4, int i4) {
            return new m(context, aVar, cVar, eVar, z, z2, z3, eVar2, iVar, pVar, pVar2, eVar3, eVar4, fVar, fVar2, i2, i3, z4, i4);
        }
    }
}

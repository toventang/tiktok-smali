package com.facebook.drawee.a.a;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.k;
import com.facebook.common.h.a;
import com.facebook.drawee.c.b;
import com.facebook.drawee.c.d;
import com.facebook.imagepipeline.e.h;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.f;
import com.facebook.imagepipeline.o.b;
import java.util.Set;

public class e extends b<e, com.facebook.imagepipeline.o.b, a<c>, f> {
    private final h n;
    private final g o;
    private com.facebook.common.d.e<com.facebook.imagepipeline.h.a> p;
    private com.facebook.drawee.a.a.b.b q;
    private com.facebook.drawee.a.a.b.f r;

    static {
        Covode.recordClassIndex(28736);
    }

    /* renamed from: com.facebook.drawee.a.a.e$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47273a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 28737(0x7041, float:4.0269E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.facebook.drawee.c.b$a[] r0 = com.facebook.drawee.c.b.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.facebook.drawee.a.a.e.AnonymousClass1.f47273a = r2
                com.facebook.drawee.c.b$a r0 = com.facebook.drawee.c.b.a.FULL_FETCH     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.facebook.drawee.a.a.e.AnonymousClass1.f47273a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.facebook.drawee.c.b$a r0 = com.facebook.drawee.c.b.a.DISK_CACHE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.facebook.drawee.a.a.e.AnonymousClass1.f47273a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.facebook.drawee.c.b$a r0 = com.facebook.drawee.c.b.a.BITMAP_MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.a.a.e.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public d a() {
        d dVar;
        com.facebook.imagepipeline.p.b.a();
        try {
            com.facebook.drawee.h.a aVar = this.f47325m;
            String d2 = d();
            if (aVar instanceof d) {
                dVar = (d) aVar;
            } else {
                g gVar = this.o;
                dVar = new d(gVar.f47278a, gVar.f47279b, gVar.f47280c, gVar.f47281d, gVar.f47282e, gVar.f47283f);
                if (gVar.f47284g != null) {
                    dVar.f47271d = gVar.f47284g.b().booleanValue();
                }
            }
            k<com.facebook.d.c<a<c>>> a2 = a(dVar, d2);
            REQUEST request = this.f47315c;
            com.facebook.imagepipeline.d.f fVar = this.n.f47839d;
            com.facebook.c.a.e eVar = null;
            if (!(fVar == null || request == null)) {
                eVar = request.mPostprocessor != null ? fVar.b(request, this.f47314b) : fVar.a(request, this.f47314b);
            }
            dVar.a(a2, d2, eVar, this.f47314b, this.p, this.q);
            dVar.a(this.r);
            return dVar;
        } finally {
            com.facebook.imagepipeline.p.b.a();
        }
    }

    /* renamed from: a */
    public final e b(Uri uri) {
        if (uri == null) {
            this.f47315c = null;
            return this;
        }
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(uri);
        a2.f48448e = com.facebook.imagepipeline.common.e.f47753d;
        this.f47315c = (REQUEST) a2.a();
        return this;
    }

    public final e a(String str) {
        if (str != null && !str.isEmpty()) {
            return b(Uri.parse(str));
        }
        this.f47315c = (REQUEST) com.facebook.imagepipeline.o.b.fromUri(str);
        return this;
    }

    public e(Context context, g gVar, h hVar, Set<d> set) {
        super(context, set);
        this.n = hVar;
        this.o = gVar;
    }

    /* Return type fixed from 'com.facebook.d.c' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.facebook.drawee.h.a, java.lang.Object, java.lang.Object, com.facebook.drawee.c.b$a] */
    @Override // com.facebook.drawee.c.b
    public final /* synthetic */ com.facebook.d.c<a<c>> a(com.facebook.drawee.h.a aVar, com.facebook.imagepipeline.o.b bVar, Object obj, b.a aVar2) {
        b.EnumC1183b bVar2;
        com.facebook.imagepipeline.k.c cVar;
        com.facebook.imagepipeline.o.b bVar3 = bVar;
        h hVar = this.n;
        int i2 = AnonymousClass1.f47273a[aVar2.ordinal()];
        if (i2 == 1) {
            bVar2 = b.EnumC1183b.FULL_FETCH;
        } else if (i2 == 2) {
            bVar2 = b.EnumC1183b.DISK_CACHE;
        } else if (i2 == 3) {
            bVar2 = b.EnumC1183b.BITMAP_MEMORY_CACHE;
        } else {
            throw new RuntimeException("Cache level" + aVar2 + "is not supported. ");
        }
        if (aVar instanceof d) {
            cVar = ((d) aVar).a();
        } else {
            cVar = null;
        }
        return hVar.a(bVar3, obj, bVar2, cVar);
    }
}

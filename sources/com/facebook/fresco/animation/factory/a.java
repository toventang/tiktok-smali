package com.facebook.fresco.animation.factory;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.e;
import com.facebook.common.d.k;
import com.facebook.imagepipeline.a.c.b;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.d.h;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.g;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public class a implements com.facebook.imagepipeline.h.a {

    /* renamed from: a  reason: collision with root package name */
    private final b f47590a;

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f47591b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f47592c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.time.b f47593d;

    /* renamed from: e  reason: collision with root package name */
    private final f f47594e;

    /* renamed from: f  reason: collision with root package name */
    private final h<e, c> f47595f;

    /* renamed from: g  reason: collision with root package name */
    private final k<Integer> f47596g;

    /* renamed from: h  reason: collision with root package name */
    private final k<Integer> f47597h;

    static {
        Covode.recordClassIndex(28860);
    }

    /* renamed from: com.facebook.fresco.animation.factory.a$a  reason: collision with other inner class name */
    public static class C1177a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final String f47598a;

        static {
            Covode.recordClassIndex(28861);
        }

        @Override // com.facebook.c.a.e
        public final String a() {
            return this.f47598a;
        }

        @Override // com.facebook.c.a.e
        public final String toString() {
            return this.f47598a;
        }

        @Override // com.facebook.c.a.e
        public final int hashCode() {
            String str = this.f47598a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public C1177a(int i2) {
            this.f47598a = "anim://".concat(String.valueOf(i2));
        }

        @Override // com.facebook.c.a.e
        public final boolean a(Uri uri) {
            return uri.toString().startsWith(this.f47598a);
        }

        @Override // com.facebook.c.a.e
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                String str = this.f47598a;
                String str2 = ((C1177a) obj).f47598a;
                if (str != null) {
                    return str.equals(str2);
                }
                if (str2 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.facebook.imagepipeline.h.a
    public final boolean a(c cVar) {
        return cVar instanceof com.facebook.imagepipeline.j.a;
    }

    private com.facebook.imagepipeline.a.c.c a(com.facebook.imagepipeline.a.a.e eVar) {
        com.facebook.imagepipeline.a.c.c cVar = new com.facebook.imagepipeline.a.c.c(new C1177a(eVar.hashCode()), this.f47595f);
        int c2 = eVar.c();
        if (c2 > 0) {
            int i2 = 0;
            do {
                if (eVar.b(i2)) {
                    com.facebook.common.h.a<c> aVar = null;
                    try {
                        aVar = com.facebook.common.h.a.a(new d(eVar.a(i2), g.f48000a));
                        cVar.a(i2, aVar);
                    } finally {
                        com.facebook.common.h.a.c(aVar);
                    }
                }
                i2++;
            } while (i2 < c2);
        }
        return cVar;
    }

    @Override // com.facebook.imagepipeline.h.a
    public final /* synthetic */ Drawable b(c cVar) {
        com.facebook.fresco.animation.b.b aVar;
        com.facebook.fresco.animation.b.b.d dVar;
        com.facebook.fresco.animation.b.b.c cVar2;
        com.facebook.imagepipeline.j.a aVar2 = (com.facebook.imagepipeline.j.a) cVar;
        com.facebook.imagepipeline.a.a.e d2 = aVar2.d();
        com.facebook.imagepipeline.a.a.c cVar3 = d2.f47649a;
        com.facebook.imagepipeline.a.a.a a2 = this.f47590a.a(d2, new Rect(0, 0, cVar3.getWidth(), cVar3.getHeight()));
        int intValue = this.f47596g.b().intValue();
        if (intValue == 1) {
            aVar = new com.facebook.fresco.animation.b.a.a(a(d2), true);
        } else if (intValue == 2) {
            aVar = new com.facebook.fresco.animation.b.a.a(a(d2), false);
        } else if (intValue != 3) {
            aVar = new com.facebook.fresco.animation.b.a.c();
        } else {
            aVar = new com.facebook.fresco.animation.b.a.b();
        }
        com.facebook.fresco.animation.b.c.b bVar = new com.facebook.fresco.animation.b.c.b(aVar, a2);
        int i2 = aVar2.f47982a.f47737d;
        if (i2 <= 0) {
            i2 = this.f47597h.b().intValue();
            dVar = null;
            if (i2 <= 0) {
                cVar2 = null;
                com.facebook.fresco.animation.b.a aVar3 = new com.facebook.fresco.animation.b.a(this.f47594e, aVar, new com.facebook.fresco.animation.b.c.a(a2), bVar, dVar, cVar2);
                aVar3.f47521b = aVar2.f47982a.f47742i;
                return new com.facebook.fresco.animation.c.a(new com.facebook.fresco.animation.a.c(aVar3, aVar3, this.f47593d, this.f47591b), aVar2.f47982a.f47745l);
            }
        }
        dVar = new com.facebook.fresco.animation.b.b.d(i2);
        cVar2 = new com.facebook.fresco.animation.b.b.c(this.f47594e, bVar, aVar2.f47982a.f47742i, this.f47592c);
        com.facebook.fresco.animation.b.a aVar32 = new com.facebook.fresco.animation.b.a(this.f47594e, aVar, new com.facebook.fresco.animation.b.c.a(a2), bVar, dVar, cVar2);
        aVar32.f47521b = aVar2.f47982a.f47742i;
        return new com.facebook.fresco.animation.c.a(new com.facebook.fresco.animation.a.c(aVar32, aVar32, this.f47593d, this.f47591b), aVar2.f47982a.f47745l);
    }

    public a(b bVar, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, com.facebook.common.time.b bVar2, f fVar, h<e, c> hVar, k<Integer> kVar, k<Integer> kVar2) {
        this.f47590a = bVar;
        this.f47591b = scheduledExecutorService;
        this.f47592c = executorService;
        this.f47593d = bVar2;
        this.f47594e = fVar;
        this.f47595f = hVar;
        this.f47596g = kVar;
        this.f47597h = kVar2;
    }
}

package com.facebook.imagepipeline.a.b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import com.facebook.common.g.h;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.a.c.b;
import com.facebook.imagepipeline.a.c.d;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.g;
import java.util.ArrayList;
import java.util.List;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    static c f47659a = a("com.facebook.animated.gif.GifImage");

    /* renamed from: b  reason: collision with root package name */
    static c f47660b = a("com.facebook.animated.webp.WebPImage");

    /* renamed from: c  reason: collision with root package name */
    private final b f47661c;

    /* renamed from: d  reason: collision with root package name */
    private final f f47662d;

    static {
        Covode.recordClassIndex(28893);
    }

    private static c a(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public e(b bVar, f fVar) {
        this.f47661c = bVar;
        this.f47662d = fVar;
    }

    @Override // com.facebook.imagepipeline.a.b.d
    public final c a(com.facebook.imagepipeline.j.e eVar, com.facebook.imagepipeline.common.b bVar) {
        com.facebook.imagepipeline.a.a.c decode;
        if (f47659a != null) {
            a b2 = a.b(eVar.f47989a);
            i.a(b2);
            try {
                h hVar = (h) b2.a();
                if (hVar.c() != null) {
                    decode = f47659a.decode(hVar.c());
                } else {
                    decode = f47659a.decode(hVar.b(), hVar.a());
                }
                return a(bVar, decode);
            } finally {
                a.c(b2);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }

    private c a(com.facebook.imagepipeline.common.b bVar, com.facebook.imagepipeline.a.a.c cVar) {
        final List<a<Bitmap>> list;
        Throwable th;
        a<Bitmap> aVar = null;
        try {
            int frameCount = bVar.f47738e ? cVar.getFrameCount() - 1 : 0;
            if (bVar.f47740g) {
                d dVar = new d(a(cVar, bVar.f47742i, frameCount), g.f48000a);
                a.c(null);
                a.a((Iterable<? extends a<?>>) null);
                return dVar;
            }
            if (bVar.f47739f) {
                Bitmap.Config config = bVar.f47742i;
                com.facebook.imagepipeline.a.a.a a2 = this.f47661c.a(com.facebook.imagepipeline.a.a.e.a(cVar), null);
                list = new ArrayList<>(a2.a());
                com.facebook.imagepipeline.a.c.d dVar2 = new com.facebook.imagepipeline.a.c.d(a2, new d.a() {
                    /* class com.facebook.imagepipeline.a.b.e.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(28895);
                    }

                    @Override // com.facebook.imagepipeline.a.c.d.a
                    public final a<Bitmap> a(int i2) {
                        return a.b((a) list.get(i2));
                    }
                });
                for (int i2 = 0; i2 < a2.a(); i2++) {
                    a<Bitmap> a3 = a(a2.c(), a2.d(), config);
                    dVar2.a(i2, a3.a());
                    list.add(a3);
                }
                try {
                    if (list.size() > frameCount) {
                        aVar = a.b(list.get(frameCount));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a.c(null);
                    a.a((Iterable<? extends a<?>>) list);
                    throw th;
                }
            } else if (bVar.f47737d > 0) {
                list = b(cVar, bVar.f47742i, bVar.f47737d);
                try {
                    if (list.size() > frameCount) {
                        aVar = a.b(list.get(frameCount));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a.c(null);
                    a.a((Iterable<? extends a<?>>) list);
                    throw th;
                }
            } else {
                list = null;
            }
            if (bVar.f47736c && aVar == null) {
                aVar = a(cVar, bVar.f47742i, frameCount);
            }
            com.facebook.imagepipeline.a.a.f fVar = new com.facebook.imagepipeline.a.a.f(cVar);
            fVar.f47654b = a.b(aVar);
            fVar.f47656d = frameCount;
            com.facebook.imagepipeline.j.a aVar2 = new com.facebook.imagepipeline.j.a(fVar.a(list).a(), bVar);
            a.c(aVar);
            a.a((Iterable<? extends a<?>>) list);
            return aVar2;
        } catch (Throwable th4) {
            th = th4;
            list = null;
            a.c(null);
            a.a((Iterable<? extends a<?>>) list);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.a.b.d
    public final c b(com.facebook.imagepipeline.j.e eVar, com.facebook.imagepipeline.common.b bVar) {
        com.facebook.imagepipeline.a.a.c decode;
        if (f47660b != null) {
            a b2 = a.b(eVar.f47989a);
            i.a(b2);
            try {
                h hVar = (h) b2.a();
                if (hVar.c() != null) {
                    decode = f47660b.decode(hVar.c());
                } else {
                    decode = f47660b.decode(hVar.b(), hVar.a());
                }
                return a(bVar, decode);
            } finally {
                a.c(b2);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }

    private a<Bitmap> a(int i2, int i3, Bitmap.Config config) {
        a<Bitmap> a2 = this.f47662d.a(i2, i3, config);
        a2.a().eraseColor(0);
        int i4 = Build.VERSION.SDK_INT;
        a2.a().setHasAlpha(true);
        return a2;
    }

    private a<Bitmap> a(com.facebook.imagepipeline.a.a.c cVar, Bitmap.Config config, int i2) {
        a<Bitmap> a2 = a(cVar.getWidth(), cVar.getHeight(), config);
        new com.facebook.imagepipeline.a.c.d(this.f47661c.a(com.facebook.imagepipeline.a.a.e.a(cVar), null), new d.a() {
            /* class com.facebook.imagepipeline.a.b.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28894);
            }

            @Override // com.facebook.imagepipeline.a.c.d.a
            public final a<Bitmap> a(int i2) {
                return null;
            }
        }).a(i2, a2.a());
        return a2;
    }

    private List<a<Bitmap>> b(com.facebook.imagepipeline.a.a.c cVar, Bitmap.Config config, int i2) {
        com.facebook.imagepipeline.a.a.a a2 = this.f47661c.a(com.facebook.imagepipeline.a.a.e.a(cVar), null);
        int a3 = a2.a();
        if (i2 > a3) {
            i2 = a3;
        }
        ((com.facebook.imagepipeline.a.c.a) a2).f47668a = 1;
        final ArrayList arrayList = new ArrayList(i2);
        com.facebook.imagepipeline.a.c.d dVar = new com.facebook.imagepipeline.a.c.d(a2, new d.a() {
            /* class com.facebook.imagepipeline.a.b.e.AnonymousClass3 */

            static {
                Covode.recordClassIndex(28896);
            }

            @Override // com.facebook.imagepipeline.a.c.d.a
            public final a<Bitmap> a(int i2) {
                return a.b((a) arrayList.get(i2));
            }
        });
        for (int i3 = 0; i3 < i2; i3++) {
            a<Bitmap> a4 = a(a2.c(), a2.d(), config);
            try {
                dVar.a(i3, a4.a());
                arrayList.add(a4);
            } catch (IllegalStateException e2) {
                Object[] objArr = new Object[0];
                if (com.facebook.common.e.a.f47081a.b(5)) {
                    com.facebook.common.e.a.f47081a.b("AnimatedImageFactoryImp", com.a.a(null, "preview decode failed", objArr), e2);
                }
            }
        }
        return arrayList;
    }
}

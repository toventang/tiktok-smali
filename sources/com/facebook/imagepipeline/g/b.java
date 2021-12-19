package com.facebook.imagepipeline.g;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.h.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.j.h;
import com.facebook.imagepipeline.l.g;
import com.facebook.imagepipeline.r.a;
import java.util.Map;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    final c f47962a;

    /* renamed from: b  reason: collision with root package name */
    final c f47963b;

    /* renamed from: c  reason: collision with root package name */
    private final c f47964c;

    /* renamed from: d  reason: collision with root package name */
    private final g f47965d;

    /* renamed from: e  reason: collision with root package name */
    private final c f47966e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<c, c> f47967f;

    static {
        Covode.recordClassIndex(29003);
    }

    private static void a(a aVar, com.facebook.common.h.a<Bitmap> aVar2) {
        if (aVar != null) {
            Bitmap a2 = aVar2.a();
            int i2 = Build.VERSION.SDK_INT;
            if (aVar.a()) {
                a2.setHasAlpha(true);
            }
        }
    }

    public final d a(e eVar, com.facebook.imagepipeline.common.b bVar) {
        com.facebook.common.h.a<Bitmap> decodeFromEncodedImageWithColorSpace = this.f47965d.decodeFromEncodedImageWithColorSpace(eVar, bVar.f47742i, null, bVar.f47741h);
        try {
            a(bVar.f47744k, decodeFromEncodedImageWithColorSpace);
            return new d(decodeFromEncodedImageWithColorSpace, com.facebook.imagepipeline.j.g.f48000a, eVar.d(), eVar.e());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    public b(c cVar, c cVar2, c cVar3, g gVar) {
        this(cVar, cVar2, cVar3, gVar, null);
    }

    @Override // com.facebook.imagepipeline.g.c
    public final com.facebook.imagepipeline.j.c a(e eVar, int i2, h hVar, com.facebook.imagepipeline.common.b bVar) {
        c cVar;
        if (bVar.f47743j != null) {
            return bVar.f47743j.a(eVar, i2, hVar, bVar);
        }
        c c2 = eVar.c();
        if (c2 == null || c2 == c.f47633a) {
            c2 = com.facebook.h.d.a(eVar.b());
            eVar.f47991c = c2;
        }
        Map<c, c> map = this.f47967f;
        if (map == null || (cVar = map.get(c2)) == null) {
            return this.f47966e.a(eVar, i2, hVar, bVar);
        }
        return cVar.a(eVar, i2, hVar, bVar);
    }

    public final d b(e eVar, int i2, h hVar, com.facebook.imagepipeline.common.b bVar) {
        com.facebook.common.h.a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace = this.f47965d.decodeJPEGFromEncodedImageWithColorSpace(eVar, bVar.f47742i, null, i2, bVar.f47741h);
        try {
            a(bVar.f47744k, decodeJPEGFromEncodedImageWithColorSpace);
            return new d(decodeJPEGFromEncodedImageWithColorSpace, hVar, eVar.d(), eVar.e());
        } finally {
            decodeJPEGFromEncodedImageWithColorSpace.close();
        }
    }

    public b(c cVar, c cVar2, c cVar3, g gVar, Map<c, c> map) {
        this.f47966e = new c() {
            /* class com.facebook.imagepipeline.g.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29004);
            }

            @Override // com.facebook.imagepipeline.g.c
            public final com.facebook.imagepipeline.j.c a(e eVar, int i2, h hVar, com.facebook.imagepipeline.common.b bVar) {
                String str;
                c c2 = eVar.c();
                if (c2 == com.facebook.h.b.f47621a) {
                    return b.this.b(eVar, i2, hVar, bVar);
                }
                if (c2 == com.facebook.h.b.f47623c) {
                    b bVar2 = b.this;
                    if (bVar.f47740g || bVar2.f47962a == null) {
                        return bVar2.a(eVar, bVar);
                    }
                    return bVar2.f47962a.a(eVar, i2, hVar, bVar);
                } else if (c2 == com.facebook.h.b.f47630j) {
                    return b.this.f47963b.a(eVar, i2, hVar, bVar);
                } else {
                    if (c2 != c.f47633a) {
                        return b.this.a(eVar, bVar);
                    }
                    try {
                        byte[] bArr = new byte[22];
                        com.facebook.common.d.a.a(eVar.b(), bArr, 22);
                        StringBuilder sb = new StringBuilder(44);
                        int i3 = 0;
                        while (true) {
                            String hexString = Integer.toHexString(bArr[i3] & 255);
                            if (hexString.length() < 2) {
                                sb.append('0');
                            }
                            sb.append(hexString.toLowerCase());
                            i3++;
                            if (i3 >= 22) {
                                break;
                            }
                        }
                        str = sb.toString();
                    } catch (Throwable unused) {
                        str = "unknow";
                    }
                    throw new a("unknown image format, errorHead: ".concat(String.valueOf(str)), eVar);
                }
            }
        };
        this.f47962a = cVar;
        this.f47963b = cVar2;
        this.f47964c = cVar3;
        this.f47965d = gVar;
        this.f47967f = map;
    }
}

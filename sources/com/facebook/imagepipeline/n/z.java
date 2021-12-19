package com.facebook.imagepipeline.n;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.f;
import com.facebook.common.g.h;
import com.facebook.common.g.i;
import com.facebook.common.g.j;
import com.facebook.h.b;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.e;
import com.facebook.imageutils.a;
import com.facebook.imageutils.g;
import java.util.Map;
import java.util.concurrent.Executor;

public class z implements bc<e> {

    /* renamed from: a  reason: collision with root package name */
    public final i f48430a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f48431b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f48432c;

    static {
        Covode.recordClassIndex(29192);
    }

    @Override // com.facebook.imagepipeline.n.bc
    public final boolean a(d dVar) {
        return bd.a(512, 512, dVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.ExifInterface a(android.net.Uri r4) {
        /*
            r3 = this;
            android.content.ContentResolver r0 = r3.f48432c
            java.lang.String r2 = com.facebook.common.k.g.a(r0, r4)
            if (r2 == 0) goto L_0x001b
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.canRead()     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            if (r0 == 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x002b
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x002b, StackOverflowError -> 0x0024 }
            return r0
        L_0x0024:
            java.lang.Class<com.facebook.imagepipeline.n.z> r1 = com.facebook.imagepipeline.n.z.class
            java.lang.String r0 = "StackOverflowError in ExifInterface constructor"
            com.facebook.common.e.a.c(r1, r0)
        L_0x002b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.n.z.a(android.net.Uri):android.media.ExifInterface");
    }

    /* JADX INFO: finally extract failed */
    public static e a(h hVar, ExifInterface exifInterface) {
        int i2;
        Pair<Integer, Integer> a2 = a.a(new j(hVar));
        int a3 = g.a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
        int i3 = -1;
        if (a2 != null) {
            i2 = ((Integer) a2.first).intValue();
            i3 = ((Integer) a2.second).intValue();
        } else {
            i2 = -1;
        }
        com.facebook.common.h.a a4 = com.facebook.common.h.a.a(hVar);
        try {
            e eVar = new e(a4);
            com.facebook.common.h.a.c(a4);
            eVar.f47991c = b.f47621a;
            eVar.f47992d = a3;
            eVar.f47994f = i2;
            eVar.f47995g = i3;
            return eVar;
        } catch (Throwable th) {
            com.facebook.common.h.a.c(a4);
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<e> kVar, al alVar) {
        an c2 = alVar.c();
        String b2 = alVar.b();
        final com.facebook.imagepipeline.o.b a2 = alVar.a();
        final AnonymousClass1 r1 = new av<e>(kVar, c2, "LocalExifThumbnailProducer", b2) {
            /* class com.facebook.imagepipeline.n.z.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29193);
            }

            @Override // com.facebook.common.b.h
            public final /* synthetic */ Object c() {
                ExifInterface a2 = z.this.a(a2.mSourceUri);
                if (a2 == null || !a2.hasThumbnail()) {
                    return null;
                }
                return z.a(z.this.f48430a.a(a2.getThumbnail()), a2);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.b.h, com.facebook.imagepipeline.n.av
            public final /* synthetic */ void b(e eVar) {
                e.d(eVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.n.av
            public final /* synthetic */ Map c(e eVar) {
                boolean z;
                if (eVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                return f.of("createdThumbnail", Boolean.toString(z));
            }
        };
        alVar.a(new e() {
            /* class com.facebook.imagepipeline.n.z.AnonymousClass2 */

            static {
                Covode.recordClassIndex(29194);
            }

            @Override // com.facebook.imagepipeline.n.am, com.facebook.imagepipeline.n.e
            public final void a() {
                r1.a();
            }
        });
        this.f48431b.execute(r1);
    }

    public z(Executor executor, i iVar, ContentResolver contentResolver) {
        this.f48431b = executor;
        this.f48430a = iVar;
        this.f48432c = contentResolver;
    }
}

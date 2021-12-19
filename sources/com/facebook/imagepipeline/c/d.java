package com.facebook.imagepipeline.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.g.h;
import com.facebook.common.l.a;
import com.facebook.h.b;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.memory.ac;
import com.facebook.imagepipeline.memory.n;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f47712a;

    /* renamed from: b  reason: collision with root package name */
    private final n f47713b;

    static {
        Covode.recordClassIndex(28917);
    }

    public d(ac acVar) {
        this.f47713b = acVar.b();
        this.f47712a = new b(acVar.a(0));
    }

    @Override // com.facebook.common.l.a
    public final Bitmap a(int i2, int i3, Bitmap.Config config) {
        e eVar;
        Throwable th;
        MethodCollector.i(14375);
        com.facebook.common.h.a<h> a2 = this.f47712a.a((short) i2, (short) i3);
        com.facebook.common.h.a<byte[]> aVar = null;
        try {
            eVar = new e(a2);
            try {
                eVar.f47991c = b.f47621a;
                int i4 = eVar.f47996h;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = true;
                options.inPreferredConfig = config;
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inSampleSize = i4;
                int i5 = Build.VERSION.SDK_INT;
                options.inMutable = true;
                int a3 = a2.a().a();
                aVar = this.f47713b.a(a3 + 2);
                byte[] a4 = aVar.a();
                a2.a().a(0, a4, 0, a3);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a4, 0, a3, options);
                decodeByteArray.setHasAlpha(true);
                decodeByteArray.eraseColor(0);
                com.facebook.common.h.a.c(aVar);
                e.d(eVar);
                com.facebook.common.h.a.c(a2);
                MethodCollector.o(14375);
                return decodeByteArray;
            } catch (Throwable th2) {
                th = th2;
                com.facebook.common.h.a.c(aVar);
                e.d(eVar);
                com.facebook.common.h.a.c(a2);
                MethodCollector.o(14375);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            eVar = null;
            com.facebook.common.h.a.c(aVar);
            e.d(eVar);
            com.facebook.common.h.a.c(a2);
            MethodCollector.o(14375);
            throw th;
        }
    }
}

package com.google.android.play.core.assetpacks;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.an;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bf;
import com.google.android.play.core.b.bg;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* access modifiers changed from: package-private */
public final class cj {

    /* renamed from: a  reason: collision with root package name */
    private static final b f52976a = new b("PatchSliceTaskHandler");

    /* renamed from: b  reason: collision with root package name */
    private final ac f52977b;

    /* renamed from: c  reason: collision with root package name */
    private final bg<dj> f52978c;

    static {
        Covode.recordClassIndex(32729);
    }

    cj(ac acVar, bg<dj> bgVar) {
        this.f52977b = acVar;
        this.f52978c = bgVar;
    }

    public final void a(ci ciVar) {
        MethodCollector.i(8002);
        File a2 = this.f52977b.a(ciVar.f52904k, ciVar.f52968a, ciVar.f52969b);
        ac acVar = this.f52977b;
        String str = ciVar.f52904k;
        int i2 = ciVar.f52968a;
        long j2 = ciVar.f52969b;
        File file = new File(acVar.b(str, i2, j2), ciVar.f52973f);
        try {
            InputStream inputStream = ciVar.f52975h;
            if (ciVar.f52972e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            try {
                af afVar = new af(a2, file);
                File a3 = this.f52977b.a(ciVar.f52904k, ciVar.f52970c, ciVar.f52971d, ciVar.f52973f);
                if (!a3.exists()) {
                    a3.mkdirs();
                }
                cm cmVar = new cm(this.f52977b, ciVar.f52904k, ciVar.f52970c, ciVar.f52971d, ciVar.f52973f);
                an.a(afVar, inputStream, new ax(a3, cmVar), ciVar.f52974g);
                cmVar.b(0);
                inputStream.close();
                f52976a.d("Patching and extraction finished for slice %s of pack %s.", ciVar.f52973f, ciVar.f52904k);
                this.f52978c.a().a(ciVar.f52903j, ciVar.f52904k, ciVar.f52973f, 0);
                try {
                    ciVar.f52975h.close();
                    MethodCollector.o(8002);
                    return;
                } catch (IOException unused) {
                    f52976a.e("Could not close file for slice %s of pack %s.", ciVar.f52973f, ciVar.f52904k);
                    MethodCollector.o(8002);
                    return;
                }
            } catch (Throwable th) {
                bf.a(th, th);
            }
            MethodCollector.o(8002);
            throw th;
        } catch (IOException e2) {
            f52976a.b("IOException during patching %s.", e2.getMessage());
            au auVar = new au(a.a("Error patching slice %s of pack %s.", new Object[]{ciVar.f52973f, ciVar.f52904k}), e2, ciVar.f52903j);
            MethodCollector.o(8002);
            throw auVar;
        }
    }
}

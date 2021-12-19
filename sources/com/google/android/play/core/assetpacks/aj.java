package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.b.bg;
import com.google.android.play.core.b.r;
import com.google.android.play.core.tasks.a;
import com.google.android.play.core.tasks.b;
import com.google.android.play.core.tasks.d;
import com.google.android.play.core.tasks.e;
import com.google.android.play.core.tasks.f;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

final class aj {

    /* renamed from: a  reason: collision with root package name */
    private final bg<dj> f52792a;

    static {
        Covode.recordClassIndex(32675);
    }

    aj(bg<dj> bgVar) {
        this.f52792a = bgVar;
    }

    /* access modifiers changed from: package-private */
    public final InputStream a(int i2, String str, String str2, int i3) {
        MethodCollector.i(7454);
        d<ParcelFileDescriptor> b2 = this.f52792a.a().b(i2, str, str2, i3);
        try {
            r.a(b2, "Task must not be null");
            if (!b2.a()) {
                com.google.android.play.core.tasks.r rVar = new com.google.android.play.core.tasks.r((byte) 0);
                b2.a(e.f53369b, (b<? super ParcelFileDescriptor>) rVar);
                b2.a(e.f53369b, (a) rVar);
                rVar.f53390a.await();
            }
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) f.a((d) b2);
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                au auVar = new au(com.a.a("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)}), i2);
                MethodCollector.o(7454);
                throw auVar;
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            MethodCollector.o(7454);
            return autoCloseInputStream;
        } catch (ExecutionException e2) {
            au auVar2 = new au(com.a.a("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i2), str, str2, Integer.valueOf(i3)}), e2, i2);
            MethodCollector.o(7454);
            throw auVar2;
        } catch (InterruptedException e3) {
            au auVar3 = new au("Extractor was interrupted while waiting for chunk file.", e3, i2);
            MethodCollector.o(7454);
            throw auVar3;
        }
    }
}

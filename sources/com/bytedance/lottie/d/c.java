package com.bytedance.lottie.d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lottie.e;
import com.bytedance.lottie.g;
import com.bytedance.lottie.h;
import com.bytedance.lottie.n;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    final String f40659a;

    /* renamed from: b  reason: collision with root package name */
    final b f40660b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f40661c;

    static {
        Covode.recordClassIndex(24937);
    }

    /* access modifiers changed from: package-private */
    public final n<g> a() {
        try {
            return b();
        } catch (IOException e2) {
            return new n<>(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lottie.d.c$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f40665a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        static {
            /*
                r0 = 24940(0x616c, float:3.4948E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lottie.d.a[] r0 = com.bytedance.lottie.d.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.lottie.d.c.AnonymousClass3.f40665a = r2
                com.bytedance.lottie.d.a r0 = com.bytedance.lottie.d.a.Zip     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.lottie.d.c.AnonymousClass3.f40665a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.lottie.d.a r0 = com.bytedance.lottie.d.a.Json     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lottie.d.c.AnonymousClass3.<clinit>():void");
        }
    }

    private n b() {
        a aVar;
        n<g> a2;
        MethodCollector.i(2299);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.f40659a.endsWith(".json")) {
            aVar = a.Json;
        } else {
            aVar = a.Zip;
        }
        String a3 = b.a(this.f40659a, aVar, true);
        Downloader.with(this.f40661c).url(this.f40659a).name(a3).savePath(a(this.f40661c).getAbsolutePath()).mainThreadListener(new AbsDownloadListener() {
            /* class com.bytedance.lottie.d.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(24939);
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                countDownLatch.countDown();
            }

            @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                countDownLatch.countDown();
            }
        }).download();
        try {
            countDownLatch.await(3, TimeUnit.SECONDS);
            File file = new File(a(this.f40661c).getAbsolutePath(), a3);
            if (AnonymousClass3.f40665a[aVar.ordinal()] != 1) {
                a2 = h.a((InputStream) new FileInputStream(new File(file.getAbsolutePath())), this.f40659a, true);
            } else {
                a2 = h.a(new ZipInputStream(new FileInputStream(file)), this.f40659a);
            }
            if (a2.f40815a != null) {
                b bVar = this.f40660b;
                File file2 = new File(b.a(bVar.f40657a), b.a(bVar.f40658b, aVar, true));
                File file3 = new File(file2.getAbsolutePath().replace(".temp", ""));
                if (!file2.renameTo(file3)) {
                    e.a("Unable to rename cache file " + file2.getAbsolutePath() + " to " + file3.getAbsolutePath() + ".");
                }
            }
            MethodCollector.o(2299);
            return a2;
        } catch (InterruptedException unused) {
            n nVar = new n((Throwable) new IllegalArgumentException("Unable to fetch " + this.f40659a));
            MethodCollector.o(2299);
            return nVar;
        }
    }

    private static File a(Context context) {
        if (d.f107194b != null && d.f107197e) {
            return d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        d.f107194b = cacheDir;
        return cacheDir;
    }

    public c(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f40661c = applicationContext;
        this.f40659a = str;
        this.f40660b = new b(applicationContext, str);
    }
}

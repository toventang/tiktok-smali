package com.bytedance.ies.bullet.f;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.bullet.kit.a.a.d;
import com.bytedance.ies.bullet.service.base.resourceloader.config.c;
import com.bytedance.ies.bullet.service.base.resourceloader.config.g;
import com.bytedance.ies.bullet.service.base.resourceloader.config.h;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.cs.e;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.io.File;
import java.lang.ref.WeakReference;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0681a f32147a = new C0681a((byte) 0);

    static {
        Covode.recordClassIndex(18853);
    }

    /* renamed from: com.bytedance.ies.bullet.f.a$a  reason: collision with other inner class name */
    public static final class C0681a {
        static {
            Covode.recordClassIndex(18854);
        }

        private C0681a() {
        }

        public /* synthetic */ C0681a(byte b2) {
            this();
        }
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<h> f32148a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<h> f32149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f32150c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Application f32151d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f32152e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ File f32153f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.e f32154g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f32155h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f32156i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f32157j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f32158k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f32159l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ h f32160m;

        static {
            Covode.recordClassIndex(18855);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            h hVar;
            l.c(downloadInfo, "");
            downloadInfo.getUrl();
            Downloader.getInstance(this.f32151d).removeMainThreadListener(downloadInfo.getId(), this);
            if (!this.f32152e && (hVar = this.f32148a.get()) != null) {
                String absolutePath = this.f32153f.getAbsolutePath();
                l.a((Object) absolutePath, "");
                hVar.a(new g(absolutePath, downloadInfo.isSuccessByCache()));
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            h hVar;
            l.c(downloadInfo, "");
            l.c(baseException, "");
            baseException.getErrorCode();
            baseException.getErrorMessage();
            Downloader.getInstance(this.f32151d).removeMainThreadListener(downloadInfo.getId(), this);
            if (this.f32154g.element.length() > 0) {
                this.f32150c.a(this.f32151d, this.f32155h, this.f32156i, this.f32157j, this.f32158k, this.f32152e, this.f32153f, this.f32159l + 1, this.f32160m);
            } else if (!this.f32152e && (hVar = this.f32149b.get()) != null) {
                hVar.a("Download Failed:reason " + baseException.getErrorCode());
            }
        }

        b(a aVar, Application application, boolean z, File file, z.e eVar, String str, j jVar, String str2, String str3, int i2, h hVar) {
            this.f32150c = aVar;
            this.f32151d = application;
            this.f32152e = z;
            this.f32153f = file;
            this.f32154g = eVar;
            this.f32155h = str;
            this.f32156i = jVar;
            this.f32157j = str2;
            this.f32158k = str3;
            this.f32159l = i2;
            this.f32160m = hVar;
            this.f32148a = new WeakReference<>(hVar);
            this.f32149b = new WeakReference<>(hVar);
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(11625);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11625);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11625);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0135 A[Catch:{ IOException -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0136 A[Catch:{ IOException -> 0x017c }] */
    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r21, boolean r22, com.bytedance.ies.bullet.service.base.resourceloader.config.j r23, com.bytedance.ies.bullet.service.base.resourceloader.config.h r24) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.f.a.a(java.lang.String, boolean, com.bytedance.ies.bullet.service.base.resourceloader.config.j, com.bytedance.ies.bullet.service.base.resourceloader.config.h):void");
    }

    public final void a(Application application, String str, j jVar, String str2, String str3, boolean z, File file, int i2, h hVar) {
        d dVar;
        String str4;
        z.e eVar = new z.e();
        eVar.element = "";
        if (jVar instanceof d) {
            dVar = (d) jVar;
        } else {
            dVar = null;
        }
        if (dVar == null || dVar.f32185b != 1) {
            str4 = str;
        } else {
            Uri parse = Uri.parse(str);
            if (!p.a((CharSequence) str, (CharSequence) dVar.f32184a.get(i2), false)) {
                Uri.Builder builder = new Uri.Builder();
                l.a((Object) parse, "");
                str4 = builder.scheme(parse.getScheme()).authority(dVar.f32184a.get(i2)).query(parse.getQuery()).path(parse.getPath()).toString();
                l.a((Object) str4, "");
            } else {
                str4 = str;
            }
            if (i2 + 1 < dVar.f32184a.size()) {
                Uri.Builder builder2 = new Uri.Builder();
                l.a((Object) parse, "");
                T t = (T) builder2.scheme(parse.getScheme()).authority(dVar.f32184a.get(i2)).query(parse.getQuery()).path(parse.getPath()).toString();
                l.a((Object) t, "");
                eVar.element = t;
            }
        }
        Downloader.with(application).url(str4).name(str3).savePath(str2).addListenerToSameTask(true).deleteCacheIfCheckFailed(true).retryCount(jVar.f32634h).autoSetHashCodeForSameTask(true).ttnetProtectTimeout(20000).expiredRedownload(true).mainThreadListener(new b(this, application, z, file, eVar, str, jVar, str2, str3, i2, hVar)).download();
    }
}

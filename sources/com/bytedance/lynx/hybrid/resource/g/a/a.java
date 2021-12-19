package com.bytedance.lynx.hybrid.resource.g.a;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.j.c;
import com.bytedance.lynx.hybrid.resource.b.f;
import com.bytedance.lynx.hybrid.resource.config.d;
import com.bytedance.lynx.hybrid.resource.config.h;
import com.bytedance.lynx.hybrid.resource.config.i;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.io.File;
import java.lang.ref.WeakReference;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final C1004a f41173a = new C1004a((byte) 0);

    static {
        Covode.recordClassIndex(25226);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.g.a.a$a  reason: collision with other inner class name */
    public static final class C1004a {
        static {
            Covode.recordClassIndex(25227);
        }

        private C1004a() {
        }

        public /* synthetic */ C1004a(byte b2) {
            this();
        }
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<i> f41174a;

        /* renamed from: b  reason: collision with root package name */
        public final WeakReference<i> f41175b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f41176c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Application f41177d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f41178e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ File f41179f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.e f41180g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f41181h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f41182i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f41183j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ String f41184k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f41185l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i f41186m;

        static {
            Covode.recordClassIndex(25228);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            i iVar;
            l.c(downloadInfo, "");
            c.a("download success，" + downloadInfo.getUrl(), com.bytedance.lynx.hybrid.j.b.D, "res-DownloaderDepend");
            Downloader.getInstance(this.f41177d).removeMainThreadListener(downloadInfo.getId(), this);
            if (!this.f41178e && (iVar = this.f41174a.get()) != null) {
                String absolutePath = this.f41179f.getAbsolutePath();
                l.a((Object) absolutePath, "");
                iVar.a(new h(absolutePath, downloadInfo.isSuccessByCache()));
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            i iVar;
            l.c(downloadInfo, "");
            l.c(baseException, "");
            c.a("download failed,errorCode:" + baseException.getErrorCode() + ";errorMsg:" + baseException.getErrorMessage(), com.bytedance.lynx.hybrid.j.b.D, "res-DownloaderDepend");
            Downloader.getInstance(this.f41177d).removeMainThreadListener(downloadInfo.getId(), this);
            if (this.f41180g.element.length() > 0) {
                this.f41176c.a(this.f41177d, this.f41181h, this.f41182i, this.f41183j, this.f41184k, this.f41178e, this.f41179f, this.f41185l + 1, this.f41186m);
            } else if (!this.f41178e && (iVar = this.f41175b.get()) != null) {
                iVar.a("Download Failed:reason " + baseException.getErrorCode());
            }
        }

        b(a aVar, Application application, boolean z, File file, z.e eVar, String str, j jVar, String str2, String str3, int i2, i iVar) {
            this.f41176c = aVar;
            this.f41177d = application;
            this.f41178e = z;
            this.f41179f = file;
            this.f41180g = eVar;
            this.f41181h = str;
            this.f41182i = jVar;
            this.f41183j = str2;
            this.f41184k = str3;
            this.f41185l = i2;
            this.f41186m = iVar;
            this.f41174a = new WeakReference<>(iVar);
            this.f41175b = new WeakReference<>(iVar);
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(10714);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(10714);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(10714);
        return delete;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139 A[Catch:{ IOException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013a A[Catch:{ IOException -> 0x0180 }] */
    @Override // com.bytedance.lynx.hybrid.resource.config.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r21, boolean r22, com.bytedance.lynx.hybrid.resource.config.j r23, com.bytedance.lynx.hybrid.resource.config.i r24) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lynx.hybrid.resource.g.a.a.a(java.lang.String, boolean, com.bytedance.lynx.hybrid.resource.config.j, com.bytedance.lynx.hybrid.resource.config.i):void");
    }

    public final void a(Application application, String str, j jVar, String str2, String str3, boolean z, File file, int i2, i iVar) {
        com.bytedance.lynx.hybrid.resource.b.d dVar;
        String str4;
        boolean z2;
        z.e eVar = new z.e();
        eVar.element = "";
        if (jVar instanceof com.bytedance.lynx.hybrid.resource.b.d) {
            dVar = (com.bytedance.lynx.hybrid.resource.b.d) jVar;
        } else {
            dVar = null;
        }
        if (dVar == null || dVar.v != 1) {
            str4 = str;
        } else {
            Uri parse = Uri.parse(str);
            if (!p.a((CharSequence) str, (CharSequence) dVar.u.get(i2), false)) {
                Uri.Builder builder = new Uri.Builder();
                l.a((Object) parse, "");
                str4 = builder.scheme(parse.getScheme()).authority(dVar.u.get(i2)).query(parse.getQuery()).path(parse.getPath()).toString();
                l.a((Object) str4, "");
            } else {
                str4 = str;
            }
            if (i2 + 1 < dVar.u.size()) {
                Uri.Builder builder2 = new Uri.Builder();
                l.a((Object) parse, "");
                T t = (T) builder2.scheme(parse.getScheme()).authority(dVar.u.get(i2)).query(parse.getQuery()).path(parse.getPath()).toString();
                l.a((Object) t, "");
                eVar.element = t;
            }
        }
        b bVar = new b(this, application, z, file, eVar, str, jVar, str2, str3, i2, iVar);
        String queryParameter = Uri.parse(str4).getQueryParameter("cdn_negotiate");
        if (f.a(queryParameter)) {
            z2 = l.a((Object) queryParameter, (Object) "1");
        } else {
            z2 = jVar.q;
        }
        Downloader.with(application).url(str4).name(str3).savePath(str2).addListenerToSameTask(true).deleteCacheIfCheckFailed(true).retryCount(jVar.f41107c).autoSetHashCodeForSameTask(true).ttnetProtectTimeout(20000).expiredRedownload(z2).mainThreadListener(bVar).download();
    }
}

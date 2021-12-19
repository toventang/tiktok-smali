package com.ss.android.ugc.aweme.music.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.music.k.g;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.b.l;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public final class c implements a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f111399f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.music.service.b f111400b;

    /* renamed from: c  reason: collision with root package name */
    public f f111401c;

    /* renamed from: d  reason: collision with root package name */
    public final String f111402d;

    /* renamed from: e  reason: collision with root package name */
    public final CountDownLatch f111403e;

    /* renamed from: g  reason: collision with root package name */
    private final String f111404g;

    /* renamed from: h  reason: collision with root package name */
    private final String f111405h;

    /* renamed from: i  reason: collision with root package name */
    private int f111406i = -1;

    /* renamed from: j  reason: collision with root package name */
    private IDownloadListener f111407j;

    /* renamed from: k  reason: collision with root package name */
    private final UrlModel f111408k;

    static {
        Covode.recordClassIndex(71576);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71577);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.e.a
    public final void a() {
        Downloader.getInstance(d.a()).removeSubThreadListener(this.f111406i, this.f111407j);
        this.f111401c = null;
    }

    @Override // com.ss.android.ugc.aweme.music.e.a
    public final void b() {
        Downloader.getInstance(d.a()).removeSubThreadListener(this.f111406i, this.f111407j);
        this.f111401c = null;
    }

    public final void c() {
        if (!e.b(this.f111408k)) {
            CountDownLatch countDownLatch = this.f111403e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            bj.b("Download Music Beat illegal beat url: " + e.a(this.f111408k));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new HttpHeader("Accept-Encoding", " "));
        this.f111407j = new b(this);
        com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(e.c(this.f111408k));
        with.n = e.d(this.f111408k);
        with.f83081f = g.f111553a;
        with.f83078c = this.f111405h;
        com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(3).a("music_beat_file");
        a2.D = this.f111407j;
        this.f111406i = a2.a(true).a(arrayList).f();
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111409a;

        static {
            Covode.recordClassIndex(71578);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(c cVar) {
            this.f111409a = cVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onPause(DownloadInfo downloadInfo) {
            super.onPause(downloadInfo);
            CountDownLatch countDownLatch = this.f111409a.f111403e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            com.ss.android.ugc.aweme.music.service.b bVar = this.f111409a.f111400b;
            if (bVar != null) {
                bVar.a();
            }
            CountDownLatch countDownLatch = this.f111409a.f111403e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            f fVar = this.f111409a.f111401c;
            if (fVar != null) {
                fVar.b(this.f111409a.f111402d, this.f111409a);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            f fVar = this.f111409a.f111401c;
            if (fVar != null) {
                fVar.a(this.f111409a.f111402d, this.f111409a);
            }
            com.ss.android.ugc.aweme.music.service.b bVar = this.f111409a.f111400b;
            if (bVar != null) {
                bVar.b();
            }
            bj.a("Download Music Beat start time: " + System.currentTimeMillis());
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            com.ss.android.ugc.aweme.music.service.b bVar = this.f111409a.f111400b;
            Long l2 = null;
            if (bVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getTargetFilePath()) == null) {
                    str = "";
                }
                bVar.a(str, null);
            }
            StringBuilder append = new StringBuilder("Download Music Beat success time: ").append(System.currentTimeMillis()).append(" duration: ");
            if (downloadInfo != null) {
                l2 = Long.valueOf(downloadInfo.getDownloadTime());
            }
            bj.a(append.append(l2).toString());
            CountDownLatch countDownLatch = this.f111409a.f111403e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            f fVar = this.f111409a.f111401c;
            if (fVar != null) {
                fVar.b(this.f111409a.f111402d, this.f111409a);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            com.ss.android.ugc.aweme.music.service.b bVar = this.f111409a.f111400b;
            if (bVar != null) {
                bVar.a(new com.ss.android.ugc.musicprovider.a());
            }
            StringBuilder sb = new StringBuilder("Download Music Beat beat url fail, cur url: ");
            Integer num = null;
            if (downloadInfo != null) {
                str = downloadInfo.getConnectionUrl();
            } else {
                str = null;
            }
            StringBuilder append = sb.append(str).append(",retry url index: ");
            if (downloadInfo != null) {
                num = Integer.valueOf(downloadInfo.getCurBackUpUrlIndex());
            }
            bj.a(append.append(num).toString());
            CountDownLatch countDownLatch = this.f111409a.f111403e;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            f fVar = this.f111409a.f111401c;
            if (fVar != null) {
                fVar.b(this.f111409a.f111402d, this.f111409a);
            }
        }
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        this.f111401c = fVar;
    }

    public c(UrlModel urlModel, String str, String str2, CountDownLatch countDownLatch) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(str2, "");
        this.f111408k = urlModel;
        this.f111402d = str2;
        this.f111403e = countDownLatch;
        String a2 = g.a(str);
        l.b(a2, "");
        this.f111404g = a2;
        String b2 = g.b(str);
        l.b(b2, "");
        this.f111405h = b2;
        cs.a(g.f111553a, false);
    }
}

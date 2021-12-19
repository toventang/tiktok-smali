package com.ss.android.ugc.aweme.kids.a.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.cs;
import h.f.b.l;
import java.util.concurrent.CountDownLatch;

public final class d implements b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f105263j = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final String f105264b;

    /* renamed from: c  reason: collision with root package name */
    public int f105265c = -1;

    /* renamed from: d  reason: collision with root package name */
    public IDownloadListener f105266d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.a.g.a f105267e;

    /* renamed from: f  reason: collision with root package name */
    public f f105268f;

    /* renamed from: g  reason: collision with root package name */
    public final UrlModel f105269g;

    /* renamed from: h  reason: collision with root package name */
    public final String f105270h;

    /* renamed from: i  reason: collision with root package name */
    public final CountDownLatch f105271i;

    /* renamed from: k  reason: collision with root package name */
    private final String f105272k;

    static {
        Covode.recordClassIndex(67483);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67484);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.c.b
    public final void a() {
        Downloader.getInstance(com.bytedance.ies.ugc.appcontext.d.a()).removeSubThreadListener(this.f105265c, this.f105266d);
        this.f105268f = null;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.c.b
    public final void b() {
        Downloader.getInstance(com.bytedance.ies.ugc.appcontext.d.a()).removeSubThreadListener(this.f105265c, this.f105266d);
        this.f105268f = null;
    }

    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f105273a;

        static {
            Covode.recordClassIndex(67485);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(d dVar) {
            this.f105273a = dVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onPause(DownloadInfo downloadInfo) {
            super.onPause(downloadInfo);
            CountDownLatch countDownLatch = this.f105273a.f105271i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.a.c.a, com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            com.ss.android.ugc.aweme.kids.a.g.a aVar = this.f105273a.f105267e;
            if (aVar != null) {
                aVar.b();
            }
            CountDownLatch countDownLatch = this.f105273a.f105271i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            f fVar = this.f105273a.f105268f;
            if (fVar != null) {
                fVar.b(this.f105273a.f105270h, this.f105273a);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            f fVar = this.f105273a.f105268f;
            if (fVar != null) {
                fVar.a(this.f105273a.f105270h, this.f105273a);
            }
            com.ss.android.ugc.aweme.kids.a.g.a aVar = this.f105273a.f105267e;
            if (aVar != null) {
                aVar.a();
            }
            bj.a("Download Music Beat start time: " + System.currentTimeMillis());
        }

        @Override // com.ss.android.ugc.aweme.kids.a.c.a, com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            com.ss.android.ugc.aweme.kids.a.g.a aVar = this.f105273a.f105267e;
            Long l2 = null;
            if (aVar != null) {
                if (downloadInfo == null || (str = downloadInfo.getTargetFilePath()) == null) {
                    str = "";
                }
                aVar.a(str, null);
            }
            StringBuilder append = new StringBuilder("Download Music Beat success time: ").append(System.currentTimeMillis()).append(" duration: ");
            if (downloadInfo != null) {
                l2 = Long.valueOf(downloadInfo.getDownloadTime());
            }
            bj.a(append.append(l2).toString());
            CountDownLatch countDownLatch = this.f105273a.f105271i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            f fVar = this.f105273a.f105268f;
            if (fVar != null) {
                fVar.b(this.f105273a.f105270h, this.f105273a);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.a.c.a, com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            com.ss.android.ugc.aweme.kids.a.g.a aVar = this.f105273a.f105267e;
            if (aVar != null) {
                aVar.a(new com.ss.android.ugc.aweme.kids.b.a());
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
            CountDownLatch countDownLatch = this.f105273a.f105271i;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            f fVar = this.f105273a.f105268f;
            if (fVar != null) {
                fVar.b(this.f105273a.f105270h, this.f105273a);
            }
        }
    }

    public d(UrlModel urlModel, String str, String str2, CountDownLatch countDownLatch) {
        l.d(urlModel, "");
        l.d(str, "");
        l.d(str2, "");
        this.f105269g = urlModel;
        this.f105270h = str2;
        this.f105271i = countDownLatch;
        String str3 = com.ss.android.ugc.aweme.kids.a.i.d.f105385a + com.ss.android.ugc.aweme.kids.a.i.d.a(str);
        l.b(str3, "");
        this.f105272k = str3;
        String a2 = com.ss.android.ugc.aweme.kids.a.i.d.a(str);
        l.b(a2, "");
        this.f105264b = a2;
        cs.a(com.ss.android.ugc.aweme.kids.a.i.d.f105385a, false);
    }
}

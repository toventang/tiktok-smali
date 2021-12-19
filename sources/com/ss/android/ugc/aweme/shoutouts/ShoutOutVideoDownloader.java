package com.ss.android.ugc.aweme.shoutouts;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.services.shoutout.ShoutoutVideoDownloadListener;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.m.p;
import java.io.File;

public final class ShoutOutVideoDownloader implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final a f133100g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f133101a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final String f133102b;

    /* renamed from: c  reason: collision with root package name */
    public final String f133103c;

    /* renamed from: d  reason: collision with root package name */
    public final String f133104d;

    /* renamed from: e  reason: collision with root package name */
    public final ShoutoutVideoDownloadListener f133105e;

    /* renamed from: f  reason: collision with root package name */
    public final m f133106f;

    static {
        Covode.recordClassIndex(87035);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87036);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f133101a != -1) {
            Downloader.getInstance(com.ss.android.ugc.aweme.df.b.a()).cancel(this.f133101a);
        }
        this.f133106f.getLifecycle().b(this);
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ShoutOutVideoDownloader f133107a;

        static {
            Covode.recordClassIndex(87037);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(ShoutOutVideoDownloader shoutOutVideoDownloader) {
            this.f133107a = shoutOutVideoDownloader;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            long j2;
            long j3;
            super.onProgress(downloadInfo);
            if (downloadInfo != null) {
                j2 = downloadInfo.getCurBytes();
                j3 = downloadInfo.getTotalBytes();
            } else {
                j2 = 0;
                j3 = 100;
            }
            q.a("SHOUTOUTTOOLSShoutOutVideoDownloader onProgress".concat(String.valueOf((int) (((((float) j2) * 1.0f) / ((float) j3)) * 100.0f))));
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            Downloader.getInstance(com.ss.android.ugc.aweme.df.b.a()).removeSubThreadListener(this.f133107a.f133101a, this);
            i lifecycle = this.f133107a.f133106f.getLifecycle();
            l.b(lifecycle, "");
            if (lifecycle.a().compareTo((Enum) i.b.RESUMED) < 0) {
                ShoutoutVideoDownloadListener shoutoutVideoDownloadListener = this.f133107a.f133105e;
                if (shoutoutVideoDownloadListener != null) {
                    shoutoutVideoDownloadListener.onSuccess("");
                    return;
                }
                return;
            }
            if (downloadInfo != null) {
                this.f133107a.f133101a = -1;
                ShoutoutVideoDownloadListener shoutoutVideoDownloadListener2 = this.f133107a.f133105e;
                if (shoutoutVideoDownloadListener2 != null) {
                    shoutoutVideoDownloadListener2.onSuccess(ShoutOutVideoDownloader.a(downloadInfo));
                }
            }
            StringBuilder sb = new StringBuilder("SHOUTOUTTOOLSShoutOutVideoDownloader onSuccessed");
            if (downloadInfo != null) {
                str = ShoutOutVideoDownloader.a(downloadInfo);
            } else {
                str = null;
            }
            q.a(sb.append(str).toString());
            if (downloadInfo != null) {
                ShoutOutVideoDownloader.a(downloadInfo);
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            ShoutoutVideoDownloadListener shoutoutVideoDownloadListener = this.f133107a.f133105e;
            if (shoutoutVideoDownloadListener != null) {
                shoutoutVideoDownloadListener.onFail();
            }
            StringBuilder sb = new StringBuilder("SHOUTOUTTOOLSShoutOutVideoDownloader onFailure");
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            q.b(sb.append(str).toString());
            if (baseException != null) {
                baseException.getErrorMessage();
            }
            Downloader.getInstance(com.ss.android.ugc.aweme.df.b.a()).removeSubThreadListener(this.f133107a.f133101a, this);
        }
    }

    public static String a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath == null || !p.c(savePath, "/", false)) {
            return downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
        }
        return downloadInfo.getSavePath() + downloadInfo.getName();
    }

    public ShoutOutVideoDownloader(String str, String str2, String str3, ShoutoutVideoDownloadListener shoutoutVideoDownloadListener, m mVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(mVar, "");
        this.f133102b = str;
        this.f133103c = str2;
        this.f133104d = str3;
        this.f133105e = shoutoutVideoDownloadListener;
        this.f133106f = mVar;
    }
}

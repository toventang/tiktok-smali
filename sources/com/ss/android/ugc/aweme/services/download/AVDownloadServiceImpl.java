package com.ss.android.ugc.aweme.services.download;

import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.common.c.a;
import com.ss.android.ugc.aweme.common.c.b;
import com.ss.android.ugc.aweme.port.in.i;
import h.f.b.g;
import h.f.b.l;
import h.m.p;
import java.io.File;

public final class AVDownloadServiceImpl implements b {
    public static final Companion Companion = new Companion(null);

    static {
        Covode.recordClassIndex(79595);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79596);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final String getFullFilePath(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return "";
        }
        String savePath = downloadInfo.getSavePath();
        if (savePath == null || !p.c(savePath, "/", false)) {
            return downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
        }
        return downloadInfo.getSavePath() + downloadInfo.getName();
    }

    @Override // com.ss.android.ugc.aweme.common.c.b
    public final void downloadFile(String str, String str2, String str3, a aVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        Downloader.with(i.f115645a).url(str).savePath(str2).name(str3).subThreadListener(new AVDownloadServiceImpl$downloadFile$1(this, aVar)).download();
    }
}

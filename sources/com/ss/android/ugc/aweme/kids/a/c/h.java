package com.ss.android.ugc.aweme.kids.a.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f105297a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, Integer> f105298b;

    static {
        Covode.recordClassIndex(67497);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67498);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private h() {
        this.f105298b = new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.kids.a.c.c
    public final void a() {
        for (Map.Entry<String, Integer> entry : this.f105298b.entrySet()) {
            int intValue = entry.getValue().intValue();
            if (!Downloader.getInstance(d.a()).isDownloading(intValue)) {
                Downloader.getInstance(d.a()).removeTaskSubListener(intValue);
            } else {
                Downloader.getInstance(d.a()).cancel(intValue);
            }
        }
        this.f105298b.clear();
    }

    public /* synthetic */ h(byte b2) {
        this();
    }

    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.a.g.a f105299a;

        static {
            Covode.recordClassIndex(67499);
        }

        b(com.ss.android.ugc.aweme.kids.a.g.a aVar) {
            this.f105299a = aVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null && downloadInfo.getTotalBytes() > 0) {
                this.f105299a.a((int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()));
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.a.c.a, com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            if (downloadInfo == null || (downloadInfo.getSavePath() + downloadInfo.getName()) == null) {
                str = "";
            }
            this.f105299a.a(str, null);
        }

        @Override // com.ss.android.ugc.aweme.kids.a.c.a, com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            int i2;
            String str;
            super.onFailed(downloadInfo, baseException);
            com.ss.android.ugc.aweme.kids.a.g.a aVar = this.f105299a;
            if (baseException != null) {
                i2 = baseException.getErrorCode();
            } else {
                i2 = -1;
            }
            String str2 = null;
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            if (downloadInfo != null) {
                str2 = downloadInfo.getConnectionUrl();
            }
            aVar.a(new com.ss.android.ugc.aweme.kids.b.a(i2, str, str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.c.c
    public final void a(String str) {
        l.d(str, "");
        Integer num = this.f105298b.get(str);
        if (num != null) {
            Downloader instance = Downloader.getInstance(d.a());
            l.b(num, "");
            if (!instance.isDownloading(num.intValue())) {
                Downloader.getInstance(d.a()).removeTaskSubListener(num.intValue());
            } else {
                Downloader.getInstance(d.a()).cancel(num.intValue());
            }
        }
        this.f105298b.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.kids.a.c.c
    public final void a(MusicModel musicModel, String str, List<String> list, com.ss.android.ugc.aweme.kids.a.g.a aVar) {
        List<String> list2;
        l.d(musicModel, "");
        l.d(str, "");
        l.d(list, "");
        l.d(aVar, "");
        if (!list.isEmpty()) {
            aVar.a();
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = z.INSTANCE;
            }
            String musicId = musicModel.getMusicId();
            UrlModel url = musicModel.getUrl();
            l.b(url, "");
            int download = Downloader.with(d.a()).url(list.get(0)).backUpUrls(list2).savePath(str).name(com.ss.android.ugc.aweme.kids.b.b.c(e.b(url))).retryCount(3).extraHeaders(n.a(new HttpHeader("downloader_scene", "music"))).showNotification(false).subThreadListener(new b(aVar)).addListenerToSameTask(true).download();
            HashMap<String, Integer> hashMap = this.f105298b;
            l.b(musicId, "");
            hashMap.put(musicId, Integer.valueOf(download));
        }
    }
}

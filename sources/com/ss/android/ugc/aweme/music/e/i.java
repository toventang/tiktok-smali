package com.ss.android.ugc.aweme.music.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.music.a.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.musicprovider.e;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f111453a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f111454b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Integer> f111455c;

    static {
        Covode.recordClassIndex(71600);
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void a() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71601);
        }

        private a() {
        }

        public static b a() {
            if (!i.f111453a) {
                i.f111453a = true;
                b();
            }
            return new i((byte) 0);
        }

        private static void b() {
            if (c.a()) {
                try {
                    e a2 = e.a();
                    l.b(a2, "");
                    String c2 = a2.c();
                    if (!com.ss.android.ugc.musicprovider.b.b(c2)) {
                        com.ss.android.ugc.musicprovider.b.a(c2);
                    }
                    new d(new File(c2), com.ss.android.ugc.aweme.music.a.a.a(), AVExternalServiceImpl.a().configService().cacheConfig().draftMusicList());
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private i() {
        this.f111455c = new HashMap<>();
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void b() {
        for (Map.Entry<String, Integer> entry : this.f111455c.entrySet()) {
            int intValue = entry.getValue().intValue();
            if (!Downloader.getInstance(d.a()).isDownloading(intValue)) {
                Downloader.getInstance(d.a()).removeTaskSubListener(intValue);
            } else {
                Downloader.getInstance(d.a()).cancel(intValue);
            }
        }
        this.f111455c.clear();
    }

    public /* synthetic */ i(byte b2) {
        this();
    }

    public static final class b extends AbsDownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f111456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.service.b f111457b;

        static {
            Covode.recordClassIndex(71602);
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null && downloadInfo.getTotalBytes() > 0) {
                this.f111457b.a((int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes()));
            }
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            String str;
            super.onSuccessed(downloadInfo);
            if (downloadInfo == null || (downloadInfo.getSavePath() + downloadInfo.getName()) == null) {
                str = "";
            }
            bj.d("downloader_loader, onSuccessed ; entity : " + downloadInfo + " , musicFilePath : " + str + " , fileExists : " + new File(str).exists());
            this.f111457b.a(str, null);
        }

        b(i iVar, com.ss.android.ugc.aweme.music.service.b bVar) {
            this.f111456a = iVar;
            this.f111457b = bVar;
        }

        @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener, com.ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            int i2;
            String str;
            super.onFailed(downloadInfo, baseException);
            com.ss.android.ugc.aweme.music.service.b bVar = this.f111457b;
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
            bVar.a(new com.ss.android.ugc.musicprovider.a(i2, str, str2));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void a(String str) {
        l.d(str, "");
        Integer num = this.f111455c.get(str);
        if (num != null) {
            Downloader instance = Downloader.getInstance(d.a());
            l.b(num, "");
            if (!instance.isDownloading(num.intValue())) {
                Downloader.getInstance(d.a()).removeTaskSubListener(num.intValue());
            } else {
                Downloader.getInstance(d.a()).cancel(num.intValue());
            }
        }
        this.f111455c.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.music.e.b
    public final void a(MusicModel musicModel, String str, List<String> list, com.ss.android.ugc.aweme.music.service.b bVar) {
        List<String> list2;
        l.d(musicModel, "");
        l.d(str, "");
        l.d(list, "");
        l.d(bVar, "");
        if (!list.isEmpty()) {
            bVar.b();
            if (list.size() > 1) {
                list2 = list.subList(1, list.size());
            } else {
                list2 = z.INSTANCE;
            }
            String musicId = musicModel.getMusicId();
            UrlModel url = musicModel.getUrl();
            l.b(url, "");
            String c2 = com.ss.android.ugc.musicprovider.b.c(e.c(url));
            com.ss.android.ugc.aweme.download.component_api.a with = DownloadServiceManager.INSTANCE.getDownloadService().with(list.get(0));
            with.n = list2;
            with.f83081f = str;
            with.f83078c = c2;
            com.ss.android.ugc.aweme.download.component_api.a a2 = with.a(3).a(n.a(new HttpHeader("downloader_scene", "music"))).a("music_normal_file");
            a2.D = new b(this, bVar);
            int f2 = a2.a(true).d().f();
            HashMap<String, Integer> hashMap = this.f111455c;
            l.b(musicId, "");
            hashMap.put(musicId, Integer.valueOf(f2));
        }
    }
}

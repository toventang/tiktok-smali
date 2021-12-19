package com.ss.android.ugc.aweme.kids.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.kids.a.c.d;
import com.ss.android.ugc.aweme.kids.a.c.f;
import com.ss.android.ugc.aweme.kids.a.c.g;
import com.ss.android.ugc.aweme.kids.a.f.d;
import com.ss.android.ugc.aweme.kids.a.f.e;
import com.ss.android.ugc.aweme.kids.a.i.c;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f105245d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f105246a;

    /* renamed from: b  reason: collision with root package name */
    public final f f105247b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.a.f.f f105248c;

    /* renamed from: e  reason: collision with root package name */
    private final Context f105249e;

    /* renamed from: f  reason: collision with root package name */
    private d f105250f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f105251g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f105252h = true;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f105253i = true;

    /* renamed from: j  reason: collision with root package name */
    private String f105254j;

    static {
        Covode.recordClassIndex(67475);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67476);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.b$b  reason: collision with other inner class name */
    public static final class C2691b implements com.ss.android.ugc.aweme.kids.a.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f105256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicModel f105257b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.a.g.a f105258c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f105259d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f105260e;

        static {
            Covode.recordClassIndex(67477);
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a() {
            this.f105258c.a();
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void b() {
            this.f105258c.b();
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a(int i2) {
            this.f105258c.a(i2);
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a(com.ss.android.ugc.aweme.kids.b.a aVar) {
            l.d(aVar, "");
            this.f105258c.a(aVar);
            this.f105259d.element.c();
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a(String str, MusicWaveBean musicWaveBean) {
            l.d(str, "");
            this.f105258c.a(str, musicWaveBean);
            this.f105259d.element.d();
        }

        C2691b(b bVar, MusicModel musicModel, com.ss.android.ugc.aweme.kids.a.g.a aVar, z.e eVar, boolean z) {
            this.f105256a = bVar;
            this.f105257b = musicModel;
            this.f105258c = aVar;
            this.f105259d = eVar;
            this.f105260e = z;
        }
    }

    public b(Context context, String str) {
        l.d(context, "");
        this.f105254j = str;
        this.f105246a = 6;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.b(applicationContext, "");
        this.f105249e = applicationContext;
        this.f105247b = new f();
        this.f105250f = new d();
    }

    public final boolean a(MusicModel musicModel, com.ss.android.ugc.aweme.kids.a.g.a aVar, boolean z) {
        List<String> list;
        String str = "";
        l.d(musicModel, str);
        l.d(aVar, str);
        AVExternalServiceImpl.a().provideAVPerformance().start("av_music_download", "MusicFetcher start");
        z.e eVar = new z.e();
        eVar.element = (T) new e(this.f105250f);
        this.f105248c = eVar.element;
        T t = eVar.element;
        if (t != null) {
            try {
                t.a();
            } catch (Throwable th) {
                if (th instanceof com.ss.android.ugc.aweme.kids.a.f.b) {
                    throw th.getRealThrowable();
                }
                throw th;
            }
        }
        C2691b bVar = new C2691b(this, musicModel, aVar, eVar, z);
        boolean z2 = false;
        if (c.a(musicModel, this.f105249e, this.f105251g)) {
            if (TextUtils.isEmpty(musicModel.getMusicId())) {
                com.bytedance.apm.b.a("aweme_music_download_error_rate", 4, new com.ss.android.ugc.aweme.app.f.c().a("errorDesc", "music id is null").a("trace", this.f105254j).a("isHitCache", (Boolean) false).a());
                StringBuilder sb = new StringBuilder("MusicFetcher music id is empty, name: ");
                String name = musicModel.getName();
                if (name == null) {
                    name = str;
                }
                StringBuilder append = sb.append(name).append(", artist: ");
                String singer = musicModel.getSinger();
                if (singer != null) {
                    str = singer;
                }
                bj.b(append.append(str).toString());
            } else if (musicModel == null || musicModel.getMusicType() != MusicModel.MusicType.ONLINE) {
                bj.b("MusicFetcher download not online music");
            } else {
                MusicModel a2 = com.ss.android.ugc.aweme.kids.a.i.a.a(musicModel);
                com.ss.android.ugc.aweme.kids.b.d a3 = com.ss.android.ugc.aweme.kids.b.d.a();
                UrlModel url = a2.getUrl();
                l.b(url, str);
                String str2 = a3.b() + com.ss.android.ugc.aweme.kids.b.b.c(com.ss.android.ugc.aweme.kids.a.c.e.b(url));
                String musicId = a2.getMusicId();
                String a4 = com.ss.android.ugc.aweme.kids.a.c.e.a(a2.getUrl());
                com.ss.android.ugc.aweme.kids.a.c.e.a(a2.getStrongBeatUrl());
                com.ss.android.ugc.aweme.framework.a.a.a(this.f105254j + ", MusicDownloadStart: musicId=" + musicId + ',' + " url=" + a4 + ',');
                CountDownLatch countDownLatch = null;
                if (this.f105252h && a2.getStrongBeatUrl() != null) {
                    if (z) {
                        countDownLatch = new CountDownLatch(1);
                    }
                    UrlModel strongBeatUrl = a2.getStrongBeatUrl();
                    l.b(strongBeatUrl, str);
                    l.b(str2, str);
                    String musicId2 = a2.getMusicId();
                    l.b(musicId2, str);
                    com.ss.android.ugc.aweme.kids.a.c.d dVar = new com.ss.android.ugc.aweme.kids.a.c.d(strongBeatUrl, str2, musicId2, countDownLatch);
                    f fVar = this.f105247b;
                    l.d(fVar, str);
                    dVar.f105268f = fVar;
                    UrlModel urlModel = dVar.f105269g;
                    if (urlModel == null || TextUtils.isEmpty(urlModel.getUri()) || com.bytedance.common.utility.collection.b.a((Collection) urlModel.getUrlList())) {
                        CountDownLatch countDownLatch2 = dVar.f105271i;
                        if (countDownLatch2 != null) {
                            countDownLatch2.countDown();
                        }
                        bj.b("Download Music Beat illegal beat url: " + com.ss.android.ugc.aweme.kids.a.c.e.a(dVar.f105269g));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new HttpHeader("Accept-Encoding", " "));
                        dVar.f105266d = new d.b(dVar);
                        DownloadTask url2 = Downloader.with(com.bytedance.ies.ugc.appcontext.d.a()).url(com.ss.android.ugc.aweme.kids.a.c.e.b(dVar.f105269g));
                        UrlModel urlModel2 = dVar.f105269g;
                        l.d(urlModel2, str);
                        List<String> urlList = urlModel2.getUrlList();
                        if (urlList != null) {
                            list = n.g((Collection) urlList);
                            list.remove(com.ss.android.ugc.aweme.kids.a.c.e.b(urlModel2));
                        } else {
                            list = h.a.z.INSTANCE;
                        }
                        dVar.f105265c = url2.backUpUrls(list).savePath(com.ss.android.ugc.aweme.kids.a.i.d.f105385a).name(dVar.f105264b).retryCount(3).showNotification(false).subThreadListener(dVar.f105266d).extraHeaders(arrayList).download();
                    }
                }
                g gVar = new g(this.f105249e, a2, new a(bVar), countDownLatch, this.f105253i, this.f105251g, this.f105254j, this.f105246a);
                f fVar2 = this.f105247b;
                l.d(fVar2, str);
                gVar.f105284j = fVar2;
                if (!gVar.f105285k.isPlayUrlValid()) {
                    return true;
                }
                gVar.f105286l.a();
                gVar.f105283i = System.currentTimeMillis();
                com.ss.android.ugc.aweme.kids.b.d a5 = com.ss.android.ugc.aweme.kids.b.d.a();
                l.b(a5, str);
                String b2 = a5.b();
                if (!com.ss.android.ugc.aweme.kids.b.b.b(b2)) {
                    com.ss.android.ugc.aweme.kids.b.b.a(b2);
                }
                Context context = gVar.f105276b;
                l.b(context, str);
                UrlModel url3 = gVar.f105285k.getUrl();
                l.b(url3, str);
                String b3 = com.ss.android.ugc.aweme.kids.a.c.e.b(url3);
                l.d(context, str);
                if (!TextUtils.isEmpty(b3)) {
                    com.ss.android.ugc.aweme.kids.b.d a6 = com.ss.android.ugc.aweme.kids.b.d.a();
                    l.b(a6, str);
                    if (Downloader.getInstance(context).getDownloadInfo(b3, a6.b()) != null) {
                        z2 = true;
                    }
                }
                gVar.f105282h = z2;
                if (gVar.f105285k.isNeedSetCookie()) {
                    com.ss.android.ugc.aweme.kids.a.c.e.a(gVar.f105285k, gVar.o, gVar.f105282h);
                }
                com.ss.android.ugc.aweme.kids.a.c.c cVar = gVar.f105281g;
                MusicModel musicModel2 = gVar.f105285k;
                String str3 = gVar.f105279e;
                l.b(str3, str);
                UrlModel url4 = gVar.f105285k.getUrl();
                l.b(url4, str);
                List<String> urlList2 = url4.getUrlList();
                l.b(urlList2, str);
                cVar.a(musicModel2, str3, urlList2, new g.c(gVar));
                return true;
            }
        }
        return false;
    }
}

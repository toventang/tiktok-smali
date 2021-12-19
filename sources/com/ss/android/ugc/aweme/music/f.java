package com.ss.android.ugc.aweme.music;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.e.g;
import com.ss.android.ugc.aweme.music.i.e;
import com.ss.android.ugc.aweme.music.i.g;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.settings.v;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f111467c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f111468a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.music.e.f f111469b;

    /* renamed from: d  reason: collision with root package name */
    private final Context f111470d;

    /* renamed from: e  reason: collision with root package name */
    private g f111471e;

    /* renamed from: f  reason: collision with root package name */
    private e f111472f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f111473g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f111474h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f111475i;

    /* renamed from: j  reason: collision with root package name */
    private String f111476j;

    static {
        Covode.recordClassIndex(71609);
    }

    public f(Context context, boolean z) {
        this(context, z, false, false, null, 28);
    }

    public f(Context context, boolean z, boolean z2) {
        this(context, false, z, false, null, 16);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71610);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements com.ss.android.ugc.aweme.music.service.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f111478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MusicModel f111479b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.music.service.b f111480c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f111481d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f111482e;

        static {
            Covode.recordClassIndex(71611);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a() {
            this.f111480c.a();
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void b() {
            this.f111480c.b();
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(int i2) {
            this.f111480c.a(i2);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(com.ss.android.ugc.musicprovider.a aVar) {
            l.d(aVar, "");
            this.f111480c.a(aVar);
            this.f111481d.element.c();
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(String str, MusicWaveBean musicWaveBean) {
            l.d(str, "");
            this.f111480c.a(str, musicWaveBean);
            this.f111481d.element.d();
        }

        b(f fVar, MusicModel musicModel, com.ss.android.ugc.aweme.music.service.b bVar, z.e eVar, boolean z) {
            this.f111478a = fVar;
            this.f111479b = musicModel;
            this.f111480c = bVar;
            this.f111481d = eVar;
            this.f111482e = z;
        }
    }

    public final void a() {
        this.f111469b.a();
        g gVar = this.f111471e;
        if (gVar != null) {
            gVar.e();
        }
    }

    public final void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.music.e.f fVar = this.f111469b;
        l.d(str, "");
        com.ss.android.ugc.aweme.music.e.a remove = fVar.f111429a.remove(str);
        if (remove != null) {
            remove.b();
        }
        com.ss.android.ugc.aweme.music.e.a remove2 = fVar.f111430b.remove(str);
        if (remove2 != null) {
            remove2.b();
        }
        g gVar = this.f111471e;
        if (gVar != null) {
            gVar.e();
        }
    }

    public final boolean a(MusicModel musicModel, com.ss.android.ugc.aweme.music.service.b bVar) {
        l.d(musicModel, "");
        l.d(bVar, "");
        return a(musicModel, bVar, true, false);
    }

    private final boolean a(MusicModel musicModel, com.ss.android.ugc.aweme.music.service.b bVar, boolean z) {
        String str;
        String b2;
        List c2;
        String str2 = this.f111476j;
        String str3 = "";
        l.d(musicModel, str3);
        String musicId = musicModel.getMusicId();
        l.b(musicId, str3);
        String uri = musicModel.getUri();
        if (uri == null || (c2 = p.c(uri, new String[]{"/"})) == null || (str = (String) n.b(c2, 2)) == null) {
            str = str3;
        }
        d dVar = new d(musicId, str, bVar, str2, (byte) 0);
        boolean z2 = false;
        if (!d.a(musicModel, this.f111470d, this.f111473g)) {
            bVar.a(new com.ss.android.ugc.musicprovider.a(5, "MusicFetcher music id is invalid : " + musicModel.getId()));
            return false;
        } else if (TextUtils.isEmpty(musicModel.getMusicId())) {
            com.bytedance.apm.b.a("aweme_music_download_error_rate", 4, new c().a("errorDesc", "music id is null").a("trace", this.f111476j).a("isHitCache", (Boolean) false).a());
            StringBuilder sb = new StringBuilder("MusicFetcher music id is empty, name: ");
            String name = musicModel.getName();
            if (name == null) {
                name = str3;
            }
            StringBuilder append = sb.append(name).append(", artist: ");
            String singer = musicModel.getSinger();
            if (singer != null) {
                str3 = singer;
            }
            bj.b(append.append(str3).toString());
            return false;
        } else if (musicModel == null || musicModel.getMusicType() != MusicModel.MusicType.ONLINE) {
            bj.b("MusicFetcher download not online music");
            return false;
        } else {
            if (v.a()) {
                b2 = com.ss.android.ugc.musicprovider.e.a().b(musicModel.getMusicId());
            } else {
                com.ss.android.ugc.musicprovider.e a2 = com.ss.android.ugc.musicprovider.e.a();
                UrlModel url = musicModel.getUrl();
                l.b(url, str3);
                b2 = a2.b(com.ss.android.ugc.aweme.music.e.e.c(url));
            }
            String musicId2 = musicModel.getMusicId();
            String a3 = com.ss.android.ugc.aweme.music.e.e.a(musicModel.getUrl());
            String a4 = com.ss.android.ugc.aweme.music.e.e.a(musicModel.getStrongBeatUrl());
            com.ss.android.ugc.aweme.app.f.d a5 = new com.ss.android.ugc.aweme.app.f.d().a("music_id", musicId2).a("enter_from", this.f111476j).a("url", a3);
            IMusicService m2 = MusicService.m();
            l.b(m2, str3);
            r.a("download_music", a5.a("download_strategy", m2.c()).a("musicEffectsUrl", a4).f66730a);
            com.ss.android.ugc.aweme.framework.a.a.a(this.f111476j + ", MusicDownloadStart: musicId=" + musicId2 + ',' + " url=" + a3 + ',');
            CountDownLatch countDownLatch = null;
            if (this.f111474h && musicModel.getStrongBeatUrl() != null) {
                if (!v.a() || z) {
                    countDownLatch = new CountDownLatch(1);
                }
                UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
                l.b(strongBeatUrl, str3);
                l.b(b2, str3);
                String musicId3 = musicModel.getMusicId();
                l.b(musicId3, str3);
                com.ss.android.ugc.aweme.music.e.c cVar = new com.ss.android.ugc.aweme.music.e.c(strongBeatUrl, b2, musicId3, countDownLatch);
                cVar.a(this.f111469b);
                cVar.c();
            }
            com.ss.android.ugc.aweme.music.e.g gVar = new com.ss.android.ugc.aweme.music.e.g(this.f111470d, musicModel, new c(dVar), countDownLatch, this.f111475i, this.f111473g, this.f111476j, this.f111468a);
            com.ss.android.ugc.aweme.music.e.f fVar = this.f111469b;
            l.d(fVar, str3);
            gVar.f111439j = fVar;
            if (gVar.f111440k.isPlayUrlValid()) {
                gVar.f111441l.b();
                gVar.f111438i = System.currentTimeMillis();
                com.ss.android.ugc.musicprovider.e a6 = com.ss.android.ugc.musicprovider.e.a();
                l.b(a6, str3);
                String c3 = a6.c();
                if (!com.ss.android.ugc.musicprovider.b.b(c3)) {
                    com.ss.android.ugc.musicprovider.b.a(c3);
                }
                if (v.a()) {
                    z2 = com.ss.android.ugc.aweme.music.e.e.a(gVar.f111432c, gVar.f111433d, "download");
                } else {
                    Context context = gVar.f111431b;
                    l.b(context, str3);
                    UrlModel url2 = gVar.f111440k.getUrl();
                    l.b(url2, str3);
                    String c4 = com.ss.android.ugc.aweme.music.e.e.c(url2);
                    l.d(context, str3);
                    if (!TextUtils.isEmpty(c4)) {
                        com.ss.android.ugc.musicprovider.e a7 = com.ss.android.ugc.musicprovider.e.a();
                        l.b(a7, str3);
                        if (Downloader.getInstance(context).getDownloadInfo(c4, a7.c()) != null) {
                            z2 = true;
                        }
                    }
                }
                gVar.f111437h = z2;
                if (gVar.f111440k.isNeedSetCookie()) {
                    com.ss.android.ugc.aweme.music.e.e.a(gVar.f111440k, gVar.o, gVar.f111437h);
                }
                com.ss.android.ugc.aweme.music.e.b bVar2 = gVar.f111436g;
                MusicModel musicModel2 = gVar.f111440k;
                String str4 = gVar.f111434e;
                l.b(str4, str3);
                UrlModel url3 = gVar.f111440k.getUrl();
                l.b(url3, str3);
                List<String> urlList = url3.getUrlList();
                l.b(urlList, str3);
                bVar2.a(musicModel2, str4, urlList, new g.c(gVar));
            }
            return true;
        }
    }

    public final boolean a(MusicModel musicModel, com.ss.android.ugc.aweme.music.service.b bVar, boolean z, boolean z2) {
        l.d(musicModel, "");
        l.d(bVar, "");
        AVExternalServiceImpl.a().provideAVPerformance().start("av_music_download", "MusicFetcher start");
        if (!z) {
            return a(musicModel, bVar, z2);
        }
        z.e eVar = new z.e();
        eVar.element = (T) new com.ss.android.ugc.aweme.music.i.f(this.f111472f);
        this.f111471e = eVar.element;
        T t = eVar.element;
        if (t != null) {
            try {
                t.a();
            } catch (Throwable th) {
                if (th instanceof com.ss.android.ugc.aweme.music.i.b) {
                    throw th.getRealThrowable();
                }
                throw th;
            }
        }
        return a(musicModel, new b(this, musicModel, bVar, eVar, z2), z2);
    }

    public f(Context context, boolean z, boolean z2, boolean z3, String str) {
        l.d(context, "");
        this.f111473g = z;
        this.f111474h = z2;
        this.f111475i = z3;
        this.f111476j = str;
        this.f111468a = 6;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.b(applicationContext, "");
        this.f111470d = applicationContext;
        this.f111469b = new com.ss.android.ugc.aweme.music.e.f();
        this.f111472f = new e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, boolean z, boolean z2, boolean z3, String str, int i2) {
        this(context, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? null : str);
    }
}

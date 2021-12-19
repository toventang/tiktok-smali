package com.ss.android.ugc.aweme.music.e;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.j.a.b;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.settings.v;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.utils.cs;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class g implements a {
    public static final a q = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Context f111431b;

    /* renamed from: c  reason: collision with root package name */
    public final String f111432c;

    /* renamed from: d  reason: collision with root package name */
    public final String f111433d;

    /* renamed from: e  reason: collision with root package name */
    public final String f111434e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f111435f;

    /* renamed from: g  reason: collision with root package name */
    public final b f111436g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f111437h;

    /* renamed from: i  reason: collision with root package name */
    public long f111438i;

    /* renamed from: j  reason: collision with root package name */
    public f f111439j;

    /* renamed from: k  reason: collision with root package name */
    public final MusicModel f111440k;

    /* renamed from: l  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.music.service.b f111441l;

    /* renamed from: m  reason: collision with root package name */
    public final CountDownLatch f111442m;
    public boolean n;
    public String o;
    public int p;
    private final h r;
    private final h s;
    private final h t;
    private final boolean u;

    static {
        Covode.recordClassIndex(71590);
    }

    public final IExternalService c() {
        return (IExternalService) this.r.getValue();
    }

    public final IAVPerformance d() {
        return (IAVPerformance) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71591);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<IExternalService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f111449a = new d();

        static {
            Covode.recordClassIndex(71596);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IExternalService invoke() {
            return AVExternalServiceImpl.a();
        }
    }

    static final class b extends m implements h.f.a.a<IAVPerformance> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(71592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IAVPerformance invoke() {
            return this.this$0.c().provideAVPerformance();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f111450a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f111451b;

        static {
            Covode.recordClassIndex(71597);
        }

        e(g gVar, boolean z) {
            this.f111450a = gVar;
            this.f111451b = z;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            if (this.f111450a.n) {
                if (this.f111451b) {
                    i2 = R.string.b95;
                } else {
                    i2 = R.string.dbb;
                }
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (!j.f107229h) {
                    i2 = R.string.de8;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f111450a.f111431b).a(i2).a();
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<ITakeInSameOptimize> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(71598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ITakeInSameOptimize invoke() {
            return this.this$0.c().provideTakeInSameOptimize();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.e.a
    public final void a() {
        this.f111436g.b();
        this.f111439j = null;
    }

    public static final class c implements com.ss.android.ugc.aweme.music.service.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f111443a;

        static {
            Covode.recordClassIndex(71593);
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a() {
            f fVar = this.f111443a.f111439j;
            if (fVar != null) {
                String str = this.f111443a.f111432c;
                l.b(str, "");
                fVar.b(str, this.f111443a);
            }
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void b() {
            f fVar = this.f111443a.f111439j;
            if (fVar != null) {
                String str = this.f111443a.f111432c;
                l.b(str, "");
                fVar.a(str, this.f111443a);
            }
            bj.a("Download Music start, id: " + this.f111443a.f111432c + " time: " + System.currentTimeMillis());
        }

        public static final class a implements IAVInfoService.IGetInfoCallback<Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f111444a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f111445b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f111446c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f111447d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f111448e;

            static {
                Covode.recordClassIndex(71594);
            }

            /* renamed from: com.ss.android.ugc.aweme.music.e.g$c$a$a  reason: collision with other inner class name */
            static final class C2855a extends m implements h.f.a.b<MusicWaveBean, z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(71595);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2855a(a aVar) {
                    super(1);
                    this.this$0 = aVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(MusicWaveBean musicWaveBean) {
                    a(musicWaveBean);
                    return z.f158842a;
                }

                public final void a(MusicWaveBean musicWaveBean) {
                    this.this$0.f111444a.f111443a.d().step("av_music_download", "audio2wavebean");
                    CountDownLatch countDownLatch = this.this$0.f111444a.f111443a.f111442m;
                    if (countDownLatch != null) {
                        try {
                            Boolean.valueOf(countDownLatch.await(1500, TimeUnit.MILLISECONDS));
                        } catch (Exception e2) {
                            bj.b("Download Music, countDownLatch await error: ".concat(String.valueOf(e2)));
                        }
                    }
                    this.this$0.f111444a.f111443a.d().step("av_music_download", "await countDownLatch");
                    bj.a("Download Music get wave data duration: " + (System.currentTimeMillis() - this.this$0.f111448e) + " currentTime: " + System.currentTimeMillis());
                    if (this.this$0.f111444a.f111443a.f111435f) {
                        this.this$0.f111444a.f111443a.f111441l.a(100);
                    }
                    this.this$0.f111444a.f111443a.d().end("av_music_download", "fetch end");
                    f fVar = this.this$0.f111444a.f111443a.f111439j;
                    if (fVar != null) {
                        String str = this.this$0.f111444a.f111443a.f111432c;
                        l.b(str, "");
                        fVar.b(str, this.this$0.f111444a.f111443a);
                    }
                    this.this$0.f111444a.f111443a.f111441l.a(this.this$0.f111446c, musicWaveBean);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(Integer num) {
                double d2;
                int intValue = num.intValue();
                this.f111444a.f111443a.d().step("av_music_download", "music audioLegal");
                if (intValue < 0) {
                    this.f111444a.f111443a.a(false);
                    this.f111444a.f111443a.a((Integer) -2, "", "", intValue, this.f111445b, cs.d(this.f111446c));
                    this.f111444a.f111443a.f111441l.a(this.f111444a.f111443a.a((Integer) -2));
                    return;
                }
                g gVar = this.f111444a.f111443a;
                long j2 = this.f111447d;
                long j3 = this.f111445b;
                String str = gVar.f111433d;
                boolean isNeedSetCookie = gVar.f111440k.isNeedSetCookie();
                String str2 = gVar.o;
                boolean z = gVar.f111437h;
                if (j2 == 0) {
                    d2 = 0.0d;
                } else {
                    d2 = (double) (j3 / j2);
                }
                com.bytedance.apm.b.a("aweme_music_download_error_rate", 0, new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(j2)).a("downloadStrategy", Integer.valueOf(MusicService.m().c())).a("speed", Double.valueOf(d2)).a("size", Long.valueOf(j3)).a("fileUri", "").a("fileUrlList", str).a("hostname", com.ss.android.ugc.aweme.music.k.d.a("")).a("is_private", Boolean.valueOf(isNeedSetCookie)).a("isUseTTPlayer", Boolean.valueOf(v.a())).a("trace", str2).a("isHitCache", Boolean.valueOf(z)).a());
                String str3 = gVar.f111432c;
                String str4 = gVar.o;
                String str5 = gVar.f111433d;
                Long valueOf = Long.valueOf(j2);
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("music_id", str3).a("enter_from", str4).a("url", str5).a("time", valueOf).a("size", Long.valueOf(j3));
                IMusicService m2 = MusicService.m();
                l.b(m2, "");
                r.a("download_music_succeed", a2.a("download_strategy", m2.c()).a("is_use_tt_player", Boolean.valueOf(v.a())).f66730a);
                com.ss.android.ugc.aweme.framework.a.a.a(gVar.o + ", MusicDownloadSuccess: musicId=" + gVar.f111432c + ',' + " url=" + gVar.f111433d + ',' + " curUrl=" + "" + " isPrivate=" + gVar.f111440k.isNeedSetCookie());
                new C2855a(this).a(null);
            }

            a(c cVar, long j2, String str, long j3, long j4) {
                this.f111444a = cVar;
                this.f111445b = j2;
                this.f111446c = str;
                this.f111447d = j3;
                this.f111448e = j4;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(g gVar) {
            this.f111443a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(int i2) {
            if (!this.f111443a.f111435f) {
                this.f111443a.f111441l.a(i2);
            } else if (i2 > 99) {
                this.f111443a.f111441l.a(99);
            } else {
                this.f111443a.f111441l.a(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(com.ss.android.ugc.musicprovider.a aVar) {
            boolean z;
            l.d(aVar, "");
            g gVar = this.f111443a;
            if (aVar == null || !(aVar.getErrorCode() == 1006 || aVar.getErrorCode() == 1007)) {
                z = false;
            } else {
                z = true;
            }
            gVar.a(z);
            g.a(this.f111443a, Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg(), aVar.getErrorUrl(), (String) null, 56);
            this.f111443a.f111441l.a(this.f111443a.a(Integer.valueOf(aVar.getErrorCode())));
            f fVar = this.f111443a.f111439j;
            if (fVar != null) {
                String str = this.f111443a.f111432c;
                l.b(str, "");
                fVar.b(str, this.f111443a);
            }
        }

        @Override // com.ss.android.ugc.aweme.music.service.b
        public final void a(String str, MusicWaveBean musicWaveBean) {
            long j2;
            l.d(str, "");
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f111443a.f111438i < 0) {
                j2 = -1;
            } else {
                j2 = currentTimeMillis - this.f111443a.f111438i;
            }
            this.f111443a.d().step("av_music_download", "fetch onSuccess");
            bj.a("Download Music onsuccess, id: " + this.f111443a.f111432c + " ，duration: " + j2 + ", musicFile:" + str);
            if (!com.ss.android.ugc.aweme.video.e.b(str)) {
                this.f111443a.a(false);
                g.a(this.f111443a, (Integer) 1063, "file not exist", (String) null, (String) null, 60);
                this.f111443a.f111441l.a(this.f111443a.a((Integer) 1063));
                return;
            }
            this.f111443a.c().abilityService().infoService().audioLegal(str, this.f111443a.p, new a(this, g.a(str), str, j2, currentTimeMillis));
        }
    }

    @Override // com.ss.android.ugc.aweme.music.e.a
    public final void b() {
        b bVar = this.f111436g;
        String str = this.f111432c;
        l.b(str, "");
        bVar.a(str);
        this.f111441l.a();
        String str2 = this.o;
        String str3 = this.f111432c;
        com.bytedance.apm.b.a("aweme_music_download_error_rate", 1, new com.ss.android.ugc.aweme.app.f.c().a("trace", str2).a("music_id", str3).a("fileUrlList", this.f111433d).a("downloadStrategy", Integer.valueOf(MusicService.m().c())).a("is_private", Boolean.valueOf(this.f111440k.isNeedSetCookie())).a("isUseTTPlayer", Boolean.valueOf(v.a())).a("isHitCache", Boolean.valueOf(this.f111437h)).a());
    }

    public static long a(String str) {
        try {
            return new File(str).length();
        } catch (Exception e2) {
            String str2 = "Download Music, getFileSize fail " + e2.getMessage();
            l.d(str2, "");
            com.ss.android.ugc.aweme.framework.a.a.b(6, "Music", str2);
            return -1;
        }
    }

    public final com.ss.android.ugc.musicprovider.a a(Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        return new com.ss.android.ugc.musicprovider.a(i2, this.f111431b.getString(R.string.dbb));
    }

    public final void a(boolean z) {
        i.b(new e(this, z), i.f4826c);
    }

    static /* synthetic */ void a(g gVar, Integer num, String str, String str2, String str3, int i2) {
        String str4 = str2;
        String str5 = "";
        if ((i2 & 4) != 0) {
            str4 = str5;
        }
        if ((i2 & 32) == 0) {
            str5 = str3;
        }
        gVar.a(num, str, str4, 0, 0, str5);
    }

    public final void a(Integer num, String str, String str2, int i2, long j2, String str3) {
        int i3;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = -1;
        }
        String str4 = this.f111432c;
        String str5 = this.f111433d;
        String str6 = this.o;
        boolean isNeedSetCookie = this.f111440k.isNeedSetCookie();
        boolean z = this.f111437h;
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = com.ss.android.ugc.aweme.music.ui.b.a.a();
        }
        boolean z2 = j.f107229h;
        if (z2) {
            com.bytedance.apm.b.a("aweme_music_download_error_rate", i3, new com.ss.android.ugc.aweme.app.f.c().a("hostname", com.ss.android.ugc.aweme.music.k.d.a(str2)).a("trace", str6).a("music_id", str4).a("fileUrlList", str5).a("downloadStrategy", Integer.valueOf(MusicService.m().c())).a("fileMagic", str3).a("code", String.valueOf(i2)).a("size", Long.valueOf(j2)).a("is_private", Boolean.valueOf(isNeedSetCookie)).a("isUseTTPlayer", Boolean.valueOf(v.a())).a("errorDesc", str).a("isHitCache", Boolean.valueOf(z)).a());
        } else {
            z2 = false;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", b.a.f48731a.a().toString());
            jSONObject.put("netWorkSpeed", (int) b.a.f48731a.b());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorUrl", str2);
            jSONObject.put("is_network_available", z2);
            jSONObject.put("isUseTTPlayer", v.a());
            jSONObject.put("isHitCache", z);
            o.b("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Context context = this.f111431b;
        l.b(context, "");
        String str7 = this.f111432c;
        String str8 = this.o;
        String str9 = this.f111433d;
        l.d(context, "");
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = com.ss.android.ugc.aweme.music.ui.b.b.a();
        }
        boolean z3 = j.f107229h;
        com.facebook.j.a.b bVar = b.a.f48731a;
        l.b(bVar, "");
        int b2 = (int) bVar.b();
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("music_id", str7).a("enter_from", str8).a("url", str9);
        IMusicService m2 = MusicService.m();
        l.b(m2, "");
        r.a("download_music_failed", a2.a("download_strategy", m2.c()).a("fail_reason", str).a("net_speed", b2).a("is_use_tt_player", Boolean.valueOf(v.a())).a("isNetworkAvailable", Boolean.valueOf(z3)).f66730a);
        com.ss.android.ugc.aweme.framework.a.a.a(this.o + ", MusicDownloadError: errocode=" + num + "errorMsg=" + str + "musicId=" + this.f111432c + ',' + " url=" + this.f111433d + ',' + " curUrl=" + str2 + " isPrivate=" + this.f111440k.isNeedSetCookie() + " fileMagic=" + str3 + " fileSize=" + j2 + " veErrorCode=" + i2);
    }

    public g(Context context, MusicModel musicModel, com.ss.android.ugc.aweme.music.service.b bVar, CountDownLatch countDownLatch, boolean z, boolean z2, String str, int i2) {
        boolean z3;
        l.d(context, "");
        l.d(musicModel, "");
        l.d(bVar, "");
        this.f111440k = musicModel;
        this.f111441l = bVar;
        this.f111442m = countDownLatch;
        this.u = z;
        this.n = z2;
        this.o = str;
        this.p = i2;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f111431b = applicationContext;
        this.f111432c = musicModel.getMusicId();
        this.f111433d = e.a(musicModel.getUrl());
        com.ss.android.ugc.musicprovider.e a2 = com.ss.android.ugc.musicprovider.e.a();
        l.b(a2, "");
        this.f111434e = a2.c();
        if (z || countDownLatch != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f111435f = z3;
        this.f111436g = h.a();
        this.f111438i = -1;
        this.r = h.i.a((h.f.a.a) d.f111449a);
        this.s = h.i.a((h.f.a.a) new b(this));
        this.t = h.i.a((h.f.a.a) new f(this));
    }
}

package com.ss.android.ugc.aweme.kids.a.c;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.facebook.j.a.b;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
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

public final class g implements b {
    public static final a q = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Context f105276b;

    /* renamed from: c  reason: collision with root package name */
    public final String f105277c;

    /* renamed from: d  reason: collision with root package name */
    final String f105278d;

    /* renamed from: e  reason: collision with root package name */
    public final String f105279e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f105280f;

    /* renamed from: g  reason: collision with root package name */
    public final c f105281g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f105282h;

    /* renamed from: i  reason: collision with root package name */
    public long f105283i;

    /* renamed from: j  reason: collision with root package name */
    public f f105284j;

    /* renamed from: k  reason: collision with root package name */
    public final MusicModel f105285k;

    /* renamed from: l  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.kids.a.g.a f105286l;

    /* renamed from: m  reason: collision with root package name */
    public final CountDownLatch f105287m;
    public boolean n;
    public String o;
    public int p;
    private final h r;
    private final h s;
    private final h t;
    private final boolean u;

    static {
        Covode.recordClassIndex(67488);
    }

    public final IExternalService c() {
        return (IExternalService) this.r.getValue();
    }

    public final IAVPerformance d() {
        return (IAVPerformance) this.s.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67489);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<IExternalService> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f105294a = new d();

        static {
            Covode.recordClassIndex(67494);
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
            Covode.recordClassIndex(67490);
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
        final /* synthetic */ g f105295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f105296b;

        static {
            Covode.recordClassIndex(67495);
        }

        e(g gVar, boolean z) {
            this.f105295a = gVar;
            this.f105296b = z;
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
            if (this.f105295a.n) {
                if (this.f105296b) {
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
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f105295a.f105276b).a(i2).a();
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<ITakeInSameOptimize> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(67496);
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

    @Override // com.ss.android.ugc.aweme.kids.a.c.b
    public final void a() {
        this.f105281g.a();
        this.f105284j = null;
    }

    public static final class c implements com.ss.android.ugc.aweme.kids.a.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f105288a;

        static {
            Covode.recordClassIndex(67491);
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void b() {
            f fVar = this.f105288a.f105284j;
            if (fVar != null) {
                String str = this.f105288a.f105277c;
                l.b(str, "");
                fVar.b(str, this.f105288a);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a() {
            f fVar = this.f105288a.f105284j;
            if (fVar != null) {
                String str = this.f105288a.f105277c;
                l.b(str, "");
                fVar.a(str, this.f105288a);
            }
            bj.a("Download Music start, id: " + this.f105288a.f105277c + " time: " + System.currentTimeMillis());
        }

        public static final class a implements IAVInfoService.IGetInfoCallback<Integer> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f105289a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f105290b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f105291c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ long f105292d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ long f105293e;

            static {
                Covode.recordClassIndex(67492);
            }

            /* renamed from: com.ss.android.ugc.aweme.kids.a.c.g$c$a$a  reason: collision with other inner class name */
            static final class C2692a extends m implements h.f.a.b<MusicWaveBean, z> {
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(67493);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2692a(a aVar) {
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
                    this.this$0.f105289a.f105288a.d().step("av_music_download", "audio2wavebean");
                    CountDownLatch countDownLatch = this.this$0.f105289a.f105288a.f105287m;
                    if (countDownLatch != null) {
                        try {
                            Boolean.valueOf(countDownLatch.await(1500, TimeUnit.MILLISECONDS));
                        } catch (Exception e2) {
                            bj.b("Download Music, countDownLatch await error: ".concat(String.valueOf(e2)));
                        }
                    }
                    this.this$0.f105289a.f105288a.d().step("av_music_download", "await countDownLatch");
                    bj.a("Download Music get wave data duration: " + (System.currentTimeMillis() - this.this$0.f105293e) + " currentTime: " + System.currentTimeMillis());
                    if (this.this$0.f105289a.f105288a.f105280f) {
                        this.this$0.f105289a.f105288a.f105286l.a(100);
                    }
                    this.this$0.f105289a.f105288a.d().end("av_music_download", "fetch end");
                    f fVar = this.this$0.f105289a.f105288a.f105284j;
                    if (fVar != null) {
                        String str = this.this$0.f105289a.f105288a.f105277c;
                        l.b(str, "");
                        fVar.b(str, this.this$0.f105289a.f105288a);
                    }
                    this.this$0.f105289a.f105288a.f105286l.a(this.this$0.f105291c, musicWaveBean);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(Integer num) {
                double d2;
                int intValue = num.intValue();
                this.f105289a.f105288a.d().step("av_music_download", "music audioLegal");
                if (intValue < 0) {
                    this.f105289a.f105288a.a(false);
                    this.f105289a.f105288a.a((Integer) -2, "", "", intValue, this.f105290b, cs.d(this.f105291c));
                    this.f105289a.f105288a.f105286l.a(this.f105289a.f105288a.a((Integer) -2));
                    return;
                }
                g gVar = this.f105289a.f105288a;
                long j2 = this.f105292d;
                long j3 = this.f105290b;
                String str = gVar.f105278d;
                boolean isNeedSetCookie = gVar.f105285k.isNeedSetCookie();
                String str2 = gVar.o;
                boolean z = gVar.f105282h;
                if (j2 == 0) {
                    d2 = 0.0d;
                } else {
                    d2 = (double) (j3 / j2);
                }
                com.bytedance.apm.b.a("aweme_music_download_error_rate", 0, new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(j2)).a("downloadStrategy", (Integer) 3).a("speed", Double.valueOf(d2)).a("size", Long.valueOf(j3)).a("fileUri", "").a("fileUrlList", str).a("hostname", com.ss.android.ugc.aweme.kids.a.i.c.a("")).a("is_private", Boolean.valueOf(isNeedSetCookie)).a("isUseTTPlayer", (Boolean) false).a("trace", str2).a("isHitCache", Boolean.valueOf(z)).a());
                com.ss.android.ugc.aweme.framework.a.a.a(gVar.o + ", MusicDownloadSuccess: musicId=" + gVar.f105277c + ',' + " url=" + gVar.f105278d + ',' + " curUrl=" + "" + " isPrivate=" + gVar.f105285k.isNeedSetCookie());
                new C2692a(this).a(null);
            }

            a(c cVar, long j2, String str, long j3, long j4) {
                this.f105289a = cVar;
                this.f105290b = j2;
                this.f105291c = str;
                this.f105292d = j3;
                this.f105293e = j4;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public c(g gVar) {
            this.f105288a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a(int i2) {
            if (!this.f105288a.f105280f) {
                this.f105288a.f105286l.a(i2);
            } else if (i2 > 99) {
                this.f105288a.f105286l.a(99);
            } else {
                this.f105288a.f105286l.a(i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a(com.ss.android.ugc.aweme.kids.b.a aVar) {
            boolean z;
            l.d(aVar, "");
            g gVar = this.f105288a;
            if (aVar == null || !(aVar.getErrorCode() == 1006 || aVar.getErrorCode() == 1007)) {
                z = false;
            } else {
                z = true;
            }
            gVar.a(z);
            g.a(this.f105288a, Integer.valueOf(aVar.getErrorCode()), aVar.getErrorMsg(), aVar.getErrorUrl(), (String) null, 56);
            this.f105288a.f105286l.a(this.f105288a.a(Integer.valueOf(aVar.getErrorCode())));
            f fVar = this.f105288a.f105284j;
            if (fVar != null) {
                String str = this.f105288a.f105277c;
                l.b(str, "");
                fVar.b(str, this.f105288a);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.a.g.a
        public final void a(String str, MusicWaveBean musicWaveBean) {
            long j2;
            l.d(str, "");
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f105288a.f105283i < 0) {
                j2 = -1;
            } else {
                j2 = currentTimeMillis - this.f105288a.f105283i;
            }
            this.f105288a.d().step("av_music_download", "fetch onSuccess");
            bj.a("Download Music onsuccess, id: " + this.f105288a.f105277c + " ，duration: " + j2);
            if (!com.ss.android.ugc.aweme.video.e.b(str)) {
                this.f105288a.a(false);
                g.a(this.f105288a, (Integer) 1063, "file not exist", (String) null, (String) null, 60);
                this.f105288a.f105286l.a(this.f105288a.a((Integer) 1063));
                return;
            }
            this.f105288a.c().abilityService().infoService().audioLegal(str, this.f105288a.p, new a(this, g.a(str), str, j2, currentTimeMillis));
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.a.c.b
    public final void b() {
        c cVar = this.f105281g;
        String str = this.f105277c;
        l.b(str, "");
        cVar.a(str);
        this.f105286l.b();
        String str2 = this.o;
        String str3 = this.f105277c;
        com.bytedance.apm.b.a("aweme_music_download_error_rate", 1, new com.ss.android.ugc.aweme.app.f.c().a("trace", str2).a("music_id", str3).a("fileUrlList", this.f105278d).a("downloadStrategy", (Integer) 3).a("is_private", Boolean.valueOf(this.f105285k.isNeedSetCookie())).a("isUseTTPlayer", (Boolean) false).a("isHitCache", Boolean.valueOf(this.f105282h)).a());
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

    public final com.ss.android.ugc.aweme.kids.b.a a(Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        return new com.ss.android.ugc.aweme.kids.b.a(i2, this.f105276b.getString(R.string.dbb));
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
        String str4 = this.f105277c;
        String str5 = this.f105278d;
        String str6 = this.o;
        boolean isNeedSetCookie = this.f105285k.isNeedSetCookie();
        boolean z = this.f105282h;
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = com.ss.android.ugc.aweme.kids.a.h.a.a.a();
        }
        boolean z2 = j.f107229h;
        if (z2) {
            com.bytedance.apm.b.a("aweme_music_download_error_rate", i3, new com.ss.android.ugc.aweme.app.f.c().a("hostname", com.ss.android.ugc.aweme.kids.a.i.c.a(str2)).a("trace", str6).a("music_id", str4).a("fileUrlList", str5).a("downloadStrategy", (Integer) 3).a("fileMagic", str3).a("code", String.valueOf(i2)).a("size", Long.valueOf(j2)).a("is_private", Boolean.valueOf(isNeedSetCookie)).a("isUseTTPlayer", (Boolean) false).a("errorDesc", str).a("isHitCache", Boolean.valueOf(z)).a());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", b.a.f48731a.a().toString());
            jSONObject.put("netWorkSpeed", (int) b.a.f48731a.b());
            jSONObject.put("errorDesc", str);
            jSONObject.put("errorUrl", str2);
            jSONObject.put("is_network_available", z2);
            jSONObject.put("isUseTTPlayer", false);
            jSONObject.put("isHitCache", z);
            o.b("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.framework.a.a.a(this.o + ", MusicDownloadError: errocode=" + num + "errorMsg=" + str + "musicId=" + this.f105277c + ',' + " url=" + this.f105278d + ',' + " curUrl=" + str2 + " isPrivate=" + this.f105285k.isNeedSetCookie() + " fileMagic=" + str3 + " fileSize=" + j2 + " veErrorCode=" + i2);
    }

    public g(Context context, MusicModel musicModel, com.ss.android.ugc.aweme.kids.a.g.a aVar, CountDownLatch countDownLatch, boolean z, boolean z2, String str, int i2) {
        boolean z3;
        l.d(context, "");
        l.d(musicModel, "");
        l.d(aVar, "");
        this.f105285k = musicModel;
        this.f105286l = aVar;
        this.f105287m = countDownLatch;
        this.u = z;
        this.n = z2;
        this.o = str;
        this.p = i2;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f105276b = applicationContext;
        this.f105277c = musicModel.getMusicId();
        this.f105278d = e.a(musicModel.getUrl());
        com.ss.android.ugc.aweme.kids.b.d a2 = com.ss.android.ugc.aweme.kids.b.d.a();
        l.b(a2, "");
        this.f105279e = a2.b();
        if (z || countDownLatch != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f105280f = z3;
        this.f105281g = new h((byte) 0);
        this.f105283i = -1;
        this.r = h.i.a((h.f.a.a) d.f105294a);
        this.s = h.i.a((h.f.a.a) new b(this));
        this.t = h.i.a((h.f.a.a) new f(this));
    }
}

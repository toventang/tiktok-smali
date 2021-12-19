package com.ss.android.ugc.aweme.shortvideo.l;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.DuetConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.StickerDownloadConfig;
import com.ss.android.ugc.aweme.setting.n;
import com.ss.android.ugc.aweme.setting.s;
import com.ss.android.ugc.aweme.shortvideo.reaction.a.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.g;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.util.r;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.y;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f128647a = "";

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f128648b = Collections.emptyMap();

    /* renamed from: c  reason: collision with root package name */
    public String f128649c;

    /* renamed from: d  reason: collision with root package name */
    public Effect f128650d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f128651e;

    /* renamed from: f  reason: collision with root package name */
    public d f128652f;

    /* renamed from: g  reason: collision with root package name */
    g f128653g;

    /* renamed from: h  reason: collision with root package name */
    protected Activity f128654h;

    /* renamed from: i  reason: collision with root package name */
    public a f128655i = new C3357b();

    /* renamed from: j  reason: collision with root package name */
    public List<String> f128656j;

    /* renamed from: k  reason: collision with root package name */
    public Aweme f128657k;

    /* renamed from: l  reason: collision with root package name */
    public String f128658l = "";

    /* renamed from: m  reason: collision with root package name */
    public boolean f128659m = false;
    public boolean n = false;
    public boolean o;
    public boolean p;
    public int q;
    public final IRecordService.UICallback r = new IRecordService.UICallback() {
        /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(84340);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void postFail() {
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final boolean checkIsCanceled() {
            return b.this.o;
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void preSuccess() {
            b.this.a();
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void postSuccess() {
            a aVar = b.this.f128655i;
            b.this.f128657k.getAid();
            aVar.a();
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            b.this.a(dVar);
            dVar.a("loading_status", 1);
            AVExternalServiceImpl.a().getAVMobService().onEventV3("loading_finish", dVar.f66730a);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
        public final void preFail(int i2) {
            b.this.b();
        }
    };
    public Runnable s = new Runnable() {
        /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass8 */

        static {
            Covode.recordClassIndex(84344);
        }

        public final void run() {
            if (b.this.f128652f != null) {
                d dVar = b.this.f128652f;
                int i2 = 100;
                if (b.this.f128651e < 100) {
                    i2 = b.this.f128651e;
                }
                dVar.setProgress(i2);
            }
        }
    };
    private String t = "duet";
    private String u;
    private String v;
    private String w = AVExternalServiceImpl.a().configService().cacheConfig().cacheDir();
    private Handler x = new Handler(Looper.getMainLooper());
    private long y;

    public interface a {
        static {
            Covode.recordClassIndex(84345);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(84335);
    }

    public final void a(final String str, Activity activity, final String str2) {
        Activity activity2;
        this.f128654h = activity;
        this.o = false;
        if (!AVExternalServiceImpl.a().publishService().isPublishable()) {
            h();
            this.f128655i.b();
        } else if (j.a(str)) {
            this.f128655i.b();
        } else if (this.f128654h == null || f()) {
            this.f128654h = activity;
            this.f128658l = str2;
            if (i()) {
                this.t = "duet_page";
            }
            if (n.a() && this.f128653g == null && this.f128654h != null) {
                j();
            } else if (!n.a() && this.f128652f == null && (activity2 = this.f128654h) != null) {
                d a2 = d.a(activity2, activity2.getResources().getString(R.string.bdz));
                this.f128652f = a2;
                a2.setIndeterminate(true);
                this.y = System.currentTimeMillis();
            }
            com.ss.android.b.a.a.a.a(new Runnable() {
                /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(84336);
                }

                public final void run() {
                    try {
                        final Aweme a2 = DetailApi.a(str, "", 0, (String) null);
                        com.ss.android.b.a.a.a.b(new Runnable() {
                            /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(84337);
                            }

                            public final void run() {
                                if (b.this.f128654h != null) {
                                    Aweme aweme = a2;
                                    if (aweme == null) {
                                        b.this.a();
                                    } else if (aweme.getStatus() != null && a2.getStatus().isPrivate()) {
                                        new com.bytedance.tux.g.b(b.this.f128654h).e(R.string.cd5).b();
                                        b.this.a();
                                        b.this.f128655i.b();
                                    } else if (a2.getStatus() == null || !a2.getStatus().isDelete()) {
                                        b.this.a(a2, b.this.f128654h, str2);
                                    } else {
                                        new com.bytedance.tux.g.b(b.this.f128654h).e(R.string.cd4).b();
                                        b.this.a();
                                        b.this.f128655i.b();
                                    }
                                }
                            }
                        });
                    } catch (Exception unused) {
                        b.this.b();
                    }
                }
            });
        } else {
            new com.bytedance.tux.g.b(this.f128654h).e(R.string.de9).b();
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private void h() {
        com.ss.android.b.a.a.a.b(new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass7 */

            static {
                Covode.recordClassIndex(84343);
            }

            public final void run() {
                if (b.this.f128654h != null) {
                    new com.bytedance.tux.g.b(b.this.f128654h).e(R.string.t9).b();
                }
            }
        });
    }

    private boolean i() {
        return TextUtils.equals("duet_page", this.f128658l);
    }

    public final void b() {
        com.ss.android.b.a.a.a.b(new Runnable() {
            /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass6 */

            static {
                Covode.recordClassIndex(84342);
            }

            public final void run() {
                if (b.this.f128654h != null) {
                    if (!b.this.p) {
                        b.this.p = true;
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        b.this.a(dVar);
                        dVar.a("loading_status", 0);
                        AVExternalServiceImpl.a().getAVMobService().onEventV3("loading_finish", dVar.f66730a);
                    }
                    if (!s.a() || !b.this.o) {
                        b.this.a();
                        new com.bytedance.tux.g.b(b.this.f128654h).e(R.string.bbv).b();
                        b.this.f128655i.b();
                    }
                }
            }
        });
    }

    private static boolean f() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean e2 = e();
        com.ss.android.ugc.aweme.lancet.j.f107229h = e2;
        return e2;
    }

    private void j() {
        if (this.f128653g == null) {
            if (s.a()) {
                this.f128653g = g.b.a(this.f128654h, g.a.VISIBLE_AFTER_5S, new l(this));
            } else {
                this.f128653g = g.b.a(this.f128654h);
            }
            this.f128653g.a();
            this.f128653g.setMessage(this.f128654h.getResources().getString(R.string.bdz));
            this.y = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        if (n.a()) {
            g gVar = this.f128653g;
            if (gVar != null) {
                gVar.setMessage(this.f128654h.getResources().getString(R.string.fyd));
                return;
            }
            return;
        }
        a();
        Activity activity = this.f128654h;
        d a2 = d.a(activity, activity.getResources().getString(R.string.fyd));
        this.f128652f = a2;
        a2.setIndeterminate(true);
    }

    private void g() {
        i<TResult> iVar;
        if (y.c(this.f128657k)) {
            VideoUrlModel playAddrH264 = this.f128657k.getVideo().getPlayAddrH264();
            if (playAddrH264 == null || com.bytedance.common.utility.collection.b.a((Collection) playAddrH264.getUrlList())) {
                this.f128655i.b();
                return;
            }
            i[] iVarArr = new i[2];
            this.f128650d = null;
            final b.j jVar = new b.j();
            AVExternalServiceImpl.a().asyncServiceWithOutPanel("duet", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(84338);
                }

                @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    b.this.b();
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    Video video = b.this.f128657k.getVideo();
                    if (video == null) {
                        jVar.a((Object) null);
                    } else {
                        asyncAVService.uiService().recordService().preloadDuetLayout(video.getWidth(), video.getHeight(), new m(this, jVar));
                    }
                }
            });
            iVarArr[0] = jVar.f4869a;
            final b.j jVar2 = new b.j();
            i.b(i.f128684a, i.f4824a);
            VideoUrlModel playAddrH2642 = this.f128657k.getVideo().getPlayAddrH264();
            this.f128656j = c.a(playAddrH2642.getUrlList(), this.f128657k);
            String b2 = com.bytedance.common.utility.d.b(playAddrH2642.getBitRatedRatioUri());
            this.f128649c = this.w + b2 + ".mp4";
            this.u = this.w + "temp_" + b2 + ".mp4";
            this.v = this.w + "temp_" + b2 + ".wav";
            if (e.b(this.f128649c)) {
                jVar2.a((Object) null);
                iVar = jVar2.f4869a;
            } else {
                if (!e.b(this.f128649c)) {
                    e.a(this.w, false);
                }
                com.ss.android.ugc.aweme.shortvideo.reaction.a.d.a(this.f128657k, this.f128656j, this.w, b2 + ".mp4", new com.ss.android.ugc.aweme.shortvideo.reaction.a.b(this.f128656j, this.t) {
                    /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(84339);
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
                    public final boolean a() {
                        return b.this.o;
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
                    public final void a(String str, String str2) {
                        super.a(str, str2);
                        if (new File(str2).length() == 0) {
                            Exception exc = new Exception("WaterMarkComposer download file size == 0: " + b.this.f128656j);
                            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
                            jVar2.a(exc);
                            return;
                        }
                        b.this.f128649c = str2;
                        jVar2.a((Object) null);
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
                    public final void a(Exception exc, String str, Integer num) {
                        super.a(exc, str, num);
                        jVar2.a(exc);
                    }

                    @Override // com.ss.android.ugc.aweme.shortvideo.reaction.a.a
                    public final void a(int i2, long j2, long j3) {
                        super.a(i2, j2, j3);
                        if (b.this.f128654h != null) {
                            b.this.q = i2;
                            b.this.f128651e = i2;
                            if (!n.a()) {
                                com.ss.android.b.a.a.a.b(b.this.s);
                            }
                        }
                    }
                });
                iVar = jVar2.f4869a;
            }
            iVarArr[1] = iVar;
            i.b((Collection<? extends i<?>>) ap.a(iVarArr)).a(new g(this), i.f4826c, null);
            this.q = 0;
            this.x.postDelayed(new h(this), 60000);
        } else if (!com.ss.android.ugc.aweme.language.d.c() || this.f128657k.getAuthor() == null || !this.f128657k.getAuthor().isPreventDownload()) {
            a();
            if (this.f128654h != null) {
                new com.bytedance.tux.g.b(this.f128654h).e(R.string.be7).b();
            }
        } else if (this.f128654h != null) {
            a();
            new com.bytedance.tux.g.b(this.f128654h).e(R.string.be0).b();
            this.f128655i.b();
        }
    }

    public final void a() {
        d dVar;
        g gVar;
        if (n.a() && (gVar = this.f128653g) != null) {
            try {
                gVar.dismiss();
            } catch (Exception unused) {
            }
            this.f128653g = null;
        } else if (!n.a() && (dVar = this.f128652f) != null) {
            try {
                dVar.dismiss();
            } catch (Exception unused2) {
            }
            this.f128652f = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        String str;
        String str2;
        String shootway;
        if (in.d()) {
            return;
        }
        if (this.f128654h != null) {
            if (TextUtils.isEmpty(this.f128647a)) {
                this.f128647a = UUID.randomUUID().toString();
            }
            RecordConfig.Builder creationId = new RecordConfig.Builder().creationId(this.f128647a);
            if (i()) {
                str = "duet_page";
            } else {
                str = "duet";
            }
            RecordConfig.Builder musicOrigin = creationId.shootWay(str).enterFrom(this.f128658l).groupId(this.f128657k.getAid()).musicOrigin("duet");
            final DuetConfig duetConfig = new DuetConfig(this.f128649c, this.u, this.v, this.f128657k.getAuthor(), this.f128657k.getAid(), 1000, a(this.f128657k), this.f128659m, this.n);
            Aweme aweme = this.f128657k;
            if (aweme != null && aweme.hasStickerID()) {
                musicOrigin.stickers(r.a(this.f128657k.getStickerIDs()));
            }
            Aweme aweme2 = this.f128657k;
            if (!(aweme2 == null || aweme2.getMusic() == null)) {
                musicOrigin.musicModel(this.f128657k.getMusic().convertToMusicModel());
            }
            Aweme aweme3 = this.f128657k;
            if (!(aweme3 == null || aweme3.getGameInfo() == null)) {
                duetConfig.setDuetGameScore(Integer.valueOf(this.f128657k.getGameInfo().getGameScore()));
                duetConfig.setMStickerDownloadConfig(new StickerDownloadConfig(b(this.f128657k), com.ss.android.ugc.aweme.language.d.g()));
            }
            final RecordConfig build = musicOrigin.build();
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", build.getCreationId()).a("shoot_way", build.getShootway()).a("is_ui_shoot", (Object) false).a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(this.f128647a)).a(this.f128648b).a("is_through_duet_sticker", this.f128659m ? 1 : 0).a("is_from_duet_button", this.n ? 1 : 0).a("prop_id", this.f128657k.getStickerIDs());
            if (i()) {
                a2.a("origin_group_id", this.f128657k.getAid());
                a2.a("origin_author_id", this.f128657k.getAuthorUid());
            } else {
                a2.a("group_id", build.getGroupId());
            }
            com.ss.android.ugc.aweme.feed.param.b a3 = FeedParamProvider.a.a(this.f128654h);
            if (a3 == null || a3.getNewsId() == null) {
                str2 = "";
            } else {
                str2 = a3.getNewsId();
            }
            if (!TextUtils.isEmpty(str2)) {
                a2.a("news_id", str2);
            }
            a2.a("duet_layout", "new_left");
            AVExternalServiceImpl.a().getAVMobService().onEventV3("shoot", a2.f66730a);
            duetConfig.setOutputDir(this.w);
            duetConfig.setDuetLayout(this.f128650d);
            Aweme aweme4 = this.f128657k;
            if (!(aweme4 == null || aweme4.getFromRawChallenge() == null || !this.f128657k.getFromRawChallenge().isCommerce())) {
                duetConfig.setDuetChallenge(this.f128657k.getFromRawChallenge().getChallengeName());
            }
            ah.f109483a = build.getEnterFrom();
            if (TextUtils.isEmpty(build.getShootway())) {
                shootway = "duet_with_movie";
            } else {
                shootway = build.getShootway();
            }
            AVExternalServiceImpl.a().asyncServiceWithOutPanel(shootway, new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.shortvideo.l.b.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(84341);
                }

                @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    b.this.b();
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startDuet(b.this.f128654h, build, duetConfig, b.this.r, b.this.f128658l, build.getShootway());
                }
            });
            return;
        }
        b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.b$b  reason: collision with other inner class name */
    class C3357b implements a {
        static {
            Covode.recordClassIndex(84346);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.b.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.l.b.a
        public final void b() {
        }

        C3357b() {
        }
    }

    private void a(String str) {
        if (this.f128654h != null) {
            new com.bytedance.tux.g.b(this.f128654h).a(str).b();
            a();
            this.f128655i.b();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object b(i iVar) {
        if (!iVar.c() && !iVar.b() && iVar.d() != null) {
            this.f128657k = (Aweme) iVar.d();
        }
        g();
        return null;
    }

    private static boolean a(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getDuetStickerStruct() != null) {
                    return interactStickerStruct.getDuetStickerStruct().getOpenMic();
                }
            }
        }
        return false;
    }

    private static String b(Aweme aweme) {
        if (aweme.getStickerIDs() != null && !aweme.getStickerIDs().isEmpty()) {
            try {
                return aweme.getStickerIDs().split(",")[0];
            } catch (NumberFormatException unused) {
                com.ss.android.ugc.aweme.framework.a.a.a("id format error");
            }
        }
        return "-1";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(i iVar) {
        if (iVar.c()) {
            b();
            return null;
        } else if (this.o) {
            return null;
        } else {
            com.ss.android.b.a.a.a.b(new j(this));
            com.ss.android.b.a.a.a.a(new k(this));
            return null;
        }
    }

    public final void a(com.ss.android.ugc.aweme.app.f.d dVar) {
        String str;
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("creation_id", this.f128647a);
        if (i()) {
            str = "duet_page";
        } else {
            str = "duet";
        }
        a2.a("shoot_way", str).a("enter_from", this.f128658l).a("loading_duration", System.currentTimeMillis() - this.y).a("group_id", this.f128657k.getVideo().getPlayAddrH264().getSourceId()).a("content_source", "shoot").a("content_type", "video").a("loading_type", "video");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(Activity activity, i iVar) {
        if (iVar.c() || iVar.b()) {
            a(activity.getResources().getString(R.string.de9));
        } else if (!((com.ss.android.ugc.aweme.shortvideo.duet.b) iVar.d()).f126497a) {
            String str = ((com.ss.android.ugc.aweme.shortvideo.duet.b) iVar.d()).f126500d;
            if (TextUtils.isEmpty(str)) {
                str = activity.getResources().getString(R.string.ro);
            }
            a(str);
        } else if (!y.c(this.f128657k)) {
            i.b(new e(this), i.f4824a).a(new f(this), i.f4826c, null);
        } else {
            g();
        }
        return null;
    }

    public final void a(Aweme aweme, Activity activity, String str) {
        this.f128654h = activity;
        this.o = false;
        if (!AVExternalServiceImpl.a().publishService().isPublishable()) {
            h();
            this.f128655i.b();
        } else if (in.d()) {
            this.f128655i.b();
            a();
        } else {
            this.f128657k = aweme;
            this.f128658l = str;
            if (!(aweme == null || aweme.getAuthor() == null)) {
                if (!e.e()) {
                    new com.bytedance.tux.g.b(this.f128654h).e(R.string.fhb).b();
                } else if (e.f() < 20971520) {
                    new com.bytedance.tux.g.b(this.f128654h).e(R.string.fhc).b();
                } else if (CommerceMediaServiceImpl.f().b(this.f128657k.getMusic())) {
                    if (this.f128654h != null) {
                        new com.bytedance.tux.g.b(this.f128654h).e(R.string.ft7).b();
                    }
                } else if (this.f128654h == null || f()) {
                    if (n.a()) {
                        j();
                    } else {
                        if (this.f128652f == null) {
                            Activity activity2 = this.f128654h;
                            this.f128652f = d.a(activity2, activity2.getResources().getString(R.string.bdz));
                        }
                        this.f128652f.setIndeterminate(false);
                        this.f128652f.setProgress(0);
                        this.y = System.currentTimeMillis();
                    }
                    i.b(new c(aweme), i.f4824a).a(new d(this, activity), i.f4826c, null);
                    return;
                } else {
                    new com.bytedance.tux.g.b(this.f128654h).e(R.string.de9).b();
                    return;
                }
            }
            this.f128655i.b();
            a();
        }
    }
}

package com.ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ao;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.jedi.arch.x;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.experiment.ch;
import com.ss.android.ugc.aweme.experiment.fw;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.ad;
import com.ss.android.ugc.aweme.shortvideo.ak;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dn;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.gamora.recorder.choosemusic.a.a;
import com.ss.android.ugc.gamora.recorder.choosemusic.e;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.y;
import h.u;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class d extends com.bytedance.als.j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {
    static final /* synthetic */ h.k.i[] $$delegatedProperties = {new y(d.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(d.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(d.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(d.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(d.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(d.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(d.class, "musicCutComponent", "getMusicCutComponent()Lcom/ss/android/ugc/gamora/recorder/musiccut/MusicCutComponent;", 0), new y(d.class, "countDownComponent", "getCountDownComponent()Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownComponent;", 0)};
    private final h.h.d activity$delegate = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);
    private final h.h.d bottomTabApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
    private final h.h.d cameraApi$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
    private final h.h chooseMusicHandler$delegate = h.i.a((h.f.a.a) new b(this));
    private final h.h.d countDownComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.countdown.b.class);
    private final com.bytedance.o.f diContainer;
    public boolean enableRecordChooseMusicComponent = true;
    private com.ss.android.ugc.aweme.shortvideo.c internalCurrentMusic;
    public final com.bytedance.als.k<z> musicAdded = new com.bytedance.als.k<>();
    public final com.bytedance.als.k<z> musicCleared = new com.bytedance.als.k<>();
    private final h.h.d musicCutComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.j.b.class);
    public final com.ss.android.ugc.gamora.recorder.choosemusic.a.a musicPlayApiComponent = ((com.ss.android.ugc.gamora.recorder.choosemusic.a.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null));
    public final com.bytedance.scene.group.b parentScene;
    private final h.h.d planCUIApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);
    private final h.h recommendMusicApiComponent$delegate = h.i.a(h.m.NONE, new a(this));
    private final h.h recordChooseMusicScene$delegate = h.i.a((h.f.a.a) new p(this));
    private final h.h.d recordControlApi$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
    private final h.h.d shortVideoContext$delegate = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
    public final b states = new b();
    private final h.h.d stickerApiComponent$delegate = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);
    private h.p<? extends Effect, Boolean> stickerMusicCancelState;

    static {
        Covode.recordClassIndex(97219);
    }

    private final com.ss.android.ugc.gamora.recorder.b.b getBottomTabApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.bottomTabApiComponent$delegate.a(this, $$delegatedProperties[4]);
    }

    private final com.bytedance.creativex.recorder.b.a.d getCameraApi() {
        return (com.bytedance.creativex.recorder.b.a.d) this.cameraApi$delegate.a(this, $$delegatedProperties[1]);
    }

    private final ad getChooseMusicHandler() {
        return (ad) this.chooseMusicHandler$delegate.getValue();
    }

    private final com.ss.android.ugc.aweme.shortvideo.countdown.b getCountDownComponent() {
        return (com.ss.android.ugc.aweme.shortvideo.countdown.b) this.countDownComponent$delegate.a(this, $$delegatedProperties[8]);
    }

    private final com.ss.android.ugc.gamora.recorder.j.b getMusicCutComponent() {
        return (com.ss.android.ugc.gamora.recorder.j.b) this.musicCutComponent$delegate.a(this, $$delegatedProperties[7]);
    }

    private final f getRecordChooseMusicScene() {
        return (f) this.recordChooseMusicScene$delegate.getValue();
    }

    public final androidx.fragment.app.e getActivity() {
        return (androidx.fragment.app.e) this.activity$delegate.a(this, $$delegatedProperties[0]);
    }

    /* Return type fixed from 'com.ss.android.ugc.gamora.recorder.choosemusic.d' to match base method */
    @Override // com.bytedance.als.j
    public a getApiComponent() {
        return this;
    }

    public final com.ss.android.ugc.aweme.shortvideo.h.a getPlanCUIApiComponent() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.planCUIApiComponent$delegate.a(this, $$delegatedProperties[5]);
    }

    public final com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a getRecommendMusicApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a) this.recommendMusicApiComponent$delegate.getValue();
    }

    public final com.bytedance.creativex.recorder.b.a.m getRecordControlApi() {
        return (com.bytedance.creativex.recorder.b.a.m) this.recordControlApi$delegate.a(this, $$delegatedProperties[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.a(this, $$delegatedProperties[6]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j getStickerApiComponent() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.stickerApiComponent$delegate.a(this, $$delegatedProperties[3]);
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public com.ss.android.ugc.aweme.shortvideo.c getCurrentMusic() {
        return this.internalCurrentMusic;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.diContainer;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public /* bridge */ /* synthetic */ com.bytedance.als.g getMusicAdded() {
        return this.musicAdded;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public /* bridge */ /* synthetic */ com.bytedance.als.g getMusicCleared() {
        return this.musicCleared;
    }

    @Override // com.bytedance.jedi.arch.ae
    public com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.p<? extends com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean>, h.p<com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> */
    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public h.p<Effect, Boolean> getStickerMusicCancelState() {
        return this.stickerMusicCancelState;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public com.bytedance.als.g<Boolean> getUiLoadingMusicEvent() {
        return this.states.f147538h;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void stopPreviewMusic() {
        getCameraView().h();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a> r1 = com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.choosemusic.d.a.invoke():com.bytedance.als.b");
        }
    }

    private final ASCameraView getCameraView() {
        return getCameraApi().D();
    }

    public final void applyBackgroundVideoIfNeed() {
        getStickerApiComponent().E().e();
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void initStitch() {
        this.states.f147543m.a((z) null);
    }

    public void notifyMusicChange() {
        this.states.f147535e.a((z) null);
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void tryHideMusicTips() {
        this.states.f147542l.a((Integer) null);
    }

    static final class b extends h.f.b.m implements h.f.a.a<ad> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(97221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            com.bytedance.creativex.recorder.b.a.m recordControlApi = this.this$0.getRecordControlApi();
            d dVar = this.this$0;
            return new ad(activity, recordControlApi, dVar, dVar.getShortVideoContext(), this.this$0.getDiContainer());
        }
    }

    private final long getBackgroundVideoDuration() {
        com.ss.android.ugc.aweme.sticker.model.a aVar = getShortVideoContext().f124757b.r;
        if (aVar != null) {
            return aVar.getMaxDuration();
        }
        return 0;
    }

    private final boolean isChangeBgVideoDuration() {
        com.ss.android.ugc.aweme.sticker.model.a aVar = getShortVideoContext().f124757b.r;
        if (aVar == null || aVar.isMultiBgVideo()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void changeMusicUi() {
        changeHasMusic(cr.a().f125295a);
        setupClickListener(false);
        changeUiEnableState(false);
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public boolean recordHasMusic() {
        Workspace workspace = getShortVideoContext().f124757b.f124713h;
        h.f.b.l.b(workspace, "");
        if (workspace.c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void stopStickerBGM() {
        getCameraView().f(false);
        getCameraView().g(true);
    }

    public static final class g implements com.ss.android.medialib.listener.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147550a;

        static {
            Covode.recordClassIndex(97226);
        }

        @Override // com.ss.android.medialib.listener.b
        public final void a(int i2, int i3) {
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(97227);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String e2;
                com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.this$0.f147550a.musicPlayApiComponent;
                if (!(aVar == null || !aVar.c() || (e2 = this.this$0.f147550a.getShortVideoContext().f124757b.e()) == null)) {
                    this.this$0.f147550a.playMusic(e2);
                }
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(d dVar) {
            this.f147550a = dVar;
        }

        @Override // com.ss.android.medialib.listener.b
        public final void a(int i2) {
            com.ss.android.ugc.asve.f.g.a(new a(this));
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<f> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(97236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f(this.this$0.states, ((com.ss.android.ugc.aweme.shortvideo.h.a) this.this$0.getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class)).d(), this.this$0.getStickerApiComponent().t(), this.this$0.getShortVideoContext());
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public h.p<Integer, Integer> getChooseMusicAnchorViewPosition() {
        f recordChooseMusicScene = getRecordChooseMusicScene();
        int[] iArr = new int[2];
        FrameLayout frameLayout = recordChooseMusicScene.f147575g;
        if (frameLayout == null) {
            h.f.b.l.a("musicRootContainer");
        }
        frameLayout.getLocationOnScreen(iArr);
        View view = recordChooseMusicScene.n;
        h.f.b.l.b(view, "");
        int width = view.getWidth();
        View view2 = recordChooseMusicScene.n;
        h.f.b.l.b(view2, "");
        return h.v.a(Integer.valueOf(iArr[0] + (width / 2)), Integer.valueOf(iArr[1] + view2.getHeight()));
    }

    private final void initMusicUI() {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        if (!getShortVideoContext().f124757b.b() && !getShortVideoContext().f124757b.c() && !getShortVideoContext().e() && (cVar = cr.a().f125295a) != null) {
            Activity activity = this.parentScene.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            EffectTemplate effectTemplate = (EffectTemplate) activity.getIntent().getParcelableExtra("first_sticker");
            if (effectTemplate == null || !effectTemplate.isBusiness() || cVar.isCommerceMusic()) {
                getCameraView().f(false);
                getCameraView().e(true);
                changeHasMusic(cVar);
                tryShowMusicTip();
                monitorAutoSelectedMusic(getShortVideoContext().r, cVar);
                return;
            }
            cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void clearMusic() {
        dn.a(getShortVideoContext());
        long backgroundVideoDuration = getBackgroundVideoDuration();
        if (backgroundVideoDuration > 0 && isChangeBgVideoDuration()) {
            getShortVideoContext().a(Math.min(getShortVideoContext().f124757b.f124707b, backgroundVideoDuration));
        }
        getRecordControlApi().a(new com.bytedance.creativex.recorder.b.a.j(getShortVideoContext().f124757b.f124707b));
        handleCancelMusicResultEvent();
        cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
        changeHasMusic(null);
    }

    @Override // com.bytedance.als.j
    public void onResume() {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        super.onResume();
        if (getShortVideoContext().f124757b.a() && (cVar = cr.a().f125295a) != null) {
            h.f.b.l.b(cVar, "");
            if (cVar.isLocalMusic()) {
                Workspace workspace = getShortVideoContext().f124757b.f124713h;
                h.f.b.l.b(workspace, "");
                if (!com.ss.android.ugc.aweme.shortvideo.af.b.a(workspace.c(), com.bytedance.als.dsl.g.c(this))) {
                    changeHasMusic(null);
                    cr.a().f125295a = null;
                    getChooseMusicHandler().a(d.a.a(true, null, null, null));
                }
            }
        }
    }

    private final void tryShowMusicTip() {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        if (getShortVideoContext() != null && getShortVideoContext().a()) {
            Activity activity = this.parentScene.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(activity, "");
            if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.e((Effect) activity.getIntent().getParcelableExtra("first_sticker"))) {
                getShortVideoContext().ad = true;
                showMusicTips(1);
                Object a2 = getDiContainer().a(com.ss.android.ugc.gamora.recorder.e.a.class, (String) null);
                h.f.b.l.b(a2, "");
                com.ss.android.ugc.gamora.recorder.e.a aVar = (com.ss.android.ugc.gamora.recorder.e.a) a2;
                aVar.setNeedNoTouchListener(true);
                aVar.getNoBlockTouchEvent().a(this, new q(this));
                if ((h.f.b.l.a((Object) "prop_reuse", (Object) getShortVideoContext().r) || h.f.b.l.a((Object) "prop_page", (Object) getShortVideoContext().r)) && (cVar = cr.a().f125295a) != null) {
                    Activity activity2 = this.parentScene.f42913m;
                    if (activity2 == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity2, "");
                    EffectTemplate effectTemplate = (EffectTemplate) activity2.getIntent().getParcelableExtra("first_sticker");
                    if (effectTemplate != null) {
                        r.a("prop_music_show", new com.ss.android.ugc.tools.f.b().a("creation_id", getShortVideoContext().q).a("shoot_way", getShortVideoContext().r).a("enter_from", "video_shoot_page").a("music_id", cVar.getMusicId()).a("prop_id", effectTemplate.getEffectId()).a("group_id", ak.INSTANCE.getVideoId()).f149193a);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void handleCancelMusicResultEvent() {
        getCameraView().setMusicPath("");
        getCameraView().a((ASCameraView) "", (String) 0, 0L, 0L);
        getCameraView().b(false);
        com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.musicPlayApiComponent;
        if (aVar != null) {
            aVar.a(getStickerApiComponent().t().f());
        }
        getStickerApiComponent().l();
        getShortVideoContext().f124764i = 0;
        getShortVideoContext().d(0);
        this.internalCurrentMusic = null;
        cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
        getShortVideoContext().f124757b.f124713h.d();
        getShortVideoContext().a((String) null);
        com.ss.android.ugc.gamora.recorder.sticker.c.k.a(getStickerApiComponent(), new PrivacyCert(new com.bytedance.bpea.basics.j("1051"), "Record audio when using sound effects on the shooting page.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}));
        this.musicCleared.a(z.f158842a);
        if (!getShortVideoContext().f124757b.s) {
            getRecordControlApi().a(getShortVideoContext().f124757b.t, false);
        }
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        com.bytedance.als.g<Boolean> b2;
        com.bytedance.als.g<Boolean> a2;
        super.onCreate();
        e eVar = new e(getActivity(), getCameraApi(), getStickerApiComponent(), getRecommendMusicApiComponent(), this, getBottomTabApiComponent(), getShortVideoContext());
        this.parentScene.a(R.id.dj5, getRecordChooseMusicScene(), "RecordChooseMusicScene");
        this.states.n.a(this, new c(eVar));
        this.states.f147531a.a(this, new h(this));
        getCameraApi().aj().a(this, new i(this));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().a(this, new j(this));
        getPlanCUIApiComponent().e().a(this, new k(this));
        getRecordControlApi().o().b(this, new l(this));
        getRecordControlApi().w().a(this, new m(this));
        getPlanCUIApiComponent().a().a(this, new n(this));
        this.states.f147539i.a(this, new o(this, eVar));
        com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.musicPlayApiComponent;
        if (!(aVar == null || (a2 = aVar.a()) == null)) {
            a2.a(this, new C3965d(this));
        }
        com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.musicPlayApiComponent;
        if (!(aVar2 == null || (b2 = aVar2.b()) == null)) {
            b2.a(this, new e(this));
        }
        this.states.p.a(this, new f(this));
        getCameraApi().D().a(new g(this));
        initMusicUI();
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void setStickerMusicCancelState(h.p<? extends Effect, Boolean> pVar) {
        this.stickerMusicCancelState = pVar;
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147556a;

        static {
            Covode.recordClassIndex(97233);
        }

        m(d dVar) {
            this.f147556a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147556a.changeMusicUi();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147560a;

        static {
            Covode.recordClassIndex(97237);
        }

        q(d dVar) {
            this.f147560a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147560a.tryHideMusicTips();
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void showMusicTips(Integer num) {
        this.states.f147542l.a(num);
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void changeCancelMusicBtnVisible(boolean z) {
        this.states.f147540j.a(Boolean.valueOf(z));
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void changeHasMusic(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        this.internalCurrentMusic = cVar;
        this.states.f147537g.a(cVar);
    }

    public final void changeMusicAutoPlayState(boolean z) {
        this.states.o.b(Boolean.valueOf(z));
    }

    public void changeUiEnableState(boolean z) {
        this.states.f147536f.b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void handleChooseMusic(com.ss.android.ugc.aweme.cz.a.d dVar) {
        h.f.b.l.d(dVar, "");
        getChooseMusicHandler().a(dVar);
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void setUiLoadingMusic(boolean z) {
        this.states.f147538h.a(Boolean.valueOf(z));
    }

    public void setupClickListener(boolean z) {
        this.states.f147541k.b(Boolean.valueOf(z));
    }

    public final void switchAutoPlayMusicUi(boolean z) {
        this.states.q.a(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$d  reason: collision with other inner class name */
    static final class C3965d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147547a;

        static {
            Covode.recordClassIndex(97223);
        }

        C3965d(d dVar) {
            this.f147547a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            d dVar = this.f147547a;
            h.f.b.l.b(bool, "");
            dVar.changeMusicAutoPlayState(bool.booleanValue());
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147548a;

        static {
            Covode.recordClassIndex(97224);
        }

        e(d dVar) {
            this.f147548a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            d dVar = this.f147548a;
            h.f.b.l.b(bool, "");
            dVar.switchAutoPlayMusicUi(bool.booleanValue());
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147552a;

        static {
            Covode.recordClassIndex(97229);
        }

        i(d dVar) {
            this.f147552a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((com.bytedance.creativex.recorder.b.a.k) obj).f28195b) {
                this.f147552a.startChooseMusicAnim(0.0f, 1.0f);
            } else {
                this.f147552a.startChooseMusicAnim(1.0f, 0.0f);
            }
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147551a;

        static {
            Covode.recordClassIndex(97228);
        }

        h(d dVar) {
            this.f147551a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.scene.j a2 = this.f147551a.parentScene.a("RecordChooseMusicScene");
                if (a2 != null) {
                    this.f147551a.parentScene.e(a2);
                    return;
                }
                return;
            }
            com.bytedance.scene.j a3 = this.f147551a.parentScene.a("RecordChooseMusicScene");
            if (a3 != null) {
                this.f147551a.parentScene.d(a3);
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147554a;

        static {
            Covode.recordClassIndex(97231);
        }

        k(d dVar) {
            this.f147554a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            u uVar = (u) obj;
            if (((Number) uVar.getFirst()).intValue() == 12346 && ((Number) uVar.getSecond()).intValue() == -1 && this.f147554a.getShortVideoContext().P) {
                this.f147554a.handleCancelMusicResultEvent();
            }
        }
    }

    public final void playMusic(String str) {
        Long l2;
        if (getShortVideoContext().Z != 2) {
            l2 = Long.valueOf(getShortVideoContext().f124757b.k());
        } else {
            l2 = null;
        }
        com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.musicPlayApiComponent;
        if (aVar != null) {
            aVar.a(str, (long) getShortVideoContext().f124757b.q, l2, getStickerApiComponent().t().f(), a.C3962a.C3963a.f147504a);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void startPreviewMusic(boolean z) {
        com.ss.android.ugc.aweme.port.in.p s = com.ss.android.ugc.aweme.port.in.g.a().s();
        Objects.requireNonNull(s, "null cannot be cast to non-null type com.ss.android.ugc.aweme.port.`in`.IAnotherMusicService");
        aa aaVar = (aa) s;
        if (z || (!h.f.b.l.a(com.ss.android.ugc.aweme.df.c.c().getClass(), aaVar.m()) && !getMusicCutComponent().f() && !getCountDownComponent().d())) {
            getCameraView().g();
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f147546a;

        static {
            Covode.recordClassIndex(97222);
        }

        c(e eVar) {
            this.f147546a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            e eVar = this.f147546a;
            PrivacyCert privacyCert = new PrivacyCert(new com.bytedance.bpea.basics.j("1030"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()});
            h.f.b.l.d(privacyCert, "");
            if (eVar.f147566f.f124757b.r != null) {
                eVar.f147563c.E().d();
            }
            eVar.f147562b.a(new e.d(eVar));
            if (eVar.f147562b.b()) {
                eVar.f147562b.d().a("ChooseMusicScene", privacyCert);
            } else {
                eVar.f147562b.b(false, privacyCert);
            }
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147549a;

        static {
            Covode.recordClassIndex(97225);
        }

        f(d dVar) {
            this.f147549a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            d dVar = this.f147549a;
            h.f.b.l.b(bool, "");
            dVar.mobClickPlayMusic(bool.booleanValue());
            if (bool.booleanValue()) {
                com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.f147549a.musicPlayApiComponent;
                if (aVar != null) {
                    aVar.d(this.f147549a.getStickerApiComponent().t().f());
                    return;
                }
                return;
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar2 = this.f147549a.musicPlayApiComponent;
            if (aVar2 != null) {
                aVar2.c(this.f147549a.getStickerApiComponent().t().f());
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147553a;

        static {
            Covode.recordClassIndex(97230);
        }

        j(d dVar) {
            this.f147553a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Object obj2 = ((com.ss.android.ugc.gamora.recorder.b.c) obj).f147371c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            boolean z = false;
            if (TextUtils.equals((CharSequence) obj2, com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.f_b))) {
                this.f147553a.setChooseMusicVisible(null, false, false);
            } else if (!this.f147553a.getShortVideoContext().b() && !this.f147553a.getShortVideoContext().f124757b.b() && !this.f147553a.getShortVideoContext().f124757b.c()) {
                this.f147553a.setChooseMusicVisible(null, true, true);
                d dVar = this.f147553a;
                if (dVar.getShortVideoContext().f124757b.h() == 0) {
                    z = true;
                }
                dVar.setEnable(z);
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147555a;

        static {
            Covode.recordClassIndex(97232);
        }

        l(d dVar) {
            this.f147555a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            t tVar = (t) obj;
            if (tVar != null) {
                if (tVar.f28206b != 0 || !tVar.f28205a.isEmpty() || this.f147555a.getShortVideoContext().f124757b.f124714i) {
                    z = false;
                } else {
                    z = true;
                }
                this.f147555a.getShortVideoContext();
                if (com.ss.android.ugc.aweme.setting.i.p.a() != 2) {
                    this.f147555a.setEnable(z);
                } else if (z != this.f147555a.enableRecordChooseMusicComponent) {
                    this.f147555a.setEnable(z);
                    this.f147555a.enableRecordChooseMusicComponent = z;
                }
            }
        }
    }

    public final void mobClickPlayMusic(boolean z) {
        r.a("click_play_music", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("shoot_way", getShortVideoContext().r).a("content_source", "shoot").a("content_type", "video").a("creation_id", getShortVideoContext().q).a("music_id", getShortVideoContext().f124762g).a("play_status", z).f149193a);
    }

    public final void setEnable(boolean z) {
        if (getShortVideoContext().b() || getShortVideoContext().f124757b.b() || getShortVideoContext().f124757b.c() || getShortVideoContext().h()) {
            setChooseMusicVisible(false, null, null);
            return;
        }
        if (getShortVideoContext().c()) {
            z = false;
        }
        setupClickListener(z);
        changeUiEnableState(z);
        if (z) {
            if (cr.a().f125295a == null) {
                changeHasMusic(null);
            }
        } else if (cr.a().f125295a != null && getShortVideoContext().f124757b.a()) {
            changeHasMusic(cr.a().f125295a);
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147557a;

        static {
            Covode.recordClassIndex(97234);
        }

        n(d dVar) {
            this.f147557a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f147557a.getShortVideoContext().b()) {
                this.f147557a.setChooseMusicVisible(false, null, null);
                return;
            }
            if (this.f147557a.getShortVideoContext().h()) {
                this.f147557a.setChooseMusicVisible(false, null, null);
            } else if (this.f147557a.getPlanCUIApiComponent().g()) {
                this.f147557a.setChooseMusicVisible(true, null, null);
            } else {
                this.f147557a.setChooseMusicVisible(bool, null, null);
            }
            if (!bool.booleanValue()) {
                this.f147557a.tryHideMusicTips();
            }
            if (this.f147557a.getShortVideoContext().f124757b.b() || this.f147557a.getShortVideoContext().f124757b.c()) {
                this.f147557a.setChooseMusicVisible(false, null, null);
            } else if (!bool.booleanValue()) {
                this.f147557a.setChooseMusicVisible(false, false, false);
            } else {
                this.f147557a.setChooseMusicVisible(null, bool, bool);
            }
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f147559b;

        static {
            Covode.recordClassIndex(97235);
        }

        o(d dVar, e eVar) {
            this.f147558a = dVar;
            this.f147559b = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a recommendMusicApiComponent;
            h.p<MusicModel, Long> a2;
            MusicModel first;
            String musicId;
            String str;
            boolean z = true;
            this.f147559b.a(true);
            this.f147558a.clearMusic();
            if (ch.a()) {
                com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f147558a.getShortVideoContext().q).a("enter_from", "video_shoot_page").a("shoot_way", this.f147558a.getShortVideoContext().r);
                com.ss.android.ugc.aweme.shortvideo.c a4 = this.f147558a.states.f147537g.a();
                if (a4 != null) {
                    str = a4.getMusicId();
                } else {
                    str = null;
                }
                r.a("unselect_music", a3.a("music_id", str).f149193a);
            }
            if (fw.c() && (recommendMusicApiComponent = this.f147558a.getRecommendMusicApiComponent()) != null) {
                if (this.f147558a.getShortVideoContext().Z != 14) {
                    z = false;
                }
                com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.a value = recommendMusicApiComponent.a().getValue();
                if (!(value == null || (a2 = value.a(z)) == null || (first = a2.getFirst()) == null || (musicId = first.getMusicId()) == null)) {
                    String str2 = this.f147558a.getShortVideoContext().q;
                    h.f.b.l.b(str2, "");
                    h.f.b.l.d(musicId, "");
                    h.f.b.l.d(str2, "");
                    h.f.b.l.d("recommend", "");
                    r.a("click_delete_music", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_shoot_page").a("music_id", musicId).a("creation_id", str2).a("music_type", "recommend").f149193a);
                }
            }
            if (com.ss.android.ugc.aweme.property.e.b()) {
                this.f147558a.clearMusic();
            }
            this.f147558a.applyBackgroundVideoIfNeed();
        }
    }

    public void startChooseMusicAnim(float f2, float f3) {
        this.states.f147534d.b(h.v.a(Float.valueOf(f2), Float.valueOf(f3)));
    }

    private final void monitorAutoSelectedMusic(String str, com.ss.android.ugc.aweme.shortvideo.c cVar) {
        AVChallenge aVChallenge;
        String str2;
        if (cVar != null) {
            cr a2 = cr.a();
            String str3 = "";
            h.f.b.l.b(a2, str3);
            List<AVChallenge> list = a2.f125298d;
            if (TextUtils.equals(str, "challenge") && !com.bytedance.common.utility.collection.b.a((Collection) list)) {
                h.f.b.l.b(list, str3);
                if (h.a.n.h((List) list) != null && (aVChallenge = (AVChallenge) h.a.n.h((List) list)) != null && aVChallenge.isCommerce) {
                    ar a3 = new ar().a("shoot_way", str);
                    AVChallenge aVChallenge2 = list.get(0);
                    if (aVChallenge2 == null || (str2 = aVChallenge2.cid) == null) {
                        str2 = str3;
                    }
                    ar a4 = a3.a("challenge_id", str2);
                    String mid = cVar.getMid();
                    if (mid != null) {
                        str3 = mid;
                    }
                    com.ss.android.ugc.aweme.df.q.a("autoselected_music_monitor", 0, a4.a("sticker_id", str3).a());
                }
            }
        }
    }

    public d(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.parentScene = bVar;
        this.diContainer = fVar;
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void handleChooseMusicResultEvent(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
        if (cVar != null) {
            boolean a2 = getShortVideoContext().f124757b.a();
            getShortVideoContext().f124757b.f124713h.a(str);
            getShortVideoContext().a(str);
            getShortVideoContext().P = false;
            getCameraView().setMusicPath(str);
            getCameraView().a((ASCameraView) str, (String) 0, 0L, 0L);
            getCameraView().b(true);
            getStickerApiComponent().a(true);
            if (!a2) {
                getCameraView().a(getActivity(), getCameraApi().g().a());
            }
            int i2 = cVar.duration;
            if (i2 > 0) {
                getShortVideoContext().f124764i = i2;
            }
            if (!getShortVideoContext().c()) {
                getShortVideoContext().d(0);
            }
            getShortVideoContext().f124762g = cVar.getMid();
            getShortVideoContext().f124766k = cVar.strongBeatUrl;
            com.ss.android.ugc.gamora.recorder.sticker.c.k.a(getStickerApiComponent(), new PrivacyCert(new com.bytedance.bpea.basics.j("1050"), "Record audio when using sound effects on the shooting page.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}));
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.musicPlayApiComponent;
            if (aVar != null && aVar.c()) {
                playMusic(str);
            }
        }
        this.internalCurrentMusic = cVar;
        cr.a().a(cVar);
        if (cVar == null) {
            this.musicCleared.a(z.f158842a);
        } else {
            this.musicAdded.a(z.f158842a);
        }
        if (!getShortVideoContext().f124757b.s) {
            getRecordControlApi().a(getShortVideoContext().f124757b.t, false);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, R> R withSubstate(x<S1, PROP1> xVar, h.f.a.b<? super PROP1, ? extends R> bVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(xVar, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, R> R withState(VM1 vm1, VM2 vm2, h.f.a.m<? super S1, ? super S2, ? extends R> mVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(mVar, "");
        return (R) b.a.a(vm1, vm2, mVar);
    }

    public <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, R> R withSubstate(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, h.f.a.m<? super PROP1, ? super PROP2, ? extends R> mVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(mVar, "");
        return (R) b.a.a(xVar, xVar2, mVar);
    }

    public void setChooseMusicVisible(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.states.f147531a.b(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.states.f147533c.b(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.states.f147532b.b(Boolean.valueOf(bool3.booleanValue()));
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.choosemusic.a
    public void onChooseMusicDone(boolean z, String str, com.ss.android.ugc.aweme.shortvideo.c cVar, String str2) {
        if (z) {
            changeHasMusic(null);
        } else if (!TextUtils.isEmpty(str2)) {
            changeHasMusic(cVar);
            notifyMusicChange();
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<com.bytedance.jedi.arch.ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, h.f.a.q<? super S1, ? super S2, ? super S3, ? extends R> qVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(vm3, "");
        h.f.b.l.d(qVar, "");
        return (R) b.a.a(vm1, vm2, vm3, qVar);
    }

    public <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends x<S3, PROP3>, PROP3 extends af, S3 extends af, R> R withSubstate(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, x<S3, PROP3> xVar3, h.f.a.q<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> qVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(xVar3, "");
        h.f.b.l.d(qVar, "");
        return (R) b.a.a(xVar, xVar2, xVar3, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, VM4 extends JediViewModel<S4>, S4 extends af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, h.f.a.r<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> rVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(vm3, "");
        h.f.b.l.d(vm4, "");
        h.f.b.l.d(rVar, "");
        return (R) b.a.a(vm1, vm2, vm3, vm4, rVar);
    }

    public <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends x<S3, PROP3>, PROP3 extends af, S3 extends af, M4 extends x<S4, PROP4>, PROP4 extends af, S4 extends af, R> R withSubstate(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, x<S3, PROP3> xVar3, x<S4, PROP4> xVar4, h.f.a.r<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> rVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(xVar3, "");
        h.f.b.l.d(xVar4, "");
        h.f.b.l.d(rVar, "");
        return (R) b.a.a(xVar, xVar2, xVar3, xVar4, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, VM4 extends JediViewModel<S4>, S4 extends af, VM5 extends JediViewModel<S5>, S5 extends af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, s<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> sVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(vm2, "");
        h.f.b.l.d(vm3, "");
        h.f.b.l.d(vm4, "");
        h.f.b.l.d(vm5, "");
        h.f.b.l.d(sVar, "");
        return (R) b.a.a(vm1, vm2, vm3, vm4, vm5, sVar);
    }

    public <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends x<S3, PROP3>, PROP3 extends af, S3 extends af, M4 extends x<S4, PROP4>, PROP4 extends af, S4 extends af, M5 extends x<S5, PROP5>, PROP5 extends af, S5 extends af, R> R withSubstate(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, x<S3, PROP3> xVar3, x<S4, PROP4> xVar4, x<S5, PROP5> xVar5, s<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> sVar) {
        h.f.b.l.d(xVar, "");
        h.f.b.l.d(xVar2, "");
        h.f.b.l.d(xVar3, "");
        h.f.b.l.d(xVar4, "");
        h.f.b.l.d(xVar5, "");
        h.f.b.l.d(sVar, "");
        return (R) b.a.a(xVar, xVar2, xVar3, xVar4, xVar5, sVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }

    public <S extends af, A, B, C, D, E> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, h.k.k<S, ? extends E> kVar5, ah<ao<A, B, C, D, E>> ahVar, h.f.a.t<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, ? super E, z> tVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(tVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, kVar5, ahVar, tVar);
    }
}

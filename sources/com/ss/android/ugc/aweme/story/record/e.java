package com.ss.android.ugc.aweme.story.record;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.DefaultGesturePresenter;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.o.n;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.adaptation.analysis.Analysis;
import com.ss.android.ugc.aweme.adaptation.analysis.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.sticker.d;
import com.ss.android.ugc.aweme.sticker.repository.a.y;
import com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.ss.android.ugc.aweme.sticker.types.ar.text.r;
import com.ss.android.ugc.aweme.story.base.ui.StoryRootActivity;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.ss.android.ugc.aweme.story.record.e.a;
import com.ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl;
import com.ss.android.ugc.aweme.story.record.recordcontrol.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.z;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class e extends com.ss.android.ugc.aweme.view.w implements com.ss.android.ugc.aweme.adaptation.analysis.b, com.ss.android.ugc.aweme.story.base.c, com.ss.android.ugc.tools.view.a.c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f138224e = new c((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.record.a.a f138225b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.creativex.recorder.sticker.a.a f138226c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f138227d;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f138228i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f138229j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f138230k;

    /* renamed from: l  reason: collision with root package name */
    private SurfaceView f138231l;
    private final ArrayList<com.ss.android.ugc.tools.view.a.b> t;
    private ArrayList<com.ss.android.ugc.tools.view.a.a> u;
    private final h.h v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final h.h z;

    static {
        Covode.recordClassIndex(90414);
    }

    public final com.bytedance.o.f F() {
        return (com.bytedance.o.f) this.f138228i.getValue();
    }

    public final com.ss.android.ugc.aweme.story.record.f.a G() {
        return (com.ss.android.ugc.aweme.story.record.f.a) this.f138230k.getValue();
    }

    public final StoryRecordBaseViewModel H() {
        return (StoryRecordBaseViewModel) this.v.getValue();
    }

    public final boolean I() {
        return ((Boolean) this.z.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void b(boolean z2) {
    }

    public static final class c {
        static {
            Covode.recordClassIndex(90417);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        public static e a(Bundle bundle) {
            h.f.b.l.d(bundle, "");
            e eVar = new e((byte) 0);
            eVar.r = bundle;
            return eVar;
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<com.bytedance.o.f> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90444);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.o.f invoke() {
            return com.bytedance.als.dsl.c.a(this.this$0).f6438e;
        }
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public final void c() {
        com.ss.android.ugc.aweme.story.record.j.c.b(G(), "slide_left");
    }

    @Override // com.bytedance.scene.j, com.ss.android.ugc.aweme.view.w
    public final void n_() {
        super.n_();
        com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).a("at_shoot_page");
    }

    static final class m extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (com.bytedance.ies.abmock.b.a().a(true, "story_slide_opt_enable", 0) != com.ss.android.ugc.aweme.story.base.a.b.f136871b || (this.this$0.f42913m instanceof StoryRootActivity)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90447);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(com.bytedance.scene.ktx.c.b(this.this$0)).a(StoryRecordBaseViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void E() {
        com.ss.android.ugc.aweme.adaptation.a.f66177a.a(this.f138231l, G().f138288k.f124708c, G().f138288k.f124709d);
    }

    public final boolean L() {
        if (!this.y) {
            Context s2 = s();
            h.f.b.l.b(s2, "");
            this.y = com.ss.android.ugc.aweme.story.record.g.d.a(s2);
        }
        return this.y;
    }

    public final void J() {
        PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-288").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
        com.ss.android.ugc.aweme.story.record.a.a aVar = this.f138225b;
        if (aVar == null) {
            return;
        }
        if (aVar.b()) {
            aVar.a((com.bytedance.creativex.recorder.b.a.d) build, (PrivacyCert) false);
        } else {
            aVar.a(false, build);
        }
    }

    @Override // com.ss.android.ugc.aweme.adaptation.analysis.b
    public final Analysis f() {
        Analysis analysis = new Analysis();
        analysis.setLabelName("story_shoot_page");
        analysis.setMinValidStayDuration(1000);
        analysis.setExtraMap(ag.b(h.v.a("creation_id", G().f138279b), h.v.a("is_story_shoot", "1")));
        return analysis;
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FrameLayout f138273b;

        static {
            Covode.recordClassIndex(90438);
        }

        n(e eVar, FrameLayout frameLayout) {
            this.f138272a = eVar;
            this.f138273b = frameLayout;
        }

        public final void run() {
            Context r = this.f138272a.r();
            if (r != null) {
                DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(r, this.f138272a, null, this.f138273b);
                com.ss.android.ugc.aweme.record.d l2 = com.ss.android.ugc.aweme.port.in.g.a().l();
                com.ss.android.ugc.aweme.story.record.a.a aVar = this.f138272a.f138225b;
                if (aVar == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.asve.recorder.effect.a effectController = aVar.D().getEffectController();
                com.ss.android.ugc.aweme.story.record.a.a aVar2 = this.f138272a.f138225b;
                if (aVar2 == null) {
                    h.f.b.l.b();
                }
                ViewGroup.LayoutParams layoutParams = aVar2.G().getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                defaultGesturePresenter.a(1, l2.getARGestureDelegateListener(effectController, new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) layoutParams)));
            }
        }
    }

    private e() {
        this.f138228i = h.i.a((h.f.a.a) new t(this));
        this.f138230k = h.i.a((h.f.a.a) new v(this));
        this.t = new ArrayList<>();
        this.u = new ArrayList<>();
        this.v = h.i.a((h.f.a.a) new w(this));
        this.w = true;
        this.z = h.i.a((h.f.a.a) new m(this));
    }

    private final void N() {
        ASCameraView D;
        G().c();
        com.ss.android.ugc.aweme.story.record.a.a aVar = this.f138225b;
        if (!(aVar == null || (D = aVar.D()) == null)) {
            com.ss.android.ugc.asve.recorder.l lVar = new com.ss.android.ugc.asve.recorder.l(new com.ss.android.ugc.aweme.shortvideo.record.c(G().b()));
            File e2 = G().b().e();
            h.f.b.l.b(e2, "");
            String absolutePath = e2.getAbsolutePath();
            h.f.b.l.b(absolutePath, "");
            D.a(lVar, absolutePath);
        }
        com.ss.android.ugc.aweme.story.record.a.a aVar2 = this.f138225b;
        if (aVar2 != null) {
            aVar2.C();
        }
        com.bytedance.creativex.recorder.sticker.a.a aVar3 = this.f138226c;
        if (aVar3 != null) {
            aVar3.p();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public final boolean b() {
        ArrayList<com.ss.android.ugc.tools.view.a.a> arrayList = this.u;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next().onKeyDown(4, null)) {
                    return true;
                }
            }
        }
        com.bytedance.scene.navigation.d a2 = com.bytedance.scene.ktx.b.a(this);
        if (a2 != null && a2.E()) {
            return true;
        }
        com.ss.android.ugc.aweme.story.record.j.c.b(G(), "system_back_button");
        H().a();
        return true;
    }

    static final class v extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.story.record.f.a> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.f.a invoke() {
            EnterStoryParam enterStoryParam;
            String str;
            Bundle bundle = this.this$0.r;
            com.ss.android.ugc.aweme.story.record.f.a aVar = new com.ss.android.ugc.aweme.story.record.f.a(new CameraComponentModel(0));
            if (!(bundle == null || (enterStoryParam = (EnterStoryParam) bundle.getParcelable("enter_story_param")) == null)) {
                String shootWay = enterStoryParam.getShootWay();
                if (shootWay == null) {
                    shootWay = "story";
                }
                aVar.f138280c = shootWay;
                aVar.f138281d = enterStoryParam.getEnterMethod();
                aVar.f138282e = enterStoryParam.getEnterFrom();
                aVar.f138283f = enterStoryParam.getNeedPublishWithAnim();
                if (!h.f.b.l.a((Object) enterStoryParam.getEnterMethod(), (Object) "slide_right")) {
                    str = "";
                } else if (enterStoryParam.isWestWindowExist()) {
                    str = "1";
                } else {
                    str = "0";
                }
                aVar.a(str);
            }
            StoryWorkspaceImpl storyWorkspaceImpl = new StoryWorkspaceImpl(aVar.a());
            aVar.f138284g = storyWorkspaceImpl;
            Workspace workspace = new Workspace(storyWorkspaceImpl);
            storyWorkspaceImpl.a(workspace);
            h.f.b.l.d(workspace, "");
            aVar.f138288k.f124713h = workspace;
            aVar.f138288k.f124708c = com.ss.android.ugc.aweme.port.in.g.a().h().getVideoWidth();
            aVar.f138288k.f124709d = com.ss.android.ugc.aweme.port.in.g.a().h().getVideoHeight();
            aVar.f138288k.f124707b = com.ss.android.ugc.aweme.story.record.recordcontrol.c.f138420a.a(aVar.f138288k);
            return aVar;
        }
    }

    public final void K() {
        com.bytedance.creativex.recorder.b.a.d dVar;
        VERecorderImpl E;
        com.ss.android.ugc.aweme.sticker.view.a.b bVar;
        com.ss.android.ugc.gamora.recorder.sticker.c.j jVar;
        com.bytedance.creativex.recorder.sticker.a.a aVar;
        com.ss.android.ugc.aweme.sticker.presenter.o t2;
        com.ss.android.ugc.aweme.sticker.repository.a.w c2;
        y j2;
        List<EffectCategoryModel> a2;
        T t3;
        String key;
        if (this.w) {
            if (I()) {
                J();
            }
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().b()) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                h.f.b.l.b(createIAVServiceProxybyMonsterPlugin2, "");
                createIAVServiceProxybyMonsterPlugin2.getStoryService().a(com.bytedance.scene.ktx.c.a(this));
            } else if (com.ss.android.ugc.aweme.port.in.l.f115658a.s().a("key_enter_story_record_first", true)) {
                if (!h.a.n.a((Iterable) h.a.n.b("click_intro", "click_fullscreen_intro", "click_story_label"), (Object) G().f138281d)) {
                    IAVServiceProxy createIAVServiceProxybyMonsterPlugin3 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                    h.f.b.l.b(createIAVServiceProxybyMonsterPlugin3, "");
                    createIAVServiceProxybyMonsterPlugin3.getStoryService().a(com.bytedance.scene.ktx.c.a(this));
                }
                com.ss.android.ugc.aweme.port.in.l.f115658a.s().b("key_enter_story_record_first", false);
            }
            com.ss.android.ugc.aweme.story.base.e.f136896b.b();
            bz unused = kotlinx.coroutines.i.a(bs.f159054a, null, null, new u(null), 3);
            this.w = false;
            return;
        }
        com.bytedance.o.f F = F();
        if (!(F == null || (aVar = (com.bytedance.creativex.recorder.sticker.a.a) F.a(com.bytedance.creativex.recorder.sticker.a.a.class, (String) null)) == null || (t2 = aVar.t()) == null || (c2 = t2.c()) == null || (j2 = c2.j()) == null || (a2 = com.ss.android.ugc.aweme.sticker.repository.b.a(j2)) == null)) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t3 = null;
                    break;
                }
                t3 = it.next();
                if (com.ss.android.ugc.aweme.sticker.repository.internals.f.a.b.a(t3)) {
                    break;
                }
            }
            T t4 = t3;
            if (!(t4 == null || (key = t4.getKey()) == null || key.length() == 0)) {
                j2.a(key);
            }
        }
        com.bytedance.o.f F2 = F();
        if (!(F2 == null || (jVar = (com.ss.android.ugc.gamora.recorder.sticker.c.j) F2.a(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)) == null)) {
            jVar.G();
        }
        com.bytedance.o.f F3 = F();
        if (!(F3 == null || (bVar = (com.ss.android.ugc.aweme.sticker.view.a.b) F3.a(com.ss.android.ugc.aweme.sticker.view.a.b.class, (String) null)) == null || !(bVar.a("sticker_category:search") instanceof com.ss.android.ugc.aweme.sticker.view.internal.search.j))) {
            com.ss.android.ugc.aweme.sticker.view.a.a a3 = bVar.a("sticker_category:search");
            Objects.requireNonNull(a3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerCategoryTabView");
            EditText editText = ((com.ss.android.ugc.aweme.sticker.view.internal.search.j) a3).a().f136475c;
            if (editText == null) {
                h.f.b.l.a("etSearchInput");
            }
            editText.setText((CharSequence) null);
        }
        com.bytedance.o.f F4 = F();
        if (F4 != null && (dVar = (com.bytedance.creativex.recorder.b.a.d) F4.a(com.bytedance.creativex.recorder.b.a.d.class)) != null && (E = dVar.E()) != null) {
            E.l();
        }
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, z> {
        final /* synthetic */ ShortVideoContext $shortVideoContext;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90426);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar, ShortVideoContext shortVideoContext) {
            super(1);
            this.this$0 = eVar;
            this.$shortVideoContext = shortVideoContext;
        }

        public static final class a extends com.bytedance.o.p<androidx.appcompat.app.d> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f138264a;

            static {
                Covode.recordClassIndex(90427);
            }

            public a(l lVar) {
                this.f138264a = lVar;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.appcompat.app.d, java.lang.Object, android.app.Activity] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final androidx.appcompat.app.d get(com.bytedance.o.f r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = ""
                    h.f.b.l.d(r3, r0)
                    com.ss.android.ugc.aweme.story.record.e$l r0 = r2.f138264a
                    com.ss.android.ugc.aweme.story.record.e r0 = r0.this$0
                    android.app.Activity r1 = r0.t()
                    java.lang.String r0 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
                    java.util.Objects.requireNonNull(r1, r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.e.l.a.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        public static final class b extends com.bytedance.o.p<Context> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f138265a;

            static {
                Covode.recordClassIndex(90428);
            }

            public b(l lVar) {
                this.f138265a = lVar;
            }

            @Override // com.bytedance.o.p
            public final Context get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Activity t = this.f138265a.this$0.t();
                h.f.b.l.b(t, "");
                return t;
            }
        }

        public static final class c extends com.bytedance.o.p<Context> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f138266a;

            static {
                Covode.recordClassIndex(90429);
            }

            public c(l lVar) {
                this.f138266a = lVar;
            }

            @Override // com.bytedance.o.p
            public final Context get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Activity t = this.f138266a.this$0.t();
                h.f.b.l.b(t, "");
                return t;
            }
        }

        public static final class d extends com.bytedance.o.p<androidx.lifecycle.m> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f138267a;

            static {
                Covode.recordClassIndex(90430);
            }

            public d(l lVar) {
                this.f138267a = lVar;
            }

            @Override // com.bytedance.o.p
            public final androidx.lifecycle.m get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f138267a.this$0;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.record.e$l$e  reason: collision with other inner class name */
        public static final class C3643e extends com.bytedance.o.p<com.ss.android.ugc.tools.view.a.c> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f138268a;

            static {
                Covode.recordClassIndex(90431);
            }

            public C3643e(l lVar) {
                this.f138268a = lVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.tools.view.a.c get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f138268a.this$0;
            }
        }

        public static final class f extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.f.a> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f138269a;

            static {
                Covode.recordClassIndex(90432);
            }

            public f(l lVar) {
                this.f138269a = lVar;
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.aweme.story.record.f.a get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f138269a.this$0.G();
            }
        }

        public static final class g extends com.bytedance.o.p<ShortVideoContext> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f138270a;

            static {
                Covode.recordClassIndex(90433);
            }

            public g(l lVar) {
                this.f138270a = lVar;
            }

            @Override // com.bytedance.o.p
            public final ShortVideoContext get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f138270a.$shortVideoContext;
            }
        }

        public static final class h extends com.bytedance.o.p<com.ss.android.ugc.tools.b.a.d> {
            static {
                Covode.recordClassIndex(90434);
            }

            @Override // com.bytedance.o.p
            public final com.ss.android.ugc.tools.b.a.d get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                Application application = com.ss.android.ugc.aweme.port.in.i.f115645a;
                h.f.b.l.b(application, "");
                return com.ss.android.ugc.aweme.effectplatform.c.a(application, j.f138271a);
            }
        }

        public static final class i extends com.bytedance.o.p<StickerPreferences> {
            static {
                Covode.recordClassIndex(90435);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences, java.lang.Object] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.o.p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences get(com.bytedance.o.f r5) {
                /*
                    r4 = this;
                    java.lang.String r3 = ""
                    h.f.b.l.d(r5, r3)
                    com.bytedance.cukaie.closet.a r2 = new com.bytedance.cukaie.closet.a
                    com.bytedance.cukaie.closet.internal.d r0 = new com.bytedance.cukaie.closet.internal.d
                    r0.<init>()
                    r2.<init>(r0)
                    android.app.Application r1 = com.ss.android.ugc.aweme.port.in.i.f115645a
                    h.f.b.l.b(r1, r3)
                    java.lang.Class<com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences> r0 = com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences.class
                    java.lang.Object r0 = r2.a(r1, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.e.l.i.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        static final class j extends h.f.b.m implements h.f.a.b<EffectPlatformBuilder, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final j f138271a = new j();

            static {
                Covode.recordClassIndex(90436);
            }

            j() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(EffectPlatformBuilder effectPlatformBuilder) {
                EffectPlatformBuilder effectPlatformBuilder2 = effectPlatformBuilder;
                h.f.b.l.d(effectPlatformBuilder2, "");
                effectPlatformBuilder2.setEnableKNEffectPlatform(true);
                effectPlatformBuilder2.setMonitorExtraParams(ag.a(h.v.a("is_story", 1)));
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            n.a a2 = nVar2.a(androidx.appcompat.app.d.class, (String) null, (com.bytedance.o.p) new a(this));
            h.f.b.l.b(a2, "");
            a2.a(Activity.class).a(androidx.fragment.app.e.class);
            h.f.b.l.b(nVar2.a(Context.class, (String) null, (com.bytedance.o.p) new b(this)), "");
            h.f.b.l.b(nVar2.a(Context.class, "applicationContext", (com.bytedance.o.p) new c(this)), "");
            h.f.b.l.b(nVar2.a(androidx.lifecycle.m.class, (String) null, (com.bytedance.o.p) new d(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.tools.view.a.c.class, (String) null, (com.bytedance.o.p) new C3643e(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.aweme.story.record.f.a.class, (String) null, (com.bytedance.o.p) new f(this)), "");
            h.f.b.l.b(nVar2.a(ShortVideoContext.class, (String) null, (com.bytedance.o.p) new g(this)), "");
            h.f.b.l.b(nVar2.a(com.ss.android.ugc.tools.b.a.d.class, (String) null, (com.bytedance.o.p) new h()), "");
            h.f.b.l.b(nVar2.a(StickerPreferences.class, (String) null, (com.bytedance.o.p) new i()), "");
            com.ss.android.ugc.aweme.port.in.g.a().l().registerNeededObjects(com.bytedance.scene.ktx.c.b(this.this$0), nVar2, this.$shortVideoContext);
            return z.f158842a;
        }
    }

    public static final class a extends com.bytedance.o.p<com.bytedance.creativex.recorder.a.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138232a;

        static {
            Covode.recordClassIndex(90415);
        }

        public a(com.bytedance.als.dsl.d dVar) {
            this.f138232a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.a.i get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.bytedance.creativex.recorder.a.i generateBeautyComponent = com.ss.android.ugc.aweme.port.in.g.a().l().generateBeautyComponent(fVar);
            generateBeautyComponent.c();
            return generateBeautyComponent;
        }
    }

    public static final class b extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.recordcontrol.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138246a;

        static {
            Covode.recordClassIndex(90416);
        }

        public b(com.bytedance.als.dsl.d dVar) {
            this.f138246a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.recordcontrol.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.record.recordcontrol.e(fVar, new f.a((androidx.fragment.app.e) fVar.a(androidx.fragment.app.e.class, (String) null), (com.ss.android.ugc.aweme.story.record.a.a) fVar.a(com.ss.android.ugc.aweme.story.record.a.a.class, (String) null)));
        }
    }

    public static final class f extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.toolbar.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f138253b;

        static {
            Covode.recordClassIndex(90420);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.toolbar.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.record.toolbar.b(this.f138253b, fVar);
        }

        public f(com.bytedance.als.dsl.d dVar, e eVar) {
            this.f138252a = dVar;
            this.f138253b = eVar;
        }
    }

    public static final class g extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.h.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f138255b;

        static {
            Covode.recordClassIndex(90421);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.h.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.record.h.b(this.f138255b, fVar);
        }

        public g(com.bytedance.als.dsl.d dVar, e eVar) {
            this.f138254a = dVar;
            this.f138255b = eVar;
        }
    }

    public static final class i extends com.bytedance.o.p<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f138259b;

        static {
            Covode.recordClassIndex(90423);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new a(this.f138259b, fVar);
        }

        public i(com.bytedance.als.dsl.d dVar, e eVar) {
            this.f138258a = dVar;
            this.f138259b = eVar;
        }
    }

    public static final class j extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.dockbar.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f138261b;

        static {
            Covode.recordClassIndex(90424);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.dockbar.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.record.dockbar.b(this.f138261b, fVar);
        }

        public j(com.bytedance.als.dsl.d dVar, e eVar) {
            this.f138260a = dVar;
            this.f138261b = eVar;
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.a aVar) {
        h.f.b.l.d(aVar, "");
        this.u.add(0, aVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.a aVar) {
        h.f.b.l.d(aVar, "");
        this.u.add(aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.e$e  reason: collision with other inner class name */
    static final class C3642e implements r.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138251a;

        static {
            Covode.recordClassIndex(90419);
        }

        C3642e(e eVar) {
            this.f138251a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.types.ar.text.r.b
        public final void a(boolean z) {
            this.f138251a.H().c(new StoryRecordBaseViewModel.i(!z));
        }
    }

    public static final class k extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.g.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f138263b;

        static {
            Covode.recordClassIndex(90425);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.g.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.record.g.b(com.bytedance.scene.ktx.c.b(this.f138263b), this.f138263b, fVar);
        }

        public k(com.bytedance.als.dsl.d dVar, e eVar) {
            this.f138262a = dVar;
            this.f138263b = eVar;
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138274a;

        static {
            Covode.recordClassIndex(90441);
        }

        q(e eVar) {
            this.f138274a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj instanceof d.e) {
                this.f138274a.H().a(true);
            } else if (obj instanceof d.a) {
                this.f138274a.H().a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(90445);
        }

        u(h.c.d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new u(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((u) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                h.r.a(obj);
                com.ss.android.ugc.aweme.port.in.g.a().l().cleanStoryCache();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void a(com.ss.android.ugc.tools.view.a.b bVar) {
        h.f.b.l.d(bVar, "");
        this.t.add(bVar);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void c(com.ss.android.ugc.tools.view.a.a aVar) {
        h.f.b.l.d(aVar, "");
        this.u.remove(aVar);
    }

    public static final class d extends com.bytedance.o.p<com.ss.android.ugc.aweme.story.record.a.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138249a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f138250b;

        static {
            Covode.recordClassIndex(90418);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.story.record.a.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.story.record.a.b((ViewGroup) this.f138250b.c(R.id.a1n), fVar, this.f138250b.G().f138288k, this.f138250b.G().f138279b);
        }

        public d(com.bytedance.als.dsl.d dVar, e eVar) {
            this.f138249a = dVar;
            this.f138250b = eVar;
        }
    }

    public static final class h extends com.bytedance.o.p<com.bytedance.creativex.recorder.gesture.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f138256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f138257b;

        static {
            Covode.recordClassIndex(90422);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.bytedance.creativex.recorder.gesture.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            com.bytedance.creativex.recorder.gesture.c cVar = new com.bytedance.creativex.recorder.gesture.c(this.f138257b, fVar, R.id.baf);
            PrivacyCert build = PrivacyCert.Builder.Companion.with("bpea-289").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build();
            h.f.b.l.d(build, "");
            cVar.f28372h = build;
            return cVar;
        }

        public h(com.bytedance.als.dsl.d dVar, e eVar) {
            this.f138256a = dVar;
            this.f138257b = eVar;
        }
    }

    static final class s<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138276a;

        static {
            Covode.recordClassIndex(90443);
        }

        s(e eVar) {
            this.f138276a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            androidx.lifecycle.i lifecycle = this.f138276a.getLifecycle();
            h.f.b.l.b(lifecycle, "");
            if (lifecycle.a().isAtLeast(i.b.STARTED)) {
                if (!this.f138276a.I()) {
                    this.f138276a.J();
                }
                if (this.f138276a.f138227d) {
                    this.f138276a.K();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.base.c
    public final void a(EnterStoryParam enterStoryParam) {
        String str = "";
        h.f.b.l.d(enterStoryParam, str);
        com.ss.android.ugc.aweme.story.record.f.a G = G();
        G.f138281d = enterStoryParam.getEnterMethod();
        G.f138282e = enterStoryParam.getEnterFrom();
        if (h.f.b.l.a((Object) enterStoryParam.getEnterMethod(), (Object) "slide_right")) {
            if (enterStoryParam.isWestWindowExist()) {
                str = "1";
            } else {
                str = "0";
            }
        }
        G.a(str);
    }

    @Override // com.ss.android.ugc.tools.view.a.c
    public final void b(com.ss.android.ugc.tools.view.a.b bVar) {
        h.f.b.l.d(bVar, "");
        this.t.remove(bVar);
    }

    static final class r<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f138275a;

        static {
            Covode.recordClassIndex(90442);
        }

        r(e eVar) {
            this.f138275a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Effect effect;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                this.f138275a.H().a(true);
                return;
            }
            com.bytedance.creativex.recorder.sticker.a.a aVar = this.f138275a.f138226c;
            if (aVar != null) {
                effect = com.ss.android.ugc.aweme.sticker.f.e.a(aVar);
            } else {
                effect = null;
            }
            if (com.ss.android.ugc.aweme.sticker.p.g.u(effect)) {
                this.f138275a.H().c(true);
                return;
            }
            this.f138275a.H().c(false);
            this.f138275a.H().a(false);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(pVar, "");
            this.this$0.f138227d = true;
            if (this.this$0.L()) {
                this.this$0.K();
            }
            this.this$0.G().f138287j = System.currentTimeMillis();
            com.ss.android.ugc.aweme.story.record.f.a G = this.this$0.G();
            h.f.b.l.d(G, "");
            com.ss.android.ugc.aweme.story.record.j.c.f138377a = -1;
            com.ss.android.ugc.aweme.story.record.j.c.f138378b = "";
            com.ss.android.ugc.aweme.story.record.j.c.f138377a = System.currentTimeMillis();
            com.ss.android.ugc.aweme.story.record.j.c.a("enter_video_shoot_page");
            Map<String, String> map = new com.ss.android.ugc.tools.f.b().a("creation_id", G.f138279b).a("shoot_way", "story").a("shoot_entrance", "story").a("shoot_page", "story_shoot_page").a("is_westwindow_exist", G.f138286i).a("enter_method", G.f138281d).a("enter_from", G.f138282e).a("last_group_id", dv.f126643b).a("last_gid_from", dv.f126644c).f149193a;
            com.ss.android.ugc.aweme.utils.d.a("shoot", map);
            com.ss.android.ugc.aweme.utils.d.a("enter_video_shoot_page", map);
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(90440);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.p pVar) {
            Effect effect;
            com.bytedance.creativex.recorder.sticker.a.c cVar;
            a aVar;
            h.f.b.l.d(pVar, "");
            this.this$0.f138227d = false;
            com.bytedance.o.f F = this.this$0.F();
            if (!(F == null || (aVar = (a) F.b(a.class, null)) == null)) {
                if (aVar.b().b()) {
                    aVar.b().a(h.a.n.b("type_scene_cover", "type_ui_operation"));
                }
                if (aVar.f138236d) {
                    aVar.e();
                }
            }
            com.bytedance.creativex.recorder.sticker.a.a aVar2 = this.this$0.f138226c;
            if (!(aVar2 == null || com.ss.android.ugc.aweme.sticker.f.e.a(aVar2) == null)) {
                com.bytedance.creativex.recorder.sticker.a.a aVar3 = this.this$0.f138226c;
                if (aVar3 != null) {
                    effect = com.ss.android.ugc.aweme.sticker.f.e.a(aVar3);
                } else {
                    effect = null;
                }
                if (com.ss.android.ugc.aweme.sticker.p.g.t(effect)) {
                    this.this$0.b();
                    com.bytedance.o.f F2 = this.this$0.F();
                    if (!(F2 == null || (cVar = (com.bytedance.creativex.recorder.sticker.a.c) F2.a((Type) com.bytedance.creativex.recorder.sticker.a.c.class, (String) null)) == null)) {
                        cVar.a(false);
                    }
                }
                com.bytedance.creativex.recorder.sticker.a.a aVar4 = this.this$0.f138226c;
                if (aVar4 != null) {
                    com.ss.android.ugc.aweme.sticker.f.e.a(aVar4, (Effect) null);
                }
            }
            com.ss.android.ugc.aweme.story.record.f.a G = this.this$0.G();
            String uuid = UUID.randomUUID().toString();
            h.f.b.l.b(uuid, "");
            h.f.b.l.d(uuid, "");
            G.f138279b = uuid;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.w
    public final void a(boolean z2) {
        com.ss.android.ugc.aweme.story.record.g.a aVar;
        com.ss.android.ugc.aweme.story.record.toolbar.a aVar2;
        if (!this.x) {
            com.bytedance.o.f F = F();
            if (!(F == null || (aVar2 = (com.ss.android.ugc.aweme.story.record.toolbar.a) F.a(com.ss.android.ugc.aweme.story.record.toolbar.a.class, (String) null)) == null)) {
                aVar2.a();
            }
            com.bytedance.o.f F2 = F();
            if (!(F2 == null || (aVar = (com.ss.android.ugc.aweme.story.record.g.a) F2.b(com.ss.android.ugc.aweme.story.record.g.a.class, null)) == null)) {
                aVar.a();
            }
            this.x = true;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        com.ss.android.ugc.aweme.story.record.a.a aVar;
        com.bytedance.creativex.recorder.sticker.a.a aVar2;
        SurfaceView surfaceView;
        com.bytedance.o.f F;
        com.ss.android.ugc.aweme.story.record.g.b bVar;
        androidx.lifecycle.t<Boolean> tVar;
        com.bytedance.als.g<Boolean> d2;
        com.ss.android.ugc.aweme.sticker.e eVar;
        com.bytedance.als.g<com.ss.android.ugc.aweme.sticker.d> a2;
        super.a(bundle);
        com.bytedance.als.dsl.g.a(this, new l(this, G().e()));
        com.bytedance.als.dsl.b bVar2 = new com.bytedance.als.dsl.b(com.bytedance.als.dsl.c.a(this));
        com.bytedance.als.dsl.d dVar = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer = bVar2.f6461a;
        alsLogicContainer.f6437d.a(com.ss.android.ugc.aweme.story.record.a.b.class, (String) null, (com.bytedance.o.p) new d(dVar, this));
        alsLogicContainer.a(com.ss.android.ugc.aweme.story.record.a.a.class, com.ss.android.ugc.aweme.story.record.a.b.class);
        com.ss.android.ugc.aweme.port.in.g.a().l().attachStickerComponent(bVar2, this, R.id.dj9, new C3642e(this));
        com.bytedance.als.dsl.d dVar2 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f6461a;
        alsLogicContainer2.f6437d.a(com.bytedance.creativex.recorder.a.i.class, (String) null, (com.bytedance.o.p) new a(dVar2));
        alsLogicContainer2.a(com.bytedance.creativex.recorder.a.a.a.class, com.bytedance.creativex.recorder.a.i.class);
        com.bytedance.als.dsl.d dVar3 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f6461a;
        alsLogicContainer3.f6437d.a(com.ss.android.ugc.aweme.story.record.toolbar.b.class, (String) null, (com.bytedance.o.p) new f(dVar3, this));
        alsLogicContainer3.a(com.ss.android.ugc.aweme.story.record.toolbar.a.class, com.ss.android.ugc.aweme.story.record.toolbar.b.class);
        com.bytedance.als.dsl.d dVar4 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f6461a;
        alsLogicContainer4.f6437d.a(com.ss.android.ugc.aweme.story.record.recordcontrol.e.class, (String) null, (com.bytedance.o.p) new b(dVar4));
        alsLogicContainer4.a(com.bytedance.creativex.recorder.b.a.m.class, com.ss.android.ugc.aweme.story.record.recordcontrol.e.class);
        com.bytedance.als.dsl.d dVar5 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f6461a;
        alsLogicContainer5.f6437d.a(com.ss.android.ugc.aweme.story.record.h.b.class, (String) null, (com.bytedance.o.p) new g(dVar5, this));
        alsLogicContainer5.a(com.ss.android.ugc.aweme.story.record.h.a.class, com.ss.android.ugc.aweme.story.record.h.b.class);
        com.bytedance.als.dsl.d dVar6 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f6461a;
        alsLogicContainer6.f6437d.a(com.bytedance.creativex.recorder.gesture.c.class, (String) null, (com.bytedance.o.p) new h(dVar6, this));
        alsLogicContainer6.a(com.bytedance.creativex.recorder.gesture.api.b.class, com.bytedance.creativex.recorder.gesture.c.class);
        com.bytedance.als.dsl.d dVar7 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f6461a;
        alsLogicContainer7.f6437d.a(a.class, (String) null, (com.bytedance.o.p) new i(dVar7, this));
        alsLogicContainer7.a(com.bytedance.als.b.class, a.class);
        com.bytedance.als.dsl.d dVar8 = new com.bytedance.als.dsl.d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f6461a;
        alsLogicContainer8.f6437d.a(com.ss.android.ugc.aweme.story.record.dockbar.b.class, (String) null, (com.bytedance.o.p) new j(dVar8, this));
        alsLogicContainer8.a(com.ss.android.ugc.aweme.story.record.dockbar.a.class, com.ss.android.ugc.aweme.story.record.dockbar.b.class);
        if (!L()) {
            com.bytedance.als.dsl.d dVar9 = new com.bytedance.als.dsl.d();
            AlsLogicContainer alsLogicContainer9 = bVar2.f6461a;
            alsLogicContainer9.f6437d.a(com.ss.android.ugc.aweme.story.record.g.b.class, (String) null, (com.bytedance.o.p) new k(dVar9, this));
            alsLogicContainer9.a(com.ss.android.ugc.aweme.story.record.g.a.class, com.ss.android.ugc.aweme.story.record.g.b.class);
        }
        bVar2.a();
        com.bytedance.o.f F2 = F();
        if (F2 != null) {
            aVar = (com.ss.android.ugc.aweme.story.record.a.a) F2.a(com.ss.android.ugc.aweme.story.record.a.a.class, (String) null);
        } else {
            aVar = null;
        }
        this.f138225b = aVar;
        com.bytedance.o.f F3 = F();
        if (F3 != null) {
            aVar2 = (com.bytedance.creativex.recorder.sticker.a.a) F3.a(com.bytedance.creativex.recorder.sticker.a.a.class, (String) null);
        } else {
            aVar2 = null;
        }
        this.f138226c = aVar2;
        getLifecycle().a(new AnalysisActivityComponent(s(), this));
        com.ss.android.ugc.aweme.story.record.a.a aVar3 = this.f138225b;
        if (aVar3 != null) {
            surfaceView = aVar3.F();
        } else {
            surfaceView = null;
        }
        this.f138231l = surfaceView;
        View c2 = c(R.id.c5v);
        h.f.b.l.b(c2, "");
        FrameLayout frameLayout = (FrameLayout) c2;
        frameLayout.post(new n(this, frameLayout));
        f.a.b.b unused = H().a(this, f.f138277a, new ah(), new o(this));
        f.a.b.b unused2 = H().a(this, g.f138289a, new ah(), new p(this));
        com.bytedance.o.f F4 = F();
        if (!(F4 == null || (eVar = (com.ss.android.ugc.aweme.sticker.e) F4.b(com.ss.android.ugc.aweme.sticker.e.class, null)) == null || (a2 = eVar.a()) == null)) {
            a2.a(this, new q(this));
        }
        com.bytedance.creativex.recorder.sticker.a.a aVar4 = this.f138226c;
        if (!(aVar4 == null || (d2 = aVar4.d()) == null)) {
            d2.a(this, new r(this));
        }
        if (!(L() || (F = F()) == null || (bVar = (com.ss.android.ugc.aweme.story.record.g.b) F.a(com.ss.android.ugc.aweme.story.record.g.b.class, (String) null)) == null || (tVar = bVar.f138290a) == null)) {
            tVar.observe(this, new s(this));
        }
        if (!I() && L()) {
            J();
        }
        com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).a("at_shoot_page", false);
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b2z, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        this.f138229j = viewGroup2;
        return viewGroup2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    @Override // com.ss.android.ugc.aweme.story.base.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r3, int r4, android.content.Intent r5) {
        /*
            r2 = this;
            r0 = 531(0x213, float:7.44E-43)
            if (r3 != r0) goto L_0x0039
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel r0 = r2.H()
            r0.a(r4)
            r0 = 10
            if (r4 == r0) goto L_0x0039
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel r1 = r2.H()
            androidx.fragment.app.e r0 = com.bytedance.scene.ktx.c.b(r2)
            com.bytedance.jedi.arch.af r0 = r1.a(r0)
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseState r0 = (com.ss.android.ugc.aweme.story.record.StoryRecordBaseState) r0
            com.bytedance.jedi.arch.k r0 = r0.getOpenAlbum()
            if (r0 == 0) goto L_0x0036
            T r0 = r0.f39404b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto L_0x0036
            com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel r1 = r2.H()
            r0 = 0
            r1.b(r0)
        L_0x0036:
            r2.N()
        L_0x0039:
            java.util.ArrayList<com.ss.android.ugc.tools.view.a.b> r0 = r2.t
            java.util.Iterator r1 = r0.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0051
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.tools.view.a.b r0 = (com.ss.android.ugc.tools.view.a.b) r0
            boolean r0 = r0.a(r3, r4, r5)
            if (r0 == 0) goto L_0x003f
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.e.a(int, int, android.content.Intent):void");
    }
}

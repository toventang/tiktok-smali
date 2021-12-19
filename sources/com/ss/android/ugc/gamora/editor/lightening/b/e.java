package com.ss.android.ugc.gamora.editor.lightening.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.t;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.property.cm;
import com.ss.android.ugc.aweme.property.p;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.gamora.editor.ac;
import com.ss.android.ugc.gamora.editor.lightening.b.j;
import com.ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.s;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import f.a.x;
import h.a.n;
import h.f.a.q;
import h.f.a.r;
import h.f.b.m;
import h.f.b.y;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class e extends com.bytedance.als.j<d> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f146095a = {new y(e.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(e.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(e.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new y(e.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new y(e.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new y(e.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};
    private final int A = R.id.c6m;
    private final boolean B;

    /* renamed from: b  reason: collision with root package name */
    public final e f146096b;

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f146097c;

    /* renamed from: d  reason: collision with root package name */
    public b f146098d;

    /* renamed from: e  reason: collision with root package name */
    public final j f146099e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.scene.group.b f146100f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f146101g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f146102h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f146103i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f146104j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f146105k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f146106l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.als.l<String> f146107m;
    private final com.bytedance.als.l<Boolean> n;
    private final com.bytedance.als.l<TextUtils.TruncateAt> o;
    private final com.bytedance.als.l<Boolean> p;
    private final com.bytedance.als.l<Boolean> q;
    private final com.bytedance.als.l<Boolean> r;
    private final com.bytedance.als.l<Boolean> s;
    private final h.h t;
    private final a u;
    private EditMusicViewModel v;
    private boolean w;
    private final h.h x;
    private final f.a.b.a y;
    private final com.bytedance.o.f z;

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final h f146113a = new h();

        static {
            Covode.recordClassIndex(96017);
        }

        h() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(96009);
    }

    private final boolean j() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    public final VideoPublishEditModel b() {
        return (VideoPublishEditModel) this.f146101g.a(this, f146095a[0]);
    }

    public final androidx.fragment.app.e c() {
        return (androidx.fragment.app.e) this.f146102h.a(this, f146095a[1]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.e.c d() {
        return (com.ss.android.ugc.gamora.editor.e.c) this.f146104j.a(this, f146095a[2]);
    }

    public final ac e() {
        return (ac) this.f146105k.a(this, f146095a[4]);
    }

    /* access modifiers changed from: package-private */
    public final p f() {
        return (p) this.t.getValue();
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ d getApiComponent() {
        return this.f146096b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.z;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    static final class a extends m implements h.f.a.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146108a = new a();

        static {
            Covode.recordClassIndex(96010);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ p invoke() {
            return com.ss.android.ugc.aweme.canvas.e.a();
        }
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    static final /* synthetic */ class l extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(96021);
        }

        l(e eVar) {
            super(0, eVar, e.class, "clearMusic", "clearMusic()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((e) this.receiver).g();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.lightening.b.d
    public final void a() {
        this.r.b(false);
    }

    public final void g() {
        cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
        e().a();
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        this.y.dispose();
    }

    static final class b extends m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(96011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.c()).a(EditToolbarViewModel.class);
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f146109a = new c();

        static {
            Covode.recordClassIndex(96012);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    static final /* synthetic */ class k extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(96020);
        }

        k(e eVar) {
            super(0, eVar, e.class, "openMusicPanel", "openMusicPanel()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            e eVar = (e) this.receiver;
            ((s) eVar.f146097c.a(eVar, e.f146095a[3])).a(1);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.als.j
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null) {
            a(cVar);
        } else {
            h();
        }
    }

    public final void i() {
        this.r.b(true);
        if (j()) {
            this.f146107m.b(c().getString(R.string.g4k));
        }
        this.p.b(false);
    }

    public final void h() {
        if (!h.f.b.l.a((Object) this.f146107m.f6468a.getValue(), (Object) c().getString(R.string.g4k))) {
            this.f146107m.b(c().getString(R.string.fvx));
        }
        if (!com.ss.android.ugc.gamora.editor.lightening.a.a() && cm.b()) {
            this.s.b(false);
        }
        this.o.b(TextUtils.TruncateAt.MIDDLE);
        this.p.b(false);
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        f.a.t<R> d2;
        Integer num;
        super.onCreate();
        if (!b().isDuet() && !b().isReaction() && !bp.b(b())) {
            h.f.b.l.d(b(), "");
            JediViewModel a2 = t.a(c()).a(EditMusicViewModel.class);
            h.f.b.l.b(a2, "");
            this.v = (EditMusicViewModel) a2;
            if (this.B) {
                this.f146098d = new b(getDiContainer(), this.u);
                this.f146107m.b(c().getString(R.string.fvx));
                if (!com.ss.android.ugc.gamora.editor.lightening.a.a() && cm.b()) {
                    this.s.b(false);
                }
                this.o.b(TextUtils.TruncateAt.MIDDLE);
                this.p.b(false);
                this.q.b(Boolean.valueOf(!b().isStickPointMode));
                ((EditToolbarViewModel) this.f146103i.getValue()).j().observe(c(), new i(this));
            }
            d().w().observe(this, new j(this));
            e().g().b(this, new C3900e(this));
            if (com.ss.android.ugc.gamora.editor.t.a(b())) {
                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                if (cVar != null) {
                    h.f.b.l.b(cVar, "");
                    a(cVar);
                }
            } else {
                VideoPublishEditModel b2 = b();
                if (cr.a().f125295a == null && b2 != null && !b2.mIsFromDraft && b2.canvasVideoData != null) {
                    this.f146099e.f146127c = new f(this);
                    j jVar = this.f146099e;
                    Context applicationContext = c().getApplicationContext();
                    if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                        applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                    }
                    h.f.b.l.b(applicationContext, "");
                    VideoPublishEditModel b3 = b();
                    h.f.b.l.d(applicationContext, "");
                    jVar.f146125a = b3;
                    jVar.f146126b = applicationContext;
                    HashMap<String, Integer> extraShareOptions = b().creativeFlowData.getExtraShareOptions();
                    if (extraShareOptions == null || (num = extraShareOptions.get("tiktok_videokit_disable_music_selection")) == null || num.intValue() != 1) {
                        j jVar2 = this.f146099e;
                        aa aaVar = (aa) com.ss.android.ugc.aweme.port.in.g.a().s();
                        if (aaVar == null) {
                            d2 = f.a.h.a.a(f.a.e.e.e.v.f157740a);
                            h.f.b.l.b(d2, "");
                        } else {
                            d2 = aaVar.k().a(2).d(j.f.f146139a);
                            h.f.b.l.b(d2, "");
                        }
                        f.a.t<R> d3 = d2.b(1).d(j.g.f146140a).a((f.a.d.g<? super R, ? extends x<? extends R>>) new j.h(jVar2), false).d(j.i.f146142a);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        f.a.t a3 = f.a.t.a(new RuntimeException("load music time out"));
                        f.a.e.b.b.a((Object) a3, "other is null");
                        f.a.t<R> a4 = d3.a(20, timeUnit, a3, f.a.h.a.a(f.a.k.a.f158005b)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).c(new j.C3901j(jVar2)).a(new j.k(jVar2)).b(new j.l(jVar2)).a(new j.m(jVar2));
                        h.f.b.l.b(a4, "");
                        this.y.a(a4.a(new g(this), h.f146113a));
                    }
                    if (this.f146099e.a()) {
                        i();
                    } else {
                        h();
                    }
                    this.f146099e.f146129e.observe(this, new d(this));
                }
            }
            if (b().mMusicPath != null) {
                this.w = true;
            }
            b bVar = this.f146098d;
            if (bVar != null) {
                this.f146100f.a(this.A, bVar, "StoryChooseMusicScene");
            }
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f146114a;

        static {
            Covode.recordClassIndex(96018);
        }

        i(e eVar) {
            this.f146114a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            b bVar;
            Boolean bool = (Boolean) obj;
            if (bool != null && (bVar = this.f146114a.f146098d) != null) {
                if (bool.booleanValue()) {
                    this.f146114a.f146100f.e(bVar);
                } else {
                    this.f146114a.f146100f.d(bVar);
                }
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f146110a;

        static {
            Covode.recordClassIndex(96013);
        }

        d(e eVar) {
            this.f146110a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2 = f.f146116a[((g) obj).f146118a.ordinal()];
            if (i2 == 1) {
                this.f146110a.i();
            } else if (i2 == 2) {
                this.f146110a.a();
            } else if (i2 == 3) {
                this.f146110a.a();
                this.f146110a.g();
            } else if (i2 == 4) {
                this.f146110a.a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$e  reason: collision with other inner class name */
    static final class C3900e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f146111a;

        static {
            Covode.recordClassIndex(96014);
        }

        C3900e(e eVar) {
            this.f146111a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            com.bytedance.jedi.arch.d dVar = (com.bytedance.jedi.arch.d) obj;
            if (this.f146111a.f146099e.a()) {
                j jVar = this.f146111a.f146099e;
                jVar.f146129e.setValue(new g<>(h.CANCEL, null, null, 6));
                f.a.b.b bVar = jVar.f146130f;
                if (bVar != null) {
                    bVar.dispose();
                }
                jVar.f146130f = null;
            }
            if (dVar == null || (t = dVar.f39404b) == null) {
                this.f146111a.h();
            } else {
                this.f146111a.a(t);
            }
        }
    }

    static final class f extends m implements h.f.a.b<com.ss.android.ugc.aweme.shortvideo.c, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(96015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.shortvideo.c cVar) {
            com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            if (bp.a()) {
                this.this$0.e().a(cVar2.path, cVar2, true);
            } else {
                this.this$0.e().a(d.a.a(false, "edit_page_list", cVar2, cVar2.path));
            }
            this.this$0.a(cVar2);
            return z.f158842a;
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f146112a;

        static {
            Covode.recordClassIndex(96016);
        }

        g(e eVar) {
            this.f146112a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = (com.ss.android.ugc.aweme.shortvideo.c) obj;
            String musicId = cVar.getMusicId();
            if (musicId != null && !h.m.p.a((CharSequence) musicId)) {
                this.f146112a.b().mFirstStickerMusicIdsJson = new com.google.gson.f().b(n.a(cVar.getMusicId()));
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        StringBuilder sb = new StringBuilder("");
        String name = cVar.getName();
        boolean z2 = false;
        if (name == null || name.length() == 0) {
            String singer = cVar.getSinger();
            if (!(singer == null || singer.length() == 0)) {
                sb.append(cVar.getSinger());
            }
        } else {
            sb.append(cVar.getName());
            String singer2 = cVar.getSinger();
            if (!(singer2 == null || singer2.length() == 0)) {
                sb.append('-');
                sb.append(cVar.getSinger());
            }
        }
        this.f146107m.b(sb.toString());
        if (!j() && !com.ss.android.ugc.gamora.editor.lightening.a.a() && cm.b()) {
            this.s.b(true);
        }
        this.o.b(TextUtils.TruncateAt.MARQUEE);
        if (j()) {
            com.bytedance.als.l<Boolean> lVar = this.p;
            if (!b().isStickPointMode && !b().isTemplateMv()) {
                z2 = true;
            }
            lVar.b(Boolean.valueOf(z2));
        } else if (!cm.b()) {
            this.p.b(Boolean.valueOf(!b().isStickPointMode));
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f146115a;

        static {
            Covode.recordClassIndex(96019);
        }

        j(e eVar) {
            this.f146115a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            VideoFileInfo videoFileInfo;
            Integer valueOf;
            VEPreviewMusicParams vEPreviewMusicParams = (VEPreviewMusicParams) obj;
            if (this.f146115a.b().canvasVideoData != null) {
                if (vEPreviewMusicParams.f156739d <= 0 || Math.abs(vEPreviewMusicParams.f156738c - vEPreviewMusicParams.f156739d) < 1000) {
                    i2 = vEPreviewMusicParams.f156738c;
                } else {
                    i2 = vEPreviewMusicParams.f156739d;
                }
                e eVar = this.f146115a;
                if (i2 == 0) {
                    i2 = eVar.f().f118589a;
                }
                int c2 = h.j.h.c(h.j.h.b(i2, eVar.f().f118590b), eVar.f().f118591c);
                com.ss.android.ugc.asve.editor.g value = eVar.d().C().getValue();
                if (value == null || (valueOf = Integer.valueOf(value.G())) == null || valueOf.intValue() != c2) {
                    VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                    vEClipTimelineParam.speed = (double) com.ss.android.ugc.aweme.tools.i.NORMAL.value();
                    vEClipTimelineParam.trimIn = 0;
                    vEClipTimelineParam.trimOut = c2;
                    if (value != null) {
                        value.a(0, new int[]{0}, new VEClipTimelineParam[]{vEClipTimelineParam});
                        value.t();
                    }
                    EditVideoSegment editVideoSegment = (EditVideoSegment) n.h((List) eVar.b().getPreviewInfo().getVideoList());
                    if (editVideoSegment != null) {
                        videoFileInfo = editVideoSegment.getVideoFileInfo();
                    } else {
                        videoFileInfo = null;
                    }
                    EditVideoSegment editVideoSegment2 = (EditVideoSegment) n.h((List) eVar.b().getPreviewInfo().getVideoList());
                    if (videoFileInfo != null && editVideoSegment2 != null) {
                        eVar.b().setPreviewInfo(new com.ss.android.ugc.aweme.shortvideo.edit.model.h(videoFileInfo.getWidth(), videoFileInfo.getHeight(), null, 28).a(new EditVideoSegment(editVideoSegment2.getVideoPath(), null, new VideoFileInfo(videoFileInfo.getWidth(), videoFileInfo.getHeight(), (long) c2, 30, 0, 0, 0, 0, 240, null))));
                        if (value != null) {
                            JediViewModel a2 = t.a(eVar.c()).a(EditInfoStickerViewModel.class);
                            h.f.b.l.b(a2, "");
                            ((EditInfoStickerViewModel) a2).a(new h.p<>(Integer.valueOf(c2), Integer.valueOf(c2)));
                            value.a(0, c2, x.g.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public e(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar, boolean z2) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.z = fVar;
        this.f146100f = bVar;
        this.B = z2;
        this.f146096b = this;
        this.f146101g = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
        this.f146102h = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);
        this.f146103i = h.i.a((h.f.a.a) new b(this));
        this.f146104j = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.editor.e.c.class);
        this.f146097c = com.bytedance.o.b.a.a(getDiContainer(), s.class);
        this.f146105k = com.bytedance.o.b.a.a(getDiContainer(), ac.class);
        this.f146106l = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.editor.music.a.class);
        com.bytedance.als.l<String> lVar = new com.bytedance.als.l<>("");
        this.f146107m = lVar;
        com.bytedance.als.l<Boolean> lVar2 = new com.bytedance.als.l<>(true);
        this.n = lVar2;
        com.bytedance.als.l<TextUtils.TruncateAt> lVar3 = new com.bytedance.als.l<>(TextUtils.TruncateAt.MIDDLE);
        this.o = lVar3;
        com.bytedance.als.l<Boolean> lVar4 = new com.bytedance.als.l<>(false);
        this.p = lVar4;
        com.bytedance.als.l<Boolean> lVar5 = new com.bytedance.als.l<>(true);
        this.q = lVar5;
        com.bytedance.als.l<Boolean> lVar6 = new com.bytedance.als.l<>(false);
        this.r = lVar6;
        com.bytedance.als.l<Boolean> lVar7 = new com.bytedance.als.l<>(false);
        this.s = lVar7;
        this.t = h.i.a((h.f.a.a) a.f146108a);
        a aVar = new a();
        h.f.b.l.d(lVar, "");
        aVar.f146059a = lVar;
        h.f.b.l.d(lVar3, "");
        aVar.f146061c = lVar3;
        h.f.b.l.d(lVar2, "");
        aVar.f146060b = lVar2;
        h.f.b.l.d(lVar4, "");
        aVar.f146062d = lVar4;
        h.f.b.l.d(lVar5, "");
        aVar.f146063e = lVar5;
        h.f.b.l.d(lVar6, "");
        aVar.f146064f = lVar6;
        k kVar = new k(this);
        h.f.b.l.d(kVar, "");
        aVar.f146066h = kVar;
        l lVar8 = new l(this);
        h.f.b.l.d(lVar8, "");
        aVar.f146067i = lVar8;
        h.f.b.l.d(lVar7, "");
        aVar.f146065g = lVar7;
        this.u = aVar;
        this.x = h.i.a((h.f.a.a) c.f146109a);
        this.f146099e = new j();
        this.y = new f.a.b.a();
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

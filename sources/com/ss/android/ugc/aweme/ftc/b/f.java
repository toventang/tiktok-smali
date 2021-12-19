package com.ss.android.ugc.aweme.ftc.b;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.ftc.b.b;
import com.ss.android.ugc.aweme.ftc.b.g;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ak;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.bw;
import com.ss.android.ugc.aweme.shortvideo.by;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dn;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.u;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class f extends j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f97471a = {new y(f.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(f.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(f.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(f.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(f.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/aweme/ftc/bottom/FTCBottomTabApiComponent;", 0), new y(f.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(f.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final k<z> f97472b = new k<>();

    /* renamed from: c  reason: collision with root package name */
    public final k<z> f97473c = new k<>();

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.scene.group.b f97474d;

    /* renamed from: e  reason: collision with root package name */
    private final c f97475e = new c();

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f97476f = com.bytedance.o.b.a.a(getDiContainer(), androidx.fragment.app.e.class);

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f97477g = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f97478h = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f97479i = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f97480j = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.ftc.a.a.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f97481k = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f97482l = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f97483m = h.i.a((h.f.a.a) new a(this));
    private final com.bytedance.o.f n;

    static {
        Covode.recordClassIndex(61930);
    }

    private final com.bytedance.creativex.recorder.b.a.d j() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f97477g.a(this, f97471a[1]);
    }

    private final com.ss.android.ugc.gamora.recorder.sticker.c.j k() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f97479i.a(this, f97471a[3]);
    }

    public final androidx.fragment.app.e e() {
        return (androidx.fragment.app.e) this.f97476f.a(this, f97471a[0]);
    }

    public final m f() {
        return (m) this.f97478h.a(this, f97471a[2]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.h.a g() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.f97481k.a(this, f97471a[5]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final ShortVideoContext h() {
        return (ShortVideoContext) this.f97482l.a(this, f97471a[6]);
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g a() {
        return this.f97472b;
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.g b() {
        return this.f97473c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.n;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
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

    private final ASCameraView l() {
        return j().D();
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final void d() {
        a(cr.a().f125295a);
        a(false);
    }

    public final void i() {
        this.f97475e.f97463i.a((Integer) null);
    }

    static final class a extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(61931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            androidx.fragment.app.e e2 = this.this$0.e();
            m f2 = this.this$0.f();
            f fVar = this.this$0;
            return new b(e2, f2, fVar, fVar.h());
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final void c() {
        l().e(true);
        l().f(false);
        l().setMusicPath("");
        l().a((ASCameraView) "", (String) 0, 0L, 0L);
        l().b(false);
        k().l();
        h().f124764i = 0;
        h().d(0);
        h().f124757b.f124713h.d();
        h().a((String) null);
        com.ss.android.ugc.gamora.recorder.sticker.c.k.a(k(), new PrivacyCert(new com.bytedance.bpea.basics.j("1053"), "Record audio when using sound effects on the shooting page.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}));
        this.f97473c.a(z.f158842a);
        if (!h().f124757b.s) {
            f().a(h().f124757b.t, false);
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        AVChallenge aVChallenge;
        String str;
        com.ss.android.ugc.aweme.shortvideo.c cVar2;
        super.onCreate();
        g gVar = new g(e(), j(), k(), this, h());
        this.f97474d.a(R.id.dj5, new h(this.f97475e, ((com.ss.android.ugc.aweme.shortvideo.h.a) getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class)).d()), "FTCRecordChooseMusicScene");
        this.f97475e.f97465k.a(this, new b(gVar));
        this.f97475e.f97455a.a(this, new c(this));
        j().aj().a(this, new d(this));
        ((com.ss.android.ugc.aweme.ftc.a.a) this.f97480j.a(this, f97471a[4])).a().a(this, new e(this));
        f().o().b(this, new C2347f(this));
        f().w().a(this, new g(this));
        g().a().a(this, new h(this));
        if (!h().f124757b.b() && !h().f124757b.c() && !h().e() && (cVar = cr.a().f125295a) != null) {
            l().f(true);
            l().e(false);
            a(cVar);
            b(false);
            String str2 = "";
            if (h() != null && h().a()) {
                Activity activity = this.f97474d.f42913m;
                if (activity == null) {
                    l.b();
                }
                l.b(activity, str2);
                if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.e((Effect) activity.getIntent().getParcelableExtra("first_sticker"))) {
                    h().ad = true;
                    a((Integer) 1);
                    Object a2 = getDiContainer().a(com.ss.android.ugc.gamora.recorder.e.a.class, (String) null);
                    l.b(a2, str2);
                    com.ss.android.ugc.gamora.recorder.e.a aVar = (com.ss.android.ugc.gamora.recorder.e.a) a2;
                    aVar.setNeedNoTouchListener(true);
                    aVar.getNoBlockTouchEvent().a(this, new i(this));
                    if ((l.a((Object) "prop_reuse", (Object) h().r) || l.a((Object) "prop_page", (Object) h().r)) && (cVar2 = cr.a().f125295a) != null) {
                        Activity activity2 = this.f97474d.f42913m;
                        if (activity2 == null) {
                            l.b();
                        }
                        l.b(activity2, str2);
                        EffectTemplate effectTemplate = (EffectTemplate) activity2.getIntent().getParcelableExtra("first_sticker");
                        if (effectTemplate != null) {
                            r.a("prop_music_show", new com.ss.android.ugc.tools.f.b().a("creation_id", h().q).a("shoot_way", h().r).a("enter_from", "video_shoot_page").a("music_id", cVar2.getMusicId()).a("prop_id", effectTemplate.getEffectId()).a("group_id", ak.INSTANCE.getVideoId()).f149193a);
                        }
                    }
                }
            }
            String str3 = h().r;
            cr a3 = cr.a();
            l.b(a3, str2);
            List<AVChallenge> list = a3.f125298d;
            if (TextUtils.equals(str3, "challenge") && !com.bytedance.common.utility.collection.b.a((Collection) list)) {
                l.b(list, str2);
                if (n.h((List) list) != null && (aVChallenge = (AVChallenge) n.h((List) list)) != null && aVChallenge.isCommerce) {
                    ar a4 = new ar().a("shoot_way", str3);
                    AVChallenge aVChallenge2 = list.get(0);
                    if (aVChallenge2 == null || (str = aVChallenge2.cid) == null) {
                        str = str2;
                    }
                    ar a5 = a4.a("challenge_id", str);
                    String mid = cVar.getMid();
                    if (mid != null) {
                        str2 = mid;
                    }
                    q.a("autoselected_music_monitor", 0, a5.a("sticker_id", str2).a());
                }
            }
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f97489a;

        static {
            Covode.recordClassIndex(61937);
        }

        g(f fVar) {
            this.f97489a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97489a.d();
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f97491a;

        static {
            Covode.recordClassIndex(61939);
        }

        i(f fVar) {
            this.f97491a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97491a.i();
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        this.f97475e.f97461g.a(cVar);
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final void a(Integer num) {
        this.f97475e.f97463i.a(num);
    }

    public final void b(boolean z) {
        this.f97475e.f97460f.b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f97485a;

        static {
            Covode.recordClassIndex(61933);
        }

        c(f fVar) {
            this.f97485a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.scene.ktx.a.a(this.f97485a.f97474d, "FTCRecordChooseMusicScene");
            } else {
                com.bytedance.scene.ktx.a.b(this.f97485a.f97474d, "FTCRecordChooseMusicScene");
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f97486a;

        static {
            Covode.recordClassIndex(61934);
        }

        d(f fVar) {
            this.f97486a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((com.bytedance.creativex.recorder.b.a.k) obj).f28195b) {
                this.f97486a.a(0.0f, 1.0f);
            } else {
                this.f97486a.a(1.0f, 0.0f);
            }
        }
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f97484a;

        static {
            Covode.recordClassIndex(61932);
        }

        b(g gVar) {
            this.f97484a = gVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            g gVar = this.f97484a;
            PrivacyCert privacyCert = new PrivacyCert(new com.bytedance.bpea.basics.j("1025"), "Open the camera on the shooting page to preview and shoot the video.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.a()});
            com.ss.android.ugc.gamora.recorder.sticker.c.j jVar = gVar.f97494c;
            if (gVar.f97496e.f124757b.r != null) {
                jVar.E().d();
            }
            gVar.f97493b.a(new g.c(gVar));
            if (!gVar.f97493b.b()) {
                gVar.f97493b.b(false, privacyCert);
            }
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f97487a;

        static {
            Covode.recordClassIndex(61935);
        }

        e(f fVar) {
            this.f97487a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.b.c cVar = (com.ss.android.ugc.gamora.recorder.b.c) obj;
            Object obj2 = cVar.f147371c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (!TextUtils.equals((CharSequence) obj2, com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.f_g))) {
                Object obj3 = cVar.f147371c;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                if (!TextUtils.equals((CharSequence) obj3, com.ss.android.ugc.aweme.port.in.i.f115645a.getString(R.string.f_b))) {
                    if (!this.f97487a.h().f124757b.b() && !this.f97487a.h().f124757b.c()) {
                        this.f97487a.a((Boolean) null, (Boolean) true, (Boolean) true);
                        return;
                    }
                    return;
                }
            }
            this.f97487a.a((Boolean) null, (Boolean) false, (Boolean) false);
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f97490a;

        static {
            Covode.recordClassIndex(61938);
        }

        h(f fVar) {
            this.f97490a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f97490a.h().h()) {
                this.f97490a.a((Boolean) false, (Boolean) null, (Boolean) null);
            } else if (this.f97490a.g().g()) {
                this.f97490a.a((Boolean) true, (Boolean) null, (Boolean) null);
            } else {
                this.f97490a.a(bool, (Boolean) null, (Boolean) null);
            }
            if (!bool.booleanValue()) {
                this.f97490a.i();
            }
            if (this.f97490a.h().f124757b.b() || this.f97490a.h().f124757b.c()) {
                this.f97490a.a((Boolean) false, (Boolean) null, (Boolean) null);
            } else {
                this.f97490a.a((Boolean) null, bool, bool);
            }
        }
    }

    public final void a(boolean z) {
        this.f97475e.f97462h.b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$f  reason: collision with other inner class name */
    static final class C2347f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f97488a;

        static {
            Covode.recordClassIndex(61936);
        }

        C2347f(f fVar) {
            this.f97488a = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            t tVar = (t) obj;
            if (tVar != null) {
                boolean z2 = false;
                if (tVar.f28206b != 0 || !tVar.f28205a.isEmpty() || this.f97488a.h().f124757b.f124714i) {
                    z = false;
                } else {
                    z = true;
                }
                f fVar = this.f97488a;
                if (fVar.h().f124757b.b() || fVar.h().f124757b.c() || fVar.h().h()) {
                    fVar.a((Boolean) false, (Boolean) null, (Boolean) null);
                    return;
                }
                if (!fVar.h().c()) {
                    z2 = z;
                }
                fVar.a(z2);
                fVar.b(z2);
                if (z2) {
                    if (cr.a().f125295a == null) {
                        fVar.a((com.ss.android.ugc.aweme.shortvideo.c) null);
                    }
                } else if (cr.a().f125295a != null && fVar.h().f124757b.a()) {
                    fVar.a(cr.a().f125295a);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final void a(com.ss.android.ugc.aweme.cz.a.d dVar) {
        long j2;
        long j3;
        long j4;
        long j5;
        bw a2;
        l.d(dVar, "");
        b bVar = (b) this.f97483m.getValue();
        l.d(dVar, "");
        if (dVar.f79323a) {
            if (!bVar.f97450a.isFinishing()) {
                dn.a(bVar.f97453d);
                long b2 = bVar.b();
                if (b2 > 0 && bVar.c()) {
                    bVar.f97453d.a(Math.min(bVar.f97453d.f124757b.f124707b, b2));
                }
                bVar.f97451b.a(new com.bytedance.creativex.recorder.b.a.j(bVar.f97453d.f124757b.f124707b));
                bVar.f97452c.c();
            }
        } else if (!TextUtils.isEmpty(dVar.f79326d) && !bVar.f97450a.isFinishing()) {
            String str = dVar.f79326d;
            com.ss.android.ugc.aweme.shortvideo.c cVar = dVar.f79325c;
            String str2 = dVar.f79324b;
            if (bVar.f97453d.f124757b.t) {
                j2 = b.f97448e;
            } else {
                j2 = 15000;
            }
            if (com.ss.android.ugc.aweme.shortvideo.record.b.a.b(bVar.f97453d.F.f124773a)) {
                StitchParams stitchParams = bVar.f97453d.F.f124773a;
                if (stitchParams == null) {
                    l.b();
                }
                u<Long, Long, Long> a3 = com.ss.android.ugc.aweme.shortvideo.record.b.a.a(stitchParams, str, cVar, j2);
                j3 = a3.component1().longValue();
                j4 = a3.component2().longValue();
                j5 = a3.component3().longValue();
            } else {
                if (cVar == null || TextUtils.isEmpty(str)) {
                    j3 = 0;
                    j4 = j2;
                } else {
                    j3 = by.a(cVar, str);
                    j4 = Math.min(j3, j2);
                }
                long b3 = bVar.b();
                if (b3 > 0 && bVar.c()) {
                    j4 = Math.min(j4, b3);
                }
                j5 = j4;
            }
            bVar.f97453d.f124765j = str2;
            bVar.f97453d.a(str);
            bVar.f97453d.a(j4);
            com.ss.android.ugc.aweme.shortvideo.cutmusic.k.a(bVar.f97453d.f124757b.y, new b.C2346b(bVar));
            bVar.f97452c.a(cVar, str);
            if (cVar != null) {
                if (((long) cVar.shootDuration) > j2 || Math.abs(cVar.shootDuration - cVar.duration) >= 1000) {
                    com.ss.android.ugc.aweme.ftc.f.a a4 = bVar.a();
                    if (a4 != null) {
                        a4.a(true);
                    }
                } else {
                    com.ss.android.ugc.aweme.ftc.f.a a5 = bVar.a();
                    if (a5 != null) {
                        a5.a(false);
                    }
                }
            }
            if (bVar.f97453d.c()) {
                a2 = d.a(j2, j5);
            } else {
                a2 = d.a(j2, j3);
            }
            if (a2 == bw.MUSIC && dVar.f79327e) {
                bVar.f97452c.a((Integer) 1);
            }
            bVar.f97451b.a(new com.bytedance.creativex.recorder.b.a.j(j5));
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.d(vm1, "");
        l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public final void a(float f2, float f3) {
        this.f97475e.f97458d.b(h.v.a(Float.valueOf(f2), Float.valueOf(f3)));
    }

    public f(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        this.f97474d = bVar;
        this.n = fVar;
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
        if (cVar != null) {
            boolean a2 = h().f124757b.a();
            l().f(true);
            h().f124757b.f124713h.a(str);
            h().a(str);
            l().setMusicPath(str);
            l().a((ASCameraView) str, (String) 0, 0L, 0L);
            l().b(true);
            l().e(false);
            k().a(true);
            if (!a2) {
                l().a(e(), j().g().a());
            }
            int i2 = cVar.duration;
            if (i2 > 0) {
                h().f124764i = i2;
            }
            if (!h().c()) {
                h().d(0);
            }
            h().f124762g = cVar.getMid();
            h().f124766k = cVar.strongBeatUrl;
            com.ss.android.ugc.gamora.recorder.sticker.c.k.a(k(), new PrivacyCert(new com.bytedance.bpea.basics.j("1052"), "Record audio when using sound effects on the shooting page.", new com.bytedance.bpea.basics.k[]{com.bytedance.bpea.store.a.b.b()}));
            this.f97472b.a(z.f158842a);
        } else {
            this.f97473c.a(z.f158842a);
        }
        if (!h().f124757b.s) {
            f().a(h().f124757b.t, false);
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        l.d(jediViewModel, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.f97475e.f97455a.b(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.f97475e.f97457c.b(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.f97475e.f97456b.b(Boolean.valueOf(bool3.booleanValue()));
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.b.a
    public final void a(boolean z, com.ss.android.ugc.aweme.shortvideo.c cVar, String str) {
        if (z) {
            a((com.ss.android.ugc.aweme.shortvideo.c) null);
        } else if (!TextUtils.isEmpty(str)) {
            a(cVar);
            this.f97475e.f97459e.a((Void) null);
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<com.bytedance.jedi.arch.ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(ahVar, "");
        l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(ahVar, "");
        l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.d(jediViewModel, "");
        l.d(kVar, "");
        l.d(kVar2, "");
        l.d(kVar3, "");
        l.d(kVar4, "");
        l.d(ahVar, "");
        l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}

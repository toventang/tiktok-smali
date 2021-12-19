package com.ss.android.ugc.aweme.ttep.ttepcomponent.b;

import com.bytedance.als.h;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.bk;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.ae;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.util.bh;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.l.f;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.k.i;
import h.z;
import java.util.Objects;
import java.util.Set;

public final class a extends j<com.ss.android.ugc.gamora.recorder.m.a> implements com.bytedance.o.a, com.ss.android.ugc.gamora.recorder.m.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f141395a = {new y(a.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(a.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(a.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(a.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(a.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new y(a.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new y(a.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(a.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new y(a.class, "commentStickerComponent", "getCommentStickerComponent()Lcom/ss/android/ugc/aweme/comment_sticker/CommentStickerComponent;", 0), new y(a.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(a.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f141396b = this;

    /* renamed from: c  reason: collision with root package name */
    public final l<Integer> f141397c = new l<>(8);

    /* renamed from: d  reason: collision with root package name */
    public boolean f141398d;

    /* renamed from: e  reason: collision with root package name */
    public b f141399e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.scene.group.b f141400f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f141401g = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f141402h = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f141403i = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f141404j = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f141405k = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.k.a.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f141406l = com.bytedance.o.b.a.a(getDiContainer(), f.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f141407m = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
    private final h.h.d n = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
    private final h.h.d o = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.z.a.class);
    private final h.h.d p = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
    private final h.h.d q = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
    private final k<com.ss.android.ugc.gamora.recorder.b.c> r;
    private final l<z> s;
    private final k<com.ss.android.ugc.gamora.recorder.b.c> t;
    private final k<c> u;
    private String v;
    private l.a w;
    private boolean x;
    private final com.bytedance.als.d<Integer> y;
    private final com.bytedance.o.f z;

    static {
        Covode.recordClassIndex(92353);
    }

    private final com.ss.android.ugc.aweme.shortvideo.h.a f() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.f141401g.a(this, f141395a[0]);
    }

    private final m g() {
        return (m) this.f141402h.a(this, f141395a[1]);
    }

    private final com.ss.android.ugc.gamora.recorder.b.b h() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.f141403i.a(this, f141395a[2]);
    }

    private final com.ss.android.ugc.gamora.recorder.k.a i() {
        return (com.ss.android.ugc.gamora.recorder.k.a) this.f141405k.a(this, f141395a[4]);
    }

    private final f j() {
        return (f) this.f141406l.a(this, f141395a[5]);
    }

    private final com.ss.android.ugc.gamora.recorder.b.b k() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.f141407m.a(this, f141395a[6]);
    }

    private final com.ss.android.ugc.gamora.recorder.choosemusic.a l() {
        return (com.ss.android.ugc.gamora.recorder.choosemusic.a) this.n.a(this, f141395a[7]);
    }

    private final com.ss.android.ugc.aweme.z.a m() {
        return (com.ss.android.ugc.aweme.z.a) this.o.a(this, f141395a[8]);
    }

    public final ShortVideoContext a() {
        return (ShortVideoContext) this.f141404j.a(this, f141395a[3]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(String str, boolean z2) {
        h.f.b.l.d(str, "");
    }

    public final com.bytedance.creativex.recorder.b.a.d b() {
        return (com.bytedance.creativex.recorder.b.a.d) this.p.a(this, f141395a[9]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final /* bridge */ /* synthetic */ h c() {
        return this.f141397c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ com.ss.android.ugc.gamora.recorder.m.a getApiComponent() {
        return this.f141396b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.z;
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(boolean z2, boolean z3) {
        if (!this.f141398d) {
            return;
        }
        if (!z2 || a().f124757b.f124714i) {
            a(8);
            return;
        }
        if (a().f124757b.h() > 0) {
            if (!bk.a() || b().D().i() || a().f124757b.f124714i) {
                a(8);
                return;
            } else if (z3) {
                return;
            }
        } else if (bk.a()) {
            a(true, (Set<String>) null);
        }
        a(0);
    }

    public final void a(boolean z2, Set<String> set) {
        this.u.a(new c(z2, set));
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final boolean e() {
        T value;
        if (!this.f141398d || (value = this.f141397c.f6468a.getValue()) == null || value.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void d() {
        if (this.f141398d && bk.a() && !b().D().i() && !a().f124757b.f124714i) {
            a(false, bh.a(a().s()));
            a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.b.a$a  reason: collision with other inner class name */
    static final class RunnableC3749a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141408a;

        static {
            Covode.recordClassIndex(92354);
        }

        RunnableC3749a(a aVar) {
            this.f141408a = aVar;
        }

        public final void run() {
            if (this.f141408a.f141398d && this.f141408a.a().f124757b.h() >= this.f141408a.a().f124757b.k() && !this.f141408a.a().f124757b.f124714i && bk.a() && !this.f141408a.b().D().i()) {
                a aVar = this.f141408a;
                aVar.a(false, bh.a(aVar.a().s()));
                this.f141408a.a(0);
            }
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        boolean z2;
        super.onCreate();
        this.v = g.a().l().getDefaultShootTabTag(a());
        com.bytedance.o.f diContainer = getDiContainer();
        k<com.ss.android.ugc.gamora.recorder.b.c> kVar = this.t;
        com.bytedance.als.l<Integer> lVar = this.f141397c;
        h<Boolean> c2 = f().c();
        com.bytedance.als.l<z> lVar2 = this.s;
        k<c> kVar2 = this.u;
        String str = this.v;
        if (!com.ss.android.ugc.gamora.recorder.m.d.a() || a().f124757b.b() || a().f124757b.c() || a().i()) {
            z2 = false;
        } else {
            z2 = true;
        }
        b bVar = new b(diContainer, kVar, lVar, c2, lVar2, kVar2, str, z2, this.y);
        this.f141399e = bVar;
        this.f141400f.a(R.id.dj5, bVar, "SplitShootScene");
        b bVar2 = this.f141399e;
        if (bVar2 == null) {
            h.f.b.l.a("splitShootScene");
        }
        com.bytedance.scene.ktx.c.a(bVar2, new RunnableC3749a(this));
        g().w().a(this, new b(this));
        this.t.a(this, new c(this));
        g().s().a(this, new d(this));
        g().o().b(this, new e(this));
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void b(boolean z2) {
        this.f141398d = z2;
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141409a;

        static {
            Covode.recordClassIndex(92355);
        }

        b(a aVar) {
            this.f141409a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f141409a.a(8);
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141410a;

        static {
            Covode.recordClassIndex(92356);
        }

        c(a aVar) {
            this.f141410a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.b.c cVar = (com.ss.android.ugc.gamora.recorder.b.c) obj;
            a aVar = this.f141410a;
            Object obj2 = cVar.f147370b;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            Object obj3 = cVar.f147371c;
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
            aVar.a((String) obj2, (String) obj3, false, cVar.f147372d, cVar.f147369a);
        }
    }

    public final void a(int i2) {
        this.f141397c.b(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void b(int i2) {
        this.y.b(Integer.valueOf(i2));
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141411a;

        static {
            Covode.recordClassIndex(92357);
        }

        d(a aVar) {
            this.f141411a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f141411a;
            if (aVar.f141398d) {
                if (aVar.a().f124757b.h() > 0) {
                    if (!bk.a() || aVar.b().D().i() || aVar.a().f124757b.f124714i) {
                        aVar.a(8);
                        return;
                    }
                    aVar.a(false, bh.a(aVar.a().s()));
                } else if (aVar.a().f124757b.f124714i) {
                    return;
                } else {
                    if (bk.a()) {
                        aVar.a(true, (Set<String>) null);
                    }
                }
                aVar.a(0);
            }
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f141412a;

        static {
            Covode.recordClassIndex(92358);
        }

        e(a aVar) {
            this.f141412a = aVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            t tVar = (t) obj;
            if (tVar != null && tVar.f28205a != null) {
                if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                    if (!this.f141412a.f141398d) {
                        return;
                    }
                    if (!bk.a() || this.f141412a.b().D().i() || this.f141412a.a().f124757b.f124714i) {
                        this.f141412a.a(8);
                    } else if (this.f141412a.a().f124757b.h() < this.f141412a.a().f124757b.k()) {
                        a aVar = this.f141412a;
                        aVar.a(false, bh.a(aVar.a().s()));
                        this.f141412a.a(0);
                    }
                } else if (!this.f141412a.a().f124757b.f124714i && tVar.f28208d && this.f141412a.f141398d) {
                    if (bk.a()) {
                        this.f141412a.a(true, (Set<String>) null);
                    }
                    this.f141412a.a(0);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(l.a aVar) {
        int i2;
        h.f.b.l.d(aVar, "");
        this.w = aVar;
        String str = this.v;
        com.ss.android.ugc.gamora.recorder.b.c cVar = aVar.f147482c;
        if (cVar != null) {
            i2 = cVar.f147372d;
        } else {
            i2 = 0;
        }
        a(null, str, true, i2, aVar.f147485f);
        this.s.b(z.f158842a);
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(boolean z2) {
        int i2;
        this.f141398d = z2;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        a(i2);
    }

    public a(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f141400f = bVar;
        this.z = fVar;
        k<com.ss.android.ugc.gamora.recorder.b.c> kVar = new k<>();
        this.r = kVar;
        this.s = new com.bytedance.als.l<>(z.f158842a);
        this.t = kVar;
        this.u = new k<>();
        this.v = ae.f124883a;
        this.y = new com.bytedance.als.d<>(0);
    }

    private final void a(String str, ShortVideoContext shortVideoContext, boolean z2) {
        if ((ae.b(str) || h.f.b.l.a((Object) ae.f124883a, (Object) str)) && !shortVideoContext.f124757b.b() && !shortVideoContext.f124757b.c()) {
            com.ss.android.ugc.aweme.tools.l lVar = new com.ss.android.ugc.aweme.tools.l(!ae.b(str), true);
            lVar.f140205c = h.f.b.l.a((Object) str, (Object) ae.f124885c);
            lVar.f140207e = z2;
            lVar.f140206d = 2;
            h().configSwitchDuration(lVar);
        }
    }

    private static void a(com.ss.android.ugc.gamora.a.a aVar, String str, ShortVideoContext shortVideoContext, boolean z2) {
        if ((ae.b(str) || h.f.b.l.a((Object) ae.f124883a, (Object) str)) && shortVideoContext.f124757b.a()) {
            if (shortVideoContext.d()) {
                shortVideoContext.d(com.ss.android.ugc.aweme.shortvideo.record.b.a.a(shortVideoContext.F.f124773a));
            } else if (!z2) {
                shortVideoContext.d(0);
            }
            Workspace workspace = shortVideoContext.f124757b.f124713h;
            h.f.b.l.b(workspace, "");
            com.ss.android.ugc.aweme.shortvideo.f.a.a(workspace.c(), cr.a().f125295a, shortVideoContext.f124757b.q);
            com.ss.android.ugc.asve.recorder.c.a c2 = aVar.c();
            Workspace workspace2 = shortVideoContext.f124757b.f124713h;
            h.f.b.l.b(workspace2, "");
            c2.a(workspace2.c(), (long) shortVideoContext.f124757b.q, shortVideoContext.f124757b.f124712g, false);
        }
    }

    private final void a(boolean z2, int i2, String str, boolean z3) {
        String str2;
        String str3;
        String str4;
        com.ss.android.ugc.tools.f.b a2;
        if (h.f.b.l.a((Object) this.v, (Object) ae.f124883a)) {
            str2 = "video_15";
        } else if (com.ss.android.ugc.aweme.shortvideo.f.a.c() == 14) {
            str2 = "video_180";
        } else {
            str2 = "video_60";
        }
        String str5 = "";
        if (i2 == 1) {
            str3 = "tab_bar_click";
        } else if (i2 == 2) {
            str3 = "tab_bar_slide";
        } else if (i2 == 3) {
            str3 = "full_slide";
        } else if (i2 != 4) {
            str3 = str5;
        } else {
            str3 = "cross";
        }
        if (z2) {
            str4 = "outer";
        } else {
            str4 = "inner";
        }
        String a3 = bh.a(str);
        if (this.x) {
            str5 = str4;
        } else if (z3) {
            this.x = true;
            a3 = "by_default";
            str3 = str5;
        } else {
            return;
        }
        com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("creation_id", a().q).a("shoot_way", a().r).a("draft_id", a().C).a("to_status", str2).a("change_type", str5).a("change_method", str3).a("from_status", a3);
        if (!bk.a() || a().f124757b.h() <= 0) {
            a2 = a4.a("enter_from", "video_shoot_page");
        } else {
            a2 = a4.a("enter_from", "video_recording_page");
        }
        r.a("change_record_mode", a2.f149193a);
    }

    public final void a(String str, String str2, boolean z2, int i2, boolean z3) {
        com.ss.android.ugc.aweme.z.a m2;
        this.v = str2;
        Object b2 = getDiContainer().b(com.ss.android.ugc.gamora.recorder.b.b.class, null);
        if (b2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.gamora.a.a provideRecordEnv = ((com.ss.android.ugc.gamora.recorder.b.b) b2).provideRecordEnv();
        com.bytedance.creativex.recorder.b.a.d d2 = provideRecordEnv.d();
        provideRecordEnv.g().a("record");
        int a2 = ae.a(str2);
        provideRecordEnv.b().Z = a2;
        f().b(true);
        com.ss.android.ugc.gamora.recorder.k.a i3 = i();
        i3.b();
        boolean z4 = false;
        i3.a(3, false);
        d2.a(0);
        i().b(true);
        if (j().d()) {
            j().b(true);
        }
        if (g.a().l().shouldDropCurrentMusicFor3min(str2, a())) {
            l().clearMusic();
            new com.ss.android.ugc.aweme.tux.a.i.a(provideRecordEnv.a()).a(R.string.d0y).a();
        }
        ShortVideoContext b3 = provideRecordEnv.b();
        if (z2) {
            l.a aVar = this.w;
            if (aVar == null) {
                h.f.b.l.a("extraInfo");
            }
            z4 = aVar.f147485f;
        }
        a(str2, b3, z4);
        a(provideRecordEnv, str2, provideRecordEnv.b(), z2);
        com.ss.android.ugc.aweme.shortvideo.f.a.b(a2);
        if (provideRecordEnv.b().f124757b.f124711f.isEmpty() && (m2 = m()) != null) {
            m2.a(true);
        }
        a(z2, i2, str, z3);
        k().notifyBottomTabIndexChange(new com.ss.android.ugc.gamora.recorder.b.c(str, str2, i2, false, false, 16));
    }
}

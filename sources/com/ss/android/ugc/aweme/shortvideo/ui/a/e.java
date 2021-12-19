package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.content.SharedPreferences;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.ac;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.u;
import com.bytedance.creativex.recorder.b.a.w;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ugc.aweme.property.bo;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.record.CameraModule;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.sticker.repository.a.q;
import com.ss.android.ugc.aweme.sticker.repository.a.s;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.p;
import h.f.b.l;
import h.f.b.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class e extends com.bytedance.als.j<d> implements com.bytedance.o.a, d {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f131268a = {new y(e.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(e.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(e.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new y(e.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(e.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new y(e.class, "recordModeApiComponent", "getRecordModeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/ui/component/RecordModeApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final d f131269b = this;

    /* renamed from: c  reason: collision with root package name */
    public final ShortVideoContext f131270c = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    private final androidx.fragment.app.e f131271d = ((androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null));

    /* renamed from: e  reason: collision with root package name */
    private final h.h.d f131272e = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);

    /* renamed from: f  reason: collision with root package name */
    private final h.h.d f131273f = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: g  reason: collision with root package name */
    private final h.h.d f131274g = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.filter.a.a.class);

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f131275h = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f131276i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.a.a.a.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f131277j = com.bytedance.o.b.a.b(getDiContainer(), i.class);

    /* renamed from: k  reason: collision with root package name */
    private final f.a.b.a f131278k = new f.a.b.a();

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.o.f f131279l;

    static {
        Covode.recordClassIndex(86003);
    }

    private final m h() {
        return (m) this.f131273f.a(this, f131268a[1]);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.creativex.recorder.b.a.d a() {
        return (com.bytedance.creativex.recorder.b.a.d) this.f131272e.a(this, f131268a[0]);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.creativex.recorder.filter.a.a b() {
        return (com.bytedance.creativex.recorder.filter.a.a) this.f131274g.a(this, f131268a[2]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j c() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f131275h.a(this, f131268a[3]);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.creativex.recorder.a.a.a d() {
        return (com.bytedance.creativex.recorder.a.a.a) this.f131276i.a(this, f131268a[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ d getApiComponent() {
        return this.f131269b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f131279l;
    }

    /* access modifiers changed from: package-private */
    public final CameraModule e() {
        return a().f();
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        this.f131278k.a();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        if (com.ss.android.ugc.aweme.beauty.b.a() && !com.ss.android.ugc.aweme.beauty.f.a()) {
            d().a(this.f131270c.f124757b.B);
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        com.bytedance.als.g<Boolean> a2;
        super.onCreate();
        b().getFilterUpdateEvent().a(this, new a(this));
        h().s().a(this, new b(this));
        h().i().a(this, new c(this));
        h().s().a(this, new d(this));
        h().t().a(this, C3417e.f131284a);
        h().m().a(this, new f(this));
        f.a.b.b a3 = h().B().a(g.f131286a, p.f150012a);
        l.b(a3, "");
        f.a.j.a.a(a3, this.f131278k);
        i iVar = (i) this.f131277j.a(this, f131268a[5]);
        if (!(iVar == null || (a2 = iVar.a()) == null)) {
            a2.a(this, new h(this));
        }
        c().f().a(this, new i(this));
        c().d().a(this.f131271d, new j(this));
    }

    public final void g() {
        if (this.f131270c.Z != 15) {
            long j2 = this.f131270c.f124757b.f124707b;
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
            edit.putLong("max_duration", j2);
            com.bytedance.common.utility.e.a.a(edit);
            String str = this.f131270c.f124757b.o.f124722c;
            String str2 = this.f131270c.f124757b.o.f124723d;
            SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
            edit2.putString("duet_video_path", str);
            edit2.putString("duet_audio_path", str2);
            com.bytedance.common.utility.e.a.a(edit2);
            ReactionParams reactionParams = this.f131270c.f124757b.p.f124739a;
            SharedPreferences.Editor edit3 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
            edit3.putString("reaction", com.ss.android.ugc.aweme.port.in.g.a().G().b(reactionParams));
            com.bytedance.common.utility.e.a.a(edit3);
            StitchParams stitchParams = this.f131270c.F.f124773a;
            SharedPreferences.Editor edit4 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
            edit4.putString("stitch_params", com.ss.android.ugc.aweme.port.in.g.a().G().b(stitchParams));
            com.bytedance.common.utility.e.a.a(edit4);
            boolean z = this.f131270c.f124757b.B;
            SharedPreferences.Editor edit5 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
            edit5.putInt("face_beauty", z ? 1 : 0);
            com.bytedance.common.utility.e.a.a(edit5);
            if (this.f131270c.i()) {
                SharedPreferences.Editor edit6 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
                edit6.putBoolean("shoutout_params", true);
                com.bytedance.common.utility.e.a.a(edit6);
            }
            SharedARModel sharedARModel = this.f131270c.S;
            if (sharedARModel != null) {
                SharedPreferences.Editor edit7 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
                edit7.putString("shared_ar", com.ss.android.ugc.aweme.port.in.g.a().G().b(sharedARModel));
                com.bytedance.common.utility.e.a.a(edit7);
            }
            com.ss.android.ugc.aweme.shortvideo.f.a.a(this.f131270c.f124757b.f124710e);
            com.ss.android.ugc.aweme.shortvideo.f.a.a(this.f131270c.f124757b.y, cr.a().f125295a, this.f131270c.f124757b.q);
            dt dtVar = this.f131270c.f124757b.f124711f;
            Objects.requireNonNull(dtVar, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> /* = java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension> */");
            com.ss.android.ugc.aweme.shortvideo.f.a.a(dtVar);
            ExtractFramesModel e2 = a().H().e();
            SharedPreferences.Editor edit8 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
            edit8.putString("shot_extract_frame", com.ss.android.ugc.aweme.port.in.g.a().G().b(e2));
            com.bytedance.common.utility.e.a.a(edit8);
            String strArray = this.f131270c.f124757b.G.f124740a.toString();
            String strArray2 = this.f131270c.f124757b.G.f124741b.toString();
            String strArray3 = this.f131270c.f124757b.G.f124742c.toString();
            SharedPreferences.Editor edit9 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
            edit9.putString("filter_labels", strArray);
            edit9.putString("filter_ids", strArray2);
            edit9.putString("filter_values", strArray3);
            com.bytedance.common.utility.e.a.a(edit9);
            if (bo.a()) {
                if (this.f131270c.f124757b.E == null) {
                    this.f131270c.a(com.ss.android.ttve.editorInfo.a.a());
                } else {
                    Map<String, Object> map = this.f131270c.f124757b.E;
                    Map<String, Object> a2 = com.ss.android.ttve.editorInfo.a.a();
                    l.b(a2, "");
                    map.putAll(a2);
                }
                com.ss.android.ugc.aweme.shortvideo.f.a.a(this.f131270c.f124757b.E);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.e$e  reason: collision with other inner class name */
    static final class C3417e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        public static final C3417e f131284a = new C3417e();

        static {
            Covode.recordClassIndex(86008);
        }

        C3417e() {
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.shortvideo.publish.b.f129738a.clear();
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f131286a = new g();

        static {
            Covode.recordClassIndex(86010);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj instanceof u.a) {
                com.ss.android.ugc.aweme.df.e.a("clearEdit() called");
                com.ss.android.ugc.aweme.shortvideo.f.a.a();
            }
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131282a;

        static {
            Covode.recordClassIndex(86006);
        }

        c(e eVar) {
            this.f131282a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            w wVar = (w) obj;
            ShortVideoContext shortVideoContext = this.f131282a.f131270c;
            l.b(wVar, "");
            shortVideoContext.ax.add(Integer.valueOf(wVar.f28212b));
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131283a;

        static {
            Covode.recordClassIndex(86007);
        }

        d(e eVar) {
            this.f131283a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            CameraComponentModel cameraComponentModel = this.f131283a.f131270c.f124757b;
            l.b(cameraComponentModel, "");
            if (cameraComponentModel.d().isEmpty()) {
                com.ss.android.ugc.aweme.shortvideo.f.a.a();
            } else {
                this.f131283a.g();
            }
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131285a;

        static {
            Covode.recordClassIndex(86009);
        }

        f(e eVar) {
            this.f131285a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            x xVar = (x) obj;
            l.b(xVar, "");
            if (xVar.f28214a != 1) {
                this.f131285a.g();
            }
        }
    }

    static final class a<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131280a;

        static {
            Covode.recordClassIndex(86004);
        }

        a(e eVar) {
            this.f131280a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.filter.a.i iVar = (com.bytedance.creativex.recorder.filter.a.i) obj;
            l.b(iVar, "");
            if (l.a((Object) iVar.f28234b.f28226a, (Object) "live")) {
                com.ss.android.ugc.aweme.port.in.c.s.a(iVar.f28233a, com.ss.android.ugc.aweme.filter.repository.a.a.c.a(iVar.f28234b.f28227b.f(), iVar.f28233a));
            }
        }
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131281a;

        static {
            Covode.recordClassIndex(86005);
        }

        b(e eVar) {
            this.f131281a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f131281a.f131270c.aC.size() > 0) {
                this.f131281a.f131270c.aC.remove(this.f131281a.f131270c.aC.size() - 1);
            }
            ShortVideoContext shortVideoContext = this.f131281a.f131270c;
            if (shortVideoContext.ax.size() > 0) {
                shortVideoContext.ax.remove(shortVideoContext.ax.size() - 1);
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131289a;

        static {
            Covode.recordClassIndex(86013);
        }

        j(e eVar) {
            this.f131289a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            e eVar = this.f131289a;
            l.b(bool, "");
            if (bool.booleanValue()) {
                eVar.a().a(new ac(false, false, 6));
            } else {
                eVar.a().a(new ac(true, false, 6));
            }
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131287a;

        static {
            Covode.recordClassIndex(86011);
        }

        h(e eVar) {
            this.f131287a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                s.a(this.f131287a.c().t().c().g(), com.ss.android.ugc.aweme.sticker.repository.d.a.i.f135498a);
                return;
            }
            q g2 = this.f131287a.c().t().c().g();
            com.ss.android.ugc.aweme.sticker.repository.d.a.i iVar = com.ss.android.ugc.aweme.sticker.repository.d.a.i.f135498a;
            l.d(g2, "");
            l.d(iVar, "");
            q.a a2 = g2.a();
            a2.b(iVar);
            a2.a();
        }
    }

    public e(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f131279l = fVar;
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f131288a;

        static {
            Covode.recordClassIndex(86012);
        }

        i(e eVar) {
            this.f131288a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.c) obj;
            if (cVar != null) {
                e eVar = this.f131288a;
                if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) {
                    Effect effect = ((com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar).f135378a;
                    eVar.a(effect);
                    if (com.ss.android.ugc.aweme.sticker.p.g.k(effect)) {
                        if (com.ss.android.ugc.aweme.beauty.b.a() && !com.ss.android.ugc.aweme.beauty.f.a()) {
                            eVar.d().a(eVar.f131270c.f124757b.B);
                        }
                        if (eVar.e().g() == 0) {
                            return;
                        }
                        if (eVar.a().b()) {
                            com.ss.android.ugc.aweme.cn.a.f c2 = eVar.a().c();
                            com.ss.android.ugc.aweme.tools.g b2 = com.ss.android.ugc.aweme.tools.g.b();
                            l.b(b2, "");
                            c2.a(b2, com.bytedance.bpea.store.a.a.t(), (String) null);
                            return;
                        }
                        com.bytedance.creativex.recorder.b.a.d a2 = eVar.a();
                        com.ss.android.ugc.aweme.tools.g b3 = com.ss.android.ugc.aweme.tools.g.b();
                        l.b(b3, "");
                        int unused = a2.a(b3, com.bytedance.bpea.store.a.a.t(), (String) null);
                    } else if (!effect.getTypes().contains("FaceReplace3D")) {
                        eVar.f();
                    } else if (effect.getTags() != null) {
                        com.bytedance.creativex.recorder.filter.a.a b4 = eVar.b();
                        List<String> tags = effect.getTags();
                        if (tags == null) {
                            tags = new ArrayList<>();
                        }
                        b4.setFilterDisable(!tags.contains("disable_beautify_filter"), "build_in");
                    }
                } else if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.d) {
                    eVar.a(null);
                    eVar.f();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Effect effect) {
        int i2 = 1;
        if (com.ss.android.ugc.aweme.sticker.p.g.a("camera_front", effect)) {
            if (e().g() != 1) {
                PrivacyCert privacyCert = new PrivacyCert(new com.bytedance.bpea.basics.j("1045"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()});
                if (a().b()) {
                    com.ss.android.ugc.aweme.cn.a.f c2 = a().c();
                    com.ss.android.ugc.aweme.tools.g a2 = com.ss.android.ugc.aweme.tools.g.a();
                    l.b(a2, "");
                    c2.a(a2, privacyCert, (String) null);
                } else {
                    com.bytedance.creativex.recorder.b.a.d a3 = a();
                    com.ss.android.ugc.aweme.tools.g a4 = com.ss.android.ugc.aweme.tools.g.a();
                    l.b(a4, "");
                    int unused = a3.a(a4, privacyCert, (String) null);
                }
            }
        } else if (com.ss.android.ugc.aweme.sticker.p.g.a("camera_back", effect) && e().g() != 0) {
            PrivacyCert privacyCert2 = new PrivacyCert(new com.bytedance.bpea.basics.j("1046"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()});
            if (a().b()) {
                com.ss.android.ugc.aweme.cn.a.f c3 = a().c();
                com.ss.android.ugc.aweme.tools.g b2 = com.ss.android.ugc.aweme.tools.g.b();
                l.b(b2, "");
                c3.a(b2, privacyCert2, (String) null);
            } else {
                com.bytedance.creativex.recorder.b.a.d a5 = a();
                com.ss.android.ugc.aweme.tools.g b3 = com.ss.android.ugc.aweme.tools.g.b();
                l.b(b3, "");
                int unused2 = a5.a(b3, privacyCert2, (String) null);
            }
        }
        a().b(com.ss.android.ugc.aweme.sticker.p.g.j(effect));
        int i3 = -1;
        if (effect == null || !effect.getTypes().contains("StabilizationOff")) {
            if (!e().f129991e.f62201a) {
                if (a().b()) {
                    e().f129991e.f62201a = true;
                    if (com.ss.android.ugc.asve.recorder.camera.a.b.f62199b == com.ss.android.ugc.asve.recorder.camera.a.b.f62200c) {
                        i2 = -1;
                    } else if (!com.ss.android.ugc.asve.recorder.camera.a.b.f62200c) {
                        i2 = 0;
                    }
                    a().c().a(i2);
                } else {
                    com.ss.android.ugc.asve.recorder.camera.a.b bVar = e().f129991e;
                    bVar.f62201a = true;
                    if (com.ss.android.ugc.asve.recorder.camera.a.b.f62199b != com.ss.android.ugc.asve.recorder.camera.a.b.f62200c) {
                        bVar.c(com.ss.android.ugc.asve.recorder.camera.a.b.f62200c);
                    }
                }
                a().a(0);
            }
        } else if (e().f129991e.f62201a) {
            if (a().b()) {
                e().f129991e.f62201a = false;
                if (com.ss.android.ugc.asve.recorder.camera.a.b.f62199b) {
                    i3 = 0;
                }
                a().c().a(i3);
            } else {
                com.ss.android.ugc.asve.recorder.camera.a.b bVar2 = e().f129991e;
                bVar2.f62201a = false;
                if (com.ss.android.ugc.asve.recorder.camera.a.b.f62199b) {
                    bVar2.c(false);
                }
            }
            a().a(0);
        }
    }
}

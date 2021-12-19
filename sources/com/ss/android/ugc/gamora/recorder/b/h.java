package com.ss.android.ugc.gamora.recorder.b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.t;
import com.bytedance.creativex.recorder.b.a.x;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.property.bk;
import com.ss.android.ugc.aweme.property.ed;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ec;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.shortvideo.util.bh;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.types.f.a;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class h extends com.bytedance.als.j<b> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147412a = {new y(h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new y(h.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(h.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(h.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new y(h.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new y(h.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(h.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new y(h.class, "stickerPanelApiComponent", "getStickerPanelApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0)};
    private final com.bytedance.als.k<Boolean> A;
    private final com.bytedance.als.k<Integer> B;
    private final com.bytedance.als.k<Integer> C;
    private boolean D;
    private final h.h E;
    private final com.bytedance.o.f F;

    /* renamed from: b  reason: collision with root package name */
    public final b f147413b = this;

    /* renamed from: c  reason: collision with root package name */
    final com.ss.android.ugc.aweme.shortvideo.h.a f147414c;

    /* renamed from: d  reason: collision with root package name */
    final h.h.d f147415d;

    /* renamed from: e  reason: collision with root package name */
    final h.h.d f147416e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.als.l<Integer> f147417f;

    /* renamed from: g  reason: collision with root package name */
    public final e f147418g;

    /* renamed from: h  reason: collision with root package name */
    public final e f147419h;

    /* renamed from: i  reason: collision with root package name */
    final com.bytedance.als.d<Integer> f147420i;

    /* renamed from: j  reason: collision with root package name */
    public final j f147421j;

    /* renamed from: k  reason: collision with root package name */
    public final g f147422k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f147423l;

    /* renamed from: m  reason: collision with root package name */
    public final com.bytedance.scene.group.b f147424m;
    public final List<a> n;
    public final List<a> o;
    private final h.h.d p;
    private final h.h.d q;
    private final h.h.d r;
    private final h.h.d s;
    private final h.h.d t;
    private final h.h.d u;
    private com.ss.android.ugc.gamora.a.a v;
    private final com.bytedance.als.k<c> w;
    private final com.bytedance.als.k<String> x;
    private final com.bytedance.als.g<c> y;
    private final com.bytedance.als.g<String> z;

    static {
        Covode.recordClassIndex(97132);
    }

    public final z a() {
        return (z) this.p.a(this, f147412a[0]);
    }

    /* access modifiers changed from: package-private */
    public final com.bytedance.creativex.recorder.b.a.m b() {
        return (com.bytedance.creativex.recorder.b.a.m) this.q.a(this, f147412a[1]);
    }

    public final ShortVideoContext c() {
        return (ShortVideoContext) this.r.a(this, f147412a[2]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j d() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.t.a(this, f147412a[5]);
    }

    public final com.bytedance.creativex.recorder.gesture.api.b e() {
        return (com.bytedance.creativex.recorder.gesture.api.b) this.u.a(this, f147412a[6]);
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void onCombinePhotoTabChanged(c cVar) {
        h.f.b.l.d(cVar, "");
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public /* bridge */ /* synthetic */ b getApiComponent() {
        return this.f147413b;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public com.bytedance.als.g<c> getBottomTabIndexChangeEvent() {
        return this.y;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public com.bytedance.als.l<Integer> getComplexTabVisibility() {
        return this.f147417f;
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.F;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public String getCurrentBottomTag() {
        return this.f147418g.d();
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

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void hidePopupForLiveTab() {
        this.f147418g.b();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void tryShowPopupForLiveTab() {
        this.f147418g.a();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f147425a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f147426b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h f147427c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f147428d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f147429e;

        static {
            Covode.recordClassIndex(97133);
        }

        a(com.bytedance.scene.group.b bVar, f fVar, h hVar, a aVar, int i2) {
            this.f147425a = bVar;
            this.f147426b = fVar;
            this.f147427c = hVar;
            this.f147428d = aVar;
            this.f147429e = i2;
        }

        public final void run() {
            h.a(this.f147425a, this.f147426b, true);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public int bottomTabSize() {
        return this.f147418g.f147382a.size();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public com.ss.android.ugc.gamora.a.a provideRecordEnv() {
        com.ss.android.ugc.gamora.a.a aVar = this.v;
        if (aVar == null) {
            h.f.b.l.a("recordEnv");
        }
        return aVar;
    }

    static final class s extends h.f.b.m implements h.f.a.a<ec> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ec invoke() {
            return new ec(this.this$0.c(), this.this$0.getDiContainer());
        }
    }

    public final boolean f() {
        String str;
        if (com.bytedance.framwork.core.b.e.b.a(this.f147418g.f147382a)) {
            return false;
        }
        for (T t2 : this.f147418g.f147382a) {
            k kVar = t2.f147394c;
            if (kVar != null) {
                str = kVar.a();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) "RecordLiveScene", (Object) str)) {
                t2.f147394c.H();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public boolean isCurrentTabNeedCamera() {
        if (!(!h.f.b.l.a((Object) getCurrentBottomTag(), (Object) "record_mode_mv")) || !(!h.f.b.l.a((Object) getCurrentBottomTag(), (Object) com.bytedance.als.dsl.g.b(this).getString(R.string.f_h)))) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public boolean isZTLiveSwitch() {
        String str;
        if (com.bytedance.framwork.core.b.e.b.a(this.f147418g.f147382a)) {
            return false;
        }
        for (T t2 : this.f147418g.f147382a) {
            k kVar = t2.f147394c;
            if (kVar != null) {
                str = kVar.a();
            } else {
                str = null;
            }
            if (h.f.b.l.a((Object) "RecordLiveScene", (Object) str)) {
                t2.f147394c.F();
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void updateBottomTab() {
        if (bk.a() && !a().D().i() && !c().f124757b.f124714i) {
            this.f147418g.a(bh.a(c().s()));
            showBottomTab(true);
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147441a;

        static {
            Covode.recordClassIndex(97143);
        }

        k(h hVar) {
            this.f147441a = hVar;
        }

        public final void run() {
            if (this.f147441a.c().f124757b.h() >= this.f147441a.c().f124757b.k() && !this.f147441a.c().f124757b.f124714i && bk.a() && !this.f147441a.a().D().i()) {
                this.f147441a.f147418g.a(bh.a(this.f147441a.c().s()));
                this.f147441a.showBottomTab(true);
            }
        }
    }

    @Override // com.bytedance.als.j
    public void onCreate() {
        T t2;
        f fVar;
        super.onCreate();
        Object a2 = this.f147424m.B().a("record_env_context");
        if (a2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.gamora.a.a aVar = (com.ss.android.ugc.gamora.a.a) a2;
        this.v = aVar;
        e eVar = this.f147418g;
        if (aVar == null) {
            h.f.b.l.a("recordEnv");
        }
        eVar.a(aVar, this.n, this.w, this.x);
        e eVar2 = this.f147419h;
        com.ss.android.ugc.gamora.a.a aVar2 = this.v;
        if (aVar2 == null) {
            h.f.b.l.a("recordEnv");
        }
        eVar2.a(aVar2, this.o, this.w, this.x);
        List<f> list = this.f147418g.f147382a;
        com.bytedance.scene.group.b bVar = this.f147424m;
        List<f> list2 = this.f147418g.f147382a;
        T t3 = null;
        if (c().al) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = it.next();
                if (h.f.b.l.a((Object) fVar.f147393b.f147377c, (Object) ig.a(R.string.f_b))) {
                    break;
                }
            }
            f fVar2 = fVar;
            if (fVar2 != null) {
                a(bVar, fVar2);
                k kVar = fVar2.f147394c;
                if (kVar != null) {
                    com.bytedance.scene.ktx.a.a(bVar, R.id.dj5, this.f147421j, "RecordBottomTabScene");
                    bVar.a(R.id.dj5, kVar, kVar.a());
                }
                a(bVar, fVar2, false);
                this.f147418g.e();
                a(fVar2.f147393b.f147377c);
                return;
            }
        }
        for (T t4 : list) {
            if (t4.f147394c != null) {
                com.bytedance.scene.ktx.a.a(this.f147424m, R.id.dj5, t4.f147394c, t4.f147394c.a());
            }
        }
        this.f147424m.a(R.id.dj5, this.f147421j, "RecordBottomTabScene");
        com.bytedance.scene.group.b bVar2 = this.f147424m;
        for (f fVar3 : list) {
            a(bVar2, fVar3);
        }
        this.A.a(bVar2, new c(bVar2));
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (t2.f147393b.f147379e) {
                break;
            }
        }
        T t5 = t2;
        if (t5 != null) {
            a(bVar2, t5, true);
        }
        c();
        isZTLiveSwitch();
        List<f> list3 = this.f147419h.f147382a;
        for (T t6 : list3) {
            if (t6.f147394c != null) {
                com.bytedance.scene.ktx.a.a(this.f147424m, R.id.dj5, t6.f147394c, t6.f147394c.a());
            }
        }
        this.f147424m.a(R.id.dj5, this.f147422k, "ComplexLighteningTabScene");
        com.bytedance.scene.group.b bVar3 = this.f147424m;
        for (f fVar4 : list3) {
            a(bVar3, fVar4);
        }
        com.bytedance.scene.group.b bVar4 = this.f147424m;
        if (!this.D) {
            this.D = true;
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                T next = it3.next();
                if (next.f147393b.f147379e) {
                    t3 = next;
                    break;
                }
            }
            T t7 = t3;
            if (t7 != null) {
                a(bVar4, t7, false);
                this.f147418g.e();
                a(t7.f147393b.f147377c);
            }
        }
        com.bytedance.scene.ktx.c.a(this.f147421j, new k(this));
        this.z.a(this, new l(this));
        getBottomTabIndexChangeEvent().a(this, new m<>(this));
        b().o().b(this, new n<>(this));
        b().h().a(this, new o<>(this));
        this.B.a(this, new p(this));
        this.C.a(this, new e(this));
        b().m().a(this, new f<>(this));
        b().k().a(this, new g<>(this));
        b().w().a(this, new C3957h<>(this));
        a().aj().a(this, new i<>(this));
        a().ai().a(this, new j<>(this));
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (!createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
            return;
        }
        if (!ed.a() || !h.a.n.b("slide_right", "click_upper_left_camera", "click_west_window_camera").contains(c().y)) {
            e().a(new b(this), 4);
        }
    }

    public static final class b extends com.bytedance.creativex.recorder.gesture.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147430a;

        static {
            Covode.recordClassIndex(97134);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(h hVar) {
            this.f147430a = hVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            T value;
            if (this.f147430a.a().D().i() || this.f147430a.a().ak()) {
                return false;
            }
            com.ss.android.ugc.aweme.shortvideo.countdown.b bVar = (com.ss.android.ugc.aweme.shortvideo.countdown.b) this.f147430a.getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, null);
            if ((bVar != null && bVar.d()) || (value = this.f147430a.f147417f.f6468a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.a(motionEvent, motionEvent2, f2, f3);
            }
            if (this.f147430a.c().f124757b.h() != 0) {
                return false;
            }
            com.bytedance.creativex.recorder.gesture.api.d a2 = this.f147430a.e().a(1);
            if (a2 != null && a2.a(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            com.bytedance.creativex.recorder.gesture.api.d a3 = this.f147430a.e().a(6);
            if ((a3 == null || !a3.a(motionEvent, motionEvent2, f2, f3)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            T value;
            if (this.f147430a.a().D().i() || this.f147430a.a().ak()) {
                return false;
            }
            com.ss.android.ugc.aweme.shortvideo.countdown.b bVar = (com.ss.android.ugc.aweme.shortvideo.countdown.b) this.f147430a.getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, null);
            if ((bVar != null && bVar.d()) || (value = this.f147430a.f147417f.f6468a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.b(motionEvent, motionEvent2, f2, f3);
            }
            if (this.f147430a.c().f124757b.h() != 0) {
                return false;
            }
            com.bytedance.creativex.recorder.gesture.api.d a2 = this.f147430a.e().a(1);
            if (a2 != null && a2.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            com.bytedance.creativex.recorder.gesture.api.d a3 = this.f147430a.e().a(6);
            if (a3 != null && a3.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            TabHost tabHost = this.f147430a.f147422k.f147400e;
            if (tabHost == null) {
                h.f.b.l.a("tabHost");
            }
            boolean a4 = gb.a(com.bytedance.als.dsl.g.b(this.f147430a));
            if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                if (!a4 || !ed.a()) {
                    h.a(tabHost);
                } else {
                    h.b(tabHost);
                }
                return true;
            } else if (motionEvent.getX() <= motionEvent2.getX() || Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            } else {
                if (!a4 || !ed.a()) {
                    h.b(tabHost);
                } else {
                    h.a(tabHost);
                }
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$h  reason: collision with other inner class name */
    static final class C3957h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147438a;

        static {
            Covode.recordClassIndex(97140);
        }

        C3957h(h hVar) {
            this.f147438a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147438a.showBottomTab(false);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f147447a = new r();

        static {
            Covode.recordClassIndex(97150);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            return h.z.f158842a;
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147436a;

        static {
            Covode.recordClassIndex(97138);
        }

        f(h hVar) {
            this.f147436a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147436a.f147418g.a(true);
            this.f147436a.f147419h.a(true);
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147439a;

        static {
            Covode.recordClassIndex(97141);
        }

        i(h hVar) {
            this.f147439a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147439a.f147421j.a(((com.bytedance.creativex.recorder.b.a.k) obj).f28194a);
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void notifyBottomTabIndexChange(c cVar) {
        h.f.b.l.d(cVar, "");
        this.w.a(cVar);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void showBottomTab(boolean z2) {
        this.A.a(Boolean.valueOf(z2));
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f147431a;

        static {
            Covode.recordClassIndex(97135);
        }

        c(com.bytedance.scene.group.b bVar) {
            this.f147431a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                com.bytedance.scene.ktx.a.a(this.f147431a, "RecordBottomTabScene");
            } else {
                com.bytedance.scene.ktx.a.b(this.f147431a, "RecordBottomTabScene");
            }
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147435a;

        static {
            Covode.recordClassIndex(97137);
        }

        e(h hVar) {
            this.f147435a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            com.bytedance.scene.j a2 = this.f147435a.f147424m.a("RecordBottomTabScene");
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            ((j) a2).a(num);
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147446a;

        static {
            Covode.recordClassIndex(97148);
        }

        p(h hVar) {
            this.f147446a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            com.bytedance.scene.j a2 = this.f147446a.f147424m.a("RecordBottomTabScene");
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            ((j) a2).b(num);
        }
    }

    public static void b(TabHost tabHost) {
        if (tabHost.getCurrentIndex() < tabHost.getTabCount() - 1) {
            tabHost.a(tabHost.getCurrentIndex() + 1, 3);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void configSwitchDuration(com.ss.android.ugc.aweme.tools.l lVar) {
        h.f.b.l.d(lVar, "");
        ((ec) this.E.getValue()).onEvent(lVar);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void resetToCurTab(String str) {
        h.f.b.l.d(str, "");
        int a2 = this.f147421j.a(str);
        if (a2 >= 0) {
            this.f147421j.a(a2, false);
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147445a;

        static {
            Covode.recordClassIndex(97147);
        }

        o(h hVar) {
            this.f147445a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f147445a.showBottomTab(false);
            this.f147445a.a(false);
            this.f147445a.f147418g.a(false);
            this.f147445a.f147419h.a(false);
            ShortVideoContext c2 = this.f147445a.c();
            if (c2.aa != c2.Z) {
                c2.aa = c2.Z;
                com.ss.android.ugc.aweme.shortvideo.f.a.c(c2.aa);
            }
        }
    }

    public static void a(TabHost tabHost) {
        if (tabHost.getCurrentIndex() > 0) {
            tabHost.a(tabHost.getCurrentIndex() - 1, 3);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147437a;

        static {
            Covode.recordClassIndex(97139);
        }

        g(h hVar) {
            this.f147437a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            x xVar = (x) obj;
            if (this.f147437a.c().f124757b.h() > 0) {
                if (bk.a() && !this.f147437a.c().f124757b.f124714i) {
                    h.f.b.l.b(xVar, "");
                    if (xVar.f28214a != 2) {
                        this.f147437a.f147418g.a(bh.a(this.f147437a.c().s()));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f147437a.c().f124757b.f124714i) {
                return;
            } else {
                if (bk.a()) {
                    this.f147437a.f147418g.c();
                }
            }
            this.f147437a.showBottomTab(true);
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147440a;

        static {
            Covode.recordClassIndex(97142);
        }

        j(h hVar) {
            this.f147440a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.l lVar = (com.bytedance.creativex.recorder.b.a.l) obj;
            boolean z = false;
            if (lVar.f28197b) {
                if (this.f147440a.c().f124757b.h() == 0) {
                    z = true;
                }
                if (lVar.f28196a || (z && !this.f147440a.c().f124757b.f124714i)) {
                    if (bk.a()) {
                        this.f147440a.f147418g.c();
                    }
                    this.f147440a.showBottomTab(true);
                    this.f147440a.a(true);
                } else if (bk.a() && !this.f147440a.a().D().i() && !this.f147440a.c().f124757b.f124714i) {
                    this.f147440a.showBottomTab(true);
                }
            } else {
                this.f147440a.showBottomTab(false);
                this.f147440a.a(false);
            }
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147442a;

        static {
            Covode.recordClassIndex(97144);
        }

        l(h hVar) {
            this.f147442a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (!this.f147442a.c().b()) {
                return;
            }
            if (h.f.b.l.a((Object) str, (Object) ig.a(R.string.f_9)) || h.f.b.l.a((Object) str, (Object) "record_mode_mv")) {
                h hVar = this.f147442a;
                com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(com.bytedance.als.dsl.g.b(hVar));
                bVar.a(R.string.fus, new q(hVar, str));
                bVar.b(R.string.b0r, r.f147447a);
                ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) a.C1094a.a(com.bytedance.als.dsl.g.b(hVar)).a(R.string.fuu).b(R.string.fut)).a(bVar).a(false)).a().b().show();
            }
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, h.z> {
        final /* synthetic */ String $toTag;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(97149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(h hVar, String str) {
            super(1);
            this.this$0 = hVar;
            this.$toTag = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            h hVar = this.this$0;
            com.ss.android.ugc.aweme.sticker.f.e.a(hVar.d(), (Effect) null);
            com.ss.android.ugc.aweme.tools.d.b.a(com.ss.android.ugc.aweme.tools.d.a.f139289a);
            hVar.d().F().a();
            hVar.c().a(false);
            hVar.f147414c.a(true, false);
            hVar.b().c(true);
            ((com.bytedance.creativex.recorder.sticker.a.c) hVar.f147416e.a(hVar, h.f147412a[7])).a(true);
            return h.z.f158842a;
        }
    }

    private final void a(String str) {
        com.ss.android.ugc.gamora.recorder.m.a aVar = (com.ss.android.ugc.gamora.recorder.m.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.m.a.class, null);
        if (aVar == null || !aVar.e()) {
            T value = getComplexTabVisibility().f6468a.getValue();
            if (value == null || value.intValue() != 0) {
                a(new c("by_default", str, 0, false, false, 24));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147432a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f147433b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f147434c;

        static {
            Covode.recordClassIndex(97136);
        }

        d(h hVar, com.bytedance.scene.group.b bVar, f fVar) {
            this.f147432a = hVar;
            this.f147433b = bVar;
            this.f147434c = fVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (this.f147434c.f147394c != null) {
                    if (bool.booleanValue()) {
                        if (h.f.b.l.a((Object) this.f147434c.f147394c.a(), (Object) "RecordLiveScene")) {
                            this.f147434c.f147394c.E();
                            Activity activity = this.f147433b.f42913m;
                            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                            ((VideoRecordNewActivity) activity).a(true, false);
                            if (this.f147432a.isZTLiveSwitch()) {
                                this.f147432a.f();
                            }
                        }
                        e.a(true, this.f147434c.f147394c.a(), this.f147434c.f147394c.C(), (com.bytedance.creativex.recorder.b.a.d) this.f147432a.a());
                        this.f147433b.e(this.f147434c.f147394c);
                        this.f147434c.f147394c.b();
                        return;
                    }
                    if (h.f.b.l.a((Object) this.f147434c.f147394c.a(), (Object) "RecordLiveScene")) {
                        this.f147434c.f147394c.E();
                        Activity activity2 = this.f147433b.f42913m;
                        Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                        ((VideoRecordNewActivity) activity2).a(false, true);
                    }
                    this.f147434c.f147394c.d();
                    this.f147433b.d(this.f147434c.f147394c);
                    e.a(false, this.f147434c.f147394c.a(), this.f147434c.f147394c.C(), (com.bytedance.creativex.recorder.b.a.d) this.f147432a.a());
                }
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147443a;

        static {
            Covode.recordClassIndex(97145);
        }

        m(h hVar) {
            this.f147443a = hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            c cVar = (c) obj;
            h hVar = this.f147443a;
            h.f.b.l.b(cVar, "");
            hVar.a(cVar);
            String string = this.f147443a.f147424m.t().getString(R.string.f_b);
            h.f.b.l.b(string, "");
            if (TextUtils.equals((CharSequence) cVar.f147370b, string)) {
                Object obj2 = cVar.f147371c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                if (!TextUtils.equals((CharSequence) obj2, string)) {
                    h hVar2 = this.f147443a;
                    ((com.ss.android.ugc.gamora.recorder.k.a) hVar2.f147415d.a(hVar2, h.f147412a[3])).a(true);
                }
            }
            if (!TextUtils.equals((CharSequence) cVar.f147370b, "record_mode_mv")) {
                Object obj3 = cVar.f147371c;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj3, "record_mode_mv")) {
                    this.f147443a.a().a(0);
                }
            }
            String str = (String) cVar.f147371c;
            if (!h.f.b.l.a((Object) str, (Object) ig.a(R.string.f_9))) {
                this.f147443a.f147423l = a.C3549a.a(str);
            }
            this.f147443a.d().e(this.f147443a.f147423l);
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f147444a;

        static {
            Covode.recordClassIndex(97146);
        }

        n(h hVar) {
            this.f147444a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            t tVar = (t) obj;
            if (tVar == null) {
                return;
            }
            if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                if (!bk.a() || this.f147444a.a().D().i() || this.f147444a.c().f124757b.f124714i) {
                    this.f147444a.showBottomTab(false);
                } else if (this.f147444a.c().f124757b.h() < this.f147444a.c().f124757b.k() && this.f147444a.c().Z != 15) {
                    this.f147444a.f147418g.a(bh.a(this.f147444a.c().s()));
                    this.f147444a.showBottomTab(true);
                }
            } else if (!this.f147444a.c().f124757b.f124714i && tVar.f28208d) {
                if (bk.a()) {
                    this.f147444a.f147418g.c();
                }
                this.f147444a.showBottomTab(true);
                this.f147444a.a(true);
            }
        }
    }

    public final void a(c cVar) {
        com.ss.android.ugc.tools.f.b a2;
        h.f.b.l.d(cVar, "");
        if (cVar.f147373e) {
            String str = "";
            for (f fVar : this.f147418g.f147382a) {
                Object obj = cVar.f147371c;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj, fVar.f147393b.f147377c)) {
                    str = fVar.f147393b.f147378d;
                }
            }
            for (f fVar2 : this.f147419h.f147382a) {
                Object obj2 = cVar.f147371c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj2, fVar2.f147393b.f147377c)) {
                    str = fVar2.f147393b.f147378d;
                }
            }
            if (!TextUtils.equals(str, "")) {
                if (TextUtils.equals(str, "video_15")) {
                    str = "camera";
                }
                com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", c().q).a("shoot_way", c().r).a("draft_id", c().C).a("to_status", str).a("from_status", bh.a(cVar.f147370b)).a("shoot_page", "video_shoot_page");
                if (!bk.a() || c().f124757b.h() <= 0) {
                    a2 = a3.a("enter_from", "video_shoot_page");
                } else {
                    a2 = a3.a("enter_from", "video_recording_page");
                }
                com.ss.android.ugc.aweme.common.r.a("change_record_mode", a2.f149193a);
            }
        }
    }

    public final void a(boolean z2) {
        int i2;
        if (getCurrentBottomTag().equals(ig.a(R.string.f_9))) {
            TabHost tabHost = this.f147422k.f147400e;
            if (tabHost == null) {
                h.f.b.l.a("tabHost");
            }
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tabHost.setVisibility(i2);
        }
    }

    private final void a(com.bytedance.scene.group.b bVar, f fVar) {
        fVar.f147392a.observe(com.bytedance.scene.ktx.b.b(bVar), new d(this, bVar, fVar));
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void setCurrentTab(String str, boolean z2) {
        h.f.b.l.d(str, "");
        this.f147418g.a(str, z2);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void showComplexTab(int i2, c cVar) {
        this.f147422k.f147402g = cVar;
        this.f147417f.b(Integer.valueOf(i2));
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    static void a(com.bytedance.scene.group.b bVar, f fVar, boolean z2) {
        com.bytedance.scene.j a2 = bVar.a("RecordBottomTabScene");
        if (a2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(a2, "");
        j jVar = (j) a2;
        int a3 = jVar.a(fVar.f147393b.f147377c);
        if (a3 >= 0) {
            jVar.a(a3, z2);
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.b
    public void addBottomTab(int i2, a aVar, int i3) {
        h.f.b.l.d(aVar, "");
        com.bytedance.scene.group.b bVar = this.f147424m;
        Iterator<T> it = this.f147418g.f147382a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = next.f147393b.f147377c;
            com.ss.android.ugc.gamora.a.a aVar2 = this.v;
            if (aVar2 == null) {
                h.f.b.l.a("recordEnv");
            }
            if (h.f.b.l.a((Object) str, (Object) aVar.createBottomTabItem(aVar2).f147377c)) {
                if (next != null) {
                    return;
                }
            }
        }
        e eVar = this.f147418g;
        com.ss.android.ugc.gamora.a.a aVar3 = this.v;
        if (aVar3 == null) {
            h.f.b.l.a("recordEnv");
        }
        f a2 = eVar.a(aVar3, i2, aVar);
        a(bVar, a2);
        k kVar = a2.f147394c;
        if (kVar != null) {
            com.bytedance.scene.ktx.a.a(bVar, R.id.dj6, kVar, kVar.a());
        }
        if (a2.f147393b.f147379e) {
            com.bytedance.scene.ktx.c.a(bVar, new a(bVar, a2, this, aVar, i2), 500);
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.b.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public h(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar, List<? extends a> list, List<? extends a> list2) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(list, "");
        h.f.b.l.d(list2, "");
        this.f147424m = bVar;
        this.F = fVar;
        this.n = list;
        this.o = list2;
        Object a2 = getDiContainer().a(com.ss.android.ugc.aweme.shortvideo.h.a.class, (String) null);
        h.f.b.l.b(a2, "");
        com.ss.android.ugc.aweme.shortvideo.h.a aVar = (com.ss.android.ugc.aweme.shortvideo.h.a) a2;
        this.f147414c = aVar;
        this.p = com.bytedance.o.b.a.a(getDiContainer(), z.class);
        this.q = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);
        this.r = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
        this.f147415d = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.k.a.class);
        this.s = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
        this.t = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);
        this.u = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
        this.f147416e = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.c.class);
        com.bytedance.als.k<c> kVar = new com.bytedance.als.k<>();
        this.w = kVar;
        com.bytedance.als.k<String> kVar2 = new com.bytedance.als.k<>();
        this.x = kVar2;
        this.y = kVar;
        this.z = kVar2;
        com.bytedance.als.l<Integer> lVar = new com.bytedance.als.l<>(8);
        this.f147417f = lVar;
        e eVar = new e();
        this.f147418g = eVar;
        e eVar2 = new e();
        this.f147419h = eVar2;
        com.bytedance.als.k<Boolean> kVar3 = new com.bytedance.als.k<>();
        this.A = kVar3;
        this.f147420i = new com.bytedance.als.d<>(null);
        this.B = new com.bytedance.als.k<>();
        this.C = new com.bytedance.als.k<>();
        this.f147421j = new j(getDiContainer(), c(), eVar, aVar.c());
        this.f147422k = new g(getDiContainer(), c(), eVar2, lVar, aVar.c(), kVar3);
        this.E = h.i.a(h.m.NONE, new s(this));
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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

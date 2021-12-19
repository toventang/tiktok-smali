package com.ss.android.ugc.gamora.recorder.m;

import android.view.MotionEvent;
import com.bytedance.als.j;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.property.bk;
import com.ss.android.ugc.aweme.property.ed;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.setting.i.p;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.ae;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.util.bh;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.b.l;
import com.ss.android.ugc.gamora.recorder.choosemusic.a.a;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.y;
import h.z;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f148051a = {new y(b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(b.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new y(b.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new y(b.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(b.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new y(b.class, "commentStickerComponent", "getCommentStickerComponent()Lcom/ss/android/ugc/aweme/comment_sticker/CommentStickerComponent;", 0), new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(b.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new y(b.class, "quickUploadComponent", "getQuickUploadComponent()Lcom/ss/android/ugc/gamora/recorder/quickupload/QuickUploadComponent;", 0)};
    private final k<f> A;
    private String B;
    private l.a C;
    private final com.bytedance.als.d<Integer> D;
    private boolean E;
    private final com.bytedance.o.f F;

    /* renamed from: b  reason: collision with root package name */
    public final b f148052b = this;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.als.l<Integer> f148053c = new com.bytedance.als.l<>(8);

    /* renamed from: d  reason: collision with root package name */
    public boolean f148054d;

    /* renamed from: e  reason: collision with root package name */
    public e f148055e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f148056f;

    /* renamed from: g  reason: collision with root package name */
    final h.h f148057g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f148058h;

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.scene.group.b f148059i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f148060j = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f148061k = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f148062l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f148063m = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
    private final h.h.d n = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.k.a.class);
    private final h.h.d o = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.l.f.class);
    private final h.h.d p = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
    private final com.ss.android.ugc.gamora.recorder.choosemusic.a.a q = ((com.ss.android.ugc.gamora.recorder.choosemusic.a.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null));
    private final com.ss.android.ugc.gamora.recorder.sticker.c.j r = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) getDiContainer().b(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, null));
    private final h.h.d s = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
    private final h.h.d t = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.aweme.z.a.class);
    private final h.h.d u = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
    private final h.h.d v = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
    private final h.h.d w = com.bytedance.o.b.a.b(getDiContainer(), com.ss.android.ugc.gamora.recorder.quickupload.k.class);
    private final k<com.ss.android.ugc.gamora.recorder.b.c> x;
    private final com.bytedance.als.l<z> y;
    private final k<com.ss.android.ugc.gamora.recorder.b.c> z;

    static {
        Covode.recordClassIndex(97599);
    }

    private final com.ss.android.ugc.aweme.shortvideo.h.a i() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.f148060j.a(this, f148051a[0]);
    }

    private final com.ss.android.ugc.gamora.recorder.k.a j() {
        return (com.ss.android.ugc.gamora.recorder.k.a) this.n.a(this, f148051a[4]);
    }

    private final com.ss.android.ugc.gamora.recorder.l.f k() {
        return (com.ss.android.ugc.gamora.recorder.l.f) this.o.a(this, f148051a[5]);
    }

    private final com.ss.android.ugc.gamora.recorder.b.b l() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.p.a(this, f148051a[6]);
    }

    private final com.ss.android.ugc.gamora.recorder.choosemusic.a m() {
        return (com.ss.android.ugc.gamora.recorder.choosemusic.a) this.s.a(this, f148051a[7]);
    }

    private final com.ss.android.ugc.aweme.z.a n() {
        return (com.ss.android.ugc.aweme.z.a) this.t.a(this, f148051a[8]);
    }

    public final m a() {
        return (m) this.f148061k.a(this, f148051a[1]);
    }

    public final com.ss.android.ugc.gamora.recorder.b.b b() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.f148062l.a(this, f148051a[2]);
    }

    public final ShortVideoContext f() {
        return (ShortVideoContext) this.f148063m.a(this, f148051a[3]);
    }

    public final com.bytedance.creativex.recorder.b.a.d g() {
        return (com.bytedance.creativex.recorder.b.a.d) this.u.a(this, f148051a[9]);
    }

    public final com.bytedance.creativex.recorder.gesture.api.b h() {
        return (com.bytedance.creativex.recorder.gesture.api.b) this.v.a(this, f148051a[10]);
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final /* bridge */ /* synthetic */ com.bytedance.als.h c() {
        return this.f148053c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f148052b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.F;
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(boolean z2) {
        this.f148054d = z2;
        a(z2 ? 0 : 8);
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(boolean z2, boolean z3) {
        if (!this.f148054d) {
            return;
        }
        if (!z2 || f().f124757b.f124714i) {
            a(8);
            this.E = true;
            return;
        }
        if (f().f124757b.h() > 0) {
            if (!bk.a() || g().D().i() || f().f124757b.f124714i) {
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

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(String str, boolean z2) {
        Object obj;
        h.f.b.l.d(str, "");
        e eVar = this.f148055e;
        if (eVar == null) {
            h.f.b.l.a("splitShootScene");
        }
        TabHost E2 = eVar.E();
        Iterator it = h.j.h.a(0, E2.getTabCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (h.f.b.l.a(E2.b(((Number) obj).intValue()), (Object) str)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            E2.a(num.intValue(), true, z2);
        }
    }

    public final void a(boolean z2, Set<String> set) {
        this.A.a(new f(z2, set));
    }

    static final class a extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f148064a = new a();

        static {
            Covode.recordClassIndex(97600);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(bk.a());
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final boolean e() {
        T value;
        if (!this.f148054d || (value = this.f148053c.f6468a.getValue()) == null || value.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void d() {
        if (this.f148054d && bk.a() && !g().D().i() && !f().f124757b.f124714i) {
            a(false, bh.a(f().s()));
            a(0);
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148066a;

        static {
            Covode.recordClassIndex(97602);
        }

        c(b bVar) {
            this.f148066a = bVar;
        }

        public final void run() {
            if (this.f148066a.f148054d && this.f148066a.f().f124757b.h() >= this.f148066a.f().f124757b.k() && !this.f148066a.f().f124757b.f124714i && bk.a() && !this.f148066a.g().D().i()) {
                b bVar = this.f148066a;
                bVar.a(false, bh.a(bVar.f().s()));
                this.f148066a.a(0);
            }
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        boolean z2;
        k<Boolean> kVar;
        super.onCreate();
        this.B = com.ss.android.ugc.aweme.port.in.g.a().l().getDefaultShootTabTag(f());
        com.bytedance.o.f diContainer = getDiContainer();
        k<com.ss.android.ugc.gamora.recorder.b.c> kVar2 = this.z;
        com.bytedance.als.l<Integer> lVar = this.f148053c;
        com.bytedance.als.h<Boolean> c2 = i().c();
        com.bytedance.als.l<z> lVar2 = this.y;
        k<f> kVar3 = this.A;
        String str = this.B;
        if (!d.a() || f().f124757b.b() || f().f124757b.c() || f().i()) {
            z2 = false;
        } else {
            z2 = true;
        }
        e eVar = new e(diContainer, kVar2, lVar, c2, lVar2, kVar3, str, z2, c.a(f()), this.D);
        this.f148055e = eVar;
        this.f148059i.a(R.id.dj5, eVar, "SplitShootScene");
        e eVar2 = this.f148055e;
        if (eVar2 == null) {
            h.f.b.l.a("splitShootScene");
        }
        com.bytedance.scene.ktx.c.a(eVar2, new c(this));
        a().w().a(this, new d(this));
        this.z.a(this, new e(this));
        a().s().a(this, new f(this));
        a().o().b(this, new g(this));
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().e() && (!ed.a() || !n.b("slide_right", "click_upper_left_camera", "click_west_window_camera").contains(f().y))) {
            h().a(new C3992b(this), 3);
        }
        i().a().a(this, new h(this));
        com.ss.android.ugc.gamora.recorder.quickupload.k kVar4 = (com.ss.android.ugc.gamora.recorder.quickupload.k) this.w.a(this, f148051a[11]);
        if (kVar4 != null && (kVar = kVar4.f148218c) != null) {
            kVar.a(this, new i(this));
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void b(boolean z2) {
        this.f148054d = z2;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$b  reason: collision with other inner class name */
    public static final class C3992b extends com.bytedance.creativex.recorder.gesture.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148065a;

        static {
            Covode.recordClassIndex(97601);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3992b(b bVar) {
            this.f148065a = bVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            T value;
            if (this.f148065a.g().D().i() || this.f148065a.g().ak()) {
                return false;
            }
            com.ss.android.ugc.aweme.shortvideo.countdown.b bVar = (com.ss.android.ugc.aweme.shortvideo.countdown.b) this.f148065a.getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, null);
            if ((bVar != null && bVar.d()) || !this.f148065a.f148054d || (value = this.f148065a.f148053c.f6468a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.a(motionEvent, motionEvent2, f2, f3);
            }
            com.bytedance.creativex.recorder.gesture.api.d a2 = this.f148065a.h().a(1);
            if (a2 != null && a2.a(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            com.bytedance.creativex.recorder.gesture.api.d a3 = this.f148065a.h().a(6);
            if ((a3 == null || !a3.a(motionEvent, motionEvent2, f2, f3)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            T value;
            if (this.f148065a.g().D().i() || this.f148065a.g().ak()) {
                return false;
            }
            com.ss.android.ugc.aweme.shortvideo.countdown.b bVar = (com.ss.android.ugc.aweme.shortvideo.countdown.b) this.f148065a.getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, null);
            if ((bVar != null && bVar.d()) || !this.f148065a.f148054d || (value = this.f148065a.f148053c.f6468a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.b(motionEvent, motionEvent2, f2, f3);
            }
            com.bytedance.creativex.recorder.gesture.api.d a2 = this.f148065a.h().a(1);
            if (a2 != null && a2.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            com.bytedance.creativex.recorder.gesture.api.d a3 = this.f148065a.h().a(6);
            if (a3 != null && a3.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            e eVar = this.f148065a.f148055e;
            if (eVar == null) {
                h.f.b.l.a("splitShootScene");
            }
            TabHost E = eVar.E();
            gb.a(com.bytedance.als.dsl.g.b(this.f148065a));
            if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                if (E.getCurrentIndex() > 0) {
                    E.a(E.getCurrentIndex() - 1, 3);
                }
                return true;
            } else if (motionEvent.getX() <= motionEvent2.getX() || Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            } else {
                if (E.getCurrentIndex() < E.getTabCount() - 1) {
                    E.a(E.getCurrentIndex() + 1, 3);
                }
                return true;
            }
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148067a;

        static {
            Covode.recordClassIndex(97603);
        }

        d(b bVar) {
            this.f148067a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f148067a.a(8);
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148071a;

        static {
            Covode.recordClassIndex(97607);
        }

        h(b bVar) {
            this.f148071a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            b bVar = this.f148071a;
            h.f.b.l.b(bool, "");
            bVar.f148058h = bool.booleanValue();
        }
    }

    public final void a(int i2) {
        this.f148053c.b(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void b(int i2) {
        this.D.b(Integer.valueOf(i2));
    }

    @Override // com.ss.android.ugc.gamora.recorder.m.a
    public final void a(l.a aVar) {
        int i2;
        h.f.b.l.d(aVar, "");
        this.C = aVar;
        if (this.f148056f) {
            String str = this.B;
            com.ss.android.ugc.gamora.recorder.b.c cVar = aVar.f147482c;
            if (cVar != null) {
                i2 = cVar.f147372d;
            } else {
                i2 = 0;
            }
            a(null, str, true, i2, aVar.f147485f, aVar.f147483d);
        } else {
            a(new com.ss.android.ugc.gamora.recorder.b.c(null, "RecordCombinePhoto", 0, aVar.f147485f, false, 16));
        }
        this.y.b(z.f158842a);
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148068a;

        static {
            Covode.recordClassIndex(97604);
        }

        e(b bVar) {
            this.f148068a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.recorder.b.c cVar = (com.ss.android.ugc.gamora.recorder.b.c) obj;
            this.f148068a.f148056f = !h.f.b.l.a(cVar.f147371c, (Object) "RecordCombinePhoto");
            if (h.f.b.l.a(cVar.f147370b, (Object) "RecordCombinePhoto") || h.f.b.l.a(cVar.f147371c, (Object) "RecordCombinePhoto")) {
                b bVar = this.f148068a;
                h.f.b.l.b(cVar, "");
                bVar.a(cVar);
                return;
            }
            b bVar2 = this.f148068a;
            Object obj2 = cVar.f147370b;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            Object obj3 = cVar.f147371c;
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
            bVar2.a((String) obj2, (String) obj3, false, cVar.f147372d, cVar.f147369a, cVar.f147374f);
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148069a;

        static {
            Covode.recordClassIndex(97605);
        }

        f(b bVar) {
            this.f148069a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            b bVar = this.f148069a;
            if (bVar.f148054d) {
                if (bVar.f().f124757b.h() > 0) {
                    if (!bk.a() || bVar.g().D().i() || bVar.f().f124757b.f124714i) {
                        bVar.a(8);
                        return;
                    }
                    bVar.a(false, bh.a(bVar.f().s()));
                } else if (bVar.f().f124757b.f124714i) {
                    return;
                } else {
                    if (bk.a()) {
                        bVar.a(true, (Set<String>) null);
                    }
                }
                bVar.a(0);
            }
        }
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148072a;

        static {
            Covode.recordClassIndex(97608);
        }

        i(b bVar) {
            this.f148072a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            T value = this.f148072a.a().d().f6468a.getValue();
            h.f.b.l.b(value, "");
            if (!value.booleanValue()) {
                if (bool.booleanValue() || !h.f.b.l.a((Object) this.f148072a.b().getCurrentBottomTag(), (Object) ig.a(R.string.f_3))) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                this.f148072a.a(i2);
                if (!this.f148072a.f148058h) {
                    this.f148072a.a(8);
                }
            }
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f148070a;

        static {
            Covode.recordClassIndex(97606);
        }

        g(b bVar) {
            this.f148070a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean a2;
            t tVar = (t) obj;
            if (tVar != null && tVar.f28205a != null) {
                this.f148070a.f();
                if (p.a() == 2) {
                    a2 = ((Boolean) this.f148070a.f148057g.getValue()).booleanValue();
                } else {
                    a2 = bk.a();
                }
                if (!tVar.f28205a.isEmpty() || tVar.f28206b != 0) {
                    if (!this.f148070a.f148054d) {
                        return;
                    }
                    if (!a2 || this.f148070a.g().D().i() || this.f148070a.f().f124757b.f124714i) {
                        this.f148070a.a(8);
                    } else if (this.f148070a.f().f124757b.h() < this.f148070a.f().f124757b.k()) {
                        b bVar = this.f148070a;
                        bVar.a(false, bh.a(bVar.f().s()));
                        this.f148070a.a(0);
                    }
                } else if (!this.f148070a.f().f124757b.f124714i && tVar.f28208d && this.f148070a.f148054d) {
                    if (a2) {
                        this.f148070a.a(true, (Set<String>) null);
                    }
                    this.f148070a.f();
                    if (p.a() == 2) {
                        T value = this.f148070a.f148053c.f6468a.getValue();
                        if ((value == null || value.intValue() != 0) && !this.f148070a.f().b()) {
                            this.f148070a.a(0);
                        }
                    } else if (!this.f148070a.f().b()) {
                        this.f148070a.a(0);
                    }
                }
            }
        }
    }

    public final void a(com.ss.android.ugc.gamora.recorder.b.c cVar) {
        o t2;
        if (h.f.b.l.a(cVar.f147370b, (Object) "RecordCombinePhoto")) {
            Object obj = cVar.f147371c;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            this.B = (String) obj;
        }
        l().onCombinePhotoTabChanged(cVar);
        int i2 = cVar.f147372d;
        Object obj2 = cVar.f147370b;
        Effect effect = null;
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        a(false, i2, (String) obj2, cVar.f147369a);
        l().notifyBottomTabIndexChange(new com.ss.android.ugc.gamora.recorder.b.c(cVar.f147370b, cVar.f147371c, cVar.f147372d, false, false, 16));
        if (h.f.b.l.a(cVar.f147371c, (Object) "RecordCombinePhoto")) {
            com.ss.android.ugc.gamora.recorder.sticker.c.j jVar = this.r;
            if (!(jVar == null || (t2 = jVar.t()) == null)) {
                effect = t2.f();
            }
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.q;
            if (aVar != null) {
                aVar.a(f().f124757b.e(), 0, null, effect, a.C3962a.C3963a.f147504a);
            }
        }
    }

    public b(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f148059i = bVar;
        this.F = fVar;
        k<com.ss.android.ugc.gamora.recorder.b.c> kVar = new k<>();
        this.x = kVar;
        this.y = new com.bytedance.als.l<>(z.f158842a);
        this.z = kVar;
        this.A = new k<>();
        this.B = ae.f124883a;
        this.D = new com.bytedance.als.d<>(0);
        this.f148056f = true;
        this.f148057g = h.i.a((h.f.a.a) a.f148064a);
        this.f148058h = true;
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

    private final void a(String str, ShortVideoContext shortVideoContext, boolean z2, boolean z3) {
        if ((ae.b(str) || h.f.b.l.a((Object) ae.f124883a, (Object) str)) && !shortVideoContext.f124757b.b() && !shortVideoContext.f124757b.c()) {
            com.ss.android.ugc.aweme.tools.l lVar = new com.ss.android.ugc.aweme.tools.l(!ae.b(str), true);
            lVar.f140205c = h.f.b.l.a((Object) str, (Object) ae.f124885c);
            lVar.f140207e = z2;
            lVar.f140206d = 2;
            lVar.f140208f = !z3;
            b().configSwitchDuration(lVar);
        }
    }

    private final void a(boolean z2, int i2, String str, boolean z3) {
        String str2;
        String str3;
        String str4;
        com.ss.android.ugc.tools.f.b a2;
        if (h.f.b.l.a((Object) this.B, (Object) ae.f124883a)) {
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
        if (z3) {
            a3 = "by_default";
            str3 = str5;
        } else {
            str5 = str4;
        }
        com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("creation_id", f().q).a("shoot_way", f().r).a("draft_id", f().C).a("to_status", str2).a("change_type", str5).a("change_method", str3).a("from_status", a3);
        if (!bk.a() || f().f124757b.h() <= 0) {
            a2 = a4.a("enter_from", "video_shoot_page");
        } else {
            a2 = a4.a("enter_from", "video_recording_page");
        }
        r.a("change_record_mode", a2.f149193a);
    }

    public final void a(String str, String str2, boolean z2, int i2, boolean z3, boolean z4) {
        com.ss.android.ugc.aweme.z.a n2;
        o t2;
        this.B = str2;
        Effect effect = null;
        Object b2 = getDiContainer().b(com.ss.android.ugc.gamora.recorder.b.b.class, null);
        if (b2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.gamora.a.a provideRecordEnv = ((com.ss.android.ugc.gamora.recorder.b.b) b2).provideRecordEnv();
        com.bytedance.creativex.recorder.b.a.d d2 = provideRecordEnv.d();
        provideRecordEnv.g().a("record");
        int a2 = ae.a(str2);
        provideRecordEnv.b().Z = a2;
        i().b(z4);
        com.ss.android.ugc.gamora.recorder.k.a j2 = j();
        j2.b();
        boolean z5 = false;
        j2.a(3, false);
        d2.a(0);
        j().b(true);
        if (k().d()) {
            k().b(true);
        }
        if (com.ss.android.ugc.aweme.port.in.g.a().l().shouldDropCurrentMusicFor3min(str2, f())) {
            m().clearMusic();
            new com.ss.android.ugc.aweme.tux.a.i.a(provideRecordEnv.a()).a(R.string.d0y).a();
        }
        com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = this.q;
        if (aVar != null) {
            com.ss.android.ugc.gamora.recorder.sticker.c.j jVar = this.r;
            if (!(jVar == null || (t2 = jVar.t()) == null)) {
                effect = t2.f();
            }
            aVar.c(effect);
        }
        ShortVideoContext b3 = provideRecordEnv.b();
        if (z2) {
            l.a aVar2 = this.C;
            if (aVar2 == null) {
                h.f.b.l.a("extraInfo");
            }
            z5 = aVar2.f147485f;
        }
        a(str2, b3, z5, z2);
        a(provideRecordEnv, str2, provideRecordEnv.b(), z2);
        com.ss.android.ugc.aweme.shortvideo.f.a.b(a2);
        if (provideRecordEnv.b().f124757b.f124711f.isEmpty() && (n2 = n()) != null) {
            n2.a(true);
        }
        a(z2, i2, str, z3);
        l().notifyBottomTabIndexChange(new com.ss.android.ugc.gamora.recorder.b.c(str, str2, i2, false, false, 16));
    }
}

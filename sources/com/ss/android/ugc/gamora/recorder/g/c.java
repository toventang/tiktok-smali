package com.ss.android.ugc.gamora.recorder.g;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
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
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.ed;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.util.at;
import com.ss.android.ugc.aweme.shortvideo.util.au;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.y;
import h.z;

public final class c extends com.bytedance.als.j<a> implements com.bytedance.jedi.arch.b, com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147752a = {new y(c.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(c.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new y(c.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(c.class, "stickerPanelApiComponent", "getStickerPanelApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0), new y(c.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new y(c.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new y(c.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final a f147753b = this;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.als.l<h.p<Float, Float>> f147754c = new com.bytedance.als.l<>(null);

    /* renamed from: d  reason: collision with root package name */
    public final androidx.fragment.app.e f147755d = ((androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null));

    /* renamed from: e  reason: collision with root package name */
    public final ShortVideoContext f147756e = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.d f147757f = ((com.bytedance.creativex.recorder.b.a.d) getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null));

    /* renamed from: g  reason: collision with root package name */
    final h.h.d f147758g = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.sticker.a.c.class);

    /* renamed from: h  reason: collision with root package name */
    final h.h.d f147759h = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.choosemusic.a.class);

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.scene.group.b f147760i;

    /* renamed from: j  reason: collision with root package name */
    private final com.bytedance.als.l<Drawable> f147761j = new com.bytedance.als.l<>(null);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f147762k = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f147763l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);

    /* renamed from: m  reason: collision with root package name */
    private final h.h.d f147764m = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);
    private final h.h.d n = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
    private final h.h.d o = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.b.b.class);
    private final h.h p = h.i.a((h.f.a.a) new o(this));
    private long q = -1;
    private final com.bytedance.o.f r;

    static {
        Covode.recordClassIndex(97396);
    }

    public final com.bytedance.creativex.recorder.b.a.m c() {
        return (com.bytedance.creativex.recorder.b.a.m) this.f147762k.a(this, f147752a[0]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.h.a d() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) this.f147763l.a(this, f147752a[1]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.recorder.sticker.c.j e() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f147764m.a(this, f147752a[2]);
    }

    public final com.bytedance.creativex.recorder.gesture.api.b f() {
        return (com.bytedance.creativex.recorder.gesture.api.b) this.n.a(this, f147752a[4]);
    }

    public final com.ss.android.ugc.gamora.recorder.b.b g() {
        return (com.ss.android.ugc.gamora.recorder.b.b) this.o.a(this, f147752a[5]);
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final b h() {
        return (b) this.p.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.g.c$c  reason: collision with other inner class name */
    public static final class C3977c extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3977c f147765a = new C3977c();

        static {
            Covode.recordClassIndex(97399);
        }

        C3977c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f147766a = new f();

        static {
            Covode.recordClassIndex(97402);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f147767a = new i();

        static {
            Covode.recordClassIndex(97405);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.a
    public final long a() {
        return this.q;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f147753b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.r;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.a
    public final void b() {
        this.q = -1;
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

    static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a("click_cross", System.currentTimeMillis());
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ String $exitMethod;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$exitMethod = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a(this.$exitMethod);
            this.this$0.h().a();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ String $exitMethod;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$exitMethod = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.port.in.c.n.a();
            this.this$0.a(this.$exitMethod);
            this.this$0.h().b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ String $exitMethod;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$exitMethod = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.port.in.c.n.a();
            this.this$0.a(this.$exitMethod);
            this.this$0.h().b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ String $exitMethod;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$exitMethod = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.this$0.f147756e.b()) {
                this.this$0.i();
            } else {
                com.ss.android.ugc.aweme.port.in.c.n.a();
                this.this$0.a(this.$exitMethod);
                this.this$0.h().a();
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<d> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d(this.this$0.f147755d, this.this$0.f147756e, this.this$0.f147757f, this.this$0.c(), (com.ss.android.ugc.aweme.shortvideo.duet.d) this.this$0.getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.duet.d.class, null));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.this$0.f147756e.q).a("shoot_way", this.this$0.f147756e.r);
            if (this.this$0.f147756e.C != 0) {
                a2.a("draft_id", this.this$0.f147756e.C);
            }
            String str = this.this$0.f147756e.D;
            h.f.b.l.b(str, "");
            if (str.length() > 0) {
                a2.a("new_draft_id", this.this$0.f147756e.D);
            }
            r.a("reshoot", a2.f149193a);
            this.this$0.h().c();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ String $exitMethod;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$exitMethod = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.this$0.f147756e.q).a("shoot_way", this.this$0.f147756e.r);
            if (this.this$0.f147756e.C != 0) {
                a2.a("draft_id", this.this$0.f147756e.C);
            }
            String str = this.this$0.f147756e.D;
            h.f.b.l.b(str, "");
            if (str.length() > 0) {
                a2.a("new_draft_id", this.this$0.f147756e.D);
            }
            r.a("reshoot", a2.f149193a);
            this.this$0.a(this.$exitMethod);
            this.this$0.h().a();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97404);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.this$0.f147756e.q).a("shoot_way", this.this$0.f147756e.r);
            if (this.this$0.f147756e.C != 0) {
                a2.a("draft_id", this.this$0.f147756e.C);
            }
            String str = this.this$0.f147756e.D;
            h.f.b.l.b(str, "");
            if (str.length() > 0) {
                a2.a("new_draft_id", this.this$0.f147756e.D);
            }
            r.a("reshoot", a2.f149193a);
            this.this$0.h().c();
            return z.f158842a;
        }
    }

    public final void i() {
        com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(this.f147755d);
        bVar.a(R.string.fus, new p(this));
        bVar.b(R.string.b0r, q.f147771a);
        ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) a.C1094a.a(this.f147755d).a(R.string.fuu).b(R.string.fut)).a(bVar).a(false)).a().b().show();
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        this.f147760i.a(R.id.dj5, new e(new l(this), this.f147761j, this.f147754c, d().d()), "RecordExitScene");
        this.f147757f.aj().a(this, new m(this));
        d().a().a(this, new n(this));
        if (ed.a() && h.a.n.b("slide_right", "click_upper_left_camera", "click_west_window_camera").contains(this.f147756e.y)) {
            f().a(new k(this), 10);
        }
    }

    public static final class k extends com.bytedance.creativex.recorder.gesture.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147768a;

        static {
            Covode.recordClassIndex(97407);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(c cVar) {
            this.f147768a = cVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (this.f147768a.f147757f.D().i() || this.f147768a.f147757f.ak()) {
                return false;
            }
            com.ss.android.ugc.aweme.shortvideo.countdown.b bVar = (com.ss.android.ugc.aweme.shortvideo.countdown.b) this.f147768a.getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, null);
            if (bVar != null && bVar.d()) {
                return false;
            }
            if (!h.a.n.b(ig.a(R.string.f_9), ig.a(R.string.f_3)).contains(this.f147768a.g().getCurrentBottomTag())) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.a(motionEvent, motionEvent2, f2, f3);
            }
            com.bytedance.creativex.recorder.gesture.api.d a2 = this.f147768a.f().a(1);
            if (a2 != null && a2.a(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            com.bytedance.creativex.recorder.gesture.api.d a3 = this.f147768a.f().a(6);
            if ((a3 == null || !a3.a(motionEvent, motionEvent2, f2, f3)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (this.f147768a.f147757f.D().i() || this.f147768a.f147757f.ak()) {
                return false;
            }
            com.ss.android.ugc.aweme.shortvideo.countdown.b bVar = (com.ss.android.ugc.aweme.shortvideo.countdown.b) this.f147768a.getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.countdown.b.class, null);
            if (bVar != null && bVar.d()) {
                return false;
            }
            if (!h.a.n.b(ig.a(R.string.f_9), ig.a(R.string.f_3)).contains(this.f147768a.g().getCurrentBottomTag())) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.b(motionEvent, motionEvent2, f2, f3);
            }
            com.bytedance.creativex.recorder.gesture.api.d a2 = this.f147768a.f().a(1);
            if (a2 != null && a2.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            com.bytedance.creativex.recorder.gesture.api.d a3 = this.f147768a.f().a(6);
            if (a3 != null && a3.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            double b2 = (double) dh.b(this.f147768a.f147755d);
            if (Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            if (!gb.a(this.f147768a.f147755d)) {
                if (motionEvent.getX() > motionEvent2.getX()) {
                    Double.isNaN(b2);
                    if (((double) (motionEvent.getX() - motionEvent2.getX())) > b2 * 0.2d) {
                        this.f147768a.a("slide_left", -1);
                    }
                }
            } else if (motionEvent2.getX() > motionEvent.getX()) {
                Double.isNaN(b2);
                if (((double) (motionEvent2.getX() - motionEvent.getX())) > b2 * 0.2d) {
                    this.f147768a.a("slide_left", -1);
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f147771a = new q();

        static {
            Covode.recordClassIndex(97413);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            return z.f158842a;
        }
    }

    public final void a(String str) {
        au.a(str, this.f147756e);
        at.a();
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    public final void a(boolean z) {
        com.bytedance.scene.group.b bVar = this.f147760i;
        if (z || this.f147756e.b()) {
            com.bytedance.scene.ktx.a.a(bVar, "RecordExitScene");
        } else {
            com.bytedance.scene.ktx.a.b(bVar, "RecordExitScene");
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147769a;

        static {
            Covode.recordClassIndex(97409);
        }

        m(c cVar) {
            this.f147769a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z = ((com.bytedance.creativex.recorder.b.a.k) obj).f28195b;
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(1.0f);
            if (z) {
                this.f147769a.f147754c.b(h.v.a(valueOf, valueOf2));
            } else {
                this.f147769a.f147754c.b(h.v.a(valueOf2, valueOf));
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f147770a;

        static {
            Covode.recordClassIndex(97410);
        }

        n(c cVar) {
            this.f147770a = cVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f147770a.d().g()) {
                this.f147770a.a(false);
                return;
            }
            c cVar = this.f147770a;
            h.f.b.l.b(bool, "");
            cVar.a(bool.booleanValue());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(97412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            h.f.b.l.d(aVar, "");
            c cVar = this.this$0;
            cVar.e().F().a();
            cVar.f147756e.a(false);
            cVar.d().a(true, false);
            if (com.ss.android.ugc.aweme.shortvideo.sticker.c.a(com.ss.android.ugc.aweme.sticker.f.e.a(cVar.e()))) {
                ((com.ss.android.ugc.gamora.recorder.choosemusic.a) cVar.f147759h.a(cVar, c.f147752a[6])).changeHasMusic(null);
            }
            com.ss.android.ugc.aweme.sticker.f.e.a(cVar.e(), (Effect) null);
            com.ss.android.ugc.aweme.tools.d.b.a(com.ss.android.ugc.aweme.tools.d.a.f139289a);
            cVar.c().c(true);
            ((com.bytedance.creativex.recorder.sticker.a.c) cVar.f147758g.a(cVar, c.f147752a[3])).a(true);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public c(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(fVar, "");
        this.f147760i = bVar;
        this.r = fVar;
    }

    @Override // com.ss.android.ugc.gamora.recorder.g.a
    public final void a(String str, long j2) {
        this.q = j2;
        if (this.f147756e.f124757b.f124706a == 1 && !this.f147756e.f124757b.f124714i && !this.f147756e.q()) {
            h().a(new a(this, str));
        } else if (this.f147756e.f124757b.h() == 0) {
            if (this.f147756e.b()) {
                i();
            } else if (this.f147756e.c()) {
                h().b(C3977c.f147765a, new d(this, str), new e(this, str));
            } else {
                a(str);
                h().a();
            }
        } else if (this.f147756e.c()) {
            h().c(f.f147766a, new g(this, str), new h(this));
        } else {
            h().a(i.f147767a, new j(this, str), new b(this));
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
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
    public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
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
    public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
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

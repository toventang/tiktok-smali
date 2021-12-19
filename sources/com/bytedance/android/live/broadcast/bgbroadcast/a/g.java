package com.bytedance.android.live.broadcast.bgbroadcast.a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.f.y;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import f.a.t;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class g {
    public static final a w = new a((byte) 0);
    private final int A;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.s.h f7625a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.broadcast.bgbroadcast.a.a.a f7626b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.s.h f7627c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.publicscreen.a.c.b f7628d;

    /* renamed from: e  reason: collision with root package name */
    public r f7629e;

    /* renamed from: f  reason: collision with root package name */
    public int f7630f = 2;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7631g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7632h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7633i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7634j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7635k;

    /* renamed from: l  reason: collision with root package name */
    final int f7636l;

    /* renamed from: m  reason: collision with root package name */
    public final List<l> f7637m;
    public b n;
    public final b o;
    public final b p;
    public final b q;
    public final b r;
    public Runnable s;
    public long t;
    public final b u;
    public final b v;
    private final Handler x = new Handler(Looper.getMainLooper());
    private boolean y;
    private int z;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f7657a;

        static {
            Covode.recordClassIndex(3773);
        }

        i(h.f.a.a aVar) {
            this.f7657a = aVar;
        }

        public final /* synthetic */ void run() {
            h.f.b.l.b(this.f7657a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(3759);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3760);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a(l lVar) {
        h.f.b.l.d(lVar, "");
        return this.f7637m.add(lVar);
    }

    public final void a(boolean z2, boolean z3) {
        this.x.postDelayed(new e(this, z2, z3), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d6, code lost:
        if (r12 != false) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r14, int r15, int r16) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.a.g.a(boolean, int, int):void");
    }

    public final com.bytedance.android.livesdk.s.h a() {
        com.bytedance.android.livesdk.s.h hVar = this.f7625a;
        if (hVar == null) {
            h.f.b.l.a("ctrlWindow");
        }
        return hVar;
    }

    public final com.bytedance.android.live.broadcast.bgbroadcast.a.a.a b() {
        com.bytedance.android.live.broadcast.bgbroadcast.a.a.a aVar = this.f7626b;
        if (aVar == null) {
            h.f.b.l.a("ctrlView");
        }
        return aVar;
    }

    public final com.bytedance.android.livesdk.s.h c() {
        com.bytedance.android.livesdk.s.h hVar = this.f7627c;
        if (hVar == null) {
            h.f.b.l.a("msgWindow");
        }
        return hVar;
    }

    public final com.bytedance.android.live.publicscreen.a.c.b d() {
        com.bytedance.android.live.publicscreen.a.c.b bVar = this.f7628d;
        if (bVar == null) {
            h.f.b.l.a("msgView");
        }
        return bVar;
    }

    public final r e() {
        r rVar = this.f7629e;
        if (rVar == null) {
            h.f.b.l.a("trayView");
        }
        return rVar;
    }

    public static final class j extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f7658d;

        /* renamed from: e  reason: collision with root package name */
        private f.a.b.b f7659e;

        static {
            Covode.recordClassIndex(3774);
        }

        private final void c() {
            View e2 = this.f7658d.a().e();
            h.f.b.l.b(e2, "");
            e2.setAlpha(0.5f);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f7660a;

            static {
                Covode.recordClassIndex(3775);
            }

            a(j jVar) {
                this.f7660a = jVar;
            }

            public final void run() {
                this.f7660a.f7658d.a(!this.f7660a.f7658d.f());
                this.f7660a.f7658d.d().setState(2);
                if (this.f7660a.f7658d.f()) {
                    this.f7660a.f7658d.a((Integer) null);
                } else {
                    this.f7660a.f7658d.a(false, true);
                }
            }
        }

        private final void b() {
            f.a.b.b bVar = this.f7659e;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f7659e = t.b(5000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), c.f7662a);
        }

        private final void a() {
            if (this.f7658d.a().f21125k) {
                c();
                int a2 = this.f7658d.f7635k + this.f7658d.e().a();
                g gVar = this.f7658d;
                gVar.a(gVar.a(), this.f7658d.a().f21115a.f21113g, a2);
                this.f7658d.a(false);
                this.f7658d.e().b(this.f7658d.a().f21115a.f21114h - this.f7658d.e().f7713c);
                this.f7658d.e().c();
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f7661a;

            static {
                Covode.recordClassIndex(3776);
            }

            b(j jVar) {
                this.f7661a = jVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f7661a.f7658d.a(a.CMD_HIDE_MSG_WINDOW);
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cp;
                h.f.b.l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final c f7662a = new c();

            static {
                Covode.recordClassIndex(3777);
            }

            c() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                h.f.b.l.d(th, "");
                com.bytedance.android.live.core.c.a.a(6, "ALogger", th.getMessage());
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void b(b bVar) {
            h.f.b.l.d(bVar, "");
            super.b(bVar);
            f.a.b.b bVar2 = this.f7659e;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            View e2 = this.f7658d.a().e();
            h.f.b.l.b(e2, "");
            e2.setAlpha(1.0f);
            this.f7658d.t = SystemClock.uptimeMillis();
            this.f7658d.e().b();
            this.f7658d.s = new a(this);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void a(b bVar) {
            h.f.b.l.d(bVar, "");
            super.a(bVar);
            a();
            this.f7658d.s = null;
            com.bytedance.android.live.publicscreen.a.c.b d2 = this.f7658d.d();
            d2.setState(3);
            if (!d2.a()) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cp;
                h.f.b.l.b(bVar2, "");
                Boolean a2 = bVar2.a();
                h.f.b.l.b(a2, "");
                if (!a2.booleanValue() || !this.f7658d.f()) {
                    this.f7658d.b(false);
                } else {
                    this.f7658d.c().c();
                    b();
                }
            }
            Iterator<T> it = this.f7658d.f7637m.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final boolean a(a aVar) {
            h.f.b.l.d(aVar, "");
            switch (i.f7669c[aVar.ordinal()]) {
                case 1:
                    this.f7658d.b(aVar);
                    a();
                    break;
                case 2:
                    g gVar = this.f7658d;
                    g.a(gVar, gVar.v, null, false, 6);
                    break;
                case 3:
                    Object param = aVar.getParam();
                    if (!(param instanceof o)) {
                        param = null;
                    }
                    o oVar = (o) param;
                    if (oVar != null) {
                        this.f7658d.a(oVar.f7699a, oVar.f7700b, oVar.f7701c);
                    }
                    g gVar2 = this.f7658d;
                    g.a(gVar2, gVar2.v, null, false, 2);
                    break;
                case 4:
                    f.a.b.b bVar = this.f7659e;
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    this.f7658d.a((Integer) null);
                    if (!this.f7658d.f7631g) {
                        b();
                        break;
                    }
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    if (!this.f7658d.d().a()) {
                        this.f7658d.b(false);
                        break;
                    }
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    f.a.b.b bVar2 = this.f7659e;
                    if (bVar2 != null) {
                        bVar2.dispose();
                    }
                    this.f7658d.a((Integer) null);
                    this.f7658d.f7631g = true;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    this.f7658d.b(false);
                    this.f7658d.f7631g = false;
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    g gVar3 = this.f7658d;
                    g.a(gVar3, gVar3.q, null, false, 6);
                    break;
                default:
                    return super.a(aVar);
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(g gVar, String str) {
            super(gVar, str);
            this.f7658d = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        com.bytedance.android.live.broadcast.bgbroadcast.a.a.a aVar = this.f7626b;
        if (aVar == null) {
            h.f.b.l.a("ctrlView");
        }
        return aVar.getIconWidth() + this.A;
    }

    public final void h() {
        com.bytedance.android.livesdk.s.h hVar = this.f7625a;
        if (hVar == null) {
            h.f.b.l.a("ctrlWindow");
        }
        com.bytedance.android.livesdk.s.h hVar2 = this.f7627c;
        if (hVar2 == null) {
            h.f.b.l.a("msgWindow");
        }
        a(hVar, hVar2, g(), this.f7636l);
    }

    public final boolean i() {
        com.bytedance.android.livesdk.s.h hVar = this.f7625a;
        if (hVar == null) {
            h.f.b.l.a("ctrlWindow");
        }
        com.bytedance.android.livesdk.s.g gVar = hVar.f21115a;
        h.f.b.l.b(gVar, "");
        if (gVar.f21113g < this.f7634j) {
            return true;
        }
        return false;
    }

    public static final class f extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f7646d;

        /* renamed from: e  reason: collision with root package name */
        private f.a.b.b f7647e;

        /* renamed from: f  reason: collision with root package name */
        private f.a.b.b f7648f;

        static {
            Covode.recordClassIndex(3765);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f7649a;

            static {
                Covode.recordClassIndex(3766);
            }

            a(f fVar) {
                this.f7649a = fVar;
            }

            public final void run() {
                r e2 = this.f7649a.f7646d.e();
                int height = this.f7649a.f7646d.b().getHeight();
                int i2 = e2.f7711a;
                if (height > 0 && i2 > height) {
                    e2.f7713c = (e2.f7711a - height) / 2;
                }
            }
        }

        private final void a() {
            g gVar = this.f7646d;
            com.bytedance.android.livesdk.s.h a2 = gVar.a();
            int i2 = this.f7646d.a().f21115a.f21113g;
            double d2 = (double) this.f7646d.f7634j;
            Double.isNaN(d2);
            gVar.a(a2, i2, (int) (d2 * 1.5d));
            this.f7646d.a(true);
        }

        /* access modifiers changed from: package-private */
        public static final class d<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f7652a;

            static {
                Covode.recordClassIndex(3769);
            }

            d(f fVar) {
                this.f7652a = fVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                this.f7652a.f7646d.a(a.CMD_CTRL_MENU_COLLAPSE);
            }
        }

        private final void a(int i2) {
            if (this.f7646d.f()) {
                b(i2);
            } else {
                a();
            }
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f7650a;

            static {
                Covode.recordClassIndex(3767);
            }

            b(f fVar) {
                this.f7650a = fVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.co;
                h.f.b.l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
                this.f7650a.f7646d.a(a.CMD_SNAPPED_TIMER_ENDED);
            }
        }

        static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final c f7651a = new c();

            static {
                Covode.recordClassIndex(3768);
            }

            c() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                h.f.b.l.d(th, "");
                com.bytedance.android.live.core.c.a.a(6, "ALogger", th.getMessage());
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void b(b bVar) {
            h.f.b.l.d(bVar, "");
            super.b(bVar);
            f.a.b.b bVar2 = this.f7648f;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            f.a.b.b bVar3 = this.f7647e;
            if (bVar3 != null) {
                bVar3.dispose();
            }
        }

        private final void b(int i2) {
            g gVar = this.f7646d;
            com.bytedance.android.livesdk.s.h a2 = gVar.a();
            int i3 = this.f7646d.a().f21115a.f21113g;
            double d2 = (double) this.f7646d.f7634j;
            Double.isNaN(d2);
            gVar.a(a2, i3, (int) (d2 * 1.5d));
            this.f7646d.a(Integer.valueOf(i2));
        }

        private final void a(boolean z) {
            f.a.b.b bVar = this.f7647e;
            if (bVar != null) {
                bVar.dispose();
            }
            if (z) {
                this.f7647e = t.b(10000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), com.bytedance.android.livesdk.util.rxutils.i.f22196a);
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final boolean a(a aVar) {
            h.f.b.l.d(aVar, "");
            switch (i.f7668b[aVar.ordinal()]) {
                case 1:
                    this.f7646d.b(aVar);
                    g gVar = this.f7646d;
                    g.a(gVar, gVar.u, null, false, 6);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    g gVar2 = this.f7646d;
                    g.a(gVar2, gVar2.v, null, false, 6);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.D;
                    h.f.b.l.b(bVar, "");
                    com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.D;
                    h.f.b.l.b(bVar2, "");
                    com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                    g gVar3 = this.f7646d;
                    g.a(gVar3, gVar3.u, null, false, 6);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                    g gVar4 = this.f7646d;
                    gVar4.a(!gVar4.b().a());
                    boolean a2 = this.f7646d.b().a();
                    if (a2 || !this.f7646d.f()) {
                        this.f7646d.b(true);
                        this.f7646d.a(false, true);
                    } else {
                        this.f7646d.a((Integer) null);
                    }
                    a(a2);
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                    if (this.f7646d.b().a()) {
                        this.f7646d.a(false);
                        if (this.f7646d.f()) {
                            this.f7646d.a((Integer) null);
                            break;
                        }
                    }
                    break;
                default:
                    return super.a(aVar);
            }
            return true;
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void a(b bVar) {
            boolean z;
            h.f.b.l.d(bVar, "");
            super.a(bVar);
            if (h.f.b.l.a(bVar, this.f7646d.p)) {
                this.f7646d.a().c();
                this.f7646d.e().f21112f.post(new a(this));
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.D;
                h.f.b.l.b(bVar2, "");
                Boolean a2 = bVar2.a();
                com.bytedance.android.livesdk.ap.b<Integer> bVar3 = com.bytedance.android.livesdk.ap.a.cq;
                h.f.b.l.b(bVar3, "");
                Integer a3 = bVar3.a();
                if (a3 != null && a3.intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                com.bytedance.android.live.broadcast.bgbroadcast.a.a.a b2 = this.f7646d.b();
                h.f.b.l.b(a2, "");
                b2.setMsgBtnActive(a2.booleanValue());
                if (!a2.booleanValue() || !z) {
                    this.f7646d.b(false);
                } else {
                    this.f7646d.a(false);
                    this.f7646d.a((Integer) 2);
                }
            } else if (h.f.b.l.a(bVar, this.f7646d.u)) {
                a(this.f7646d.f7630f);
            } else if (h.f.b.l.a(bVar, this.f7646d.v) && this.f7638a == a.CMD_CLICK_FLOAT_BALL && SystemClock.uptimeMillis() - this.f7646d.t < 200) {
                a(this.f7646d.f7630f);
                this.f7638a = null;
            } else if (this.f7646d.i()) {
                g gVar = this.f7646d;
                g.a(gVar, gVar.u, null, false, 6);
                return;
            }
            f.a.b.b bVar4 = this.f7648f;
            if (bVar4 != null) {
                bVar4.dispose();
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar5 = com.bytedance.android.livesdk.ap.a.co;
            h.f.b.l.b(bVar5, "");
            Boolean a4 = bVar5.a();
            h.f.b.l.b(a4, "");
            if (a4.booleanValue()) {
                this.f7648f = t.b(60000, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), c.f7651a);
            }
            Runnable runnable = this.f7646d.s;
            if (runnable != null) {
                runnable.run();
            }
            this.f7646d.s = null;
            a(this.f7646d.b().a());
            Iterator<T> it = this.f7646d.f7637m.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(g gVar, String str) {
            super(gVar, str);
            this.f7646d = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ b $newState;
        final /* synthetic */ a $pendingCmd;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(3778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(g gVar, b bVar, a aVar) {
            super(0);
            this.this$0 = gVar;
            this.$newState = bVar;
            this.$pendingCmd = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$newState.f7638a = this.$pendingCmd;
            g gVar = this.this$0;
            b bVar = this.$newState;
            h.f.b.l.d(bVar, "");
            if (!h.f.b.l.a(gVar.n, bVar)) {
                b bVar2 = gVar.n;
                bVar2.b(bVar);
                gVar.n = bVar;
                bVar.a(bVar2);
            }
            a aVar = this.this$0.n.f7638a;
            if (aVar != null) {
                this.this$0.a(aVar);
                this.this$0.n.f7638a = null;
            }
            return z.f158842a;
        }
    }

    public final boolean f() {
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.D;
        h.f.b.l.b(bVar, "");
        if (!h.f.b.l.a((Object) bVar.a(), (Object) true)) {
            com.bytedance.android.live.publicscreen.a.c.b bVar2 = this.f7628d;
            if (bVar2 == null) {
                h.f.b.l.a("msgView");
            }
            if (bVar2.a()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public g() {
        int a2 = y.a(10.0f);
        this.f7632h = a2;
        this.f7633i = n.e(y.e()) + a2;
        this.f7634j = a2;
        this.A = (int) i.a.a.a.a.b.a(6.0f);
        this.f7637m = new ArrayList();
        this.n = new b(this, "default");
        this.o = new h(this, "initState");
        this.p = new C0107g(this, "hiddenState");
        this.q = new f(this, "floatingState");
        this.r = new c(this, "destroyState");
        this.u = new j(this, "snappedState");
        this.v = new d(this, "draggingState");
    }

    public static final class h extends b {

        /* renamed from: d  reason: collision with root package name */
        public boolean f7654d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g f7655e;

        static {
            Covode.recordClassIndex(3771);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f7656a;

            static {
                Covode.recordClassIndex(3772);
            }

            a(h hVar) {
                this.f7656a = hVar;
            }

            public final void run() {
                if (this.f7656a.f7655e.b().getWidth() <= 0 || this.f7656a.f7655e.b().getHeight() <= 0) {
                    String a2 = com.a.a("ctrlView size is wrong, width=%d, height=%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f7656a.f7655e.b().getWidth()), Integer.valueOf(this.f7656a.f7655e.b().getHeight())}, 2));
                    h.f.b.l.b(a2, "");
                    com.bytedance.android.live.core.c.a.a(6, "GameUiStateMachine", a2);
                    this.f7656a.f7655e.b().measure(0, 0);
                    this.f7656a.f7655e.a().f21115a.b(this.f7656a.f7655e.b().getMeasuredWidth(), this.f7656a.f7655e.b().getMeasuredHeight());
                    String a3 = com.a.a("ctrlView size after measured, measuredWidth=%d, measuredHeight=%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f7656a.f7655e.b().getMeasuredWidth()), Integer.valueOf(this.f7656a.f7655e.b().getMeasuredHeight())}, 2));
                    h.f.b.l.b(a3, "");
                    com.bytedance.android.live.core.c.a.a(6, "GameUiStateMachine", a3);
                    return;
                }
                this.f7656a.f7655e.a().f21115a.b(this.f7656a.f7655e.b().getWidth(), this.f7656a.f7655e.b().getHeight());
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void a(b bVar) {
            h.f.b.l.d(bVar, "");
            super.a(bVar);
            if (!this.f7654d) {
                this.f7655e.b().post(new a(this));
                com.bytedance.android.livesdk.ap.b<Integer> bVar2 = com.bytedance.android.livesdk.ap.a.B;
                h.f.b.l.b(bVar2, "");
                Integer a2 = bVar2.a();
                com.bytedance.android.livesdk.ap.b<Integer> bVar3 = com.bytedance.android.livesdk.ap.a.C;
                h.f.b.l.b(bVar3, "");
                Integer a3 = bVar3.a();
                if (a2.intValue() < 0 || a3.intValue() < 0) {
                    this.f7655e.a().f21115a.a(8388659, this.f7655e.f7632h, this.f7655e.f7633i);
                } else {
                    com.bytedance.android.livesdk.s.g gVar = this.f7655e.a().f21115a;
                    h.f.b.l.b(a2, "");
                    int intValue = a2.intValue();
                    h.f.b.l.b(a3, "");
                    gVar.a(8388659, intValue, a3.intValue());
                }
                this.f7655e.h();
                this.f7655e.a().d();
                this.f7655e.b(false);
                this.f7655e.e().b();
                Iterator<T> it = this.f7655e.f7637m.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.f7654d = true;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(g gVar, String str) {
            super(gVar, str);
            this.f7655e = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f7643a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f7644b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f7645c;

        static {
            Covode.recordClassIndex(3764);
        }

        e(g gVar, boolean z, boolean z2) {
            this.f7643a = gVar;
            this.f7644b = z;
            this.f7645c = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e9, code lost:
            if (r4 != false) goto L_0x008b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 242
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.bgbroadcast.a.g.e.run():void");
        }
    }

    public static final class m implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f7665a;

        static {
            Covode.recordClassIndex(3780);
        }

        public final void onAnimationCancel(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            h.f.b.l.d(animator, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(g gVar) {
            this.f7665a = gVar;
        }

        public final void onAnimationEnd(Animator animator) {
            h.f.b.l.d(animator, "");
            this.f7665a.h();
        }
    }

    public static final class d extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f7642d;

        static {
            Covode.recordClassIndex(3763);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void a(b bVar) {
            h.f.b.l.d(bVar, "");
            super.a(bVar);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final boolean a(a aVar) {
            h.f.b.l.d(aVar, "");
            o oVar = null;
            switch (i.f7670d[aVar.ordinal()]) {
                case 1:
                case 3:
                    return true;
                case 2:
                    this.f7642d.b(aVar);
                    g gVar = this.f7642d;
                    g.a(gVar, gVar.u, null, false, 6);
                    return true;
                case 4:
                    Object param = aVar.getParam();
                    if (param instanceof o) {
                        oVar = param;
                    }
                    o oVar2 = oVar;
                    if (oVar2 == null) {
                        return true;
                    }
                    this.f7642d.a(oVar2.f7699a, oVar2.f7700b, oVar2.f7701c);
                    return true;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    g gVar2 = this.f7642d;
                    g.a(gVar2, gVar2.q, aVar, false, 4);
                    return true;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    if (this.f7642d.i()) {
                        g gVar3 = this.f7642d;
                        g.a(gVar3, gVar3.u, null, false, 6);
                        return true;
                    }
                    g gVar4 = this.f7642d;
                    g.a(gVar4, gVar4.q, null, false, 6);
                    return true;
                default:
                    return super.a(aVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar, String str) {
            super(gVar, str);
            this.f7642d = gVar;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.a.g$g  reason: collision with other inner class name */
    public static final class C0107g extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f7653d;

        static {
            Covode.recordClassIndex(3770);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final boolean a(a aVar) {
            h.f.b.l.d(aVar, "");
            if (i.f7667a[aVar.ordinal()] != 1) {
                return super.a(aVar);
            }
            return true;
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void b(b bVar) {
            h.f.b.l.d(bVar, "");
            super.b(bVar);
            if (h.f.b.l.a(bVar, this.f7653d.q)) {
                this.f7653d.a().c();
            }
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void a(b bVar) {
            h.f.b.l.d(bVar, "");
            super.a(bVar);
            this.f7653d.a().d();
            com.bytedance.android.livesdk.ap.b<Integer> bVar2 = com.bytedance.android.livesdk.ap.a.B;
            h.f.b.l.b(bVar2, "");
            com.bytedance.android.livesdk.s.g gVar = this.f7653d.a().f21115a;
            h.f.b.l.b(gVar, "");
            com.bytedance.android.livesdk.ap.c.a(bVar2, Integer.valueOf(gVar.f21113g));
            com.bytedance.android.livesdk.ap.b<Integer> bVar3 = com.bytedance.android.livesdk.ap.a.C;
            h.f.b.l.b(bVar3, "");
            com.bytedance.android.livesdk.s.g gVar2 = this.f7653d.a().f21115a;
            h.f.b.l.b(gVar2, "");
            com.bytedance.android.livesdk.ap.c.a(bVar3, Integer.valueOf(gVar2.f21114h));
            this.f7653d.b(false);
            this.f7653d.e().b();
            Iterator<T> it = this.f7653d.f7637m.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0107g(g gVar, String str) {
            super(gVar, str);
            this.f7653d = gVar;
        }
    }

    public final void b(boolean z2) {
        com.bytedance.android.livesdk.s.h hVar = this.f7627c;
        if (hVar == null) {
            h.f.b.l.a("msgWindow");
        }
        hVar.d();
        if (z2) {
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.cq;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) 1);
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public a f7638a;

        /* renamed from: b  reason: collision with root package name */
        public final String f7639b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f7640c;

        static {
            Covode.recordClassIndex(3761);
        }

        public void a(b bVar) {
            h.f.b.l.d(bVar, "");
        }

        public void b(b bVar) {
            h.f.b.l.d(bVar, "");
        }

        public boolean a(a aVar) {
            h.f.b.l.d(aVar, "");
            int i2 = h.f7666a[aVar.ordinal()];
            if (i2 == 1) {
                g gVar = this.f7640c;
                g.a(gVar, gVar.o, null, false, 6);
            } else if (i2 == 2) {
                g gVar2 = this.f7640c;
                g.a(gVar2, gVar2.p, null, false, 6);
            } else if (i2 == 3) {
                g gVar3 = this.f7640c;
                g.a(gVar3, gVar3.r, null, false, 6);
            } else if (i2 != 4) {
                return false;
            } else {
                g gVar4 = this.f7640c;
                g.a(gVar4, gVar4.q, null, false, 6);
            }
            return true;
        }

        public b(g gVar, String str) {
            h.f.b.l.d(str, "");
            this.f7640c = gVar;
            this.f7639b = str;
        }
    }

    public static final class c extends b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f7641d;

        static {
            Covode.recordClassIndex(3762);
        }

        @Override // com.bytedance.android.live.broadcast.bgbroadcast.a.g.b
        public final void a(b bVar) {
            h.f.b.l.d(bVar, "");
            super.a(bVar);
            this.f7641d.a().a();
            this.f7641d.c().a();
            this.f7641d.e().f();
            Iterator<T> it = this.f7641d.f7637m.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, String str) {
            super(gVar, str);
            this.f7641d = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f7663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.s.h f7664b;

        static {
            Covode.recordClassIndex(3779);
        }

        l(g gVar, com.bytedance.android.livesdk.s.h hVar) {
            this.f7663a = gVar;
            this.f7664b = hVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.d(valueAnimator, "");
            com.bytedance.android.livesdk.s.g gVar = this.f7664b.f21115a;
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            gVar.a(((Integer) animatedValue).intValue());
            this.f7663a.h();
        }
    }

    private final void c(boolean z2) {
        if (z2) {
            com.bytedance.android.livesdk.s.h hVar = this.f7625a;
            if (hVar == null) {
                h.f.b.l.a("ctrlWindow");
            }
            com.bytedance.android.livesdk.s.g gVar = hVar.f21115a;
            if (gVar != null) {
                gVar.c((int) i.a.a.a.a.b.a(166.0f), (int) i.a.a.a.a.b.a(96.0f));
                return;
            }
            return;
        }
        com.bytedance.android.livesdk.s.h hVar2 = this.f7625a;
        if (hVar2 == null) {
            h.f.b.l.a("ctrlWindow");
        }
        com.bytedance.android.livesdk.s.g gVar2 = hVar2.f21115a;
        if (gVar2 != null) {
            gVar2.c((int) i.a.a.a.a.b.a(36.0f), (int) i.a.a.a.a.b.a(36.0f));
        }
    }

    public final void a(a aVar) {
        h.f.b.l.d(aVar, "");
        if (h.f.b.l.a(this.n, this.r)) {
            com.bytedance.android.live.core.c.a.a(6, "GameUiStateMachine", "stateMachine is destroy, cmd=".concat(String.valueOf(aVar)));
        } else if (!this.n.a(aVar)) {
            com.bytedance.android.live.core.c.a.a(6, "GameUiStateMachine", "not handleCommand, state=" + this.n + ", cmd=" + aVar);
        }
    }

    public final void b(a aVar) {
        if (aVar == a.CMD_ORIENTATION_CHANGED) {
            Object param = aVar.getParam();
            if (!(param instanceof n)) {
                param = null;
            }
            n nVar = (n) param;
            if (nVar != null) {
                r rVar = this.f7629e;
                if (rVar == null) {
                    h.f.b.l.a("trayView");
                }
                int i2 = nVar.f7698b;
                if (i2 > 0) {
                    rVar.a(rVar.f21113g - i2);
                } else {
                    rVar.a(rVar.f21113g + rVar.f7712b);
                }
                rVar.f7712b = i2;
                this.z = nVar.f7698b;
                this.y = nVar.f7697a;
            }
            com.bytedance.android.livesdk.s.h hVar = this.f7625a;
            if (hVar == null) {
                h.f.b.l.a("ctrlWindow");
            }
            hVar.f21115a.b(this.f7633i);
        }
    }

    public final void a(Integer num) {
        if (f()) {
            if (num != null) {
                com.bytedance.android.live.publicscreen.a.c.b bVar = this.f7628d;
                if (bVar == null) {
                    h.f.b.l.a("msgView");
                }
                bVar.setState(num.intValue());
            }
            com.bytedance.android.livesdk.s.h hVar = this.f7627c;
            if (hVar == null) {
                h.f.b.l.a("msgWindow");
            }
            if (!hVar.f21125k) {
                com.bytedance.android.livesdk.s.h hVar2 = this.f7627c;
                if (hVar2 == null) {
                    h.f.b.l.a("msgWindow");
                }
                hVar2.c();
                h();
                com.bytedance.android.livesdk.ap.b<Integer> bVar2 = com.bytedance.android.livesdk.ap.a.cq;
                h.f.b.l.b(bVar2, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) 0);
                a(true, false);
            }
        }
    }

    public final void a(boolean z2) {
        com.bytedance.android.live.broadcast.bgbroadcast.a.a.a aVar = this.f7626b;
        if (aVar == null) {
            h.f.b.l.a("ctrlView");
        }
        if (aVar.a() != z2) {
            if (z2) {
                com.bytedance.android.live.broadcast.bgbroadcast.a.a.a aVar2 = this.f7626b;
                if (aVar2 == null) {
                    h.f.b.l.a("ctrlView");
                }
                aVar2.f7607c.setVisibility(0);
                c(true);
                return;
            }
            com.bytedance.android.live.broadcast.bgbroadcast.a.a.a aVar3 = this.f7626b;
            if (aVar3 == null) {
                h.f.b.l.a("ctrlView");
            }
            aVar3.f7607c.setVisibility(8);
            c(false);
        }
    }

    public final void a(com.bytedance.android.livesdk.s.h hVar, int i2, int i3) {
        ValueAnimator ofInt = ObjectAnimator.ofInt(i2, i3);
        h.f.b.l.b(ofInt, "");
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(200L).start();
        ofInt.addUpdateListener(new l(this, hVar));
        ofInt.addListener(new m(this));
    }

    public final void a(com.bytedance.android.livesdk.s.h hVar, com.bytedance.android.livesdk.s.h hVar2, r rVar) {
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(hVar2, "");
        h.f.b.l.d(rVar, "");
        this.f7625a = hVar;
        View e2 = hVar.e();
        Objects.requireNonNull(e2, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.bgbroadcast.game.floatwindow.LiveGameControlView");
        this.f7626b = (com.bytedance.android.live.broadcast.bgbroadcast.a.a.a) e2;
        this.f7627c = hVar2;
        View e3 = hVar2.e();
        Objects.requireNonNull(e3, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.api.game.GameMessageView");
        this.f7628d = (com.bytedance.android.live.publicscreen.a.c.b) e3;
        this.f7629e = rVar;
    }

    static void a(com.bytedance.android.livesdk.s.h hVar, com.bytedance.android.livesdk.s.h hVar2, int i2, int i3) {
        if (hVar != null && hVar.f21125k && hVar2 != null && hVar2.f21125k) {
            com.bytedance.android.livesdk.s.g gVar = hVar.f21115a;
            h.f.b.l.b(gVar, "");
            float f2 = (float) gVar.f21113g;
            com.bytedance.android.livesdk.s.g gVar2 = hVar.f21115a;
            h.f.b.l.b(gVar2, "");
            float f3 = (float) gVar2.f21114h;
            hVar2.f21115a.a((int) (f2 + ((float) i2)));
            hVar2.f21115a.b((int) (f3 + ((float) i3)));
        }
    }

    static /* synthetic */ void a(g gVar, b bVar, a aVar, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            aVar = null;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        k kVar = new k(gVar, bVar, aVar);
        if (z2) {
            gVar.x.post(new i(kVar));
        } else {
            kVar.invoke();
        }
    }
}

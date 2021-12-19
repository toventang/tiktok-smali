package com.ss.android.ugc.gamora.editor.progressbar;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import com.bytedance.f.a.a.h;
import com.ss.android.ugc.aweme.property.ad;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;
import h.f.b.m;

public final class c implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public int f146336a;

    /* renamed from: b  reason: collision with root package name */
    public final a f146337b;

    /* renamed from: c  reason: collision with root package name */
    public int f146338c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f146339d;

    /* renamed from: e  reason: collision with root package name */
    private long f146340e;

    /* renamed from: f  reason: collision with root package name */
    private long f146341f;

    /* renamed from: g  reason: collision with root package name */
    private float f146342g;

    /* renamed from: h  reason: collision with root package name */
    private float f146343h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f146344i;

    /* renamed from: j  reason: collision with root package name */
    private final int f146345j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f146346k = h.i.a((h.f.a.a) C3914c.f146351a);

    /* renamed from: l  reason: collision with root package name */
    private final h.h f146347l = h.i.a((h.f.a.a) e.f146353a);

    /* renamed from: m  reason: collision with root package name */
    private final h.h f146348m = h.i.a((h.f.a.a) h.f146356a);
    private final h.h n = h.i.a((h.f.a.a) g.f146355a);
    private final h.h o = h.i.a((h.f.a.a) d.f146352a);
    private final h.h p = h.i.a((h.f.a.a) a.f146349a);
    private final h.h q = h.i.a((h.f.a.a) i.f146357a);
    private final h.h r = h.i.a((h.f.a.a) new f(this));
    private final h.h s = h.i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(96200);
    }

    private final boolean c() {
        return ((Boolean) this.f146346k.getValue()).booleanValue();
    }

    private final Handler d() {
        return (Handler) this.f146347l.getValue();
    }

    private int e() {
        return ((Number) this.f146348m.getValue()).intValue();
    }

    private final Runnable f() {
        return (Runnable) this.r.getValue();
    }

    private final Runnable g() {
        return (Runnable) this.s.getValue();
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar) {
        l.d(bVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(com.ss.android.ugc.tools.utils.a.b bVar, float f2, float f3) {
        l.d(bVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(com.ss.android.ugc.tools.utils.a.c cVar) {
        l.d(cVar, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void b(com.ss.android.ugc.tools.utils.a.b bVar) {
        l.d(bVar, "");
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b() {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(ScaleGestureDetector scaleGestureDetector) {
        l.d(scaleGestureDetector, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(float f2) {
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean d(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean f(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        return false;
    }

    static final class b extends m implements h.f.a.a<Runnable> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96202);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.gamora.editor.progressbar.c.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f146350a;

                static {
                    Covode.recordClassIndex(96203);
                }

                {
                    this.f146350a = r1;
                }

                public final void run() {
                    this.f146350a.this$0.f146337b.a(-1);
                }
            };
        }
    }

    static final class f extends m implements h.f.a.a<Runnable> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(96207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Runnable invoke() {
            return new Runnable(this) {
                /* class com.ss.android.ugc.gamora.editor.progressbar.c.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f146354a;

                static {
                    Covode.recordClassIndex(96208);
                }

                {
                    this.f146354a = r1;
                }

                public final void run() {
                    this.f146354a.this$0.f146337b.a(this.f146354a.this$0.f146336a);
                }
            };
        }
    }

    static final class a extends m implements h.f.a.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f146349a = new a();

        static {
            Covode.recordClassIndex(96201);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(r.a(70.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.progressbar.c$c  reason: collision with other inner class name */
    static final class C3914c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3914c f146351a = new C3914c();

        static {
            Covode.recordClassIndex(96204);
        }

        C3914c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(ad.c());
        }
    }

    static final class d extends m implements h.f.a.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f146352a = new d();

        static {
            Covode.recordClassIndex(96205);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(r.a(50.0f));
        }
    }

    static final class e extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f146353a = new e();

        static {
            Covode.recordClassIndex(96206);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class g extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f146355a = new g();

        static {
            Covode.recordClassIndex(96209);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(r.b(com.ss.android.ugc.aweme.port.in.i.f115645a));
        }
    }

    static final class h extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f146356a = new h();

        static {
            Covode.recordClassIndex(96210);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(r.a(com.ss.android.ugc.aweme.port.in.i.f115645a));
        }
    }

    static final class i extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f146357a = new i();

        static {
            Covode.recordClassIndex(96211);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.ss.android.ugc.aweme.adaptation.a.c());
        }
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean c(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (this.f146341f - this.f146340e >= 150) {
            return true;
        }
        this.f146337b.e();
        return true;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final void e(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        int i2 = 1;
        if (action == 0) {
            this.f146340e = System.currentTimeMillis();
            this.f146342g = x;
            this.f146343h = y;
            this.f146344i = false;
            this.f146339d = false;
            if (c()) {
                if (motionEvent.getX() >= ((float) (e() / 2))) {
                    i2 = 0;
                }
                this.f146336a = i2;
                d().postDelayed(f(), 300);
            }
        } else if (action == 1) {
            this.f146341f = System.currentTimeMillis();
            if (c()) {
                d().removeCallbacks(f());
                if (this.f146341f - this.f146340e > 150 && !this.f146339d) {
                    d().post(g());
                }
            }
            if (d.b() && this.f146344i) {
                this.f146337b.b(3, 0);
            }
        } else if (action != 2 || !c()) {
        } else {
            if (Math.abs(x - this.f146342g) > 50.0f || Math.abs(y - this.f146343h) > 50.0f) {
                d().removeCallbacks(f());
                d().post(g());
                this.f146339d = true;
            }
        }
    }

    public c(a aVar, int i2) {
        l.d(aVar, "");
        this.f146337b = aVar;
        this.f146338c = i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(com.ss.android.ugc.asve.a.b());
        l.b(viewConfiguration, "");
        this.f146345j = viewConfiguration.getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        if (!d.b()) {
            return false;
        }
        return this.f146344i;
    }

    @Override // com.bytedance.f.a.a.h.a
    public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        int i2;
        float f4;
        float floatValue;
        float x;
        l.d(motionEvent, "");
        l.d(motionEvent2, "");
        if (!d.b()) {
            return false;
        }
        if (this.f146344i) {
            if (gb.a()) {
                x = 100.0f - ((motionEvent2.getX() * 100.0f) / ((float) e()));
            } else {
                x = (motionEvent2.getX() * 100.0f) / ((float) e());
            }
            this.f146337b.b(2, (int) x);
            return true;
        }
        int x2 = (int) motionEvent.getX();
        int x3 = (int) motionEvent2.getX();
        int y = (int) motionEvent2.getY();
        if (this.f146338c < 0) {
            this.f146338c = ((Number) this.n.getValue()).intValue() - ((Number) this.q.getValue()).intValue();
        }
        int i3 = this.f146338c;
        if (ad.d()) {
            f4 = (float) i3;
            floatValue = ((Number) this.o.getValue()).floatValue();
        } else if (ad.e()) {
            f4 = (float) i3;
            floatValue = ((Number) this.p.getValue()).floatValue();
        } else {
            i2 = i3;
            if (i2 < i3 || y > i3 || y < i2 || Math.abs(x2 - x3) < this.f146345j) {
                return false;
            }
            this.f146337b.b(1, 0);
            this.f146344i = true;
            return true;
        }
        i2 = (int) (f4 - floatValue);
        if (i2 < i3) {
        }
        return false;
    }
}

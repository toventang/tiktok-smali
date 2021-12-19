package com.ss.android.ugc.aweme.g.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.g.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    final ViewGroup f98934a;

    /* renamed from: b  reason: collision with root package name */
    public final e f98935b;

    /* renamed from: c  reason: collision with root package name */
    public final f f98936c;

    /* renamed from: d  reason: collision with root package name */
    public final f f98937d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f98938e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f98939f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f98940g;

    /* renamed from: h  reason: collision with root package name */
    public final Context f98941h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewGroup f98942i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f98943j = true;

    static {
        Covode.recordClassIndex(62905);
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void a() {
        this.f98943j = false;
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void d() {
        g();
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void f() {
        g();
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void b() {
        this.f98935b.b(e.a.b.f98989a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.g.a.a$a  reason: collision with other inner class name */
    public static final class C2409a extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(62907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2409a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f98936c.c(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.g.a.a.C2409a.AnonymousClass1 */
                final /* synthetic */ C2409a this$0;

                static {
                    Covode.recordClassIndex(62908);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.f98935b.a(e.a.C2411a.f98988a);
                    this.this$0.this$0.f98938e = false;
                    this.this$0.this$0.f98940g = false;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(62909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f98937d.a(new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.g.a.a.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(62910);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ z invoke() {
                    this.this$0.this$0.f98938e = true;
                    this.this$0.this$0.f98939f = false;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    private final void g() {
        if (this.f98938e && !this.f98940g) {
            this.f98934a.clearAnimation();
            this.f98940g = true;
            this.f98937d.c(new C2409a(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void c() {
        View findViewById = this.f98934a.findViewById(R.id.e_0);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.f98935b.a(e.a.C2411a.f98988a);
    }

    @Override // com.ss.android.ugc.aweme.g.a.g
    public final void e() {
        if (!this.f98938e && !this.f98939f) {
            this.f98934a.clearAnimation();
            this.f98935b.b(e.a.b.f98989a);
            this.f98939f = true;
            this.f98936c.a(new b(this));
        }
    }

    public static final class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f98945a;

        static {
            Covode.recordClassIndex(62911);
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f98945a = aVar;
        }

        public final void onAnimationEnd(Animation animation) {
            if (!this.f98945a.f98938e) {
                this.f98945a.f98935b.a(e.a.C2411a.f98988a);
            }
        }
    }

    public a(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        l.d(viewGroup, "");
        this.f98941h = context;
        this.f98942i = viewGroup;
        View findViewById = viewGroup.findViewById(R.id.e9v);
        l.b(findViewById, "");
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        this.f98934a = viewGroup2;
        this.f98935b = new b(context, viewGroup2);
        this.f98936c = new d(context, viewGroup2);
        this.f98937d = new c(context, viewGroup2);
        viewGroup2.setOnTouchListener(new View.OnTouchListener(this) {
            /* class com.ss.android.ugc.aweme.g.a.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f98944a;

            static {
                Covode.recordClassIndex(62906);
            }

            {
                this.f98944a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                MethodCollector.i(3290);
                l.b(motionEvent, "");
                int action = motionEvent.getAction();
                if (action == 0) {
                    a aVar = this.f98944a;
                    aVar.f98934a.clearAnimation();
                    if (!aVar.f98938e) {
                        aVar.f98935b.b(e.a.b.f98989a);
                    }
                    aVar.f98934a.startAnimation(AnimationUtils.loadAnimation(aVar.f98941h, R.anim.b3));
                } else if (action == 1) {
                    a aVar2 = this.f98944a;
                    aVar2.f98934a.clearAnimation();
                    Animation loadAnimation = AnimationUtils.loadAnimation(aVar2.f98941h, R.anim.b4);
                    loadAnimation.setAnimationListener(new c(aVar2));
                    aVar2.f98934a.startAnimation(loadAnimation);
                }
                MethodCollector.o(3290);
                return false;
            }
        });
    }
}

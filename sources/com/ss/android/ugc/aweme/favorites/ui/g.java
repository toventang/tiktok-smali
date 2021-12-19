package com.ss.android.ugc.aweme.favorites.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.e.j;
import com.ss.android.ugc.aweme.favorites.ui.ae;
import com.ss.android.ugc.aweme.favorites.ui.ah;
import com.ss.android.ugc.aweme.metrics.i;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.v;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class g extends PopupWindow {

    /* renamed from: c  reason: collision with root package name */
    public static final a f90872c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final androidx.fragment.app.e f90873a;

    /* renamed from: b  reason: collision with root package name */
    public final String f90874b;

    /* renamed from: d  reason: collision with root package name */
    private final String f90875d;

    static {
        Covode.recordClassIndex(57120);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57126);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f90881a;

        static {
            Covode.recordClassIndex(57127);
        }

        b(g gVar) {
            this.f90881a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f90881a.dismiss();
        }
    }

    public static final class e implements o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f90886a;

        static {
            Covode.recordClassIndex(57130);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f90886a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.favorites.ui.o
        public final void a(boolean z, com.ss.android.ugc.aweme.favorites.api.d dVar) {
            l.d(dVar, "");
            this.f90886a.a(!z, dVar);
        }
    }

    public static final class f implements ah.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f90887a;

        static {
            Covode.recordClassIndex(57131);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(g gVar) {
            this.f90887a = gVar;
        }

        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f90890a;

            static {
                Covode.recordClassIndex(57133);
            }

            b(f fVar) {
                this.f90890a = fVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                new com.bytedance.tux.g.b(this.f90890a.f90887a.f90873a).e(R.string.bp3).b();
            }
        }

        static final class a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f90888a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f90889b;

            static {
                Covode.recordClassIndex(57132);
            }

            a(f fVar, String str) {
                this.f90888a = fVar;
                this.f90889b = str;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                new i().a(this.f90888a.f90887a.f90874b).a((Integer) 0).f();
                this.f90888a.f90887a.a(false, new com.ss.android.ugc.aweme.favorites.api.d(((com.ss.android.ugc.aweme.favorites.api.g) obj).f90469a, this.f90889b, null, null, 28));
            }
        }

        @Override // com.ss.android.ugc.aweme.favorites.ui.ah.b
        public final void a(String str) {
            l.d(str, "");
            new j().f90621b.a(new com.ss.android.ugc.aweme.favorites.api.f(1, null, str, null, null, null, null, null, 250)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a(this, str), new b(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f90885a;

        static {
            Covode.recordClassIndex(57129);
        }

        d(g gVar) {
            this.f90885a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            new com.bytedance.tux.g.b(this.f90885a.f90873a).e(R.string.bp3).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f90882a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f90883b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.favorites.api.d f90884c;

        static {
            Covode.recordClassIndex(57128);
        }

        c(g gVar, boolean z, com.ss.android.ugc.aweme.favorites.api.d dVar) {
            this.f90882a = gVar;
            this.f90883b = z;
            this.f90884c = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f90883b) {
                r.a("collection_add_videos", v.a(this.f90882a.f90874b, "enter_from"), v.a(this.f90884c.f90449a, "collection_id"));
            }
            com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f90882a.f90873a);
            String string = this.f90882a.f90873a.getString(R.string.btd);
            l.b(string, "");
            String a2 = com.a.a(string, Arrays.copyOf(new Object[]{this.f90884c.f90450b}, 1));
            l.b(a2, "");
            bVar.a(a2).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
        }
    }

    public final void a(boolean z, com.ss.android.ugc.aweme.favorites.api.d dVar) {
        new j().f90621b.a(new com.ss.android.ugc.aweme.favorites.api.f(10, dVar.f90449a, null, null, null, n.a(this.f90875d), null, null, 220)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, z, dVar), new d(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(androidx.fragment.app.e eVar, String str, String str2) {
        super(eVar);
        l.d(eVar, "");
        l.d(str, "");
        l.d(str2, "");
        MethodCollector.i(9006);
        this.f90873a = eVar;
        this.f90875d = str;
        this.f90874b = str2;
        setContentView(LayoutInflater.from(eVar).inflate(R.layout.a07, (ViewGroup) null));
        getContentView().setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.favorites.ui.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f90876a;

            static {
                Covode.recordClassIndex(57121);
            }

            {
                this.f90876a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f90876a.dismiss();
                r.a("click_collection_banner", v.a(this.f90876a.f90874b, "enter_from"));
                new j().f90621b.a(0, (String) null).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.favorites.ui.g.AnonymousClass1.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f90877a;

                    static {
                        Covode.recordClassIndex(57122);
                    }

                    {
                        this.f90877a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        com.ss.android.ugc.aweme.favorites.api.e eVar = (com.ss.android.ugc.aweme.favorites.api.e) obj;
                        List<com.ss.android.ugc.aweme.favorites.api.d> list = eVar.f90457a;
                        if (list == null || list.isEmpty()) {
                            g gVar = this.f90877a.f90876a;
                            androidx.fragment.app.e eVar2 = this.f90877a.f90876a.f90873a;
                            new com.ss.android.ugc.aweme.metrics.n().a(gVar.f90874b).f();
                            androidx.fragment.app.i supportFragmentManager = gVar.f90873a.getSupportFragmentManager();
                            l.b(supportFragmentManager, "");
                            String string = eVar2.getString(R.string.btc);
                            l.b(string, "");
                            String string2 = eVar2.getString(R.string.ffv);
                            l.b(string2, "");
                            ah.a.a(supportFragmentManager, string, string2, new f(gVar));
                            return;
                        }
                        g gVar2 = this.f90877a.f90876a;
                        ae.a.a(gVar2.f90873a, false, null, gVar2.f90874b, eVar.f90457a.size(), new e(gVar2));
                    }
                }, AnonymousClass2.f90878a);
            }
        });
        setWidth(com.bytedance.common.utility.n.a(eVar));
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setTouchInterceptor(new View.OnTouchListener(this) {
            /* class com.ss.android.ugc.aweme.favorites.ui.g.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f90879a;

            static {
                Covode.recordClassIndex(57124);
            }

            {
                this.f90879a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                l.b(motionEvent, "");
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                this.f90879a.dismiss();
                return true;
            }
        });
        setAnimationStyle(R.style.we);
        final f.a.b.b d2 = t.b(5, TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new b(this));
        setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.ss.android.ugc.aweme.favorites.ui.g.AnonymousClass3 */

            static {
                Covode.recordClassIndex(57125);
            }

            public final void onDismiss() {
                f.a.b.b bVar = d2;
                l.b(bVar, "");
                if (!bVar.isDisposed()) {
                    d2.dispose();
                }
            }
        });
        MethodCollector.o(9006);
    }
}

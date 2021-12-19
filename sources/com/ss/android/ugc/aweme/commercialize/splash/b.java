package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.d.a.a.a.b.c;
import com.d.a.a.a.b.e;
import com.d.a.a.a.b.f;
import com.d.a.a.a.b.h;
import com.d.a.a.a.b.j;
import com.d.a.a.a.b.k;
import com.ss.android.ad.splash.core.e.o;
import com.ss.android.ugc.aweme.commerce.a.i;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public final class b implements com.ss.android.ad.splash.core.i.a {

    /* renamed from: a  reason: collision with root package name */
    a f75273a;

    /* renamed from: b  reason: collision with root package name */
    private Context f75274b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f75275c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private boolean f75276d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f75277e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f75278f = true;

    static {
        Covode.recordClassIndex(46463);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final boolean f75279a;

        /* renamed from: b  reason: collision with root package name */
        com.d.a.a.a.b.b f75280b;

        /* renamed from: c  reason: collision with root package name */
        com.d.a.a.a.b.a.b f75281c;

        static {
            Covode.recordClassIndex(46464);
        }

        public final void a() {
            com.d.a.a.a.b.b bVar = this.f75280b;
            if (bVar != null) {
                bVar.b();
                this.f75280b = null;
            }
        }

        a(com.ss.android.ad.splash.c.a aVar) {
            f fVar;
            this.f75279a = aVar.r();
            if (aVar.B() != null) {
                try {
                    j a2 = j.a("Bytedance", d.i());
                    String a3 = i.a(d.a());
                    o B = aVar.B();
                    ArrayList arrayList = new ArrayList();
                    for (o.a aVar2 : B.f58518a) {
                        arrayList.add(k.a(aVar2.f58519a, new URL(aVar2.f58520b), aVar2.f58521c));
                    }
                    com.d.a.a.a.e.d.a(a2, "Partner is null");
                    com.d.a.a.a.e.d.a((Object) a3, "OM SDK JS script content is null");
                    com.d.a.a.a.e.d.a(arrayList, "VerificationScriptResources is null");
                    com.d.a.a.a.b.d dVar = new com.d.a.a.a.b.d(a2, a3, arrayList, null, e.NATIVE);
                    if (aVar.r()) {
                        fVar = f.VIDEO;
                    } else {
                        fVar = f.NATIVE_DISPLAY;
                    }
                    h hVar = h.BEGIN_TO_RENDER;
                    com.d.a.a.a.b.i iVar = com.d.a.a.a.b.i.NATIVE;
                    this.f75280b = com.d.a.a.a.b.b.a(c.a(fVar, hVar, iVar, iVar), dVar);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void a() {
        a aVar = this.f75273a;
        if (aVar != null && aVar.f75280b != null && aVar.f75281c != null) {
            aVar.f75281c.a();
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void b() {
        a aVar = this.f75273a;
        if (aVar != null && aVar.f75280b != null && aVar.f75281c != null) {
            aVar.f75281c.b();
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void c() {
        a aVar = this.f75273a;
        if (aVar != null && aVar.f75280b != null && aVar.f75281c != null) {
            aVar.f75281c.c();
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void d() {
        a aVar = this.f75273a;
        if (aVar != null) {
            if (!(aVar.f75280b == null || aVar.f75281c == null)) {
                aVar.f75281c.d();
            }
            this.f75276d = true;
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void e() {
        a aVar = this.f75273a;
        if (aVar != null && aVar.f75280b != null && aVar.f75281c != null) {
            aVar.f75281c.e();
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void f() {
        a aVar = this.f75273a;
        if (aVar != null && aVar.f75280b != null && aVar.f75281c != null) {
            aVar.f75281c.f();
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void g() {
        a aVar = this.f75273a;
        if (aVar != null && !this.f75277e) {
            if (!(aVar.f75280b == null || aVar.f75281c == null)) {
                aVar.f75281c.g();
            }
            this.f75277e = true;
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void h() {
        a aVar = this.f75273a;
        if (aVar != null) {
            this.f75276d = true;
            if (aVar.f75280b != null && aVar.f75281c != null) {
                aVar.f75281c.a(com.d.a.a.a.b.a.a.CLICK);
            }
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void i() {
        if (this.f75273a != null) {
            int a2 = com.ss.android.ugc.aweme.commercialize.f.a.a();
            if (a2 > 0) {
                if (!this.f75276d) {
                    g();
                }
                if (!this.f75278f) {
                    a2 = 0;
                }
                this.f75275c.postDelayed(new c(this), (long) (a2 * 1000));
                return;
            }
            this.f75273a.a();
            this.f75273a = null;
        }
    }

    public b(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f75274b = applicationContext;
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void a(long j2) {
        a aVar = this.f75273a;
        if (aVar != null && aVar.f75280b != null && aVar.f75281c != null) {
            aVar.f75281c.a((float) j2, 0.0f);
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void a(com.ss.android.ad.splash.c.a aVar) {
        Context context = this.f75274b;
        if (!com.d.a.a.a.a.f46317a.f46366a) {
            com.d.a.a.a.a.a(context);
        }
        if (com.d.a.a.a.a.f46317a.f46366a) {
            if (this.f75273a != null) {
                i();
            }
            this.f75273a = new a(aVar);
            this.f75278f = aVar.r();
            this.f75276d = false;
            this.f75277e = false;
        }
    }

    @Override // com.ss.android.ad.splash.core.i.a
    public final void a(View view, List<View> list) {
        a aVar = this.f75273a;
        if (!(aVar == null || aVar.f75280b == null)) {
            aVar.f75280b.a(view);
            if (list != null) {
                for (View view2 : list) {
                    aVar.f75280b.b(view2);
                }
            }
            if (aVar.f75279a) {
                aVar.f75281c = com.d.a.a.a.b.a.b.a(aVar.f75280b);
            }
            aVar.f75280b.a();
            com.d.a.a.a.b.a a2 = com.d.a.a.a.b.a.a(aVar.f75280b);
            a2.a(com.d.a.a.a.b.a.d.a(com.d.a.a.a.b.a.c.STANDALONE));
            a2.a();
        }
    }
}

package com.ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.c;
import com.ss.android.ugc.aweme.lancet.ssretrofitchain.g;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f107245a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(68602);
    }

    public static final class b extends com.ss.android.ugc.aweme.secapi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f107250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f107251b;

        static {
            Covode.recordClassIndex(68605);
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a() {
            this.f107250a.f107245a.set(false);
        }

        b(a aVar, String str) {
            this.f107250a = aVar;
            this.f107251b = str;
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a(boolean z, int i2) {
            if (z) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.base.d.a(this.f107251b));
            }
            this.f107250a.f107245a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$a  reason: collision with other inner class name */
    static final class RunnableC2755a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f107246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f107247b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f107248c;

        static {
            Covode.recordClassIndex(68603);
        }

        RunnableC2755a(a aVar, int i2, String str) {
            this.f107246a = aVar;
            this.f107247b = i2;
            this.f107248c = str;
        }

        public final void run() {
            Activity j2 = f.j();
            if (j2 != null) {
                this.f107246a.a(j2, this.f107247b, this.f107248c);
            } else {
                new Handler().postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.lancet.ssretrofitchain.a.RunnableC2755a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ RunnableC2755a f107249a;

                    static {
                        Covode.recordClassIndex(68604);
                    }

                    {
                        this.f107249a = r1;
                    }

                    public final void run() {
                        Activity j2 = f.j();
                        if (j2 != null) {
                            this.f107249a.f107246a.a(j2, this.f107249a.f107247b, this.f107249a.f107248c);
                        } else {
                            this.f107249a.f107246a.f107245a.set(false);
                        }
                    }
                }, 1000);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(cVar);
        l.d(cVar, "");
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f107253a;

        static {
            Covode.recordClassIndex(68607);
        }

        d(a aVar) {
            this.f107253a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f107253a.f107245a.set(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f107252a;

        static {
            Covode.recordClassIndex(68606);
        }

        c(a aVar) {
            this.f107252a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.account.b.b().logout("expired_logout", "sdk_expired_logout");
            this.f107252a.f107245a.set(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f107254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f107255b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f107256c;

        static {
            Covode.recordClassIndex(68608);
        }

        e(a aVar, Activity activity, String str) {
            this.f107254a = aVar;
            this.f107255b = activity;
            this.f107256c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            bo b2 = com.ss.android.ugc.aweme.account.b.b();
            IAccountService.d dVar = new IAccountService.d();
            dVar.f62401a = this.f107255b;
            dVar.f62405e = new IAccountService.g(this) {
                /* class com.ss.android.ugc.aweme.lancet.ssretrofitchain.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f107257a;

                static {
                    Covode.recordClassIndex(68609);
                }

                {
                    this.f107257a = r1;
                }

                @Override // com.ss.android.ugc.aweme.IAccountService.g
                public final void onResult(int i2, int i3, Object obj) {
                    a aVar = this.f107257a.f107254a;
                    if (i2 == 1 && i3 == 1) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.base.d.a(this.f107257a.f107256c));
                    }
                    aVar.f107245a.set(false);
                }
            };
            b2.showLoginAndRegisterView(dVar.a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.lancet.ssretrofitchain.c
    public final c.a a(g gVar, Request request, u<?> uVar) {
        g.a aVar;
        String str;
        g.a aVar2;
        g.a aVar3;
        if (gVar == null || ((((aVar = gVar.f107266a) == null || aVar.f107268a != 3070) && (((aVar2 = gVar.f107266a) == null || aVar2.f107268a != 3071) && ((aVar3 = gVar.f107266a) == null || aVar3.f107268a != 3072))) || !this.f107245a.compareAndSet(false, true))) {
            c.a aVar4 = b.f107258a;
            l.b(aVar4, "");
            return aVar4;
        }
        int i2 = gVar.f107266a.f107268a;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC2755a(this, i2, str));
        return new c.a(true, false);
    }

    public final void a(Activity activity, int i2, String str) {
        l.d(activity, "");
        if (i2 == 3070 || i2 == 3072) {
            SecApiImpl.a().popCaptcha(activity, i2, new b(this, str));
        } else if (i2 == 3071) {
            a.C0731a aVar = new a.C0731a(activity);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                aVar.a(R.string.czg).b(R.string.czf).a(R.string.b75, (DialogInterface.OnClickListener) new c(this), false);
            } else {
                aVar.b(R.string.arn).b(R.string.a7u, (DialogInterface.OnClickListener) new d(this), false).a(R.string.aob, (DialogInterface.OnClickListener) new e(this, activity, str), false);
            }
            aVar.a().b().setCancelable(false);
        }
    }
}

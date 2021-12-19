package com.bytedance.bdturing.verify;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.bdturing.b;
import com.bytedance.bdturing.e;
import com.bytedance.bdturing.e.f;
import com.bytedance.bdturing.e.g;
import com.bytedance.bdturing.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class RiskControlService implements a {
    public l mDialogShowing;

    static {
        Covode.recordClassIndex(15607);
    }

    @Override // com.bytedance.bdturing.verify.a
    public final boolean isProcess(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 12;
    }

    public final void dismissVerifyDialog() {
        l lVar = this.mDialogShowing;
        if (lVar != null && lVar.isShowing()) {
            l lVar2 = this.mDialogShowing;
            if (lVar2 == null) {
                h.f.b.l.a();
            }
            lVar2.dismiss();
        }
    }

    public static final class a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RiskControlService f26566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.bdturing.verify.a.a f26567b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f26568c;

        static {
            Covode.recordClassIndex(15608);
        }

        /* renamed from: com.bytedance.bdturing.verify.RiskControlService$a$a  reason: collision with other inner class name */
        static final class RunnableC0564a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f26569a;

            static {
                Covode.recordClassIndex(15609);
            }

            RunnableC0564a(a aVar) {
                this.f26569a = aVar;
            }

            public final void run() {
                e.a();
                this.f26569a.f26566a.mDialogShowing = new l(this.f26569a.f26567b, this.f26569a.f26568c);
                l lVar = this.f26569a.f26566a.mDialogShowing;
                if (lVar != null) {
                    lVar.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                        /* class com.bytedance.bdturing.verify.RiskControlService.a.RunnableC0564a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ RunnableC0564a f26570a;

                        static {
                            Covode.recordClassIndex(15610);
                        }

                        {
                            this.f26570a = r1;
                        }

                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (dialogInterface == this.f26570a.f26569a.f26566a.mDialogShowing) {
                                this.f26570a.f26569a.f26566a.mDialogShowing = null;
                            }
                        }
                    });
                }
                l lVar2 = this.f26569a.f26566a.mDialogShowing;
                if (lVar2 != null) {
                    lVar2.show();
                }
                e.b();
            }
        }

        a(RiskControlService riskControlService, com.bytedance.bdturing.verify.a.a aVar, b bVar) {
            this.f26566a = riskControlService;
            this.f26567b = aVar;
            this.f26568c = bVar;
        }

        @Override // com.bytedance.bdturing.e.f.a
        public final void a(int i2, String str, long j2) {
            Activity activity;
            Activity activity2 = this.f26567b.f26573a;
            if ((activity2 == null || !activity2.isFinishing()) && (activity = this.f26567b.f26573a) != null) {
                activity.runOnUiThread(new RunnableC0564a(this));
            }
        }
    }

    @Override // com.bytedance.bdturing.verify.a
    public final boolean execute(com.bytedance.bdturing.verify.a.a aVar, b bVar) {
        boolean z;
        MethodCollector.i(539);
        h.f.b.l.c(aVar, "");
        h.f.b.l.c(bVar, "");
        l lVar = this.mDialogShowing;
        if (lVar == null || !lVar.isShowing()) {
            g gVar = g.f26485h;
            a aVar2 = new a(this, aVar, bVar);
            h.f.b.l.c(aVar2, "");
            boolean z2 = false;
            if (g.a() > System.currentTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar2.a(200, null, 0);
            } else {
                synchronized (gVar) {
                    try {
                        if (g.f26483f.size() == 0) {
                            z2 = true;
                        }
                        g.f26483f.add(aVar2);
                        if (z2) {
                            g.a(0);
                        }
                    } finally {
                        MethodCollector.o(539);
                    }
                }
            }
            return true;
        }
        com.bytedance.bdturing.g.a("verifyDialog still showing skip this request");
        bVar.a(998);
        MethodCollector.o(539);
        return true;
    }
}

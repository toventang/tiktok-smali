package com.ss.android.ugc.aweme.account.j;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.sdk.a.c;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f63101a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(38865);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f63102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f63103b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63104c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63105d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.base.component.f f63106e;

        static {
            Covode.recordClassIndex(38866);
        }

        a(Activity activity, String str, String str2, String str3, com.ss.android.ugc.aweme.base.component.f fVar) {
            this.f63102a = activity;
            this.f63103b = str;
            this.f63104c = str2;
            this.f63105d = str3;
            this.f63106e = fVar;
        }

        public final void run() {
            String str;
            com.ss.android.sdk.a.b bVar = com.ss.android.sdk.a.b.f60131a;
            String str2 = "";
            l.b(bVar, str2);
            c b2 = bVar.b();
            if (!(b2 == null || (str = b2.f60146l) == null)) {
                str2 = str;
            }
            a.C0731a a2 = new a.C0731a(this.f63102a).a(R.string.a5q);
            a2.f33402b = this.f63103b;
            a2.E = true;
            a2.a(R.string.czd, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC1399a(this, str2), true).b(R.string.cze, (DialogInterface.OnClickListener) new b(this), true).a().c().setCancelable(false);
            r.a("bind_notify", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.f63104c).a("enter_method", this.f63105d).a("platform", str2).f62575a);
        }

        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f63112a;

            static {
                Covode.recordClassIndex(38870);
            }

            b(a aVar) {
                this.f63112a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (!this.f63112a.f63102a.isFinishing()) {
                    dialogInterface.dismiss();
                }
                this.f63112a.f63106e.b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.j.f$a$a  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC1399a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f63107a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f63108b;

            static {
                Covode.recordClassIndex(38867);
            }

            DialogInterface$OnClickListenerC1399a(a aVar, String str) {
                this.f63107a = aVar;
                this.f63108b = str;
            }

            public final void onClick(final DialogInterface dialogInterface, int i2) {
                r.a("bind_notify_confirm", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.f63107a.f63104c).a("enter_method", this.f63107a.f63105d).a("platform", this.f63108b).f62575a);
                cj.h().bindMobileOrEmailAndSetPwd(this.f63107a.f63102a, this.f63107a.f63104c, this.f63107a.f63105d, null, new IAccountService.g(this) {
                    /* class com.ss.android.ugc.aweme.account.j.f.a.DialogInterface$OnClickListenerC1399a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ DialogInterface$OnClickListenerC1399a f63109a;

                    static {
                        Covode.recordClassIndex(38868);
                    }

                    {
                        this.f63109a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.IAccountService.g
                    public final void onResult(int i2, int i3, Object obj) {
                        if (i3 == 1) {
                            if (!this.f63109a.f63107a.f63102a.isFinishing()) {
                                dialogInterface.dismiss();
                            }
                            m.a(new Runnable(this) {
                                /* class com.ss.android.ugc.aweme.account.j.f.a.DialogInterface$OnClickListenerC1399a.AnonymousClass1.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ AnonymousClass1 f63111a;

                                static {
                                    Covode.recordClassIndex(38869);
                                }

                                {
                                    this.f63111a = r1;
                                }

                                public final void run() {
                                    this.f63111a.f63109a.f63107a.f63106e.a();
                                }
                            }, 200);
                        }
                    }
                });
            }
        }
    }

    public static void a(Activity activity, String str, com.ss.android.ugc.aweme.base.component.f fVar, String str2, String str3) {
        l.d(fVar, "");
        l.d(str2, "");
        l.d(str3, "");
        if (activity != null && !TextUtils.isEmpty(str)) {
            activity.runOnUiThread(new a(activity, str, str2, str3, fVar));
        }
    }
}

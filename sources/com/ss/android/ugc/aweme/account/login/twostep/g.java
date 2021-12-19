package com.ss.android.ugc.aweme.account.login.twostep;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.e;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.user.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class g extends androidx.appcompat.app.c {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f63915d;

    /* renamed from: e  reason: collision with root package name */
    public static g f63916e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f63917f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final Activity f63918b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f63919c;

    static {
        Covode.recordClassIndex(39384);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39385);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        public static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f63922a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f63923b;

            static {
                Covode.recordClassIndex(39388);
            }

            b(Activity activity, boolean z) {
                this.f63922a = activity;
                this.f63923b = z;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
                Activity activity = this.f63922a;
                Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                DialogContext.a aVar2 = new DialogContext.a((e) activity);
                aVar2.f33424a = b.a.TWO_FACTOR_AUTH;
                aVar.a(aVar2.a(new b.c(this) {
                    /* class com.ss.android.ugc.aweme.account.login.twostep.g.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f63924a;

                    static {
                        Covode.recordClassIndex(39389);
                    }

                    @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                    public final void a(List<Integer> list) {
                    }

                    @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                    public final void a(List<Integer> list, int i2) {
                    }

                    @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                    public final void a() {
                        if (((e) this.f63924a.f63922a).isFinishing()) {
                            a.C0732a.f33434a.a(b.a.TERMS_PRIVACY_COOKIE);
                            return;
                        }
                        g gVar = new g(this.f63924a.f63922a, this.f63924a.f63923b);
                        g.f63916e = gVar;
                        gVar.show();
                        g gVar2 = g.f63916e;
                        if (gVar2 == null) {
                            l.b();
                        }
                        gVar2.setOnDismissListener(DialogInterface$OnDismissListenerC1433a.f63925a);
                    }

                    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a$b$1$a  reason: collision with other inner class name */
                    static final class DialogInterface$OnDismissListenerC1433a implements DialogInterface.OnDismissListener {

                        /* renamed from: a  reason: collision with root package name */
                        public static final DialogInterface$OnDismissListenerC1433a f63925a = new DialogInterface$OnDismissListenerC1433a();

                        static {
                            Covode.recordClassIndex(39390);
                        }

                        DialogInterface$OnDismissListenerC1433a() {
                        }

                        public final void onDismiss(DialogInterface dialogInterface) {
                            a.C0732a.f33434a.a(b.a.TERMS_PRIVACY_COOKIE);
                        }
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f63924a = r1;
                    }
                }));
                return z.f158842a;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.g$a$a  reason: collision with other inner class name */
        public static final class C1432a<TTaskResult, TContinuationResult> implements b.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f63920a;

            static {
                Covode.recordClassIndex(39386);
            }

            C1432a(Activity activity) {
                this.f63920a = activity;
            }

            @Override // b.g
            public final /* synthetic */ Object then(i iVar) {
                l.b(iVar, "");
                if (l.a(iVar.d(), (Object) false)) {
                    m.a(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.account.login.twostep.g.a.C1432a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ C1432a f63921a;

                        static {
                            Covode.recordClassIndex(39387);
                        }

                        {
                            this.f63921a = r1;
                        }

                        public final void run() {
                            a.b(this.f63921a.f63920a);
                        }
                    });
                }
                return z.f158842a;
            }
        }

        public static void a(Activity activity) {
            l.d(activity, "");
            try {
                if (f.a(com.ss.android.ugc.aweme.user.e.f142364k.a())) {
                    int twoStepVerificationStatusFromLocal = cj.f71084b.m().getTwoStepVerificationStatusFromLocal();
                    if (twoStepVerificationStatusFromLocal == -1) {
                        cj.f71084b.m().getTwoStepVerificationStatusFromNetwork().a(new C1432a(activity));
                    } else if (twoStepVerificationStatusFromLocal == 0) {
                        b(activity);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public static void b(Activity activity) {
            l.d(activity, "");
            if (f.a(com.ss.android.ugc.aweme.user.e.f142364k.a()) && !g.f63915d) {
                g gVar = g.f63916e;
                if (gVar == null || !gVar.isShowing()) {
                    String f2 = f.f();
                    if (!TextUtils.isEmpty(f2)) {
                        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(f2);
                        l.b(parse, "");
                        boolean z = false;
                        if (System.currentTimeMillis() > parse.getTime()) {
                            z = true;
                        } else if (System.currentTimeMillis() - f.h() <= 86400000 || !f.g()) {
                            return;
                        }
                        a(z, activity);
                    }
                }
            }
        }

        private static void a(boolean z, Activity activity) {
            l.d(activity, "");
            i.b(new b(activity, z), i.f4826c);
        }
    }

    public final void cancel() {
        super.cancel();
        f63915d = false;
    }

    public final void show() {
        super.show();
        f63915d = true;
    }

    public final void dismiss() {
        super.dismiss();
        f63915d = false;
        f63916e = null;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f63926a;

        static {
            Covode.recordClassIndex(39391);
        }

        b(g gVar) {
            this.f63926a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            aVar.a("enter_methods", "turn_on");
            r.a("show_twosv_nudge_popup", aVar.f62575a);
            cj.f71084b.m().openTwoStepVerificationManageActivity(this.f63926a.f63918b, "mandatory_popup");
            if (!this.f63926a.f63919c) {
                this.f63926a.dismiss();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f63927a;

        static {
            Covode.recordClassIndex(39392);
        }

        c(g gVar) {
            this.f63927a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            if (this.f63927a.f63919c) {
                aVar.a("enter_methods", "logout");
                r.a("show_twosv_nudge_popup", aVar.f62575a);
                new com.ss.android.ugc.aweme.login.a(this.f63927a.f63918b).show();
                com.ss.android.ugc.aweme.account.b.b().logout("user_logout", "user_logout");
                return;
            }
            this.f63927a.dismiss();
            aVar.a("enter_methods", "not_now");
            r.a("show_twosv_nudge_popup", aVar.f62575a);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(8870);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.fw, (ViewGroup) null);
        if (inflate != null) {
            ((TextView) inflate.findViewById(R.id.f_1)).setOnClickListener(new b(this));
            ((TextView) inflate.findViewById(R.id.f3m)).setOnClickListener(new c(this));
            TextView textView = (TextView) inflate.findViewById(R.id.f9l);
            TextView textView2 = (TextView) inflate.findViewById(R.id.exf);
            TextView textView3 = (TextView) inflate.findViewById(R.id.f3m);
            l.b(textView, "");
            textView.setText(this.f63918b.getString(R.string.cbu));
            l.b(textView2, "");
            textView2.setText(this.f63918b.getString(R.string.cbp, new Object[]{f.f()}) + "\n\n" + this.f63918b.getString(R.string.cbq));
            if (this.f63919c) {
                textView2.setText(this.f63918b.getString(R.string.cbr));
                l.b(textView3, "");
                textView3.setText(this.f63918b.getString(R.string.cbs));
            }
        }
        setContentView(inflate);
        f.b().edit().putLong("last_show_hpas_dialog_time", System.currentTimeMillis()).apply();
        setCanceledOnTouchOutside(false);
        setCancelable(!this.f63919c);
        r.a("show_twosv_nudge_popup", new com.ss.android.ugc.aweme.account.a.b.a().f62575a);
        MethodCollector.o(8870);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Activity activity, boolean z) {
        super(activity, R.style.ug);
        l.d(activity, "");
        this.f63918b = activity;
        this.f63919c = z;
    }
}

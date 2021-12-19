package com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.h.e;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.Callable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static Dialog f76802a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f76803b = new e(d.a(), "gradient_punish_warning");

    /* renamed from: c  reason: collision with root package name */
    public static final a f76804c = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a$a  reason: collision with other inner class name */
    public static final class CallableC1757a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.e f76805a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76806b;

        static {
            Covode.recordClassIndex(47474);
        }

        public CallableC1757a(androidx.fragment.app.e eVar, String str) {
            this.f76805a = eVar;
            this.f76806b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f76805a);
            aVar2.f33424a = b.a.GRADIENT_PUNISH_WARNING;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.banappeal.gradientpunish.a.CallableC1757a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ CallableC1757a f76807a;

                static {
                    Covode.recordClassIndex(47475);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    Dialog dialog;
                    MethodCollector.i(5805);
                    androidx.fragment.app.e eVar = this.f76807a.f76805a;
                    String str = this.f76807a.f76806b;
                    l.b(str, "");
                    l.d(eVar, "");
                    l.d(str, "");
                    if (a.f76802a == null || (dialog = a.f76802a) == null || !dialog.isShowing()) {
                        GradientPunishWarning a2 = a.a();
                        if (a2 == null) {
                            MethodCollector.o(5805);
                            return;
                        }
                        String component1 = a2.component1();
                        String component2 = a2.component2();
                        View inflate = LayoutInflater.from(eVar).inflate(R.layout.ul, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.f04);
                        l.b(textView, "");
                        textView.setText(component1);
                        TextView textView2 = (TextView) inflate.findViewById(R.id.f03);
                        l.b(textView2, "");
                        textView2.setText(component2);
                        textView2.setOnClickListener(new b(eVar, str));
                        Dialog b2 = new a.C0731a(eVar).a().b();
                        b2.setContentView(inflate);
                        b2.setCancelable(false);
                        b2.show();
                        a.f76802a = b2;
                        r.a("violation_dialog_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).f66730a);
                        MethodCollector.o(5805);
                        return;
                    }
                    MethodCollector.o(5805);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f76807a = r1;
                }
            }));
            return null;
        }
    }

    static {
        Covode.recordClassIndex(47473);
    }

    public static final GradientPunishWarning a() {
        try {
            return (GradientPunishWarning) SettingsManager.a().a("gradient_punish_warning", GradientPunishWarning.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f76808a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76809b;

        static {
            Covode.recordClassIndex(47476);
        }

        b(Activity activity, String str) {
            this.f76808a = activity;
            this.f76809b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.a(this.f76808a, "popup_warning");
            r.a("enter_violation_record", new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "dialog").a("enter_from", this.f76809b).f66730a);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            String curUserId = g2.getCurUserId();
            l.b(curUserId, "");
            a.a(curUserId, true);
            Dialog dialog = a.f76802a;
            if (dialog != null) {
                dialog.dismiss();
            }
            a.C0732a.f33434a.a(b.a.GRADIENT_PUNISH_WARNING);
        }
    }

    public static final void b(String str, boolean z) {
        l.d(str, "");
        f76803b.b("has_click_warning_bubble_".concat(String.valueOf(str)), z);
    }

    public static final void a(String str, boolean z) {
        l.d(str, "");
        f76803b.b("has_click_warning_dialog_".concat(String.valueOf(str)), z);
    }

    public static final void a(Context context, String str) {
        String str2;
        l.d(context, "");
        l.d(str, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        StringBuilder sb = new StringBuilder();
        GradientPunishWarning a2 = a();
        if (a2 != null) {
            str2 = a2.getDetailUrl();
        } else {
            str2 = null;
        }
        buildRoute.withParam("url", sb.append(str2).append("&enter_from=").append(str).toString()).withParam("hide_nav_bar", true).open();
    }
}

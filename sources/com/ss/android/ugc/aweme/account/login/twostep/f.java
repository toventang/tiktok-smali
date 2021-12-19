package com.ss.android.ugc.aweme.account.login.twostep;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.n;
import com.ss.android.ugc.aweme.account.login.ui.a;
import com.ss.android.ugc.aweme.account.ui.CodeInputView;
import com.ss.android.ugc.aweme.account.ui.LoadingCircleView;
import com.ss.android.ugc.aweme.account.ui.TimerTextView;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONObject;

public final class f extends n implements CodeInputView.a {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f63902f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final a f63903g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TimerTextView f63904a;

    /* renamed from: b  reason: collision with root package name */
    public CodeInputView f63905b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f63906c;

    /* renamed from: d  reason: collision with root package name */
    public View f63907d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f63908e;

    /* renamed from: m  reason: collision with root package name */
    private LoadingCircleView f63909m;
    private TextView n;
    private View o;

    public static final class a {
        static {
            Covode.recordClassIndex(39378);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f63911a;

        static {
            Covode.recordClassIndex(39380);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void a() {
            f.a(this.f63911a).setVisibility(0);
            f.b(this.f63911a).setEnabled(false);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void b() {
            f.a(this.f63911a).setVisibility(8);
            f.b(this.f63911a).setEnabled(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f63911a = fVar;
        }
    }

    static {
        Covode.recordClassIndex(39377);
    }

    private final void e() {
        View view = this.o;
        if (view == null) {
            l.a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f63905b;
        if (codeInputView == null) {
            l.a("codeInputView");
        }
        codeInputView.d();
    }

    public final void b() {
        TwoStepAuthApi.a().sendEmailCode(this.f63983j, 6).a(new C1431f(this), i.f4826c, null);
    }

    public final void c() {
        LoadingCircleView loadingCircleView = this.f63909m;
        if (loadingCircleView == null) {
            l.a("loadingView");
        }
        loadingCircleView.b();
        LoadingCircleView loadingCircleView2 = this.f63909m;
        if (loadingCircleView2 == null) {
            l.a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f63910a;

        static {
            Covode.recordClassIndex(39379);
        }

        b(f fVar) {
            this.f63910a = fVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f63910a.f63981h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            f fVar = this.f63910a;
            String a2 = g.a(jSONObject, "verify_ticket", "");
            l.b(a2, "");
            fVar.d(a2);
            if (!TextUtils.isEmpty(this.f63910a.f63983j)) {
                this.f63910a.b();
            } else {
                this.f63910a.a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.twostep.n
    public final View a() {
        MethodCollector.i(8448);
        if (this.f63984k.getLayoutResource() <= 0) {
            this.f63984k.setLayoutResource(R.layout.gy);
        }
        View inflate = this.f63984k.inflate();
        l.b(inflate, "");
        View findViewById = inflate.findViewById(R.id.aut);
        l.b(findViewById, "");
        this.f63909m = (LoadingCircleView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.aup);
        l.b(findViewById2, "");
        this.f63906c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.aus);
        l.b(findViewById3, "");
        this.f63905b = (CodeInputView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.auu);
        l.b(findViewById4, "");
        this.f63907d = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.auv);
        l.b(findViewById5, "");
        this.f63904a = (TimerTextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.auq);
        l.b(findViewById6, "");
        this.o = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.aur);
        l.b(findViewById7, "");
        this.n = (TextView) findViewById7;
        TimerTextView timerTextView = this.f63904a;
        if (timerTextView == null) {
            l.a("timerText");
        }
        timerTextView.a("s");
        TimerTextView timerTextView2 = this.f63904a;
        if (timerTextView2 == null) {
            l.a("timerText");
        }
        timerTextView2.setCallback(new c(this));
        View view = this.f63907d;
        if (view == null) {
            l.a("resendCodeBtn");
        }
        view.setEnabled(false);
        View view2 = this.f63907d;
        if (view2 == null) {
            l.a("resendCodeBtn");
        }
        view2.setOnClickListener(new d(this));
        CodeInputView codeInputView = this.f63905b;
        if (codeInputView == null) {
            l.a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f63905b;
        if (codeInputView2 == null) {
            l.a("codeInputView");
        }
        codeInputView2.a();
        CodeInputView codeInputView3 = this.f63905b;
        if (codeInputView3 == null) {
            l.a("codeInputView");
        }
        codeInputView3.b();
        CodeInputView codeInputView4 = this.f63905b;
        if (codeInputView4 == null) {
            l.a("codeInputView");
        }
        codeInputView4.setCallback(this);
        CodeInputView codeInputView5 = this.f63905b;
        if (codeInputView5 == null) {
            l.a("codeInputView");
        }
        codeInputView5.setInputLength(6);
        if (this.f63981h == null) {
            a(null, "JSON is empty");
        } else {
            ai.a(new b(this), "BoltsUtils");
        }
        MethodCollector.o(8448);
        return inflate;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f63912a;

        static {
            Covode.recordClassIndex(39381);
        }

        d(f fVar) {
            this.f63912a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63912a.b();
        }
    }

    public static final /* synthetic */ TimerTextView a(f fVar) {
        TimerTextView timerTextView = fVar.f63904a;
        if (timerTextView == null) {
            l.a("timerText");
        }
        return timerTextView;
    }

    public static final /* synthetic */ View b(f fVar) {
        View view = fVar.f63907d;
        if (view == null) {
            l.a("resendCodeBtn");
        }
        return view;
    }

    public static final /* synthetic */ TextView c(f fVar) {
        TextView textView = fVar.f63906c;
        if (textView == null) {
            l.a("descriptionText");
        }
        return textView;
    }

    private final void f(String str) {
        View view = this.o;
        if (view == null) {
            l.a("errorLayout");
        }
        view.setVisibility(0);
        TextView textView = this.n;
        if (textView == null) {
            l.a("errorText");
        }
        textView.setText(str);
        CodeInputView codeInputView = this.f63905b;
        if (codeInputView == null) {
            l.a("codeInputView");
        }
        codeInputView.c();
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void b(String str) {
        l.d(str, "");
        if (this.f63908e) {
            CodeInputView codeInputView = this.f63905b;
            if (codeInputView == null) {
                l.a("codeInputView");
            }
            codeInputView.setText("");
            this.f63908e = false;
        }
        e();
    }

    public final void c(String str) {
        c();
        e();
        e(str);
    }

    static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f63913a;

        static {
            Covode.recordClassIndex(39382);
        }

        e(f fVar) {
            this.f63913a = fVar;
        }

        @Override // b.g
        public final Object then(i<TwoStepAuthApi.c> iVar) {
            Integer num;
            String str;
            if (!ai.a(iVar)) {
                this.f63913a.f63908e = true;
                this.f63913a.a(null, "TwoStepAuthApi.verifyEmailCode bolts Task error");
                return null;
            }
            l.b(iVar, "");
            TwoStepAuthApi.c d2 = iVar.d();
            if (!p.a("success", d2.f63762a, true) || d2.f63763b == null || TextUtils.isEmpty(d2.f63763b.f63764a)) {
                this.f63913a.f63908e = true;
                TwoStepAuthApi.c.a aVar = d2.f63763b;
                if (aVar != null) {
                    num = aVar.f63766c;
                } else {
                    num = null;
                }
                TwoStepAuthApi.c.a aVar2 = d2.f63763b;
                if (aVar2 != null) {
                    str = aVar2.f63767d;
                } else {
                    str = null;
                }
                this.f63913a.a(num, str);
                return null;
            }
            this.f63913a.c(d2.f63763b.f63764a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void a_(String str) {
        l.d(str, "");
        this.f63908e = false;
        LoadingCircleView loadingCircleView = this.f63909m;
        if (loadingCircleView == null) {
            l.a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f63909m;
        if (loadingCircleView2 == null) {
            l.a("loadingView");
        }
        loadingCircleView2.a();
        e();
        String str2 = this.f63983j;
        l.d(str, "");
        TwoStepAuthApi.Api a2 = TwoStepAuthApi.a();
        String a3 = com.ss.android.ugc.aweme.account.util.f.a(null);
        l.b(a3, "");
        String a4 = com.ss.android.ugc.aweme.account.util.f.a(str);
        l.b(a4, "");
        a2.verifyEmailCode(1, a3, a4, 6, str2).a(new e(this), i.f4826c, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f$f  reason: collision with other inner class name */
    public static final class C1431f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f63914a;

        static {
            Covode.recordClassIndex(39383);
        }

        C1431f(f fVar) {
            this.f63914a = fVar;
        }

        @Override // b.g
        public final Object then(i<TwoStepAuthApi.a> iVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (!p.a("error", iVar.d().f63748a, true)) {
                    if (TextUtils.isEmpty(f.c(this.f63914a).getText())) {
                        TextView c2 = f.c(this.f63914a);
                        Locale locale = Locale.US;
                        androidx.appcompat.app.d d2 = this.f63914a.d();
                        if (d2 == null) {
                            l.b();
                        }
                        String string = d2.getString(R.string.ars);
                        l.b(string, "");
                        Object[] objArr = new Object[1];
                        TwoStepAuthApi.a.C1429a aVar = iVar.d().f63749b;
                        if (aVar != null) {
                            str3 = aVar.f63750a;
                        }
                        objArr[0] = str3;
                        String a2 = com.a.a(locale, string, Arrays.copyOf(objArr, 1));
                        l.b(a2, "");
                        c2.setText(a2);
                    }
                    CodeInputView codeInputView = this.f63914a.f63905b;
                    if (codeInputView == null) {
                        l.a("codeInputView");
                    }
                    codeInputView.setEnabled(true);
                    f.b(this.f63914a).setEnabled(false);
                    this.f63914a.c();
                    return f.a(this.f63914a).c();
                }
            }
            if (f.f63902f) {
                l.b(iVar, "");
                if (iVar.e() == null) {
                    TwoStepAuthApi.a.C1429a aVar2 = iVar.d().f63749b;
                    if (aVar2 != null) {
                        str2 = aVar2.f63752c;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            f fVar = this.f63914a;
            l.b(iVar, "");
            TwoStepAuthApi.a.C1429a aVar3 = iVar.d().f63749b;
            if (aVar3 != null) {
                num = aVar3.f63753d;
            } else {
                num = null;
            }
            Exception e2 = iVar.e();
            if (e2 == null || (str = e2.getMessage()) == null) {
                TwoStepAuthApi.a.C1429a aVar4 = iVar.d().f63749b;
                if (aVar4 != null) {
                    str = aVar4.f63752c;
                } else {
                    str = null;
                }
            }
            fVar.a(num, str);
            return null;
        }
    }

    public final void a(Integer num, String str) {
        c();
        f(b(num, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.d dVar, ViewStub viewStub, n.a aVar) {
        super(dVar, viewStub, aVar);
        l.d(dVar, "");
        l.d(viewStub, "");
        l.d(aVar, "");
    }
}

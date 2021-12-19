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
import com.ss.android.ugc.aweme.account.experiment.o;
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

public final class j extends n implements CodeInputView.a {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f63943f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final a f63944g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TimerTextView f63945a;

    /* renamed from: b  reason: collision with root package name */
    public CodeInputView f63946b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f63947c;

    /* renamed from: d  reason: collision with root package name */
    public View f63948d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f63949e;

    /* renamed from: m  reason: collision with root package name */
    private LoadingCircleView f63950m;
    private TextView n;
    private View o;

    public static final class a {
        static {
            Covode.recordClassIndex(39402);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class c extends a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63952a;

        static {
            Covode.recordClassIndex(39404);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void a() {
            j.a(this.f63952a).setVisibility(0);
            j.b(this.f63952a).setEnabled(false);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void b() {
            j.a(this.f63952a).setVisibility(8);
            j.b(this.f63952a).setEnabled(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(j jVar) {
            this.f63952a = jVar;
        }
    }

    static {
        Covode.recordClassIndex(39401);
    }

    private final void e() {
        View view = this.o;
        if (view == null) {
            l.a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f63946b;
        if (codeInputView == null) {
            l.a("codeInputView");
        }
        codeInputView.d();
    }

    public final void c() {
        LoadingCircleView loadingCircleView = this.f63950m;
        if (loadingCircleView == null) {
            l.a("loadingView");
        }
        loadingCircleView.b();
        LoadingCircleView loadingCircleView2 = this.f63950m;
        if (loadingCircleView2 == null) {
            l.a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63951a;

        static {
            Covode.recordClassIndex(39403);
        }

        b(j jVar) {
            this.f63951a = jVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f63951a.f63981h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            j jVar = this.f63951a;
            String a2 = g.a(jSONObject, "verify_ticket", "");
            l.b(a2, "");
            jVar.d(a2);
            if (!TextUtils.isEmpty(this.f63951a.f63983j)) {
                this.f63951a.b();
            } else {
                this.f63951a.a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    public final void b() {
        TwoStepAuthApi.a().sendSmsCode(this.f63983j, Integer.valueOf(o.a() ? 1 : 0), 22).a(new f(this), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.account.login.twostep.n
    public final View a() {
        int i2;
        int i3;
        MethodCollector.i(9325);
        if (this.f63984k.getLayoutResource() <= 0) {
            this.f63984k.setLayoutResource(R.layout.h0);
        }
        View inflate = this.f63984k.inflate();
        l.b(inflate, "");
        View findViewById = inflate.findViewById(R.id.e6p);
        l.b(findViewById, "");
        this.f63950m = (LoadingCircleView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.e6l);
        l.b(findViewById2, "");
        this.f63947c = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.e6o);
        l.b(findViewById3, "");
        this.f63946b = (CodeInputView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.e6q);
        l.b(findViewById4, "");
        this.f63948d = findViewById4;
        View findViewById5 = inflate.findViewById(R.id.e6r);
        l.b(findViewById5, "");
        this.f63945a = (TimerTextView) findViewById5;
        View findViewById6 = inflate.findViewById(R.id.e6m);
        l.b(findViewById6, "");
        this.o = findViewById6;
        View findViewById7 = inflate.findViewById(R.id.e6n);
        l.b(findViewById7, "");
        this.n = (TextView) findViewById7;
        TextView textView = (TextView) inflate.findViewById(R.id.e6s);
        if (o.a()) {
            i2 = R.string.ar0;
        } else {
            i2 = R.string.d0f;
        }
        textView.setText(i2);
        TimerTextView timerTextView = this.f63945a;
        if (timerTextView == null) {
            l.a("timerText");
        }
        timerTextView.a("s");
        TimerTextView timerTextView2 = this.f63945a;
        if (timerTextView2 == null) {
            l.a("timerText");
        }
        timerTextView2.setCallback(new c(this));
        View view = this.f63948d;
        if (view == null) {
            l.a("resendCodeBtn");
        }
        view.setEnabled(false);
        View view2 = this.f63948d;
        if (view2 == null) {
            l.a("resendCodeBtn");
        }
        view2.setOnClickListener(new d(this));
        CodeInputView codeInputView = this.f63946b;
        if (codeInputView == null) {
            l.a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f63946b;
        if (codeInputView2 == null) {
            l.a("codeInputView");
        }
        codeInputView2.a();
        CodeInputView codeInputView3 = this.f63946b;
        if (codeInputView3 == null) {
            l.a("codeInputView");
        }
        codeInputView3.b();
        CodeInputView codeInputView4 = this.f63946b;
        if (codeInputView4 == null) {
            l.a("codeInputView");
        }
        codeInputView4.setCallback(this);
        CodeInputView codeInputView5 = this.f63946b;
        if (codeInputView5 == null) {
            l.a("codeInputView");
        }
        if (o.a()) {
            i3 = 6;
        } else {
            i3 = 4;
        }
        codeInputView5.setInputLength(i3);
        if (this.f63981h == null) {
            a(null, "JSON is empty");
        } else {
            ai.a(new b(this), "BoltsUtils");
        }
        MethodCollector.o(9325);
        return inflate;
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63953a;

        static {
            Covode.recordClassIndex(39405);
        }

        d(j jVar) {
            this.f63953a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63953a.b();
        }
    }

    public static final /* synthetic */ TimerTextView a(j jVar) {
        TimerTextView timerTextView = jVar.f63945a;
        if (timerTextView == null) {
            l.a("timerText");
        }
        return timerTextView;
    }

    public static final /* synthetic */ View b(j jVar) {
        View view = jVar.f63948d;
        if (view == null) {
            l.a("resendCodeBtn");
        }
        return view;
    }

    public static final /* synthetic */ TextView c(j jVar) {
        TextView textView = jVar.f63947c;
        if (textView == null) {
            l.a("descriptionText");
        }
        return textView;
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void b(String str) {
        l.d(str, "");
        if (this.f63949e) {
            CodeInputView codeInputView = this.f63946b;
            if (codeInputView == null) {
                l.a("codeInputView");
            }
            codeInputView.setText("");
            this.f63949e = false;
        }
        e();
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
        CodeInputView codeInputView = this.f63946b;
        if (codeInputView == null) {
            l.a("codeInputView");
        }
        codeInputView.c();
    }

    public final void c(String str) {
        c();
        e();
        e(str);
    }

    static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63954a;

        static {
            Covode.recordClassIndex(39406);
        }

        e(j jVar) {
            this.f63954a = jVar;
        }

        @Override // b.g
        public final Object then(i<TwoStepAuthApi.c> iVar) {
            Integer num;
            String str;
            if (!ai.a(iVar)) {
                this.f63954a.f63949e = true;
                this.f63954a.a(null, "TwoStepAuthApi.verifySmsCode bolts Task error");
                return null;
            }
            l.b(iVar, "");
            TwoStepAuthApi.c d2 = iVar.d();
            if (!p.a("success", d2.f63762a, true) || d2.f63763b == null || TextUtils.isEmpty(d2.f63763b.f63764a)) {
                this.f63954a.f63949e = true;
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
                this.f63954a.a(num, str);
                return null;
            }
            this.f63954a.c(d2.f63763b.f63764a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void a_(String str) {
        l.d(str, "");
        this.f63949e = false;
        LoadingCircleView loadingCircleView = this.f63950m;
        if (loadingCircleView == null) {
            l.a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f63950m;
        if (loadingCircleView2 == null) {
            l.a("loadingView");
        }
        loadingCircleView2.a();
        e();
        String str2 = this.f63983j;
        l.d(str, "");
        TwoStepAuthApi.Api a2 = TwoStepAuthApi.a();
        String a3 = com.ss.android.ugc.aweme.account.util.f.a(null);
        String a4 = com.ss.android.ugc.aweme.account.util.f.a(str);
        l.b(a4, "");
        a2.verifySmsCode(1, a3, a4, 22, str2).a(new e(this), i.f4826c, null);
    }

    /* access modifiers changed from: package-private */
    public static final class f<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f63955a;

        static {
            Covode.recordClassIndex(39407);
        }

        f(j jVar) {
            this.f63955a = jVar;
        }

        @Override // b.g
        public final Object then(i<TwoStepAuthApi.b> iVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (ai.a(iVar)) {
                l.b(iVar, "");
                if (!p.a("error", iVar.d().f63754a, true)) {
                    if (TextUtils.isEmpty(j.c(this.f63955a).getText())) {
                        TextView c2 = j.c(this.f63955a);
                        Locale locale = Locale.US;
                        androidx.appcompat.app.d d2 = this.f63955a.d();
                        if (d2 == null) {
                            l.b();
                        }
                        String string = d2.getString(R.string.arz);
                        l.b(string, "");
                        Object[] objArr = new Object[1];
                        TwoStepAuthApi.b.a aVar = iVar.d().f63755b;
                        if (aVar != null) {
                            str3 = aVar.f63756a;
                        }
                        objArr[0] = str3;
                        String a2 = com.a.a(locale, string, Arrays.copyOf(objArr, 1));
                        l.b(a2, "");
                        c2.setText(a2);
                    }
                    CodeInputView codeInputView = this.f63955a.f63946b;
                    if (codeInputView == null) {
                        l.a("codeInputView");
                    }
                    codeInputView.setEnabled(true);
                    j.b(this.f63955a).setEnabled(false);
                    this.f63955a.c();
                    return j.a(this.f63955a).c();
                }
            }
            if (j.f63943f) {
                l.b(iVar, "");
                if (iVar.e() == null) {
                    TwoStepAuthApi.b.a aVar2 = iVar.d().f63755b;
                    if (aVar2 != null) {
                        str2 = aVar2.f63759d;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            j jVar = this.f63955a;
            l.b(iVar, "");
            TwoStepAuthApi.b.a aVar3 = iVar.d().f63755b;
            if (aVar3 != null) {
                num = aVar3.f63760e;
            } else {
                num = null;
            }
            Exception e2 = iVar.e();
            if (e2 == null || (str = e2.getMessage()) == null) {
                TwoStepAuthApi.b.a aVar4 = iVar.d().f63755b;
                if (aVar4 != null) {
                    str = aVar4.f63759d;
                } else {
                    str = null;
                }
            }
            jVar.a(num, str);
            return null;
        }
    }

    public final void a(Integer num, String str) {
        c();
        f(b(num, str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.d dVar, ViewStub viewStub, n.a aVar) {
        super(dVar, viewStub, aVar);
        l.d(dVar, "");
        l.d(viewStub, "");
        l.d(aVar, "");
    }
}

package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.recover.f;
import com.ss.android.ugc.aweme.account.login.ui.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.ui.CodeInputView;
import com.ss.android.ugc.aweme.account.ui.LoadingCircleView;
import com.ss.android.ugc.aweme.account.ui.TimerTextView;
import com.ss.android.ugc.aweme.aq;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class j extends a implements View.OnClickListener, CodeInputView.a {

    /* renamed from: j  reason: collision with root package name */
    public static final h.h f64842j = h.i.a((h.f.a.a) b.f64857a);

    /* renamed from: k  reason: collision with root package name */
    public static final a f64843k = new a((byte) 0);
    private String A = "";
    private String B = "";
    private f.b C;
    private boolean D;
    private final h.h E = h.i.a((h.f.a.a) new d(this));
    private final h.h F = h.i.a((h.f.a.a) new s(this));
    private final h.h G = h.i.a((h.f.a.a) ae.f64856a);
    private final ad H = new ad(this);
    private HashMap I;

    /* renamed from: a  reason: collision with root package name */
    public String f64844a = "";

    /* renamed from: b  reason: collision with root package name */
    public long f64845b = System.currentTimeMillis();

    /* renamed from: c  reason: collision with root package name */
    public boolean f64846c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f64847d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f64848e;

    /* renamed from: l  reason: collision with root package name */
    private boolean f64849l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f64850m;
    private String n = "";
    private int o;
    private TimerHolder.b p;
    private com.ss.android.ugc.aweme.account.login.ui.a q;
    private boolean r;
    private com.ss.android.ugc.aweme.account.login.e.f s;
    private boolean y;
    private boolean z;

    private final boolean t() {
        return ((Boolean) this.G.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.I == null) {
            this.I = new HashMap();
        }
        View view = (View) this.I.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.I.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hl;
    }

    public final boolean e() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    public final String g() {
        return (String) this.F.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.I;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39853);
        }

        public static HashMap<String, Boolean> a() {
            return (HashMap) j.f64842j.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        I();
    }

    public static final class ad extends a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64855a;

        static {
            Covode.recordClassIndex(39857);
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void a() {
            this.f64855a.i();
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void b() {
            if (this.f64855a.ab_()) {
                this.f64855a.k();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ad(j jVar) {
            this.f64855a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.account.login.ui.a.b, com.ss.android.ugc.aweme.account.login.ui.a.AbstractC1435a
        public final void a(long j2) {
            if (this.f64855a.ab_()) {
                this.f64855a.a(j2);
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<HashMap<String, Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64857a = new b();

        static {
            Covode.recordClassIndex(39859);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<String, Boolean> invoke() {
            return new HashMap();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        V_();
    }

    static final class ae extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final ae f64856a = new ae();

        static {
            Covode.recordClassIndex(39858);
        }

        ae() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(com.ss.android.ugc.aweme.account.experiment.o.a());
        }
    }

    private final String E() {
        if (TextUtils.isEmpty(this.n)) {
            return this.f64844a;
        }
        return this.n;
    }

    static final class d extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount", false));
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            return arguments.getString("platform", "");
        }
    }

    static {
        Covode.recordClassIndex(39852);
    }

    private final void I() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) c(R.id.bp9);
        h.f.b.l.b(loadingCircleView, "");
        loadingCircleView.setVisibility(0);
        ((LoadingCircleView) c(R.id.bp9)).a();
    }

    public final String m() {
        return E() + "_voice";
    }

    public final void o() {
        com.ss.android.ugc.aweme.common.r.a("auto_fill_sms_verification", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", x()).f62575a);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.ss.android.ugc.aweme.account.login.e.f fVar = this.s;
        if (fVar != null) {
            fVar.c();
        }
        super.onDestroyView();
        KeyboardUtils.c(c(R.id.bpd));
        h();
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
        h.f.b.l.b(codeInputView, "");
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(codeInputView);
    }

    private final void J() {
        String str;
        a.C0731a aVar = new a.C0731a(getContext());
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.ar2);
        } else {
            str = null;
        }
        aVar.f33401a = str;
        aVar.a(R.string.asq, (DialogInterface.OnClickListener) null, false).a().c().setCancelable(false);
    }

    public final void i() {
        TimerTextView timerTextView = (TimerTextView) c(R.id.bpc);
        h.f.b.l.b(timerTextView, "");
        if (timerTextView.getVisibility() != 0) {
            TimerTextView timerTextView2 = (TimerTextView) c(R.id.bpc);
            h.f.b.l.b(timerTextView2, "");
            timerTextView2.setVisibility(0);
        }
        TuxTextView tuxTextView = (TuxTextView) c(R.id.bp_);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setEnabled(false);
    }

    public final void k() {
        TimerTextView timerTextView = (TimerTextView) c(R.id.bpc);
        h.f.b.l.b(timerTextView, "");
        if (timerTextView.getVisibility() != 8) {
            TimerTextView timerTextView2 = (TimerTextView) c(R.id.bpc);
            h.f.b.l.b(timerTextView2, "");
            timerTextView2.setVisibility(8);
        }
        TuxTextView tuxTextView = (TuxTextView) c(R.id.bp_);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setEnabled(true);
    }

    public final void l() {
        TuxTextView tuxTextView = (TuxTextView) c(R.id.bp_);
        h.f.b.l.b(tuxTextView, "");
        tuxTextView.setEnabled(false);
        ((TimerTextView) c(R.id.bpc)).setCallback(this.H);
        TimerHolder.a.a(getActivity(), E(), new TimerHolder.b(((TimerTextView) c(R.id.bpc)).c()), A());
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        if (e()) {
            com.ss.android.ugc.aweme.common.r.a("back", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", "Input Phone Captcha").a("duration", System.currentTimeMillis() - this.t).f62575a);
        }
        return super.q();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
        h.f.b.l.b(codeInputView, "");
        codeInputView.setEnabled(true);
        LoadingCircleView loadingCircleView = (LoadingCircleView) c(R.id.bp9);
        h.f.b.l.b(loadingCircleView, "");
        loadingCircleView.setVisibility(8);
        ((LoadingCircleView) c(R.id.bp9)).b();
    }

    public final void n() {
        com.ss.android.ugc.aweme.common.r.a("switch_to_password", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", x()).f62575a);
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_PASSWORD_LOGIN.getValue());
        arguments.putInt("current_scene", A().getValue());
        arguments.putBoolean("recover_mobile_code", this.D);
        arguments.putSerializable("recover_account_data", this.C);
        h.f.b.l.b(arguments, "");
        a(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        String str;
        String str2;
        int i2 = k.f64878a[V_().ordinal()];
        int i3 = R.string.ar5;
        boolean z2 = true;
        String str3 = "";
        switch (i2) {
            case 1:
                if (!this.f64849l) {
                    if (t()) {
                        i3 = R.string.ar0;
                    } else {
                        i3 = R.string.ary;
                    }
                }
                str2 = getString(i3);
                h.f.b.l.b(str2, str3);
                Locale locale = Locale.US;
                String string = getString(R.string.aqy);
                h.f.b.l.b(string, str3);
                str = com.a.a(locale, string, Arrays.copyOf(new Object[]{this.f64844a}, 1));
                h.f.b.l.b(str, str3);
                if (!this.f64849l) {
                    str3 = "phone_sign_up_sms_verification_page";
                    break;
                } else {
                    str3 = "phone_sign_up_whatsapp_verification_page";
                    break;
                }
            case 2:
                str2 = getString(R.string.arr);
                h.f.b.l.b(str2, str3);
                Locale locale2 = Locale.US;
                String string2 = getString(R.string.ars);
                h.f.b.l.b(string2, str3);
                str = com.a.a(locale2, string2, Arrays.copyOf(new Object[]{this.n}, 1));
                h.f.b.l.b(str, str3);
                str3 = "email_sign_up_verification_page";
                break;
            case 3:
                if (t()) {
                    str2 = getString(R.string.ar0);
                } else {
                    str2 = getString(R.string.ary);
                }
                h.f.b.l.b(str2, str3);
                Locale locale3 = Locale.US;
                String string3 = getString(R.string.aqy);
                h.f.b.l.b(string3, str3);
                str = com.a.a(locale3, string3, Arrays.copyOf(new Object[]{this.f64844a}, 1));
                h.f.b.l.b(str, str3);
                str3 = "reset_sms_code_input";
                break;
            case 4:
                str2 = getString(R.string.arr);
                h.f.b.l.b(str2, str3);
                Locale locale4 = Locale.US;
                String string4 = getString(R.string.ars);
                h.f.b.l.b(string4, str3);
                str = com.a.a(locale4, string4, Arrays.copyOf(new Object[]{this.n}, 1));
                h.f.b.l.b(str, str3);
                str3 = "reset_email_code_input";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                if (!this.f64849l) {
                    if (t()) {
                        i3 = R.string.ar0;
                    } else {
                        i3 = R.string.ary;
                    }
                }
                str2 = getString(i3);
                h.f.b.l.b(str2, str3);
                if (t()) {
                    Locale locale5 = Locale.US;
                    String string5 = getString(R.string.d0h);
                    h.f.b.l.b(string5, str3);
                    str = com.a.a(locale5, string5, Arrays.copyOf(new Object[]{this.f64844a}, 1));
                    h.f.b.l.b(str, str3);
                } else {
                    Locale locale6 = Locale.US;
                    String string6 = getString(R.string.aqy);
                    h.f.b.l.b(string6, str3);
                    str = com.a.a(locale6, string6, Arrays.copyOf(new Object[]{this.f64844a}, 1));
                    h.f.b.l.b(str, str3);
                }
                if (!this.f64849l) {
                    str3 = "phone_login_sms_verification_page";
                    break;
                } else {
                    str3 = "phone_login_whatsapp_verification_page";
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                if (t()) {
                    str2 = getString(R.string.ar0);
                } else {
                    str2 = getString(R.string.ary);
                }
                h.f.b.l.b(str2, str3);
                Locale locale7 = Locale.US;
                String string7 = getString(R.string.aqy);
                h.f.b.l.b(string7, str3);
                str = com.a.a(locale7, string7, Arrays.copyOf(new Object[]{this.f64844a}, 1));
                h.f.b.l.b(str, str3);
                z2 = false;
                break;
            default:
                throw new IllegalStateException("Unknown step " + V_() + " during getCommonUiParam()");
        }
        if (A() == com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT || this.D) {
            z2 = false;
        }
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(" ", null, false, str2, str, false, str3, z2, false, 1230);
    }

    public static final class c implements com.ss.android.ugc.aweme.account.loginsetting.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64858a;

        static {
            Covode.recordClassIndex(39860);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(j jVar) {
            this.f64858a = jVar;
        }

        @Override // com.ss.android.ugc.aweme.account.loginsetting.a
        public final void a(boolean z) {
            a.a().put(this.f64858a.f64844a, Boolean.valueOf(z));
            this.f64858a.f64846c = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64871a;

        static {
            Covode.recordClassIndex(39877);
        }

        t(j jVar) {
            this.f64871a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64871a.l();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64872a;

        static {
            Covode.recordClassIndex(39878);
        }

        u(j jVar) {
            this.f64872a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64872a.l();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64873a;

        static {
            Covode.recordClassIndex(39879);
        }

        v(j jVar) {
            this.f64873a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64873a.l();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64874a;

        static {
            Covode.recordClassIndex(39880);
        }

        w(j jVar) {
            this.f64874a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64874a.l();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64875a;

        static {
            Covode.recordClassIndex(39881);
        }

        x(j jVar) {
            this.f64875a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64875a.l();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64876a;

        static {
            Covode.recordClassIndex(39882);
        }

        y(j jVar) {
            this.f64876a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64876a.l();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class z<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64877a;

        static {
            Covode.recordClassIndex(39883);
        }

        z(j jVar) {
            this.f64877a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64877a.l();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ac implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f64854a;

        static {
            Covode.recordClassIndex(39856);
        }

        ac(z.a aVar) {
            this.f64854a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (!this.f64854a.element) {
                com.ss.android.ugc.aweme.account.login.d.a.a("sms_verification", "cancel");
            }
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64859a;

        static {
            Covode.recordClassIndex(39862);
        }

        e(j jVar) {
            this.f64859a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.h.a.m mVar = (com.bytedance.sdk.a.h.a.m) obj;
            if (mVar.f43301e != null) {
                j jVar = this.f64859a;
                com.ss.android.ugc.aweme.account.login.v2.base.j A = jVar.A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64859a.V_();
                com.bytedance.sdk.a.n.a aVar = mVar.f43301e;
                h.f.b.l.b(aVar, "");
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(jVar, A, V_, aVar);
            }
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64862a;

        static {
            Covode.recordClassIndex(39865);
        }

        h(j jVar) {
            this.f64862a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.h.a.f fVar = (com.bytedance.sdk.a.h.a.f) obj;
            if (fVar.f43271f != null) {
                j jVar = this.f64862a;
                com.ss.android.ugc.aweme.account.login.v2.base.j A = jVar.A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64862a.V_();
                com.bytedance.sdk.a.n.a aVar = fVar.f43271f;
                h.f.b.l.b(aVar, "");
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(jVar, A, V_, aVar);
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.account.login.v2.a.w, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.account.login.v2.a.w wVar) {
            com.ss.android.ugc.aweme.account.login.v2.a.w wVar2 = wVar;
            h.f.b.l.d(wVar2, "");
            j jVar = this.this$0;
            String g2 = jVar.g();
            h.f.b.l.b(g2, "");
            jVar.a(g2, false, wVar2.getErrorCode());
            return h.z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.account.login.v2.a.w, h.z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(39868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.account.login.v2.a.w wVar) {
            com.ss.android.ugc.aweme.account.login.v2.a.w wVar2 = wVar;
            h.f.b.l.d(wVar2, "");
            j jVar = this.this$0;
            String g2 = jVar.g();
            h.f.b.l.b(g2, "");
            jVar.a(g2, false, wVar2.getErrorCode());
            return h.z.f158842a;
        }
    }

    static final class o<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64867a;

        static {
            Covode.recordClassIndex(39872);
        }

        o(j jVar) {
            this.f64867a = jVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            ((CodeInputView) this.f64867a.c(R.id.bpd)).setTextAndAutoCheck((String) obj);
            this.f64867a.o();
        }
    }

    static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64868a;

        static {
            Covode.recordClassIndex(39873);
        }

        p(j jVar) {
            this.f64868a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            TimerTextView timerTextView = (TimerTextView) this.f64868a.c(R.id.bpc);
            h.f.b.l.b(timerTextView, "");
            timerTextView.setVisibility(0);
            this.f64868a.l();
        }
    }

    public static final class r extends com.ss.android.ugc.aweme.account.views.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64870a;

        static {
            Covode.recordClassIndex(39875);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && this.f64870a.C()) {
                this.f64870a.onClick(view);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(j jVar, int i2, int i3) {
            super(i2, i3);
            this.f64870a = jVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aa<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64851a;

        static {
            Covode.recordClassIndex(39854);
        }

        aa(j jVar) {
            this.f64851a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            androidx.fragment.app.e activity = this.f64851a.getActivity();
            String m2 = this.f64851a.m();
            com.ss.android.ugc.aweme.account.login.ui.a a2 = new com.ss.android.ugc.aweme.account.login.ui.a(60000, 1000, null).a();
            h.f.b.l.b(a2, "");
            TimerHolder.a.a(activity, m2, new TimerHolder.b(a2), this.f64851a.A());
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64861a;

        static {
            Covode.recordClassIndex(39864);
        }

        g(j jVar) {
            this.f64861a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.h.a.l lVar = (com.bytedance.sdk.a.h.a.l) obj;
            if (lVar.f43296e != null) {
                j jVar = this.f64861a;
                com.ss.android.ugc.aweme.account.login.v2.base.j A = jVar.A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_ = this.f64861a.V_();
                com.bytedance.sdk.a.n.a aVar = lVar.f43296e;
                h.f.b.l.b(aVar, "");
                com.ss.android.ugc.aweme.account.login.v2.a.a.a.a(jVar, A, V_, aVar);
            }
            com.ss.android.ugc.aweme.common.r.a("input_code_page", new com.ss.android.ugc.aweme.account.a.b.a().a("stay_time", System.currentTimeMillis() - this.f64861a.f64845b).f62575a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.j$j  reason: collision with other inner class name */
    static final class C1448j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64863a;

        static {
            Covode.recordClassIndex(39867);
        }

        C1448j(j jVar) {
            this.f64863a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.d.a aVar = (com.bytedance.sdk.a.a.d.a) obj;
            j jVar = this.f64863a;
            String g2 = jVar.g();
            h.f.b.l.b(g2, "");
            jVar.a(g2, true, aVar.f43073d);
            j jVar2 = this.f64863a;
            Bundle arguments = jVar2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.RESET_PASSWORD_FOR_PHONE.getValue());
            arguments.putString("ticket", aVar.f43089j);
            h.f.b.l.b(arguments, "");
            jVar2.a(arguments);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64864a;

        static {
            Covode.recordClassIndex(39869);
        }

        l(j jVar) {
            this.f64864a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.d.a aVar = (com.bytedance.sdk.a.a.d.a) obj;
            j jVar = this.f64864a;
            String g2 = jVar.g();
            h.f.b.l.b(g2, "");
            jVar.a(g2, true, aVar.f43073d);
            j jVar2 = this.f64864a;
            Bundle arguments = jVar2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.RESET_PASSWORD_FOR_EMAIL.getValue());
            arguments.putString("ticket", aVar.f43089j);
            h.f.b.l.b(arguments, "");
            jVar2.a(arguments);
        }
    }

    static final class n<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64866a;

        static {
            Covode.recordClassIndex(39871);
        }

        n(j jVar) {
            this.f64866a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.f fVar = (com.bytedance.sdk.a.a.a.f) obj;
            j jVar = this.f64866a;
            Bundle arguments = jVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.INPUT_PHONE_MODIFY.getValue());
            h.f.b.l.b(fVar, "");
            arguments.putString("ticket", fVar.f43086j);
            h.f.b.l.b(arguments, "");
            jVar.a(arguments);
        }
    }

    static final class q<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64869a;

        static {
            Covode.recordClassIndex(39874);
        }

        q(j jVar) {
            this.f64869a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            CodeInputView codeInputView = (CodeInputView) this.f64869a.c(R.id.bpd);
            h.f.b.l.b(codeInputView, "");
            codeInputView.setEnabled(true);
            TimerTextView timerTextView = (TimerTextView) this.f64869a.c(R.id.bpc);
            h.f.b.l.b(timerTextView, "");
            timerTextView.setVisibility(0);
            this.f64869a.l();
            CodeInputView codeInputView2 = (CodeInputView) this.f64869a.c(R.id.bpd);
            h.f.b.l.b(codeInputView2, "");
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(codeInputView2);
            this.f64869a.f64847d = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void b(String str) {
        h.f.b.l.d(str, "");
        if (ab_()) {
            if (this.z) {
                ((CodeInputView) c(R.id.bpd)).setText("");
                this.z = false;
            }
            ((InputResultIndicator) c(R.id.bp7)).a();
            ((CodeInputView) c(R.id.bpd)).d();
        }
    }

    public final void a(long j2) {
        if (this.f64846c && j2 <= 50000) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.bpe);
            h.f.b.l.b(tuxTextView, "");
            if (tuxTextView.getVisibility() != 0) {
                TuxTextView tuxTextView2 = (TuxTextView) c(R.id.bpe);
                h.f.b.l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
            }
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64860a;

        static {
            Covode.recordClassIndex(39863);
        }

        f(j jVar) {
            this.f64860a = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0049, code lost:
            if (r1 != null) goto L_0x0046;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r10) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.a.j.f.accept(java.lang.Object):void");
        }
    }

    static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64865a;

        static {
            Covode.recordClassIndex(39870);
        }

        m(j jVar) {
            this.f64865a = jVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
            if (this.f64865a.e()) {
                com.ss.android.ugc.aweme.common.r.a("set_up_proAccount", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Phone Captcha").a("method", "set_by_phone").a("duration", System.currentTimeMillis() - this.f64865a.t).f62575a);
            }
            j jVar = this.f64865a;
            com.bytedance.sdk.a.h.a.a aVar = (com.bytedance.sdk.a.h.a.a) dVar.f43081j;
            h.f.b.l.d(jVar, "");
            androidx.fragment.app.e activity = jVar.getActivity();
            if (activity != null) {
                androidx.lifecycle.r<Bundle> rVar = ((ActionResultModel) androidx.lifecycle.ae.a(activity, (ad.b) null).a(ActionResultModel.class)).f64699b;
                Bundle arguments = jVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                User f2 = cj.f();
                if (!(f2 == null || aVar == null)) {
                    com.ss.android.account.b.a aVar2 = aVar.f43247g.f43464b.get("mobile");
                    if (aVar2 != null) {
                        str = aVar2.f58181d;
                    } else {
                        str = "";
                    }
                    f2.setPhoneBinded(true);
                    f2.setBindPhone(str);
                    if (aVar.f43247g.f43463a > 0) {
                        cj.f71084b.e().updateUserInfo(aVar.f43247g);
                    }
                    if (str == null) {
                        h.f.b.l.b();
                    }
                    com.bytedance.sdk.a.n.a aVar3 = aVar.f43247g;
                    h.f.b.l.b(aVar3, "");
                    String jSONObject = aVar3.f43475m.toString();
                    h.f.b.l.b(jSONObject, "");
                    cj.a(7, 1, new aq(str, jSONObject));
                }
                rVar.postValue(arguments);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0180  */
    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.a.j.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.account.ui.CodeInputView.a
    public final void a_(String str) {
        boolean z2;
        String str2;
        h.f.b.l.d(str, "");
        CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
        h.f.b.l.b(codeInputView, "");
        codeInputView.setEnabled(false);
        this.z = false;
        I();
        switch (k.f64881d[V_().ordinal()]) {
            case 1:
            case 2:
                if (A() == com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT) {
                    f.b bVar = this.C;
                    if (bVar != null) {
                        str2 = bVar.getTicket();
                    } else {
                        str2 = null;
                    }
                    com.ss.android.ugc.aweme.account.login.v2.base.j A2 = A();
                    com.ss.android.ugc.aweme.account.login.v2.base.k V_ = V_();
                    h.f.b.l.d(this, "");
                    h.f.b.l.d(str, "");
                    h.f.b.l.d(A2, "");
                    h.f.b.l.d(V_, "");
                    f.a.n b2 = f.a.n.a((f.a.q) new x.be(A2, V_, this, str2, str)).d(new x.bf(this)).b(x.bg.f64420a);
                    h.f.b.l.b(b2, "");
                    com.ss.android.ugc.aweme.account.login.v2.a.z.a(this, b2).d(new e(this)).c();
                    return;
                }
                String str3 = this.f64844a;
                com.ss.android.ugc.aweme.account.login.v2.base.j A3 = A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_2 = V_();
                boolean z3 = this.f64849l;
                h.f.b.l.d(this, "");
                h.f.b.l.d(str3, "");
                h.f.b.l.d(str, "");
                h.f.b.l.d(A3, "");
                h.f.b.l.d(V_2, "");
                if (A3 == com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                f.a.n b3 = f.a.n.a((f.a.q) new x.bb(A3, this, V_2, str3, str)).d(new x.bc(z2, z3, this)).b(new x.bd(z2, z3, this));
                h.f.b.l.b(b3, "");
                com.ss.android.ugc.aweme.account.login.v2.a.z.a(this, b3).d(new g(this)).c();
                return;
            case 3:
                String str4 = this.n;
                com.ss.android.ugc.aweme.account.login.v2.base.j A4 = A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_3 = V_();
                h.f.b.l.d(this, "");
                h.f.b.l.d(str4, "");
                h.f.b.l.d(str, "");
                h.f.b.l.d(A4, "");
                h.f.b.l.d(V_3, "");
                f.a.n b4 = f.a.n.a((f.a.q) new x.cx(this, A4, V_3, str4, str)).d(new x.cy(this)).b(new x.cz(this));
                h.f.b.l.b(b4, "");
                com.ss.android.ugc.aweme.account.login.v2.a.z.a(this, b4).d(new h(this)).c();
                return;
            case 4:
                com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, this.f64844a, str, 4, (Map<String, String>) null, new i(this)).d(new C1448j(this)).c();
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                com.ss.android.ugc.aweme.account.login.v2.a.x.a("forget_password", this, this.n, str, 4, (Map<String, String>) null, new k(this)).d(new l(this)).c();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                String str5 = this.f64844a;
                com.ss.android.ugc.aweme.account.login.v2.base.j A5 = A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_4 = V_();
                Bundle arguments = getArguments();
                if (arguments == null) {
                    h.f.b.l.b();
                }
                boolean z4 = arguments.getBoolean("from_changePwd", false);
                h.f.b.l.d(this, "");
                h.f.b.l.d(str5, "");
                h.f.b.l.d(A5, "");
                h.f.b.l.d(V_4, "");
                h.f.b.l.d(str, "");
                f.a.n b5 = f.a.n.a((f.a.q) new x.d(this, A5, V_4, z4, str5, str)).d(new x.e(this, str5)).b(new x.f(this, str5));
                h.f.b.l.b(b5, "");
                com.ss.android.ugc.aweme.account.login.v2.a.z.a(this, b5).d(new m(this)).c();
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                com.ss.android.ugc.aweme.account.login.v2.base.j A6 = A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_5 = V_();
                h.f.b.l.d(this, "");
                h.f.b.l.d(A6, "");
                h.f.b.l.d(V_5, "");
                h.f.b.l.d(str, "");
                f.a.n b6 = f.a.n.a((f.a.q) new x.bh(A6, V_5, this, str, com.ss.android.ugc.aweme.account.login.v2.a.x.a(V_5))).d(new x.bi(this)).b(new x.bj(this));
                h.f.b.l.b(b6, "");
                com.ss.android.ugc.aweme.account.login.v2.a.z.a(this, b6).d(new n(this)).c();
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                String str6 = this.f64844a;
                com.ss.android.ugc.aweme.account.login.v2.base.j A7 = A();
                com.ss.android.ugc.aweme.account.login.v2.base.k V_6 = V_();
                String str7 = this.A;
                String str8 = this.B;
                h.f.b.l.d(this, "");
                h.f.b.l.d(A7, "");
                h.f.b.l.d(V_6, "");
                h.f.b.l.d(str, "");
                h.f.b.l.d(str7, "");
                h.f.b.l.d(str8, "");
                androidx.c.a aVar = new androidx.c.a();
                aVar.put("unusable_mobile_ticket", str8);
                f.a.n b7 = f.a.n.a((f.a.q) new x.h(A7, V_6, this, str6, str, str7, aVar)).d(new x.i(this)).b(new x.j(this));
                h.f.b.l.b(b7, "");
                com.ss.android.ugc.aweme.account.login.v2.a.z.a(this, b7).d(new f(this)).c();
                return;
            default:
                throw new IllegalStateException("Unknown step [" + V_() + "] when trying to validate codes");
        }
    }

    public final void onClick(View view) {
        Integer num;
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        String str;
        ClickAgent.onClick(view);
        String str2 = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        String str3 = "user_click";
        if (num != null) {
            if (num.intValue() == R.id.bp_) {
                if (e()) {
                    com.ss.android.ugc.aweme.common.r.onEventV3("resend_code_phone");
                }
                switch (k.f64880c[V_().ordinal()]) {
                    case 1:
                    case 2:
                        String str4 = "choose_dialog";
                        if (A() == com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT) {
                            f.b bVar = this.C;
                            if (bVar != null) {
                                str = bVar.getTicket();
                            } else {
                                str = null;
                            }
                            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT;
                            com.ss.android.ugc.aweme.account.login.v2.base.k kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN;
                            boolean z2 = this.f64850m;
                            if (!z2) {
                                str3 = "auto_system";
                            }
                            if (!z2) {
                                str4 = null;
                            }
                            com.ss.android.ugc.aweme.account.login.v2.a.x.b(this, str, jVar, kVar, "", str3, str4).d(new t(this)).c();
                            return;
                        } else if (this.f64849l) {
                            com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, this.f64844a, A(), V_(), "resend", "").d(new u(this)).c();
                            return;
                        } else {
                            String str5 = this.f64844a;
                            com.ss.android.ugc.aweme.account.login.v2.base.j A2 = A();
                            com.ss.android.ugc.aweme.account.login.v2.base.k V_ = V_();
                            if (!this.f64850m) {
                                str4 = null;
                            }
                            com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, str5, A2, V_, "", "resend", str4, 128).d(new v(this)).c();
                            return;
                        }
                    case 3:
                        String str6 = this.n;
                        Bundle arguments = getArguments();
                        if (arguments != null) {
                            str2 = arguments.getString("password");
                        }
                        com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, str6, 1, "resend", (Map) null, str2, 64).d(new w(this)).c();
                        return;
                    case 4:
                        com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, this.f64844a, V_(), "resend").d(new x(this)).c();
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, this.n, 4, "resend", (Map) null, (String) null, 96).d(new y(this)).c();
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, this.f64844a, A(), V_(), this.A, this.B, "resend").d(new z(this)).c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown step [" + V_() + "] when trying to send codes");
                }
            } else if (num != null) {
                if (num.intValue() == R.id.bpe) {
                    if (this.f64846c && !TextUtils.isEmpty(this.f64844a)) {
                        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), m(), A());
                        if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
                            this.y = true;
                            com.ss.android.ugc.aweme.account.login.v2.a.x.b(this, this.f64844a, A(), V_(), str3).d(new aa(this)).c();
                            return;
                        }
                        J();
                    }
                } else if (num.intValue() != R.id.bpb) {
                } else {
                    if (this.f64848e) {
                        z.a aVar2 = new z.a();
                        aVar2.element = false;
                        h.f.b.l.d("sms_verification", "");
                        com.ss.android.ugc.aweme.common.r.a("login_procedure_jump_notify", new com.ss.android.ugc.aweme.app.f.d().a("platform", "sms_verification").f66730a);
                        com.ss.android.ugc.aweme.common.f.a aVar3 = new com.ss.android.ugc.aweme.common.f.a(getActivity());
                        aVar3.a(new String[]{getString(R.string.ap1), getString(R.string.d0a)}, new ab(this, aVar2));
                        androidx.appcompat.app.c a3 = aVar3.f76416a.a();
                        a3.setOnDismissListener(new ac(aVar2));
                        bt.a(a3);
                        return;
                    }
                    n();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        h.f.b.l.d(str, "");
        if (!this.y || i2 != 1206) {
            this.z = true;
            CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
            h.f.b.l.b(codeInputView, "");
            codeInputView.setEnabled(true);
            ((CodeInputView) c(R.id.bpd)).c();
            ((InputResultIndicator) c(R.id.bp7)).a(str);
            return;
        }
        this.y = false;
        J();
    }

    /* access modifiers changed from: package-private */
    public static final class ab implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f64853b;

        static {
            Covode.recordClassIndex(39855);
        }

        ab(j jVar, z.a aVar) {
            this.f64852a = jVar;
            this.f64853b = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (i2 == 1) {
                this.f64853b.element = true;
                com.ss.android.ugc.aweme.account.login.d.a.a("sms_verification", "log_in_with_password");
                this.f64852a.n();
            } else if (i2 == 0) {
                if (this.f64852a.getActivity() != null) {
                    this.f64853b.element = true;
                    h.f.b.l.d("sms_verification", "");
                    com.ss.android.ugc.aweme.common.r.a("login_procedure_jump_confirm", new com.ss.android.ugc.aweme.app.f.d().a("platform", "sms_verification").f66730a);
                    com.ss.android.ugc.aweme.account.login.d.a.a(this.f64852a, "sms_verification");
                } else {
                    return;
                }
            }
            dialogInterface.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        long j2;
        String str;
        String str2;
        com.ss.android.ugc.aweme.account.login.ui.a aVar2;
        boolean z2;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), E(), A());
        this.p = a2;
        String str3 = null;
        if (a2 != null) {
            aVar = a2.f64744a;
        } else {
            aVar = null;
        }
        this.q = aVar;
        if (V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN && !this.r) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.bpb);
            h.f.b.l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            this.f64848e = false;
        }
        TimerTextView timerTextView = (TimerTextView) c(R.id.bpc);
        com.ss.android.ugc.aweme.account.login.ui.a aVar3 = this.q;
        if (aVar3 != null) {
            j2 = aVar3.b();
        } else {
            j2 = 60000;
        }
        timerTextView.a(j2, "s");
        CodeInputView codeInputView = (CodeInputView) c(R.id.bpd);
        h.f.b.l.b(codeInputView, "");
        codeInputView.setEnabled(true);
        ((CodeInputView) c(R.id.bpd)).a();
        ((CodeInputView) c(R.id.bpd)).b();
        ((CodeInputView) c(R.id.bpd)).setCallback(this);
        ((CodeInputView) c(R.id.bpd)).setInputLength(this.o);
        com.bytedance.ies.dmt.ui.f.c.a(c(R.id.bp_), 0.5f);
        com.bytedance.ies.dmt.ui.f.c.a(c(R.id.bpb), 0.5f);
        a(c(R.id.bp_), this);
        String string = getString(R.string.ar1);
        h.f.b.l.b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.ar4, string));
        TuxTextView tuxTextView2 = (TuxTextView) c(R.id.bpe);
        h.f.b.l.b(tuxTextView2, "");
        spannableStringBuilder.setSpan(new r(this, androidx.core.content.b.c(tuxTextView2.getContext(), R.color.bh), getResources().getColor(R.color.bh)), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 34);
        TuxTextView tuxTextView3 = (TuxTextView) c(R.id.bpe);
        h.f.b.l.b(tuxTextView3, "");
        tuxTextView3.setText(spannableStringBuilder);
        TuxTextView tuxTextView4 = (TuxTextView) c(R.id.bpe);
        h.f.b.l.b(tuxTextView4, "");
        tuxTextView4.setMovementMethod(com.ss.android.ugc.aweme.account.views.a.a());
        ((TuxTextView) c(R.id.bpb)).setOnClickListener(this);
        if (!(V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.EMAIL_SMS_SIGN_UP || V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.EMAIL_SMS_FIND_PASSWORD)) {
            com.ss.android.ugc.aweme.account.login.e.f fVar = this.s;
            if (fVar == null) {
                h.f.b.l.b();
            }
            androidx.lifecycle.t<String> tVar = fVar.f63434b;
            h.f.b.l.b(tVar, "");
            String value = tVar.getValue();
            if (!TextUtils.isEmpty(value)) {
                ((CodeInputView) c(R.id.bpd)).setTextAndAutoCheck(value);
                com.ss.android.ugc.aweme.account.login.e.f fVar2 = this.s;
                if (fVar2 == null) {
                    h.f.b.l.b();
                }
                androidx.lifecycle.t<String> tVar2 = fVar2.f63434b;
                h.f.b.l.b(tVar2, "");
                tVar2.setValue("");
                o();
            } else {
                com.ss.android.ugc.aweme.account.login.e.f fVar3 = this.s;
                if (fVar3 == null) {
                    h.f.b.l.b();
                }
                fVar3.f63434b.observe(this, new o(this));
            }
        }
        if (V_() != com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_VERIFY) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                arguments.getBoolean("code_sent");
            }
            Bundle arguments2 = getArguments();
            if (arguments2 == null || !arguments2.getBoolean("code_sent")) {
                if (!(this.q == null || !a.a().containsKey(this.f64844a) || a.a().get(this.f64844a) == null)) {
                    Boolean bool = a.a().get(this.f64844a);
                    if (bool == null) {
                        h.f.b.l.b();
                    }
                    this.f64846c = bool.booleanValue();
                    com.ss.android.ugc.aweme.account.login.ui.a aVar4 = this.q;
                    if (aVar4 == null) {
                        h.f.b.l.b();
                    }
                    a(aVar4.b());
                }
                com.ss.android.ugc.aweme.account.login.ui.a aVar5 = this.q;
                if (aVar5 == null || !aVar5.d()) {
                    k();
                } else {
                    ((TimerTextView) c(R.id.bpc)).setCallback(this.H);
                    TimerTextView timerTextView2 = (TimerTextView) c(R.id.bpc);
                    com.ss.android.ugc.aweme.account.login.ui.a aVar6 = this.q;
                    if (aVar6 == null) {
                        h.f.b.l.b();
                    }
                    timerTextView2.a(aVar6);
                    i();
                }
            } else {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    arguments3.remove("code_sent");
                }
                l();
                if ((V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_SIGN_UP || V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN) && A() != com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!TextUtils.isEmpty(this.f64844a) && z2) {
                    if (!a.a().containsKey(this.f64844a) || a.a().get(this.f64844a) == null) {
                        com.ss.android.ugc.aweme.account.loginsetting.d.a(this.f64844a, new c(this));
                    } else {
                        Boolean bool2 = a.a().get(this.f64844a);
                        if (bool2 == null) {
                            h.f.b.l.b();
                        }
                        this.f64846c = bool2.booleanValue();
                    }
                }
            }
        } else {
            com.ss.android.ugc.aweme.account.login.ui.a aVar7 = this.q;
            if (aVar7 == null) {
                TimerTextView timerTextView3 = (TimerTextView) c(R.id.bpc);
                h.f.b.l.b(timerTextView3, "");
                timerTextView3.setVisibility(8);
                com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, "", A(), V_(), "", this.B, "user_click").d(new p(this)).c();
            } else if (aVar7.d()) {
                ((TimerTextView) c(R.id.bpc)).setCallback(this.H);
                TimerTextView timerTextView4 = (TimerTextView) c(R.id.bpc);
                com.ss.android.ugc.aweme.account.login.ui.a aVar8 = this.q;
                if (aVar8 == null) {
                    h.f.b.l.b();
                }
                timerTextView4.a(aVar8);
                i();
            } else {
                com.ss.android.ugc.aweme.account.login.ui.a aVar9 = this.q;
                if (aVar9 == null) {
                    h.f.b.l.b();
                }
                if (aVar9.c()) {
                    k();
                }
            }
        }
        if (A() == com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT && V_() == com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN) {
            TimerHolder.b a3 = TimerHolder.a.a(getActivity(), E(), A());
            if (a3 == null || (aVar2 = a3.f64744a) == null || !aVar2.d()) {
                CodeInputView codeInputView2 = (CodeInputView) c(R.id.bpd);
                h.f.b.l.b(codeInputView2, "");
                codeInputView2.setEnabled(false);
                TimerTextView timerTextView5 = (TimerTextView) c(R.id.bpc);
                h.f.b.l.b(timerTextView5, "");
                timerTextView5.setVisibility(8);
                f.b bVar = this.C;
                if (bVar != null) {
                    str = bVar.getTicket();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT;
                com.ss.android.ugc.aweme.account.login.v2.base.k kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN;
                boolean z3 = this.f64850m;
                if (z3) {
                    str2 = "user_click";
                } else {
                    str2 = "auto_system";
                }
                if (z3) {
                    str3 = "choose_dialog";
                }
                com.ss.android.ugc.aweme.account.login.v2.a.x.b(this, str, jVar, kVar, "", str2, str3).d(new q(this)).c();
            }
        }
    }

    public final void a(String str, boolean z2, int i2) {
        String str2;
        com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", "forgot_password").a("enter_method", x()).a("platform", str);
        if (z2) {
            str2 = "success";
        } else {
            str2 = "fail";
        }
        com.ss.android.ugc.aweme.common.r.a("forgot_pw_code_submit", a2.a("status", str2).a("error_code", i2).a("duration", System.currentTimeMillis() - this.t).f62575a);
    }
}

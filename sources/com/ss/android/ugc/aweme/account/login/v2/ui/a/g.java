package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.experiment.n;
import com.ss.android.ugc.aweme.account.i;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.a.z;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.f;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import f.a.q;
import h.f.b.l;
import java.util.HashMap;

public final class g extends a implements com.bytedance.analytics.page.d {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f64825b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f64826c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f64827a = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.account.login.v2.ui.f f64828d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f64829e;

    static {
        Covode.recordClassIndex(39839);
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "PhoneEmailSignUpStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64829e == null) {
            this.f64829e = new HashMap();
        }
        View view = (View) this.f64829e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64829e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hk;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64829e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39840);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static com.ss.android.ugc.aweme.account.a.b.a a(TuxCheckBox tuxCheckBox) {
            l.d(tuxCheckBox, "");
            com.ss.android.ugc.aweme.account.a.b.a aVar = new com.ss.android.ugc.aweme.account.a.b.a();
            String str = "checked";
            if (n.a()) {
                if (!tuxCheckBox.isChecked()) {
                    str = "unchecked";
                }
                aVar.a("email_checkbox_status", str);
                aVar.a("text_type", "short_version");
            } else if (n.b()) {
                if (!tuxCheckBox.isChecked()) {
                    str = "unchecked";
                }
                aVar.a("email_checkbox_status", str);
                aVar.a("text_type", "long_version");
            }
            return aVar;
        }

        public static void a(Integer num, String str) {
            int i2;
            l.d(str, "");
            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "email").a("enter_method", str);
            if (num != null && num.intValue() == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            com.ss.android.ugc.aweme.account.a.b.a a3 = a2.a("is_success", i2).a("is_register", 1);
            if (num == null) {
                a3.a("error_code", "");
            } else {
                a3.a("error_code", num.intValue());
            }
            r.a("register_click_next_result", a3.f62575a);
        }

        public static void a(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            r.a("show_button_consent_check_box", new com.ss.android.ugc.aweme.account.a.b.a().a("page_name", str).a("exp_name", str2).a("text_type", str3).f62575a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.auj)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.auj)).a(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void f() {
        super.f();
        RecyclerView recyclerView = (RecyclerView) c(R.id.aul);
        l.b(recyclerView, "");
        recyclerView.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, true, null, false, true, 895);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.k
    public final void u() {
        super.u();
        RecyclerView recyclerView = (RecyclerView) c(R.id.aul);
        l.b(recyclerView, "");
        recyclerView.setVisibility(8);
    }

    public static final class e extends i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f64833a;

        static {
            Covode.recordClassIndex(39844);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f64833a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f64833a.c(R.id.aun);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f64833a.c(R.id.auj);
            if (loadingButton != null) {
                boolean z = false;
                if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                    z = true;
                }
                loadingButton.setEnabled(z);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f64834a;

        static {
            Covode.recordClassIndex(39845);
        }

        f(g gVar) {
            this.f64834a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            bt.a(com.ss.android.ugc.aweme.account.base.a.a.a(this.f64834a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.g$g  reason: collision with other inner class name */
    static final class View$OnClickListenerC1447g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f64835a;

        static {
            Covode.recordClassIndex(39846);
        }

        View$OnClickListenerC1447g(g gVar) {
            this.f64835a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            bt.a(com.ss.android.ugc.aweme.account.base.a.a.b(this.f64835a.getActivity()));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f64832a;

        static {
            Covode.recordClassIndex(39843);
        }

        d(g gVar) {
            this.f64832a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f64832a.c(R.id.auo);
            l.b(tuxCheckBox, "");
            com.ss.android.ugc.aweme.account.a.b.a a2 = a.a(tuxCheckBox);
            a2.a("page_name", "email_signup_page");
            a2.a("exp_name", "onboarding_collect_email_consent");
            r.a("click_button_consent_check_box", a2.f62575a);
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f64830a;

        static {
            Covode.recordClassIndex(39841);
        }

        b(g gVar) {
            this.f64830a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            com.bytedance.sdk.a.h.a.d dVar = (com.bytedance.sdk.a.h.a.d) obj;
            g gVar = this.f64830a;
            com.ss.android.ugc.aweme.account.login.v2.base.e.a(gVar, ((InputWithIndicator) gVar.c(R.id.aum)).getText());
            ((InputWithIndicator) this.f64830a.c(R.id.aum)).getText();
            l.b(dVar, "");
            dVar.a();
            if (dVar.a()) {
                g gVar2 = this.f64830a;
                Bundle arguments = gVar2.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", k.EMAIL_PASSWORD_LOGIN.getValue());
                l.b(arguments, "");
                gVar2.a(arguments);
            } else {
                g gVar3 = this.f64830a;
                Bundle arguments2 = gVar3.getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                if (com.ss.android.ugc.aweme.account.experiment.l.a()) {
                    arguments2.putInt("next_page", k.EMAIL_VERIFICATION_WHEN_SIGN_UP.getValue());
                } else {
                    arguments2.putInt("next_page", k.CREATE_PASSWORD_FOR_EMAIL.getValue());
                }
                l.b(arguments2, "");
                gVar3.a(arguments2);
                if (n.b() || n.a()) {
                    TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f64830a.c(R.id.auo);
                    l.b(tuxCheckBox, "");
                    z = tuxCheckBox.isChecked();
                } else {
                    z = false;
                }
                g.f64825b = z;
            }
            String x = this.f64830a.x();
            l.b(x, "");
            a.a(0, x);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f64831a;

        static {
            Covode.recordClassIndex(39842);
        }

        c(g gVar) {
            this.f64831a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            TuxCheckBox tuxCheckBox = (TuxCheckBox) this.f64831a.c(R.id.auo);
            l.b(tuxCheckBox, "");
            r.a("register_click_next", a.a(tuxCheckBox).a("platform", "email").a("enter_method", this.f64831a.x()).a("stay_time", System.currentTimeMillis() - this.f64831a.f64827a).f62575a);
            String text = ((InputWithIndicator) this.f64831a.c(R.id.aum)).getText();
            if (TextUtils.isEmpty(text) || !Patterns.EMAIL_ADDRESS.matcher(text).matches()) {
                g gVar = this.f64831a;
                String string = gVar.getString(R.string.aq5);
                l.b(string, "");
                gVar.a(0, string);
                String x = this.f64831a.x();
                l.b(x, "");
                a.a(null, x);
                return;
            }
            ((InputResultIndicator) this.f64831a.c(R.id.aun)).a();
            g gVar2 = this.f64831a;
            String text2 = ((InputWithIndicator) gVar2.c(R.id.aum)).getText();
            j jVar = j.SIGN_UP;
            k V_ = gVar2.V_();
            l.d(gVar2, "");
            l.d(text2, "");
            l.d(jVar, "");
            l.d(V_, "");
            f.a.n b2 = f.a.n.a((q) new x.t(jVar, V_, gVar2, text2)).b(new x.u(gVar2));
            l.b(b2, "");
            z.a(gVar2, b2).d(new b(gVar2)).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        ((InputResultIndicator) c(R.id.aun)).a(str);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context;
        Context context2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        String str = null;
        if (n.a()) {
            TuxCheckBox tuxCheckBox = (TuxCheckBox) c(R.id.auo);
            l.b(tuxCheckBox, "");
            tuxCheckBox.setVisibility(0);
            TuxTextView tuxTextView = (TuxTextView) c(R.id.auy);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.auy);
            l.b(tuxTextView2, "");
            TuxTextView tuxTextView3 = (TuxTextView) c(R.id.auy);
            if (!(tuxTextView3 == null || (context2 = tuxTextView3.getContext()) == null)) {
                str = context2.getString(R.string.bd);
            }
            tuxTextView2.setText(str);
            a.a("email_signup_page", "onboarding_collect_email_consent", "short_version");
        } else if (n.b()) {
            TuxCheckBox tuxCheckBox2 = (TuxCheckBox) c(R.id.auo);
            l.b(tuxCheckBox2, "");
            tuxCheckBox2.setVisibility(0);
            TuxTextView tuxTextView4 = (TuxTextView) c(R.id.auy);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(0);
            TuxTextView tuxTextView5 = (TuxTextView) c(R.id.auy);
            l.b(tuxTextView5, "");
            TuxTextView tuxTextView6 = (TuxTextView) c(R.id.auy);
            if (!(tuxTextView6 == null || (context = tuxTextView6.getContext()) == null)) {
                str = context.getString(R.string.bc);
            }
            tuxTextView5.setText(str);
            a.a("email_signup_page", "onboarding_collect_email_consent", "long_version");
        } else {
            TuxCheckBox tuxCheckBox3 = (TuxCheckBox) c(R.id.auo);
            l.b(tuxCheckBox3, "");
            tuxCheckBox3.setVisibility(8);
            TuxTextView tuxTextView7 = (TuxTextView) c(R.id.auy);
            l.b(tuxTextView7, "");
            tuxTextView7.setVisibility(8);
        }
        a(c(R.id.auj), new c(this));
        a(c(R.id.auo), new d(this));
        ((InputWithIndicator) c(R.id.aum)).setTextWatcher(new e(this));
        com.ss.android.ugc.aweme.account.login.z.a(getContext(), (TextView) c(R.id.auk), new f(this), new View$OnClickListenerC1447g(this), false);
        RecyclerView recyclerView = (RecyclerView) c(R.id.aul);
        l.b(recyclerView, "");
        EditText editText = ((InputWithIndicator) c(R.id.aum)).getEditText();
        String w = w();
        l.b(w, "");
        String x = x();
        l.b(x, "");
        this.f64828d = f.c.a(recyclerView, editText, w, x);
        ((InputWithIndicator) c(R.id.aum)).getEditText().setNextFocusDownId(((InputWithIndicator) c(R.id.aum)).getEditText().getId());
    }
}

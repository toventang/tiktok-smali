package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.view.a;
import com.ss.android.ugc.aweme.account.login.z;
import com.ss.android.ugc.aweme.account.n.n;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.ui.PhoneInputView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;

public final class u extends a implements com.bytedance.analytics.page.d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f64984c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.view.a f64985a;

    /* renamed from: b  reason: collision with root package name */
    public long f64986b = System.currentTimeMillis();

    /* renamed from: d  reason: collision with root package name */
    private boolean f64987d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f64988e = h.i.a((h.f.a.a) new f(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f64989j;

    static {
        Covode.recordClassIndex(39951);
    }

    private final com.ss.android.ugc.aweme.account.login.e.a e() {
        return (com.ss.android.ugc.aweme.account.login.e.a) this.f64988e.getValue();
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "PhoneEmailSignUpStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64989j == null) {
            this.f64989j = new HashMap();
        }
        View view = (View) this.f64989j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64989j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hs;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64989j;
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
            Covode.recordClassIndex(39952);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Integer num, String str) {
            int i2;
            l.d(str, "");
            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("enter_method", str);
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
    }

    public static final class g implements a.AbstractC1449a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64994a;

        static {
            Covode.recordClassIndex(39958);
        }

        @Override // com.ss.android.ugc.aweme.account.login.view.a.AbstractC1449a
        public final void a() {
            bt.b(this.f64994a.f64985a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(u uVar) {
            this.f64994a = uVar;
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.login.e.a> {
        final /* synthetic */ u this$0;

        static {
            Covode.recordClassIndex(39957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(u uVar) {
            super(0);
            this.this$0 = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.login.e.a invoke() {
            u uVar = this.this$0;
            return new com.ss.android.ugc.aweme.account.login.e.a(uVar, uVar.x());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        e().b();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.d4e)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.d4e);
        if (loadingButton != null) {
            loadingButton.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, true, 1023);
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (AccountKeyBoardHelper.a.a()) {
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((PhoneInputView) c(R.id.d4h)).getInputView().getEditText());
        } else {
            ((PhoneInputView) c(R.id.d4h)).getInputView().getEditText().requestFocus();
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64990a;

        static {
            Covode.recordClassIndex(39953);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(u uVar) {
            this.f64990a = uVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f64990a.c(R.id.d4g);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f64990a.c(R.id.d4e);
            if (loadingButton != null) {
                boolean z = false;
                if (!(editable == null || (obj = editable.toString()) == null || obj.length() <= 0)) {
                    z = true;
                }
                loadingButton.setEnabled(z);
            }
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e().a();
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64991a;

        static {
            Covode.recordClassIndex(39954);
        }

        c(u uVar) {
            this.f64991a = uVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            bt.a(com.ss.android.ugc.aweme.account.base.a.a.a(this.f64991a.getActivity()));
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64992a;

        static {
            Covode.recordClassIndex(39955);
        }

        d(u uVar) {
            this.f64992a = uVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            bt.a(com.ss.android.ugc.aweme.account.base.a.a.b(this.f64992a.getActivity()));
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64995a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64996b;

        static {
            Covode.recordClassIndex(39959);
        }

        h(u uVar, boolean z) {
            this.f64995a = uVar;
            this.f64996b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64995a.a(this.f64996b);
            this.f64995a.a(this.f64996b, true);
            bt.b(this.f64995a.f64985a);
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64998b;

        static {
            Covode.recordClassIndex(39960);
        }

        i(u uVar, boolean z) {
            this.f64997a = uVar;
            this.f64998b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64997a.a(!this.f64998b);
            this.f64997a.a(!this.f64998b, true);
            bt.b(this.f64997a.f64985a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64999a;

        static {
            Covode.recordClassIndex(39961);
        }

        j(u uVar) {
            this.f64999a = uVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f64999a.x();
            l.b(x, "");
            a.a(0, x);
            this.f64999a.b(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f65000a;

        static {
            Covode.recordClassIndex(39962);
        }

        k(u uVar) {
            this.f65000a = uVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f65000a.x();
            l.b(x, "");
            a.a(0, x);
            this.f65000a.b(false, true);
        }
    }

    public final void a(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        r.a(str, new com.ss.android.ugc.aweme.account.a.b.a().a("enter_type", y()).f62575a);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f64993a;

        static {
            Covode.recordClassIndex(39956);
        }

        e(u uVar) {
            this.f64993a = uVar;
        }

        public final void onClick(View view) {
            String string;
            String string2;
            ClickAgent.onClick(view);
            r.a("register_click_next", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("enter_method", this.f64993a.x()).a("stay_time", System.currentTimeMillis() - this.f64993a.f64986b).f62575a);
            if (!com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) this.f64993a.c(R.id.d4h)).getCountryCodeString(), ((PhoneInputView) this.f64993a.c(R.id.d4h)).getPhoneNumberString())) {
                String x = this.f64993a.x();
                l.b(x, "");
                a.a(null, x);
                u uVar = this.f64993a;
                String string3 = uVar.getString(R.string.aqs);
                l.b(string3, "");
                uVar.a(0, string3);
            } else if (n.a(((PhoneInputView) this.f64993a.c(R.id.d4h)).getCountryCodeString())) {
                u uVar2 = this.f64993a;
                if (uVar2.getActivity() != null) {
                    String countryCodeString = ((PhoneInputView) uVar2.c(R.id.d4h)).getCountryCodeString();
                    boolean b2 = n.b(countryCodeString);
                    if (n.b(countryCodeString)) {
                        string = uVar2.getString(R.string.fl1);
                        l.b(string, "");
                        string2 = uVar2.getString(R.string.fl0);
                        l.b(string2, "");
                    } else {
                        string = uVar2.getString(R.string.fl0);
                        l.b(string, "");
                        string2 = uVar2.getString(R.string.fl1);
                        l.b(string2, "");
                    }
                    String fullPhoneNumber = ((PhoneInputView) uVar2.c(R.id.d4h)).getFullPhoneNumber();
                    androidx.fragment.app.e activity = uVar2.getActivity();
                    if (activity == null) {
                        l.b();
                    }
                    l.b(activity, "");
                    String string4 = uVar2.getString(R.string.fl2);
                    l.b(string4, "");
                    String string5 = uVar2.getString(R.string.fkz, fullPhoneNumber);
                    l.b(string5, "");
                    String y = uVar2.y();
                    l.b(y, "");
                    uVar2.f64985a = new com.ss.android.ugc.aweme.account.login.view.a(activity, new a.b(string4, string5, string, string2, y, fullPhoneNumber));
                    com.ss.android.ugc.aweme.account.login.view.a aVar = uVar2.f64985a;
                    if (aVar == null) {
                        l.b();
                    }
                    aVar.f65105a = new g(uVar2);
                    com.ss.android.ugc.aweme.account.login.view.a aVar2 = uVar2.f64985a;
                    if (aVar2 == null) {
                        l.b();
                    }
                    aVar2.f65106b = new h(uVar2, b2);
                    com.ss.android.ugc.aweme.account.login.view.a aVar3 = uVar2.f64985a;
                    if (aVar3 == null) {
                        l.b();
                    }
                    aVar3.f65107c = new i(uVar2, b2);
                    bt.a(uVar2.f64985a);
                }
            } else {
                this.f64993a.a(false, false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.d4g);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
    }

    public final void b(boolean z, boolean z2) {
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, ((PhoneInputView) c(R.id.d4h)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_SIGN_UP.getValue());
        arguments.putInt("current_scene", com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP.getValue());
        arguments.putBoolean("code_sent", z2);
        arguments.putBoolean("use_whatsapp", z);
        l.b(arguments, "");
        a(arguments);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((PhoneInputView) c(R.id.d4h)).getInputView().setTextWatcher(new b(this));
        z.a(getContext(), (TextView) c(R.id.d4f), new c(this), new d(this), true);
        ((PhoneInputView) c(R.id.d4h)).a();
        if (!this.f64987d) {
            e().a(((PhoneInputView) c(R.id.d4h)).getEditText());
            this.f64987d = true;
        }
        a(c(R.id.d4e), new e(this));
    }

    public final void a(boolean z, boolean z2) {
        String str;
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), ((PhoneInputView) c(R.id.d4h)).getFullPhoneNumber(), com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP);
        if (a2 != null && (aVar = a2.f64744a) != null && aVar.d()) {
            b(z, false);
        } else if (z) {
            String a3 = com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) c(R.id.d4h)).getPhoneNumberObject());
            l.b(a3, "");
            x.a(this, a3, com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP, com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_SIGN_UP, "user_click", "").d(new j(this)).c();
        } else {
            String a4 = com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) c(R.id.d4h)).getPhoneNumberObject());
            l.b(a4, "");
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP;
            com.ss.android.ugc.aweme.account.login.v2.base.k kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_SIGN_UP;
            if (z2) {
                str = "choose_dialog";
            } else {
                str = null;
            }
            x.a(this, a4, jVar, kVar, "", "user_click", str, 128).d(new k(this)).c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        e().a(i2, i3, intent);
    }
}

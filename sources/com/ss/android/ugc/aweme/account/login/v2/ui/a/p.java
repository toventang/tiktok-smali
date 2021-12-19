package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.q;
import com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.ui.PhoneInputView;
import com.ss.android.ugc.aweme.base.ui.o;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.services.BaseBindService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class p extends a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f64919d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    String f64920a = "";

    /* renamed from: b  reason: collision with root package name */
    String f64921b = "";

    /* renamed from: c  reason: collision with root package name */
    public long f64922c = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    private final h.h f64923e = h.i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f64924j;

    static {
        Covode.recordClassIndex(39905);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64924j == null) {
            this.f64924j = new HashMap();
        }
        View view = (View) this.f64924j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64924j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.ho;
    }

    public final boolean e() {
        return ((Boolean) this.f64923e.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64924j;
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
            Covode.recordClassIndex(39906);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.bpo);
        if (loadingButton != null) {
            loadingButton.b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.bpo);
        if (loadingButton != null) {
            loadingButton.a(true);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(39907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p pVar) {
            super(0);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount", false));
        }
    }

    static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f64930a;

        static {
            Covode.recordClassIndex(39912);
        }

        f(p pVar) {
            this.f64930a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f64930a);
            aVar2.f33424a = b.a.TWO_FACTOR_AUTH;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.ui.a.p.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f64931a;

                static {
                    Covode.recordClassIndex(39913);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    if (this.f64931a.f64930a.getActivity() != null) {
                        androidx.fragment.app.e activity = this.f64931a.f64930a.getActivity();
                        if (!(activity instanceof com.ss.android.ugc.aweme.account.login.v2.base.b)) {
                            activity = null;
                        }
                        com.ss.android.ugc.aweme.account.login.v2.base.b bVar = (com.ss.android.ugc.aweme.account.login.v2.base.b) activity;
                        if (bVar != null && !bVar.isFinishing()) {
                            androidx.fragment.app.e activity2 = this.f64931a.f64930a.getActivity();
                            if (activity2 == null) {
                                l.b();
                            }
                            l.b(activity2, "");
                            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(activity2).b(this.f64931a.f64930a.getString(R.string.h1a)).d(this.f64931a.f64930a.getString(R.string.h19)), new a(this)).a(false)).a().b().show();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f64931a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.p$f$1$a */
                static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(39914);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(AnonymousClass1 r2) {
                        super(1);
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
                        com.bytedance.tux.dialog.b.b bVar2 = bVar;
                        l.d(bVar2, "");
                        String string = this.this$0.f64931a.f64930a.getString(R.string.h18);
                        l.b(string, "");
                        bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.account.login.v2.ui.a.p.f.AnonymousClass1.a.AnonymousClass1 */
                            final /* synthetic */ a this$0;

                            static {
                                Covode.recordClassIndex(39915);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                l.d(aVar, "");
                                com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("aweme://i18n_feedback_input");
                                gVar.a("feedback_id", "5695");
                                SmartRouter.buildRoute(this.this$0.this$0.f64931a.f64930a.getActivity(), gVar.a()).open();
                                a.C0732a.f33434a.a(b.a.TWO_FACTOR_AUTH);
                                return z.f158842a;
                            }
                        });
                        String string2 = this.this$0.f64931a.f64930a.getString(R.string.asq);
                        l.b(string2, "");
                        bVar2.b(string2, AnonymousClass2.f64932a);
                        bVar2.f44820b = true;
                        return z.f158842a;
                    }
                }
            }));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((PhoneInputView) c(R.id.bpq)).getEditText());
        this.f64922c = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        if (e()) {
            r.a("back", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", "Set up by Phone").a("duration", System.currentTimeMillis() - this.t).f62575a);
        }
        if (A() == j.BIND_PHONE) {
            com.ss.android.ugc.aweme.account.b.c.a(w());
        }
        return super.q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r0.getBoolean("show_skip") != false) goto L_0x0068;
     */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        /*
        // Method dump skipped, instructions count: 395
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.a.p.p():com.ss.android.ugc.aweme.account.login.v2.ui.b");
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f64933a;

        static {
            Covode.recordClassIndex(39917);
        }

        g(p pVar) {
            this.f64933a = pVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64933a.a(true);
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f64935a;

        static {
            Covode.recordClassIndex(39919);
        }

        i(p pVar) {
            this.f64935a = pVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64935a.a(true);
        }
    }

    public static final class c extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditText f64925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f64926b;

        static {
            Covode.recordClassIndex(39908);
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f64926b.c(R.id.bpo);
            if (loadingButton != null) {
                loadingButton.setEnabled(!TextUtils.isEmpty(this.f64925a.getText()));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f64926b.c(R.id.bpp);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
        }

        c(EditText editText, p pVar) {
            this.f64925a = editText;
            this.f64926b = pVar;
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f64934a;

        static {
            Covode.recordClassIndex(39918);
        }

        h(p pVar) {
            this.f64934a = pVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f64934a.e()) {
                r.a("click_next_for_proAccount", new com.ss.android.ugc.aweme.account.a.b.a().a("is_success", 1).a("method", "phone").a("page", "Set up by Phone").a("duration", System.currentTimeMillis() - this.f64934a.f64922c).f62575a);
            }
            this.f64934a.a(true);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f64927a;

        static {
            Covode.recordClassIndex(39909);
        }

        d(p pVar) {
            this.f64927a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f64927a.e()) {
                r.onEventV3("set_up_by_email");
            }
            Bundle arguments = this.f64927a.getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.getInt("last_scene", -1) != -1) {
                androidx.fragment.app.e activity = this.f64927a.getActivity();
                if (activity == null) {
                    l.b();
                }
                activity.finish();
                return;
            }
            BaseBindService h2 = cj.h();
            androidx.fragment.app.e activity2 = this.f64927a.getActivity();
            String w = this.f64927a.w();
            String x = this.f64927a.x();
            androidx.fragment.app.e activity3 = this.f64927a.getActivity();
            Objects.requireNonNull(activity3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
            Bundle c2 = ((BindOrModifyPhoneActivity) activity3).c();
            c2.putInt("current_scene", this.f64927a.A().getValue());
            h2.bindEmail(activity2, w, x, c2, new IAccountService.g(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.ui.a.p.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f64928a;

                static {
                    Covode.recordClassIndex(39910);
                }

                {
                    this.f64928a = r1;
                }

                @Override // com.ss.android.ugc.aweme.IAccountService.g
                public final void onResult(int i2, int i3, Object obj) {
                    if (i3 == 1) {
                        androidx.fragment.app.e activity = this.f64928a.f64927a.getActivity();
                        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity");
                        BindOrModifyPhoneActivity bindOrModifyPhoneActivity = (BindOrModifyPhoneActivity) activity;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.os.Bundle");
                        Bundle bundle = (Bundle) obj;
                        l.d(bundle, "");
                        bindOrModifyPhoneActivity.f65339a = true;
                        bindOrModifyPhoneActivity.f65340b = bundle;
                        bindOrModifyPhoneActivity.f65341c = Integer.valueOf(i2);
                        bindOrModifyPhoneActivity.finish();
                    }
                }
            });
        }
    }

    public final void a(boolean z) {
        com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, ((PhoneInputView) c(R.id.bpq)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("code_sent", z);
        int i2 = q.f64937b[V_().ordinal()];
        if (i2 == 1) {
            arguments.putInt("next_page", k.PHONE_SMS_FIND_PASSWORD.getValue());
        } else if (i2 == 2) {
            arguments.putInt("next_page", k.PHONE_SMS_BIND.getValue());
        } else if (i2 == 3) {
            arguments.putInt("next_page", k.PHONE_SMS_MODIFY.getValue());
        }
        l.b(arguments, "");
        a(arguments);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        if (A() == j.MODIFY_PHONE) {
            Bundle arguments = getArguments();
            String str2 = "";
            if (arguments == null || (str = arguments.getString("ticket")) == null) {
                str = str2;
            }
            this.f64920a = str;
            Bundle arguments2 = getArguments();
            if (!(arguments2 == null || (string = arguments2.getString("mUnusableMobileTicket")) == null)) {
                str2 = string;
            }
            this.f64921b = str2;
        } else if (A() == j.BIND_PHONE) {
            com.ss.android.ugc.aweme.account.b.c.a(w(), "mobile");
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f64929a;

        static {
            Covode.recordClassIndex(39911);
        }

        e(p pVar) {
            this.f64929a = pVar;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.account.login.ui.a aVar;
            ClickAgent.onClick(view);
            p pVar = this.f64929a;
            if (!com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) pVar.c(R.id.bpq)).getCountryCodeString(), ((PhoneInputView) pVar.c(R.id.bpq)).getPhoneNumberString())) {
                String string = pVar.getString(R.string.aqs);
                l.b(string, "");
                pVar.a(0, string);
                if (pVar.e()) {
                    r.a("input_wrong_phone", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Set up by Phone").a("error_code", "1").f62575a);
                    return;
                }
                return;
            }
            TimerHolder.b a2 = TimerHolder.a.a(pVar.getActivity(), ((PhoneInputView) pVar.c(R.id.bpq)).getFullPhoneNumber(), pVar.A());
            if (a2 == null || (aVar = a2.f64744a) == null || !aVar.d()) {
                String a3 = com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) pVar.c(R.id.bpq)).getPhoneNumberObject());
                l.b(a3, "");
                int i2 = q.f64936a[pVar.V_().ordinal()];
                if (i2 == 1) {
                    x.a(pVar, a3, pVar.V_(), "user_click").d(new g(pVar)).c();
                } else if (i2 == 2) {
                    x.a(pVar, com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) pVar.c(R.id.bpq)).getPhoneNumberObject()), pVar.A(), pVar.V_(), "", "", "user_click").d(new h(pVar)).c();
                } else if (i2 == 3) {
                    x.a(pVar, com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) pVar.c(R.id.bpq)).getPhoneNumberObject()), pVar.A(), pVar.V_(), pVar.f64920a, pVar.f64921b, "user_click").d(new i(pVar)).c();
                }
            } else {
                pVar.a(false);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.bpp);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
        if (i2 == 1356) {
            b.i.b(new f(this), b.i.f4826c);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        PhoneInputView phoneInputView = (PhoneInputView) c(R.id.bpq);
        EditText editText = phoneInputView.getEditText();
        editText.setInputType(3);
        editText.addTextChangedListener(new c(editText, this));
        editText.setHint(getString(R.string.d_a));
        a.C1412a b2 = com.ss.android.ugc.aweme.account.login.v2.base.e.b(this);
        if (b2 != null) {
            phoneInputView.setCountryCode(new StringBuilder().append(b2.getCountryCode()).toString());
            phoneInputView.setCountryName(b2.getCountryIso());
            phoneInputView.setPhoneNumber(new StringBuilder().append(b2.getNationalNumber()).toString());
        } else {
            phoneInputView.a();
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        if (arguments.getBoolean("use_email", false) || e()) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView2, "");
            q.a(tuxTextView2, new d(this), R.string.fnz, R.string.fo0);
        }
        a(c(R.id.bpo), new e(this));
    }
}

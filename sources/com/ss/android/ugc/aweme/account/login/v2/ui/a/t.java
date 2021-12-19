package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.model.a;
import com.ss.android.ugc.aweme.account.login.v2.timer.TimerHolder;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.view.a;
import com.ss.android.ugc.aweme.account.login.x;
import com.ss.android.ugc.aweme.account.n.n;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.ui.PhoneInputView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class t extends a implements com.bytedance.analytics.page.d, x {

    /* renamed from: c  reason: collision with root package name */
    public static final a f64962c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.account.login.view.a f64963a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f64964b = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f64965d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f64966e;

    /* renamed from: j  reason: collision with root package name */
    private String f64967j = "";

    /* renamed from: k  reason: collision with root package name */
    private String f64968k = "";

    /* renamed from: l  reason: collision with root package name */
    private final h.h f64969l = h.i.a((h.f.a.a) new d(this));

    /* renamed from: m  reason: collision with root package name */
    private boolean f64970m;
    private HashMap n;

    static {
        Covode.recordClassIndex(39936);
    }

    private final com.ss.android.ugc.aweme.account.login.e.a e() {
        return (com.ss.android.ugc.aweme.account.login.e.a) this.f64969l.getValue();
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hr;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39937);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(boolean z, String str) {
            l.d(str, "");
            r.a("login_click_next_result", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("enter_method", str).a("is_success", z ? 1 : 0).a("is_register", 0).f62575a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.x
    public final boolean a() {
        return this.f64964b;
    }

    public static final class f implements a.AbstractC1449a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64975a;

        static {
            Covode.recordClassIndex(39945);
        }

        @Override // com.ss.android.ugc.aweme.account.login.view.a.AbstractC1449a
        public final void a() {
            bt.b(this.f64975a.f64963a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(t tVar) {
            this.f64975a = tVar;
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.login.e.a> {
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(39940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(t tVar) {
            super(0);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.account.login.e.a invoke() {
            t tVar = this.this$0;
            return new com.ss.android.ugc.aweme.account.login.e.a(tVar, tVar.x());
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        e().b();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.d4b)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.d4b)).a(true);
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64973a;

        static {
            Covode.recordClassIndex(39941);
        }

        e(t tVar) {
            this.f64973a = tVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
            DialogContext.a aVar2 = new DialogContext.a(this.f64973a);
            aVar2.f33424a = b.a.TWO_FACTOR_AUTH;
            aVar.a(aVar2.a(new b.c(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.ui.a.t.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f64974a;

                static {
                    Covode.recordClassIndex(39942);
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a(List<Integer> list, int i2) {
                }

                @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
                public final void a() {
                    if (this.f64974a.f64973a.getActivity() != null) {
                        androidx.fragment.app.e activity = this.f64974a.f64973a.getActivity();
                        if (!(activity instanceof com.ss.android.ugc.aweme.account.login.v2.base.b)) {
                            activity = null;
                        }
                        com.ss.android.ugc.aweme.account.login.v2.base.b bVar = (com.ss.android.ugc.aweme.account.login.v2.base.b) activity;
                        if (bVar != null && !bVar.isFinishing()) {
                            androidx.fragment.app.e activity2 = this.f64974a.f64973a.getActivity();
                            if (activity2 == null) {
                                l.b();
                            }
                            l.b(activity2, "");
                            ((com.bytedance.tux.dialog.b) com.bytedance.tux.dialog.b.c.a(new com.bytedance.tux.dialog.b(activity2).b(this.f64974a.f64973a.getString(R.string.h0u)).d(this.f64974a.f64973a.getString(R.string.h0s)), new a(this)).a(false)).a().b().show();
                        }
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f64974a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a.t$e$1$a */
                static final class a extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
                    final /* synthetic */ AnonymousClass1 this$0;

                    static {
                        Covode.recordClassIndex(39943);
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
                        String string = this.this$0.f64974a.f64973a.getString(R.string.asq);
                        l.b(string, "");
                        bVar2.a(string, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                            /* class com.ss.android.ugc.aweme.account.login.v2.ui.a.t.e.AnonymousClass1.a.AnonymousClass1 */
                            final /* synthetic */ a this$0;

                            static {
                                Covode.recordClassIndex(39944);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                                l.d(aVar, "");
                                androidx.fragment.app.e activity = this.this$0.this$0.f64974a.f64973a.getActivity();
                                if (!(activity instanceof com.ss.android.ugc.aweme.account.login.v2.base.b)) {
                                    activity = null;
                                }
                                com.ss.android.ugc.aweme.account.login.v2.base.b bVar = (com.ss.android.ugc.aweme.account.login.v2.base.b) activity;
                                if (bVar != null) {
                                    bVar.onBackPressed();
                                }
                                a.C0732a.f33434a.a(b.a.TWO_FACTOR_AUTH);
                                return z.f158842a;
                            }
                        });
                        bVar2.f44820b = true;
                        return z.f158842a;
                    }
                }
            }));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        KeyboardUtils.c(((PhoneInputView) c(R.id.d4d)).getEditText());
        h();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, true, null, false, false, 1870);
    }

    private final void g() {
        if (((PhoneInputView) c(R.id.d4d)).getPhoneNumber() <= 0 && !this.f64966e) {
            e().a(((PhoneInputView) c(R.id.d4d)).getEditText());
        }
        this.f64966e = true;
        com.ss.android.ugc.aweme.account.login.v2.ui.c.a(((PhoneInputView) c(R.id.d4d)).getInputView().getEditText());
    }

    public static final class c extends com.ss.android.ugc.aweme.account.i {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64972a;

        static {
            Covode.recordClassIndex(39939);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(t tVar) {
            this.f64972a = tVar;
        }

        @Override // com.ss.android.ugc.aweme.account.i
        public final void afterTextChanged(Editable editable) {
            String obj;
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f64972a.c(R.id.d4c);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
            LoadingButton loadingButton = (LoadingButton) this.f64972a.c(R.id.d4b);
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

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64976a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64977b;

        static {
            Covode.recordClassIndex(39946);
        }

        g(t tVar, boolean z) {
            this.f64976a = tVar;
            this.f64977b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64976a.a(this.f64977b);
            this.f64976a.a(this.f64977b, true);
            bt.b(this.f64976a.f64963a);
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64979b;

        static {
            Covode.recordClassIndex(39947);
        }

        h(t tVar, boolean z) {
            this.f64978a = tVar;
            this.f64979b = z;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f64978a.a(!this.f64979b);
            this.f64978a.a(!this.f64979b, true);
            bt.b(this.f64978a.f64963a);
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64980a;

        static {
            Covode.recordClassIndex(39948);
        }

        i(t tVar) {
            this.f64980a = tVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f64980a.getActivity() != null) {
                com.ss.android.ugc.aweme.account.login.d.a.a(this.f64980a, "");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64981a;

        static {
            Covode.recordClassIndex(39949);
        }

        j(t tVar) {
            this.f64981a = tVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f64981a.x();
            l.b(x, "");
            a.a(true, x);
            this.f64981a.a(true, true, false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64982a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f64983b;

        static {
            Covode.recordClassIndex(39950);
        }

        k(t tVar, boolean z) {
            this.f64982a = tVar;
            this.f64983b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String x = this.f64982a.x();
            l.b(x, "");
            a.a(true, x);
            this.f64982a.a(false, true, this.f64983b);
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

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            return;
        }
        if (ab_()) {
            g();
        } else {
            this.f64965d = true;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f64971a;

        static {
            Covode.recordClassIndex(39938);
        }

        b(t tVar) {
            this.f64971a = tVar;
        }

        public final void onClick(View view) {
            String string;
            String string2;
            ClickAgent.onClick(view);
            this.f64971a.f64964b = false;
            r.a("login_click_next", new com.ss.android.ugc.aweme.account.a.b.a().a("platform", "phone").a("enter_method", this.f64971a.x()).f62575a);
            if (!com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) this.f64971a.c(R.id.d4d)).getCountryCodeString(), ((PhoneInputView) this.f64971a.c(R.id.d4d)).getPhoneNumberString())) {
                String x = this.f64971a.x();
                l.b(x, "");
                a.a(false, x);
                t tVar = this.f64971a;
                String string3 = tVar.getString(R.string.aqs);
                l.b(string3, "");
                tVar.a(0, string3);
            } else if (!n.a(((PhoneInputView) this.f64971a.c(R.id.d4d)).getCountryCodeString()) || this.f64971a.A() == com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT) {
                this.f64971a.a(false, false);
            } else {
                t tVar2 = this.f64971a;
                if (tVar2.getActivity() != null) {
                    String countryCodeString = ((PhoneInputView) tVar2.c(R.id.d4d)).getCountryCodeString();
                    boolean b2 = n.b(countryCodeString);
                    if (n.b(countryCodeString)) {
                        string = tVar2.getString(R.string.fl1);
                        l.b(string, "");
                        string2 = tVar2.getString(R.string.fl0);
                        l.b(string2, "");
                    } else {
                        string = tVar2.getString(R.string.fl0);
                        l.b(string, "");
                        string2 = tVar2.getString(R.string.fl1);
                        l.b(string2, "");
                    }
                    String fullPhoneNumber = ((PhoneInputView) tVar2.c(R.id.d4d)).getFullPhoneNumber();
                    androidx.fragment.app.e activity = tVar2.getActivity();
                    if (activity == null) {
                        l.b();
                    }
                    l.b(activity, "");
                    String string4 = tVar2.getString(R.string.fl2);
                    l.b(string4, "");
                    String string5 = tVar2.getString(R.string.fkz, fullPhoneNumber);
                    l.b(string5, "");
                    String y = tVar2.y();
                    l.b(y, "");
                    tVar2.f64963a = new com.ss.android.ugc.aweme.account.login.view.a(activity, new a.b(string4, string5, string, string2, y, fullPhoneNumber));
                    com.ss.android.ugc.aweme.account.login.view.a aVar = tVar2.f64963a;
                    if (aVar == null) {
                        l.b();
                    }
                    aVar.f65105a = new f(tVar2);
                    com.ss.android.ugc.aweme.account.login.view.a aVar2 = tVar2.f64963a;
                    if (aVar2 == null) {
                        l.b();
                    }
                    aVar2.f65106b = new g(tVar2, b2);
                    com.ss.android.ugc.aweme.account.login.view.a aVar3 = tVar2.f64963a;
                    if (aVar3 == null) {
                        l.b();
                    }
                    aVar3.f65107c = new h(tVar2, b2);
                    bt.a(tVar2.f64963a);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.account.login.d.a.f63389a.contains(Integer.valueOf(i2));
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.d4c);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
        LoadingButton loadingButton = (LoadingButton) c(R.id.d4b);
        if (loadingButton != null) {
            loadingButton.b(true);
        }
        if (i2 == 1053) {
            b.i.b(new e(this), b.i.f4826c);
        }
    }

    public final void a(boolean z, boolean z2) {
        String str;
        com.ss.android.ugc.aweme.account.login.ui.a aVar;
        TimerHolder.b a2 = TimerHolder.a.a(getActivity(), ((PhoneInputView) c(R.id.d4d)).getFullPhoneNumber(), com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN);
        if (a2 != null && (aVar = a2.f64744a) != null && aVar.d()) {
            a(z, false, false);
        } else if (!z || A() == com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT) {
            String a3 = com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) c(R.id.d4d)).getPhoneNumberObject());
            l.b(a3, "");
            com.ss.android.ugc.aweme.account.login.v2.base.j jVar = com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN;
            com.ss.android.ugc.aweme.account.login.v2.base.k kVar = com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN;
            if (z2) {
                str = "choose_dialog";
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, a3, jVar, kVar, "", "user_click", str, 128).d(new k(this, z2)).c();
        } else {
            String a4 = com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) c(R.id.d4d)).getPhoneNumberObject());
            l.b(a4, "");
            com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, a4, com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN, com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN, "user_click", "").d(new j(this)).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String countryIso;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a(c(R.id.d4b), new b(this));
        ((PhoneInputView) c(R.id.d4d)).getInputView().setTextWatcher(new c(this));
        if (A() != com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                l.b();
            }
            Serializable serializable = arguments.getSerializable("auto_fill_phone_number");
            com.ss.android.ugc.aweme.account.login.model.a aVar = null;
            if (!(serializable instanceof a.C1412a)) {
                serializable = null;
            }
            a.C1412a aVar2 = (a.C1412a) serializable;
            if (aVar2 != null) {
                if (aVar2.getNationalNumber() != 0) {
                    ((PhoneInputView) c(R.id.d4d)).setPhoneNumber(String.valueOf(aVar2.getNationalNumber()));
                }
                l.d(aVar2, "");
                com.google.c.c.z<com.ss.android.ugc.aweme.account.login.model.a> zVar = com.ss.android.ugc.aweme.account.login.model.a.f63493h;
                if (zVar != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : zVar) {
                        T t2 = t;
                        if (t2.a() == aVar2.getCountryCode() && ((countryIso = aVar2.getCountryIso()) == null || countryIso.length() == 0 || l.a((Object) t2.f63497c, (Object) aVar2.getCountryIso()))) {
                            arrayList.add(t);
                        }
                    }
                    ArrayList arrayList2 = arrayList;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        aVar = (com.ss.android.ugc.aweme.account.login.model.a) arrayList2.get(0);
                    }
                }
                ((PhoneInputView) c(R.id.d4d)).setCountry(aVar);
            }
        }
        if (((PhoneInputView) c(R.id.d4d)).getCountryCodeString().length() == 0 && ((PhoneInputView) c(R.id.d4d)).getCountryName().length() == 0) {
            ((PhoneInputView) c(R.id.d4d)).a();
        }
        if (this.f64965d) {
            g();
            this.f64965d = false;
        }
        if (this.f64970m) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.a4j);
            l.b(tuxTextView, "");
            if (tuxTextView.getVisibility() != 0) {
                TuxTextView tuxTextView2 = (TuxTextView) c(R.id.a4j);
                l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                TuxTextView tuxTextView3 = (TuxTextView) c(R.id.a4j);
                l.b(tuxTextView3, "");
                tuxTextView3.setText(getString(R.string.ap5));
                ((TuxTextView) c(R.id.a4j)).setOnClickListener(new i(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        e().a(i2, i3, intent);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (c(R.id.d4d) != null) {
            androidx.fragment.app.e activity = getActivity();
            boolean z4 = true;
            if (activity == null || !activity.isFinishing()) {
                com.ss.android.ugc.aweme.account.login.v2.base.e.a(this, ((PhoneInputView) c(R.id.d4d)).getPhoneNumberObject());
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", com.ss.android.ugc.aweme.account.login.v2.base.k.PHONE_SMS_LOGIN.getValue());
                arguments.putInt("current_scene", com.ss.android.ugc.aweme.account.login.v2.base.j.LOGIN.getValue());
                if (A() != com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT) {
                    z4 = false;
                }
                arguments.putBoolean("recover_mobile_code", z4);
                arguments.putBoolean("code_sent", z2);
                arguments.putBoolean("use_whatsapp", z);
                arguments.putBoolean("from_choose_dialog", z3);
                l.b(arguments, "");
                if (!l.a((Object) com.ss.android.ugc.aweme.account.login.h.a.a(((PhoneInputView) c(R.id.d4d)).getPhoneNumberObject()), (Object) this.f64968k) || TextUtils.isEmpty(this.f64967j)) {
                    arguments.putString("gms_phone_pwd", "");
                } else {
                    arguments.putString("gms_phone_pwd", this.f64967j);
                }
                a(arguments);
            }
        }
    }

    public final void a(String str, String str2, String str3, String str4, boolean z) {
        if (c(R.id.d4d) != null) {
            if (!((!TextUtils.isEmpty(((PhoneInputView) c(R.id.d4d)).getEditText().getText()) && !z) || str == null || str3 == null)) {
                com.ss.android.ugc.aweme.account.login.model.a a2 = a.C1414a.a(Integer.parseInt(str3));
                ((PhoneInputView) c(R.id.d4d)).setPhoneNumber(str);
                ((PhoneInputView) c(R.id.d4d)).setCountry(a2);
            }
            if (str4 == null || str2 == null) {
                if (!z) {
                    return;
                }
            } else if (!z) {
                this.f64968k = str4;
                this.f64967j = str2;
                return;
            }
            LoadingButton loadingButton = (LoadingButton) c(R.id.d4b);
            if (loadingButton != null) {
                loadingButton.a(true);
            }
        }
    }
}

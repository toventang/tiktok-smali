package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.analytics.page.d;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.recover.f;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.x;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.account.util.h;
import com.ss.android.ugc.aweme.base.ui.o;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;

public final class f extends a implements View.OnClickListener, d, com.ss.android.ugc.aweme.account.login.v2.ui.d, x {

    /* renamed from: k  reason: collision with root package name */
    public static final a f64814k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public EditText f64815a;

    /* renamed from: b  reason: collision with root package name */
    public EditText f64816b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f64817c;

    /* renamed from: d  reason: collision with root package name */
    public f.b f64818d;

    /* renamed from: e  reason: collision with root package name */
    String f64819e = "";

    /* renamed from: j  reason: collision with root package name */
    String f64820j = "";

    /* renamed from: l  reason: collision with root package name */
    private boolean f64821l;

    /* renamed from: m  reason: collision with root package name */
    private String f64822m = "";
    private boolean n = true;
    private HashMap o;

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64823a = new b();

        static {
            Covode.recordClassIndex(39837);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39835);
    }

    @Override // com.bytedance.analytics.page.d
    public final String ad_() {
        return "PhoneEmailLoginStep";
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        View view = (View) this.o.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hj;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39836);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.x
    public final boolean a() {
        return this.n;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f64821l) {
            g();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.auf);
        if (loadingButton != null) {
            loadingButton.b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        LoadingButton loadingButton = (LoadingButton) c(R.id.auf);
        if (loadingButton != null) {
            loadingButton.a(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.d
    public final String e() {
        EditText editText = this.f64815a;
        if (editText == null) {
            l.a("emailInput");
        }
        return editText.getText().toString();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        EditText editText = this.f64815a;
        if (editText == null) {
            l.a("emailInput");
        }
        KeyboardUtils.c(editText);
        EditText editText2 = this.f64816b;
        if (editText2 == null) {
            l.a("passwordInput");
        }
        KeyboardUtils.c(editText2);
        h();
    }

    private final void g() {
        EditText editText;
        EditText editText2 = this.f64815a;
        if (editText2 == null) {
            l.a("emailInput");
        }
        if (com.ss.android.ugc.aweme.account.login.v2.ui.c.b(editText2)) {
            editText = this.f64815a;
            if (editText == null) {
                l.a("emailInput");
            }
        } else {
            editText = this.f64816b;
            if (editText == null) {
                l.a("passwordInput");
            }
        }
        if (AccountKeyBoardHelper.a.a()) {
            com.ss.android.ugc.aweme.account.login.v2.ui.c.a(editText);
        } else {
            editText.requestFocus();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        if (this.f64821l) {
            return new com.ss.android.ugc.aweme.account.login.v2.ui.b(getString(R.string.aof), null, false, getString(R.string.aq2), getString(R.string.aq1), false, "email_sign_up_to_login_enter_password_page", false, true, 718);
        }
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, "email_login_homepage", false, true, 767);
    }

    public static final class c extends o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f64824a;

        static {
            Covode.recordClassIndex(39838);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f64824a = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // com.ss.android.ugc.aweme.base.ui.o
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r4) {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.a.f.c.afterTextChanged(android.text.Editable):void");
        }
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
            this.f64817c = true;
        }
    }

    public final void onClick(View view) {
        boolean z;
        Boolean bool;
        ClickAgent.onClick(view);
        boolean z2 = false;
        this.n = false;
        com.ss.android.ugc.aweme.account.n.a.a(getContext());
        EditText editText = this.f64815a;
        if (editText == null) {
            l.a("emailInput");
        }
        String obj = editText.getText().toString();
        EditText editText2 = this.f64816b;
        if (editText2 == null) {
            l.a("passwordInput");
        }
        String obj2 = editText2.getText().toString();
        if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2) || !l.a((Object) obj, (Object) this.f64819e) || !l.a((Object) obj2, (Object) this.f64820j)) {
            z = false;
        } else {
            z = true;
        }
        boolean a2 = h.a(obj);
        String str = null;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                bool = Boolean.valueOf(arguments.getBoolean("email_should_add_email", false));
            } else {
                bool = null;
            }
        } else {
            bool = false;
        }
        f.b bVar = this.f64818d;
        if (bVar != null) {
            z2 = bVar.getSafe();
        }
        String str2 = "email";
        if (A() == j.RECOVER_ACCOUNT) {
            if (bool == null) {
                l.b();
            }
            if (bool.booleanValue() && z2) {
                if (!a2) {
                    str2 = "handle";
                }
                f.b bVar2 = this.f64818d;
                if (bVar2 != null) {
                    str = bVar2.getTicket();
                }
                com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, obj, obj2, str2, str).d(b.f64823a).c();
                return;
            }
        }
        if (!a2) {
            str2 = "handle";
        }
        com.ss.android.ugc.aweme.account.login.v2.a.x.a(this, obj, obj2, str2, z, (h.f.a.b) null, 32).c();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        f.b bVar;
        Serializable serializable;
        super.onCreate(bundle);
        Boolean bool = null;
        if (A() == j.RECOVER_ACCOUNT) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("recover_account_data");
            } else {
                serializable = null;
            }
            this.f64818d = (f.b) serializable;
        }
        boolean z2 = false;
        if (V_() == k.EMAIL_PASSWORD_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        this.f64821l = z;
        if (z) {
            this.f64822m = e.a(this);
            return;
        }
        if (getArguments() != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                bool = Boolean.valueOf(arguments2.getBoolean("email_should_add_email", false));
            }
        } else {
            bool = false;
        }
        f.b bVar2 = this.f64818d;
        if (bVar2 != null) {
            z2 = bVar2.getSafe();
        }
        if (A() == j.RECOVER_ACCOUNT) {
            if (bool == null) {
                l.b();
            }
            if (bool.booleanValue()) {
                if (z2 && (bVar = this.f64818d) != null && bVar.getEmail() != null) {
                    f.b bVar3 = this.f64818d;
                    if (bVar3 == null) {
                        l.b();
                    }
                    this.f64822m = String.valueOf(bVar3.getEmail());
                    return;
                }
                return;
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            l.b();
        }
        String string = arguments3.getString("auto_fill_account_name", "");
        l.b(string, "");
        this.f64822m = string;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        InputResultIndicator inputResultIndicator;
        l.d(str, "");
        View c2 = c(R.id.aue);
        if (!(c2 == null || (inputResultIndicator = (InputResultIndicator) c2.findViewById(R.id.bpx)) == null)) {
            inputResultIndicator.f64757a.setVisibility(0);
            inputResultIndicator.f64757a.setBackgroundColor(inputResultIndicator.f64759c);
            inputResultIndicator.f64758b.setVisibility(8);
        }
        InputResultIndicator inputResultIndicator2 = (InputResultIndicator) c(R.id.auh);
        if (inputResultIndicator2 != null) {
            inputResultIndicator2.a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e8, code lost:
        if (r7 != false) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.v2.ui.a.f.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

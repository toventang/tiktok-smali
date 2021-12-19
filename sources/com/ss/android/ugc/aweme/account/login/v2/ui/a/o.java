package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.recover.f;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.ui.InputResultIndicator;
import com.ss.android.ugc.aweme.account.login.v2.ui.c;
import com.ss.android.ugc.aweme.account.ui.InputWithIndicator;
import com.ss.android.ugc.aweme.account.ui.LoadingButton;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.io.Serializable;
import java.util.HashMap;

public final class o extends a {

    /* renamed from: a  reason: collision with root package name */
    public EditText f64910a;

    /* renamed from: b  reason: collision with root package name */
    public f.b f64911b;

    /* renamed from: c  reason: collision with root package name */
    public String f64912c = "";

    /* renamed from: d  reason: collision with root package name */
    private boolean f64913d;

    /* renamed from: e  reason: collision with root package name */
    private String f64914e = "";

    /* renamed from: j  reason: collision with root package name */
    private HashMap f64915j;

    static {
        Covode.recordClassIndex(39901);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64915j == null) {
            this.f64915j = new HashMap();
        }
        View view = (View) this.f64915j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64915j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hn;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64915j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        EditText editText = this.f64910a;
        if (editText == null) {
            l.a("passwordInput");
        }
        c.a(editText);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
        ((LoadingButton) c(R.id.bpm)).b(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
        ((LoadingButton) c(R.id.bpm)).a(true);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        boolean z;
        if (this.f64913d || A() == j.RECOVER_ACCOUNT) {
            z = false;
        } else {
            z = true;
        }
        return new com.ss.android.ugc.aweme.account.login.v2.ui.b(" ", null, false, getString(R.string.ap4), " ", false, "phone_login_enter_password_page", z, false, 1230);
    }

    public static final class a extends com.ss.android.ugc.aweme.base.ui.o {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64916a;

        static {
            Covode.recordClassIndex(39902);
        }

        a(o oVar) {
            this.f64916a = oVar;
        }

        @Override // com.ss.android.ugc.aweme.base.ui.o
        public final void afterTextChanged(Editable editable) {
            LoadingButton loadingButton = (LoadingButton) this.f64916a.c(R.id.bpm);
            if (loadingButton != null) {
                loadingButton.setEnabled(!c.b(o.a(this.f64916a)));
            }
            InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f64916a.c(R.id.bpx);
            if (inputResultIndicator != null) {
                inputResultIndicator.a();
            }
        }
    }

    public static final /* synthetic */ EditText a(o oVar) {
        EditText editText = oVar.f64910a;
        if (editText == null) {
            l.a("passwordInput");
        }
        return editText;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        String str;
        super.onCreate(bundle);
        r.a("phone_login_enter_password", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", x()).a("enter_type", y()).f62575a);
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("recover_mobile_code", false);
        }
        this.f64913d = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("recover_account_data");
        } else {
            serializable = null;
        }
        this.f64911b = (f.b) serializable;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("gms_phone_pwd")) == null) {
            str = "";
        }
        this.f64912c = str;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f64917a;

        static {
            Covode.recordClassIndex(39903);
        }

        b(o oVar) {
            this.f64917a = oVar;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            if (this.f64917a.A() == j.RECOVER_ACCOUNT) {
                o oVar = this.f64917a;
                String obj = o.a(oVar).getText().toString();
                f.b bVar = this.f64917a.f64911b;
                if (bVar != null) {
                    str = bVar.getTicket();
                } else {
                    str = null;
                }
                x.a(oVar, "", obj, "phone", str).d(AnonymousClass1.f64918a).c();
                return;
            }
            if (TextUtils.isEmpty(o.a(this.f64917a).getText().toString()) || !l.a((Object) o.a(this.f64917a).getText().toString(), (Object) this.f64917a.f64912c)) {
                z = false;
            } else {
                z = true;
            }
            o oVar2 = this.f64917a;
            String a2 = com.ss.android.ugc.aweme.account.login.h.a.a(e.b(oVar2));
            l.b(a2, "");
            x.a(oVar2, a2, o.a(this.f64917a).getText().toString(), "phone", z, (h.f.a.b) null, 32).c();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
        InputResultIndicator inputResultIndicator = (InputResultIndicator) c(R.id.bpx);
        if (inputResultIndicator != null) {
            inputResultIndicator.a(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        EditText editText = ((InputWithIndicator) c(R.id.bpw)).getEditText();
        this.f64910a = editText;
        if (editText == null) {
            l.a("passwordInput");
        }
        editText.setHint(getString(R.string.d_q));
        editText.addTextChangedListener(new a(this));
        if (A() == j.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        View c2 = c(R.id.bpk);
        l.b(c2, "");
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = this.v;
        if (bVar == null) {
            l.b();
        }
        String str = bVar.f65055i;
        if (str == null) {
            l.b();
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.e.a(c2, this, str, z);
        a(c(R.id.bpm), new b(this));
        if (!TextUtils.isEmpty(this.f64912c)) {
            EditText editText2 = this.f64910a;
            if (editText2 == null) {
                l.a("passwordInput");
            }
            editText2.setText(this.f64912c);
            EditText editText3 = this.f64910a;
            if (editText3 == null) {
                l.a("passwordInput");
            }
            editText3.setSelection(this.f64912c.length());
        }
    }
}

package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.d;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends d {

    /* renamed from: b  reason: collision with root package name */
    public final c f64171b;

    /* renamed from: c  reason: collision with root package name */
    public final String f64172c;

    static {
        Covode.recordClassIndex(39540);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.d
    public final boolean a() {
        a.C0731a aVar = new a.C0731a(this.f64171b.getActivity());
        aVar.f33402b = this.f64171b.getString(R.string.aps);
        a.C0731a b2 = aVar.a(this.f64171b.getString(R.string.apq), (DialogInterface.OnClickListener) new a(this), false).b(this.f64171b.getString(R.string.apr), (DialogInterface.OnClickListener) new b(this), false);
        l.b(b2, "");
        a(b2);
        return true;
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64174a;

        static {
            Covode.recordClassIndex(39542);
        }

        b(j jVar) {
            this.f64174a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            e activity = this.f64174a.f64729a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(c cVar, String str) {
        super(cVar);
        l.d(cVar, "");
        l.d(str, "");
        this.f64171b = cVar;
        this.f64172c = str;
    }

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f64173a;

        static {
            Covode.recordClassIndex(39541);
        }

        a(j jVar) {
            this.f64173a = jVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            if (TextUtils.isEmpty(this.f64173a.f64172c)) {
                c cVar = this.f64173a.f64729a;
                String string = this.f64173a.f64729a.getString(R.string.de8);
                l.b(string, "");
                cVar.a(0, string);
                return;
            }
            r.a("click_sign_up", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", "login").f62575a);
            Bundle arguments = this.f64173a.f64729a.getArguments();
            if (arguments == null || !arguments.getBoolean("age_gate_block")) {
                Object a2 = com.ss.android.ugc.aweme.a.a(bf.class);
                l.b(a2, "");
                int d2 = ((bf) a2).d();
                if (d2 != 0) {
                    r.a("tns_phone_not_registered_age_gate_action", new com.ss.android.ugc.aweme.account.a.b.a().a("register_age_gate_action", d2).a("show", 1).f62575a);
                    c cVar2 = this.f64173a.f64171b;
                    Bundle arguments2 = this.f64173a.f64729a.getArguments();
                    if (arguments2 == null) {
                        arguments2 = new Bundle();
                    }
                    arguments2.putInt("next_page", k.AGE_GATE_LOGIN.getValue());
                    arguments2.putString("sms_code_key", this.f64173a.f64172c);
                    arguments2.putInt("age_gate_register_action", d2);
                    l.b(arguments2, "");
                    cVar2.a(arguments2);
                    return;
                }
                r.a("tns_phone_not_registered_age_gate_action", new com.ss.android.ugc.aweme.account.a.b.a().a("register_age_gate_action", d2).a("show", 0).f62575a);
                if (com.ss.android.ugc.aweme.account.login.g.c.a()) {
                    c cVar3 = this.f64173a.f64171b;
                    Bundle arguments3 = this.f64173a.f64729a.getArguments();
                    if (arguments3 == null) {
                        arguments3 = new Bundle();
                    }
                    arguments3.putInt("next_page", k.TERMS_CONSENT_NEW_PHONE_USER.getValue());
                    arguments3.putString("sms_code_key", this.f64173a.f64172c);
                    l.b(arguments3, "");
                    cVar3.a(arguments3);
                    return;
                }
                a.C1412a b2 = com.ss.android.ugc.aweme.account.login.v2.base.e.b(this.f64173a.f64171b);
                c cVar4 = this.f64173a.f64729a;
                String a3 = com.ss.android.ugc.aweme.account.login.h.a.a(b2);
                l.b(a3, "");
                x.a(cVar4, a3, this.f64173a.f64172c, com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP, this.f64173a.f64171b.V_()).c();
                return;
            }
            c cVar5 = this.f64173a.f64171b;
            Bundle arguments4 = this.f64173a.f64729a.getArguments();
            if (arguments4 == null) {
                arguments4 = new Bundle();
            }
            arguments4.putInt("next_page", k.FTC_CREATE_ACCOUNT.getValue());
            l.b(arguments4, "");
            cVar5.a(arguments4);
        }
    }
}

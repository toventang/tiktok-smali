package com.ss.android.ugc.aweme.account.o;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.d.o;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.ss.android.ugc.aweme.account.o.a;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import java.util.HashMap;

public final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    public final String f65220a = "email_verify_success";

    /* renamed from: b  reason: collision with root package name */
    private final h f65221b = i.a((h.f.a.a) new a(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f65222j = i.a((h.f.a.a) new b(this));

    /* renamed from: k  reason: collision with root package name */
    private final h f65223k = i.a((h.f.a.a) new C1455c(this));

    /* renamed from: l  reason: collision with root package name */
    private HashMap f65224l;

    static {
        Covode.recordClassIndex(40110);
    }

    private String k() {
        return (String) this.f65221b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f65224l == null) {
            this.f65224l = new HashMap();
        }
        View view = (View) this.f65224l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65224l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean g() {
        return ((Boolean) this.f65223k.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f65224l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(40111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (this.this$0.A() != j.MODIFY_PHONE) {
                return com.ss.android.ugc.aweme.account.login.v2.base.e.a(this.this$0);
            }
            User f2 = cj.f();
            l.b(f2, "");
            return f2.getEmail();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(40112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_changePwd"));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.o.c$c  reason: collision with other inner class name */
    static final class C1455c extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(40113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1455c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                l.b();
            }
            return Boolean.valueOf(arguments.getBoolean("from_ProAccount"));
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final com.ss.android.ugc.aweme.account.login.v2.ui.a.l e() {
        com.ss.android.ugc.aweme.account.login.v2.ui.a.l lVar = new com.ss.android.ugc.aweme.account.login.v2.ui.a.l();
        lVar.a(k());
        lVar.f64883b = false;
        lVar.f64885d = com.ss.android.ugc.aweme.account.login.v2.base.e.d(this);
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        if (g()) {
            r.onEventV3("resend_code_email");
        }
        a.f65209a.invoke(this, k(), "resend").d(new f(this)).c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        String string;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        if (g()) {
            i2 = R.string.fok;
        } else {
            i2 = R.string.arr;
        }
        bVar.f65051e = getString(i2);
        if (g()) {
            string = getString(R.string.foj, k());
        } else {
            string = getString(R.string.ars, k());
        }
        bVar.f65052f = string;
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65225a;

        static {
            Covode.recordClassIndex(40114);
        }

        d(c cVar) {
            this.f65225a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f65225a.t();
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65227a;

        static {
            Covode.recordClassIndex(40116);
        }

        f(c cVar) {
            this.f65227a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f65227a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        l.d(str, "");
        x.b(this, str, a.C1454a.a(this), null).d(new e(this)).c();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (A() == j.MODIFY_PHONE) {
            a.f65209a.invoke(this, k(), "auto_system").d(new d(this)).c();
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f65226a;

        static {
            Covode.recordClassIndex(40115);
        }

        e(c cVar) {
            this.f65226a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            o oVar = (o) obj;
            if (this.f65226a.A() == j.MODIFY_PHONE) {
                c cVar = this.f65226a;
                Bundle arguments = cVar.getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", k.INPUT_PHONE_MODIFY.getValue());
                arguments.putString("ticket", oVar.f43104j);
                l.b(arguments, "");
                cVar.a(arguments);
                return;
            }
            User f2 = cj.f();
            l.b(f2, "");
            f2.setEmailVerified(true);
            if (this.f65226a.g()) {
                r.a("set_up_proAccount", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Email Captcha").a("method", "verify_email").a("duration", System.currentTimeMillis() - this.f65226a.t).f62575a);
            }
            Bundle arguments2 = this.f65226a.getArguments();
            if (arguments2 == null) {
                l.b();
            }
            if (arguments2.getBoolean("show_success_toast", true)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f65226a.getString(R.string.bmm)).a();
            }
            r.a(this.f65226a.f65220a, new HashMap());
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            String str = oVar.f43104j;
            l.b(str, "");
            com.ss.android.ugc.aweme.account.login.v2.base.e.d(bundle, str);
            Bundle arguments3 = this.f65226a.getArguments();
            if (arguments3 == null) {
                l.b();
            }
            arguments3.putBundle("final_data", bundle);
            c cVar2 = this.f65226a;
            Bundle arguments4 = cVar2.getArguments();
            if (arguments4 == null) {
                l.b();
            }
            l.b(arguments4, "");
            cVar2.b(arguments4);
        }
    }
}

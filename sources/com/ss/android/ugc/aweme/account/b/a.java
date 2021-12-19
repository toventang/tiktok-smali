package com.ss.android.ugc.aweme.account.b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.a.z;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import f.a.q;
import h.f.b.l;
import h.h;
import h.i;
import java.util.HashMap;
import org.json.JSONObject;

public final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f62865a = i.a((h.f.a.a) new C1384a(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f62866b = i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f62867j;

    static {
        Covode.recordClassIndex(38726);
    }

    private String k() {
        return (String) this.f62865a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f62867j == null) {
            this.f62867j = new HashMap();
        }
        View view = (View) this.f62867j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62867j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final boolean g() {
        return ((Boolean) this.f62866b.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f62867j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.b.a$a  reason: collision with other inner class name */
    static final class C1384a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38727);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1384a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.a(this.this$0);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(38728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
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
        lVar.f64885d = e.d(this);
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        if (g()) {
            r.onEventV3("resend_code_email");
        }
        b.f62871b.invoke(this, k(), "resend").d(new d(this)).c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(R.string.arr);
        bVar.f65052f = getString(R.string.ars, k());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62869a;

        static {
            Covode.recordClassIndex(38730);
        }

        d(a aVar) {
            this.f62869a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f62869a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        l.d(str, "");
        String k2 = k();
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        boolean z = arguments.getBoolean("from_changePwd", false);
        l.d(this, "");
        l.d(k2, "");
        l.d(str, "");
        n b2 = n.a((q) new x.a(this, k2, str, z)).d(new x.b(this)).b(new x.c(this));
        l.b(b2, "");
        z.a(this, b2).d(new c(this)).c();
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f62868a;

        static {
            Covode.recordClassIndex(38729);
        }

        c(a aVar) {
            this.f62868a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
            User f2 = cj.f();
            JSONObject jSONObject = ((com.ss.android.ugc.aweme.account.login.v2.a.i) dVar.f43081j).f43284m;
            if (jSONObject == null || (optJSONObject2 = jSONObject.optJSONObject("data")) == null || (str = optJSONObject2.optString("email")) == null) {
                str = "";
            }
            f2.setEmail(str);
            f2.setEmailVerified(true);
            f2.setHasEmail(true);
            Bundle arguments = this.f62868a.getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.getBoolean("show_success_toast", true)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f62868a.getString(R.string.bmg)).a();
            }
            r.a(b.f62872c, new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, 1).f66730a);
            if (this.f62868a.g()) {
                r.a("set_up_proAccount", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Email Captcha").a("method", "set_by_email").a("duration", System.currentTimeMillis() - this.f62868a.t).f62575a);
            }
            Bundle arguments2 = this.f62868a.getArguments();
            if (arguments2 == null) {
                l.b();
            }
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            JSONObject jSONObject2 = ((com.ss.android.ugc.aweme.account.login.v2.a.i) dVar.f43081j).f43284m;
            if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("data")) == null || (str2 = optJSONObject.optString("ticket")) == null) {
                str2 = "";
            }
            e.d(bundle, str2);
            arguments2.putBundle("final_data", bundle);
            a aVar = this.f62868a;
            Bundle arguments3 = aVar.getArguments();
            if (arguments3 == null) {
                l.b();
            }
            l.b(arguments3, "");
            aVar.b(arguments3);
        }
    }
}

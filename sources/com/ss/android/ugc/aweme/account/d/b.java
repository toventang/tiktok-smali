package com.ss.android.ugc.aweme.account.d;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
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
import java.util.Objects;
import org.json.JSONObject;

public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f62942a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f62943b = i.a((h.f.a.a) new C1389b(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f62944j;

    static {
        Covode.recordClassIndex(38776);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f62944j == null) {
            this.f62944j = new HashMap();
        }
        View view = (View) this.f62944j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62944j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String g() {
        return (String) this.f62942a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f62944j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final boolean j() {
        return ((Boolean) this.f62943b.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.a(this.this$0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.d.b$b  reason: collision with other inner class name */
    static final class C1389b extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(38778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1389b(b bVar) {
            super(0);
            this.this$0 = bVar;
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
        lVar.a(g());
        lVar.f64883b = false;
        lVar.f64885d = e.d(this);
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        if (j()) {
            r.onEventV3("resend_code_email");
        }
        a.f62932b.invoke(this, g(), "resend").d(new d(this)).c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        String string;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        if (j()) {
            i2 = R.string.fok;
        } else {
            i2 = R.string.arr;
        }
        bVar.f65051e = getString(i2);
        if (j()) {
            string = getString(R.string.foj, g());
        } else {
            string = getString(R.string.ars, g());
        }
        bVar.f65052f = string;
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62946a;

        static {
            Covode.recordClassIndex(38780);
        }

        d(b bVar) {
            this.f62946a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f62946a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        l.d(str, "");
        String g2 = g();
        String e2 = e.e(this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            l.b();
        }
        boolean z = arguments.getBoolean("from_changePwd", false);
        l.d(this, "");
        l.d(g2, "");
        l.d(str, "");
        l.d(e2, "");
        n a2 = n.a((q) new x.g(this, str, g2, e2, z));
        l.b(a2, "");
        z.a(this, a2).d(new c(this)).c();
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f62945a;

        static {
            Covode.recordClassIndex(38779);
        }

        c(b bVar) {
            this.f62945a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            String str2;
            JSONObject optJSONObject;
            JSONObject optJSONObject2;
            com.bytedance.sdk.a.a.a.d dVar = (com.bytedance.sdk.a.a.a.d) obj;
            e.b(this.f62945a, "");
            User f2 = cj.f();
            l.b(f2, "");
            String uid = f2.getUid();
            l.b(uid, "");
            String g2 = this.f62945a.g();
            l.d(uid, "");
            l.d(g2, "");
            boolean z = false;
            for (T t : com.ss.android.ugc.aweme.account.login.q.f63528b) {
                if (l.a((Object) t.getUid(), (Object) uid) && t.getLoginMethodName() == LoginMethodName.EMAIL_PASS) {
                    Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod");
                    t.setName(g2);
                    z = true;
                }
            }
            if (z) {
                com.ss.android.ugc.aweme.account.login.q.f();
            }
            JSONObject jSONObject = ((com.ss.android.ugc.aweme.account.login.v2.a.n) dVar.f43081j).f43284m;
            if (jSONObject == null || (optJSONObject2 = jSONObject.optJSONObject("data")) == null || (str = optJSONObject2.optString("email")) == null) {
                str = "";
            }
            f2.setEmail(str);
            f2.setEmailVerified(true);
            f2.setHasEmail(true);
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            JSONObject jSONObject2 = ((com.ss.android.ugc.aweme.account.login.v2.a.n) dVar.f43081j).f43284m;
            if (jSONObject2 == null || (optJSONObject = jSONObject2.optJSONObject("data")) == null || (str2 = optJSONObject.optString("ticket")) == null) {
                str2 = "";
            }
            e.d(bundle, str2);
            Bundle arguments = this.f62945a.getArguments();
            if (arguments == null) {
                l.b();
            }
            arguments.putBundle("final_data", bundle);
            Bundle arguments2 = this.f62945a.getArguments();
            if (arguments2 == null) {
                l.b();
            }
            if (arguments2.getBoolean("show_success_toast", true)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.a.f62426a).a(this.f62945a.getString(R.string.bmk)).a();
            }
            r.a(com.ss.android.ugc.aweme.account.b.b.f62872c, new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, 2).f66730a);
            if (this.f62945a.j()) {
                r.a("set_up_proAccount", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Email Captcha").a("method", "use_new_email").a("duration", System.currentTimeMillis() - this.f62945a.t).f62575a);
            }
            b bVar = this.f62945a;
            Bundle arguments3 = bVar.getArguments();
            if (arguments3 == null) {
                l.b();
            }
            l.b(arguments3, "");
            bVar.b(arguments3);
        }
    }
}

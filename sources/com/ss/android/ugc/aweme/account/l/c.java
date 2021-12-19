package com.ss.android.ugc.aweme.account.l;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.d.o;
import com.bytedance.sdk.a.h.a.g;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.l;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f63147a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f63148b = i.a((h.f.a.a) new a(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f63149j;

    static {
        Covode.recordClassIndex(38893);
    }

    private String g() {
        return (String) this.f63147a.getValue();
    }

    private final String k() {
        return (String) this.f63148b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f63149j == null) {
            this.f63149j = new HashMap();
        }
        View view = (View) this.f63149j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63149j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f63149j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class b extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.a(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f63151a;

        static {
            Covode.recordClassIndex(38897);
        }

        d(c cVar) {
            this.f63151a = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f63151a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        c("resend").c();
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(38894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("conditional_login_ticket");
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final l e() {
        l lVar = new l();
        lVar.a(g());
        lVar.f64883b = false;
        lVar.f64885d = false;
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        String str;
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(R.string.arr);
        boolean z = true;
        bVar.f65052f = getString(R.string.fnq, g());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        if (k() != null) {
            str = getString(R.string.abp);
        } else {
            str = "";
        }
        bVar.f65050d = str;
        IAccountUserService e2 = AccountService.a().e();
        h.f.b.l.b(e2, "");
        if (!e2.isLogin() && k() != null) {
            z = false;
        }
        bVar.f65049c = z;
        return bVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c("auto_system").c();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.l.c$c  reason: collision with other inner class name */
    static final class C1402c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f63150a;

        static {
            Covode.recordClassIndex(38896);
        }

        C1402c(c cVar) {
            this.f63150a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            c cVar = this.f63150a;
            String str = ((o) obj).f43104j;
            h.f.b.l.b(str, "");
            e.b(cVar, str);
            c cVar2 = this.f63150a;
            Bundle arguments = cVar2.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("next_page", k.CHANGE_PASSWORD.getValue());
            arguments.putString("platForm", "email");
            h.f.b.l.b(arguments, "");
            cVar2.a(arguments);
        }
    }

    private n<com.bytedance.sdk.a.a.a.d<g>> c(String str) {
        h.f.b.l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String k2 = k();
        if (k2 != null) {
            h.f.b.l.b(k2, "");
            linkedHashMap.put("conditional_login_ticket", k2);
        }
        n<com.bytedance.sdk.a.a.a.d<g>> a2 = x.a(this, "", 11, str, linkedHashMap, (String) null, 96).a((f.a.d.a) new d(this));
        h.f.b.l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        h.f.b.l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String k2 = k();
        if (k2 != null) {
            h.f.b.l.b(k2, "");
            linkedHashMap.put("conditional_login_ticket", k2);
        }
        x.b(this, str, 11, linkedHashMap).d(new C1402c(this)).c();
    }
}

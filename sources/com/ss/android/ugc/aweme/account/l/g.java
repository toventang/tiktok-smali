package com.ss.android.ugc.aweme.account.l;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.experiment.o;
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

public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f63157a = i.a((h.f.a.a) new c(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f63158b = i.a((h.f.a.a) new a(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f63159j;

    static {
        Covode.recordClassIndex(38903);
    }

    private String g() {
        return (String) this.f63157a.getValue();
    }

    private final String k() {
        return (String) this.f63158b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f63159j == null) {
            this.f63159j = new HashMap();
        }
        View view = (View) this.f63159j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f63159j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f63159j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(38906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.c(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f63161a;

        static {
            Covode.recordClassIndex(38907);
        }

        d(g gVar) {
            this.f63161a = gVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f63161a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        c("resend").c();
    }

    static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(38904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.this$0 = gVar;
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
        lVar.f64883b = true;
        lVar.f64884c = false;
        lVar.f64885d = false;
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        int i3;
        String str;
        if (o.a()) {
            i2 = R.string.ar0;
        } else {
            i2 = R.string.ary;
        }
        if (o.a()) {
            i3 = R.string.fnp;
        } else {
            i3 = R.string.fnr;
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(i2);
        boolean z = true;
        bVar.f65052f = getString(i3, g());
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
        c("user_click").c();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f63160a;

        static {
            Covode.recordClassIndex(38905);
        }

        b(g gVar) {
            this.f63160a = gVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.f fVar = (com.bytedance.sdk.a.a.a.f) obj;
            g gVar = this.f63160a;
            h.f.b.l.b(fVar, "");
            String str = fVar.f43086j;
            h.f.b.l.b(str, "");
            e.b(gVar, str);
            g gVar2 = this.f63160a;
            Bundle arguments = gVar2.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putInt("next_page", k.CHANGE_PASSWORD.getValue());
            arguments.putString("platform", "phone");
            h.f.b.l.b(arguments, "");
            gVar2.a(arguments);
        }
    }

    private n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> c(String str) {
        h.f.b.l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String k2 = k();
        if (k2 != null) {
            h.f.b.l.b(k2, "");
            linkedHashMap.put("conditional_login_ticket", k2);
        }
        n<com.bytedance.sdk.a.a.a.d<com.bytedance.sdk.a.h.a.n>> a2 = x.a(this, g(), A(), V_(), "", str, (String) null, linkedHashMap).a(new d(this));
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
        x.a(this, str, 13, linkedHashMap).d(new b(this)).c();
    }
}

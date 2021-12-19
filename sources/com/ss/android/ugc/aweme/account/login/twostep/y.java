package com.ss.android.ugc.aweme.account.login.twostep;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.d.o;
import com.bytedance.sdk.a.h.a.g;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.l;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Map;

public final class y extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f64062a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private HashMap f64063b;

    static {
        Covode.recordClassIndex(39487);
    }

    private String g() {
        return (String) this.f64062a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64063b == null) {
            this.f64063b = new HashMap();
        }
        View view = (View) this.f64063b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64063b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64063b;
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
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(39488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar) {
            super(0);
            this.this$0 = yVar;
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
        final /* synthetic */ y f64066a;

        static {
            Covode.recordClassIndex(39491);
        }

        d(y yVar) {
            this.f64066a = yVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f64066a.t();
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        c("resend").d(new c(this)).c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(R.string.arr);
        bVar.f65052f = getString(R.string.ars, g());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f64065a;

        static {
            Covode.recordClassIndex(39490);
        }

        c(y yVar) {
            this.f64065a = yVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f64065a.t();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c("user_click").c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        h.f.b.l.d(str, "");
        x.b(this, str, 6, null).d(new b(this)).c();
    }

    private n<com.bytedance.sdk.a.a.a.d<g>> c(String str) {
        h.f.b.l.d(str, "");
        n<com.bytedance.sdk.a.a.a.d<g>> a2 = x.a(this, g(), 6, str, (Map) null, (String) null, 112).a((f.a.d.a) new d(this));
        h.f.b.l.b(a2, "");
        return a2;
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f64064a;

        static {
            Covode.recordClassIndex(39489);
        }

        b(y yVar) {
            this.f64064a = yVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            User f2 = cj.f();
            h.f.b.l.b(f2, "");
            f2.setEmailVerified(true);
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "email");
            String str = ((o) obj).f43104j;
            h.f.b.l.b(str, "");
            e.d(bundle, str);
            Bundle arguments = this.f64064a.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putBundle("final_data", bundle);
            y yVar = this.f64064a;
            Bundle arguments2 = yVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(arguments2, "");
            yVar.b(arguments2);
        }
    }
}

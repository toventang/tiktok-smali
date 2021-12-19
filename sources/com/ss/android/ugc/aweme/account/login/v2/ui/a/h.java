package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.h.a.g;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.a.z;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.HashMap;
import java.util.Map;

public final class h extends m {

    /* renamed from: a  reason: collision with root package name */
    public final int f64836a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f64837b = 3;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f64838j = i.a((h.f.a.a) new a(this));

    /* renamed from: k  reason: collision with root package name */
    private HashMap f64839k;

    static {
        Covode.recordClassIndex(39847);
    }

    private String g() {
        return (String) this.f64838j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64839k == null) {
            this.f64839k = new HashMap();
        }
        View view = (View) this.f64839k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64839k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64839k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(39848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.a(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f64841a;

        static {
            Covode.recordClassIndex(39850);
        }

        c(h hVar) {
            this.f64841a = hVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f64841a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        c("resend").c();
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
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, true, null, false, true, 895);
        bVar.f65051e = getString(R.string.arr);
        bVar.f65052f = getString(R.string.ars, g());
        bVar.f65047a = getString(R.string.aox);
        bVar.f65056j = false;
        return bVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c("auto_system").c();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f64840a;

        static {
            Covode.recordClassIndex(39849);
        }

        b(h hVar) {
            this.f64840a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.d.e eVar = (com.bytedance.sdk.a.a.d.e) obj;
            h hVar = this.f64840a;
            Bundle arguments = hVar.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            l.b(arguments, "");
            l.b(eVar, "");
            String str = eVar.f43091j;
            l.b(str, "");
            e.d(arguments, str);
            arguments.putInt("next_page", k.CREATE_PASSWORD_FOR_EMAIL.getValue());
            l.b(arguments, "");
            hVar.a(arguments);
        }
    }

    private n<d<g>> c(String str) {
        l.d(str, "");
        n<d<g>> a2 = x.a(this, g(), this.f64836a, str, (Map<String, String>) null, (String) null, Integer.valueOf(this.f64837b)).a(new c(this));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        l.d(str, "");
        String g2 = g();
        l.d(this, "");
        l.d(g2, "");
        l.d(str, "");
        n a2 = n.a((q) new x.ak(this, g2, str));
        l.b(a2, "");
        z.a(this, a2).d(new b(this)).c();
    }
}

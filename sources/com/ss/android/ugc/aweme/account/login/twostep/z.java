package com.ss.android.ugc.aweme.account.login.twostep;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.ss.android.ugc.aweme.account.experiment.o;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.l;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.m;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.n;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Map;

public final class z extends m {

    /* renamed from: a  reason: collision with root package name */
    private final h f64067a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    private HashMap f64068b;

    static {
        Covode.recordClassIndex(39492);
    }

    private String g() {
        return (String) this.f64067a.getValue();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f64068b == null) {
            this.f64068b = new HashMap();
        }
        View view = (View) this.f64068b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64068b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f64068b;
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
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(39494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            return e.c(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f64070a;

        static {
            Covode.recordClassIndex(39495);
        }

        c(z zVar) {
            this.f64070a = zVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f64070a.t();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void i() {
        c("resend").c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final l e() {
        l lVar = new l();
        lVar.f64883b = true;
        lVar.a(g());
        lVar.f64885d = e.d(this);
        return lVar;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        int i2;
        if (o.a()) {
            i2 = R.string.ar0;
        } else {
            i2 = R.string.ary;
        }
        com.ss.android.ugc.aweme.account.login.v2.ui.b bVar = new com.ss.android.ugc.aweme.account.login.v2.ui.b(null, null, false, null, null, false, null, false, false, 2047);
        bVar.f65051e = getString(i2);
        bVar.f65052f = getString(R.string.aqy, g());
        bVar.f65047a = " ";
        bVar.f65056j = false;
        return bVar;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.account.login.v2.ui.a.m, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c("user_click").c();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.m
    public final void a(String str) {
        h.f.b.l.d(str, "");
        x.a(this, str, 22, (Map<String, String>) null).d(new a(this)).c();
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f64069a;

        static {
            Covode.recordClassIndex(39493);
        }

        a(z zVar) {
            this.f64069a = zVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.sdk.a.a.a.f fVar = (com.bytedance.sdk.a.a.a.f) obj;
            Bundle bundle = new Bundle();
            bundle.putString("platForm", "phone");
            h.f.b.l.b(fVar, "");
            String str = fVar.f43086j;
            h.f.b.l.b(str, "");
            e.d(bundle, str);
            Bundle arguments = this.f64069a.getArguments();
            if (arguments == null) {
                h.f.b.l.b();
            }
            arguments.putBundle("final_data", bundle);
            z zVar = this.f64069a;
            Bundle arguments2 = zVar.getArguments();
            if (arguments2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(arguments2, "");
            zVar.b(arguments2);
        }
    }

    private n<d<com.bytedance.sdk.a.h.a.n>> c(String str) {
        h.f.b.l.d(str, "");
        n<d<com.bytedance.sdk.a.h.a.n>> a2 = x.a(this, g(), A(), V_(), "", str, (String) null, 192).a((f.a.d.a) new c(this));
        h.f.b.l.b(a2, "");
        return a2;
    }
}

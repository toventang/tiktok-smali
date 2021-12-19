package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.view.b;
import h.f.b.l;
import java.util.HashMap;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f64784a;

    static {
        Covode.recordClassIndex(39816);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void b_(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final View c(int i2) {
        if (this.f64784a == null) {
            this.f64784a = new HashMap();
        }
        View view = (View) this.f64784a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f64784a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void h() {
        HashMap hashMap = this.f64784a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final boolean q() {
        return false;
    }

    @Override // com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.account.login.v2.base.c, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.account.view.c.f65516a.c();
        h();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.account.login.v2.base.c, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.account.view.c.f65516a.b();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.ss.android.ugc.aweme.account.view.c.f65516a.a();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.a$a  reason: collision with other inner class name */
    public static final class C1443a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f64787a;

        static {
            Covode.recordClassIndex(39817);
        }

        @Override // com.ss.android.ugc.aweme.account.view.b
        public final void a() {
            Bundle arguments = this.f64787a.getArguments();
            if (arguments == null) {
                l.b();
            }
            arguments.putInt("next_page", k.FINISH.getValue());
            a aVar = this.f64787a;
            Bundle arguments2 = aVar.getArguments();
            if (arguments2 == null) {
                l.b();
            }
            l.b(arguments2, "");
            aVar.a(arguments2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1443a(a aVar) {
            this.f64787a = aVar;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.account.view.c.f65516a.a(bundle);
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        com.ss.android.ugc.aweme.account.view.c.f65516a.a(view, new C1443a(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.ss.android.ugc.aweme.account.view.c.f65516a.a(layoutInflater, viewGroup, bundle);
    }
}

package com.ss.android.ugc.aweme.journey.step.f;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.view.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class a extends com.ss.android.ugc.aweme.base.f.a {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f105008a;

    static {
        Covode.recordClassIndex(67327);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.f.a$a  reason: collision with other inner class name */
    public static final class C2679a implements b {
        static {
            Covode.recordClassIndex(67328);
        }

        C2679a() {
        }

        @Override // com.ss.android.ugc.aweme.account.view.b
        public final void a() {
            c.a(new com.ss.android.ugc.aweme.journey.step.g.b());
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.account.view.c.f65516a.c();
        SparseArray sparseArray = this.f105008a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.account.view.c.f65516a.b();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.ss.android.ugc.aweme.account.view.c.f65516a.a();
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
        com.ss.android.ugc.aweme.account.view.c.f65516a.a(view, new C2679a());
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.ss.android.ugc.aweme.account.view.c.f65516a.a(layoutInflater, viewGroup, bundle);
    }
}

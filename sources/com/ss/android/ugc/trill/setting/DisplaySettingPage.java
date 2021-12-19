package com.ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

@com.bytedance.ies.powerpage.a.a
public final class DisplaySettingPage extends com.ss.android.ugc.aweme.setting.page.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f150533g = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public ViewGroup f150534e;

    /* renamed from: f  reason: collision with root package name */
    public AppLanguageViewModel f150535f;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.trill.language.b.a f150536h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f150537i;

    static {
        Covode.recordClassIndex(98994);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f150537i == null) {
            this.f150537i = new SparseArray();
        }
        View view = (View) this.f150537i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f150537i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f150537i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.ay_;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98995);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(View view, Bundle bundle) {
        i supportFragmentManager;
        l.d(view, "");
        this.f150534e = (ViewGroup) view.findViewById(R.id.dqe);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = this.f150534e;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(b.c(viewGroup.getContext(), R.color.f159928l));
        }
        e activity = getActivity();
        if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
            Fragment a2 = supportFragmentManager.a("language_app_fragment");
            if (!(a2 instanceof com.ss.android.ugc.trill.language.b.a)) {
                a2 = null;
            }
            com.ss.android.ugc.trill.language.b.a aVar = (com.ss.android.ugc.trill.language.b.a) a2;
            if (aVar == null) {
                aVar = new com.ss.android.ugc.trill.language.b.a();
            }
            this.f150536h = aVar;
            if (!aVar.isAdded()) {
                n a3 = supportFragmentManager.a();
                l.b(a3, "");
                a3.a(R.id.b94, aVar, "language_app_fragment");
                a3.a((String) null);
                a3.c();
            }
        }
        this.f150535f = (AppLanguageViewModel) ae.a(this, (ad.b) null).a(AppLanguageViewModel.class);
    }
}

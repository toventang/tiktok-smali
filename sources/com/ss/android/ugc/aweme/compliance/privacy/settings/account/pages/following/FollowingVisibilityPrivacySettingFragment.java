package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.following;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class FollowingVisibilityPrivacySettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    private FollowingVisibilityViewModel f77717a;

    /* renamed from: b  reason: collision with root package name */
    private a f77718b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f77719c;

    static {
        Covode.recordClassIndex(48118);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77719c == null) {
            this.f77719c = new SparseArray();
        }
        View view = (View) this.f77719c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77719c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77719c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d
    public final List<b> c() {
        a aVar = this.f77718b;
        if (aVar == null) {
            l.a("fvAdapter");
        }
        return n.a(aVar);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac a2 = new ad(this).a(FollowingVisibilityViewModel.class);
        l.b(a2, "");
        this.f77717a = (FollowingVisibilityViewModel) a2;
        FollowingVisibilityViewModel followingVisibilityViewModel = this.f77717a;
        if (followingVisibilityViewModel == null) {
            l.a("fvViewModel");
        }
        this.f77718b = new a(followingVisibilityViewModel, this);
    }

    static final class a extends m implements h.f.a.b<c, c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77720a = new a();

        static {
            Covode.recordClassIndex(48119);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            Integer num;
            com.ss.android.ugc.aweme.compliance.api.model.c cVar2;
            c cVar3 = cVar;
            l.d(cVar3, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar3, "Show following visibility setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar3, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "following_visibility"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar3, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar3, "is_private", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (cVar2 = b2.f76688d) == null) {
                num = null;
            } else {
                num = Integer.valueOf(cVar2.f76646a);
            }
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar3, "cur_value", num);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b(R.string.eu3);
        a aVar = this.f77718b;
        if (aVar == null) {
            l.a("fvAdapter");
        }
        a(aVar.d());
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", a.f77720a);
    }
}

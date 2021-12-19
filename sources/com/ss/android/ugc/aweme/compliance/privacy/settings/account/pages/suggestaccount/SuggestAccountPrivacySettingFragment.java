package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.a;
import com.bytedance.tux.dialog.b.c;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class SuggestAccountPrivacySettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    public String f77777a = "privacy_setting";

    /* renamed from: b  reason: collision with root package name */
    public String f77778b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f77779c;

    /* renamed from: d  reason: collision with root package name */
    private b f77780d;

    /* renamed from: e  reason: collision with root package name */
    private c f77781e;

    /* renamed from: f  reason: collision with root package name */
    private e f77782f;

    /* renamed from: g  reason: collision with root package name */
    private f f77783g;

    /* renamed from: h  reason: collision with root package name */
    private d f77784h;

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f77785i;

    static {
        Covode.recordClassIndex(48179);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77785i == null) {
            this.f77785i = new SparseArray();
        }
        View view = (View) this.f77785i.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77785i.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77785i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ SuggestAccountPrivacySettingFragment this$0;

        static {
            Covode.recordClassIndex(48180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SuggestAccountPrivacySettingFragment suggestAccountPrivacySettingFragment) {
            super(0);
            this.this$0 = suggestAccountPrivacySettingFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            Context context = this.this$0.getContext();
            if (context == null) {
                l.b();
            }
            l.b(context, "");
            c.a((com.bytedance.tux.dialog.b) a.C1094a.a(context).b(R.string.gad).a(false), AnonymousClass1.f77786a).a().b().show();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d
    public final List<com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b> c() {
        a[] aVarArr = new a[5];
        b bVar = this.f77780d;
        if (bVar == null) {
            l.a("sugToContactsAdapter");
        }
        aVarArr[0] = bVar;
        c cVar = this.f77781e;
        if (cVar == null) {
            l.a("sugToFbFriendsAdapter");
        }
        aVarArr[1] = cVar;
        e eVar = this.f77782f;
        if (eVar == null) {
            l.a("sugToMutualConnectionsAdapter");
        }
        aVarArr[2] = eVar;
        f fVar = this.f77783g;
        if (fVar == null) {
            l.a("sugToWhoShareLinkAdapter");
        }
        aVarArr[3] = fVar;
        d dVar = this.f77784h;
        if (dVar == null) {
            l.a("sugToInterestedUsersAdapter");
        }
        aVarArr[4] = dVar;
        return n.b(aVarArr);
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.app.f.c, com.ss.android.ugc.aweme.app.f.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77787a = new b();

        static {
            Covode.recordClassIndex(48182);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.app.f.c invoke(com.ss.android.ugc.aweme.app.f.c cVar) {
            com.ss.android.ugc.aweme.app.f.c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show suggest account page");
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = this.f77777a;
        String str2 = this.f77778b;
        int i2 = this.f77779c;
        l.d(str, "");
        l.d(str2, "");
        r.a("enter_suggest_accounts", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("previous_page", str2).a("is_rec", i2).f66730a);
        ac a2 = new ad(this).a(SugToContactsViewModel.class);
        l.b(a2, "");
        this.f77780d = new b((SugToContactsViewModel) a2, this);
        ac a3 = new ad(this).a(SugToFbFriendsViewModel.class);
        l.b(a3, "");
        this.f77781e = new c((SugToFbFriendsViewModel) a3, this);
        ac a4 = new ad(this).a(SugToMutualConnectionsViewModel.class);
        l.b(a4, "");
        this.f77782f = new e((SugToMutualConnectionsViewModel) a4, this);
        ac a5 = new ad(this).a(SugToWhoShareLinkViewModel.class);
        l.b(a5, "");
        this.f77783g = new f((SugToWhoShareLinkViewModel) a5, this);
        ac a6 = new ad(this).a(SugToInterestedUsersViewModel.class);
        l.b(a6, "");
        this.f77784h = new d((SugToInterestedUsersViewModel) a6, this);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b(R.string.etv);
        ((TuxNavBar) a(R.id.emo)).b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_info_circle).a((h.f.a.a<z>) new a(this)));
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", b.f77787a);
    }
}

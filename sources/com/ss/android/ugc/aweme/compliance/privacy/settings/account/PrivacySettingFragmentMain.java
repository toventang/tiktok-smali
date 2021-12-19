package com.ss.android.ugc.aweme.compliance.privacy.settings.account;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.a.e;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class PrivacySettingFragmentMain extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a {

    /* renamed from: a  reason: collision with root package name */
    public e f77441a;

    /* renamed from: b  reason: collision with root package name */
    private a f77442b;

    /* renamed from: c  reason: collision with root package name */
    private PrivacySettingViewModel f77443c;

    /* renamed from: d  reason: collision with root package name */
    private long f77444d;

    /* renamed from: e  reason: collision with root package name */
    private final h f77445e = RouteArgExtension.INSTANCE.optionalArg(this, a.f77447a, "highlight_private_account_item", Boolean.class);

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f77446f;

    static {
        Covode.recordClassIndex(47906);
    }

    private final Boolean c() {
        return (Boolean) this.f77445e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77446f == null) {
            this.f77446f = new SparseArray();
        }
        View view = (View) this.f77446f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77446f.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77446f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ PrivacySettingFragmentMain this$0;

        static {
            Covode.recordClassIndex(47909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PrivacySettingFragmentMain privacySettingFragmentMain) {
            super(0);
            this.this$0 = privacySettingFragmentMain;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void a() {
        super.a();
        long j2 = this.f77444d;
        r.a("stay_time", new d().a("enter_from", "privacy_and_safety_settings").a("duration", System.currentTimeMillis() - j2).f66730a);
    }

    static final class a extends m implements h.f.a.b<Boolean, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77447a = new a();

        static {
            Covode.recordClassIndex(47907);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return false;
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PrivacySettingFragmentMain f77448a;

        static {
            Covode.recordClassIndex(47908);
        }

        b(PrivacySettingFragmentMain privacySettingFragmentMain) {
            this.f77448a = privacySettingFragmentMain;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            f fVar = (f) obj;
            l.b(fVar, "");
            int i2 = fVar.O;
            int i3 = fVar.P;
            boolean z = fVar.Q;
            String a2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.a();
            e eVar = this.f77448a.f77441a;
            if (eVar != null) {
                eVar.b("comment_filter_status_".concat(String.valueOf(a2)), Integer.valueOf(i2));
            }
            e eVar2 = this.f77448a.f77441a;
            if (eVar2 != null) {
                eVar2.b("comment_offensive_filter_".concat(String.valueOf(a2)), Integer.valueOf(i3));
            }
            e eVar3 = this.f77448a.f77441a;
            if (eVar3 != null) {
                eVar3.b("author_review_all_comments_".concat(String.valueOf(a2)), Boolean.valueOf(z));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        ac a2 = new ad(this).a(PrivacySettingViewModel.class);
        l.b(a2, "");
        PrivacySettingViewModel privacySettingViewModel = (PrivacySettingViewModel) a2;
        this.f77443c = privacySettingViewModel;
        if (privacySettingViewModel == null) {
            l.a("privacySettingViewModel");
        }
        Boolean c2 = c();
        if (c2 != null) {
            z = c2.booleanValue();
        } else {
            z = false;
        }
        privacySettingViewModel.f77450b = z;
        if (l.a((Object) c(), (Object) true)) {
            r.a("enter_privacy_setting", new d().a("enter_from", "personal_homepage").a("enter_method", "pop_up").f66730a);
        }
        PrivacySettingViewModel privacySettingViewModel2 = this.f77443c;
        if (privacySettingViewModel2 == null) {
            l.a("privacySettingViewModel");
        }
        privacySettingViewModel2.f77449a.observe(this, new b(this));
        this.f77441a = e.a.f91018a;
        com.ss.android.ugc.aweme.compliance.privacy.data.b.a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxNavBar) a(R.id.emo)).a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new c(this)));
        g gVar = new g();
        String string = getString(R.string.cd);
        l.b(string, "");
        ((TuxNavBar) a(R.id.emo)).a(gVar.a(string));
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(1);
        RecyclerView recyclerView = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        PrivacySettingViewModel privacySettingViewModel = this.f77443c;
        if (privacySettingViewModel == null) {
            l.a("privacySettingViewModel");
        }
        a aVar = new a(privacySettingViewModel, this);
        this.f77442b = aVar;
        List a2 = n.a(aVar);
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.cb4);
        l.b(recyclerView3, "");
        recyclerView3.setAdapter(new com.ss.android.ugc.aweme.compliance.privacy.b.a.a(a2));
        PrivacySettingViewModel privacySettingViewModel2 = this.f77443c;
        if (privacySettingViewModel2 == null) {
            l.a("privacySettingViewModel");
        }
        privacySettingViewModel2.a();
        this.f77444d = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        a aVar = this.f77442b;
        if (aVar == null) {
            l.a("adapter");
        }
        Iterator it = n.g((Collection) aVar.f77466c).iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}

package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.compliance.api.model.h;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

@com.bytedance.ies.powerpage.a.a
public final class LikedListPrivacySettingFragment extends d {

    /* renamed from: a  reason: collision with root package name */
    private LikedListViewModel f77739a;

    /* renamed from: b  reason: collision with root package name */
    private a f77740b;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f77741c;

    static {
        Covode.recordClassIndex(48133);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final View a(int i2) {
        if (this.f77741c == null) {
            this.f77741c = new SparseArray();
        }
        View view = (View) this.f77741c.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f77741c.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void b() {
        SparseArray sparseArray = this.f77741c;
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
        a aVar = this.f77740b;
        if (aVar == null) {
            l.a("likedListAdapter");
        }
        return n.a(aVar);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ac a2 = new ad(this).a(LikedListViewModel.class);
        l.b(a2, "");
        this.f77739a = (LikedListViewModel) a2;
        LikedListViewModel likedListViewModel = this.f77739a;
        if (likedListViewModel == null) {
            l.a("likedListViewModel");
        }
        this.f77740b = new a(likedListViewModel, this);
    }

    static final class a extends m implements h.f.a.b<c, c> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77742a = new a();

        static {
            Covode.recordClassIndex(48134);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ c invoke(c cVar) {
            Integer num;
            h hVar;
            c cVar2 = cVar;
            l.d(cVar2, "");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "Show liked videos setting page");
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, com.ss.android.ugc.aweme.compliance.privacy.data.b.a(0, "favorite"));
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "restriction_logid", com.ss.android.ugc.aweme.compliance.privacy.data.b.a());
            com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "is_private", Boolean.valueOf(com.ss.android.ugc.aweme.compliance.privacy.a.a.b()));
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 == null || (hVar = b2.f76687c) == null) {
                num = null;
            } else {
                num = Integer.valueOf(hVar.f76667a);
            }
            return com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(cVar2, "cur_value", num);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b(R.string.nh);
        a aVar = this.f77740b;
        if (aVar == null) {
            l.a("likedListAdapter");
        }
        a(aVar.d());
        com.ss.android.ugc.aweme.compliance.privacy.utils.a.a("PRIVACY_SETTING_ALOG", a.f77742a);
    }
}

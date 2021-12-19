package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f77802e;

    static {
        Covode.recordClassIndex(48204);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "sug_to_interested_users";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a
    public final String e() {
        return "like_account";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(SugToInterestedUsersViewModel sugToInterestedUsersViewModel, Fragment fragment) {
        super(sugToInterestedUsersViewModel, fragment);
        l.d(sugToInterestedUsersViewModel, "");
        l.d(fragment, "");
        this.f77802e = fragment;
        a(a.a(this, new g()).a(R.string.dni).b(R.string.dnj).a(1, 2).a());
        sugToInterestedUsersViewModel.f77673d.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f77803a;

            static {
                Covode.recordClassIndex(48205);
            }

            {
                this.f77803a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77803a.a();
            }
        });
        sugToInterestedUsersViewModel.f77674e.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.d.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f77804a;

            static {
                Covode.recordClassIndex(48206);
            }

            {
                this.f77804a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77804a.a();
            }
        });
    }
}

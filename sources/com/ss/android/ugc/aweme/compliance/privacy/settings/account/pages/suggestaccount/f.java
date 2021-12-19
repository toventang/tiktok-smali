package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f77808e;

    static {
        Covode.recordClassIndex(48210);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "sug_to_who_share_link";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a
    public final String e() {
        return "link";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(SugToWhoShareLinkViewModel sugToWhoShareLinkViewModel, Fragment fragment) {
        super(sugToWhoShareLinkViewModel, fragment);
        l.d(sugToWhoShareLinkViewModel, "");
        l.d(fragment, "");
        this.f77808e = fragment;
        a(a.a(this, new g()).a(R.string.dnh).b(R.string.dng).a(1, 2).a());
        sugToWhoShareLinkViewModel.f77673d.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.f.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f77809a;

            static {
                Covode.recordClassIndex(48211);
            }

            {
                this.f77809a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77809a.a();
            }
        });
        sugToWhoShareLinkViewModel.f77674e.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.f.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f77810a;

            static {
                Covode.recordClassIndex(48212);
            }

            {
                this.f77810a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77810a.a();
            }
        });
    }
}

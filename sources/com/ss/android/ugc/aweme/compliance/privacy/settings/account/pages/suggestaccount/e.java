package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f77805e;

    static {
        Covode.recordClassIndex(48207);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "sug_to_mutual_connections";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a
    public final String e() {
        return "mutual_connect";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(SugToMutualConnectionsViewModel sugToMutualConnectionsViewModel, Fragment fragment) {
        super(sugToMutualConnectionsViewModel, fragment);
        l.d(sugToMutualConnectionsViewModel, "");
        l.d(fragment, "");
        this.f77805e = fragment;
        a(a.a(this, new g()).a(R.string.dne).b(R.string.dnd).a(1, 2).a());
        sugToMutualConnectionsViewModel.f77673d.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.e.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f77806a;

            static {
                Covode.recordClassIndex(48208);
            }

            {
                this.f77806a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77806a.a();
            }
        });
        sugToMutualConnectionsViewModel.f77674e.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.e.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f77807a;

            static {
                Covode.recordClassIndex(48209);
            }

            {
                this.f77807a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77807a.a();
            }
        });
    }
}

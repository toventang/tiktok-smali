package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.c;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.Arrays;

public final class b extends a {

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f77790e;

    static {
        Covode.recordClassIndex(48189);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "sug_to_contacts";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a
    public final String e() {
        return "contact";
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.b$b  reason: collision with other inner class name */
    static final class C1805b extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(48194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1805b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            b bVar = this.this$0;
            com.ss.android.ugc.aweme.compliance.privacy.a.a.f().h().bindMobile(bVar.f77790e.getActivity(), "suggest_account_setting", null, new a(bVar));
            b.e.a("contact");
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(SugToContactsViewModel sugToContactsViewModel, Fragment fragment) {
        super(sugToContactsViewModel, fragment);
        l.d(sugToContactsViewModel, "");
        l.d(fragment, "");
        this.f77790e = fragment;
        a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a.a(this, new g()).a(R.string.dn9).a(new h.f.a.a<CharSequence>(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48190);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ CharSequence invoke() {
                b bVar = (b) this.receiver;
                boolean z = !TextUtils.isEmpty(com.ss.android.ugc.aweme.compliance.privacy.a.a.e().getBindPhone());
                CharSequence text = bVar.f77467d.getText(R.string.dn_);
                l.b(text, "");
                if (z) {
                    return text;
                }
                String string = bVar.f77467d.getString(R.string.dnb);
                l.b(string, "");
                String string2 = bVar.f77467d.getString(R.string.dna);
                l.b(string2, "");
                String a2 = com.a.a(string2, Arrays.copyOf(new Object[]{string}, 1));
                l.b(a2, "");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(text);
                spannableStringBuilder.append((CharSequence) a2);
                int a3 = p.a((CharSequence) spannableStringBuilder, string, 0, false, 6);
                int length = string.length() + a3;
                if (a3 >= 0 && length < spannableStringBuilder.length()) {
                    c cVar = new c();
                    cVar.f45054f = new C1805b(bVar);
                    cVar.f45052d = 1;
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) cVar.a(bVar.f77467d);
                    for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class)) {
                        spannableStringBuilder.setSpan(clickableSpan, a3, length, 33);
                    }
                }
                return spannableStringBuilder;
            }
        }).a(1, 2).a());
        sugToContactsViewModel.f77673d.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.b.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f77791a;

            static {
                Covode.recordClassIndex(48191);
            }

            {
                this.f77791a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77791a.a();
            }
        });
        sugToContactsViewModel.f77674e.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.b.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f77792a;

            static {
                Covode.recordClassIndex(48192);
            }

            {
                this.f77792a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77792a.a();
            }
        });
    }

    static final class a implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f77793a;

        static {
            Covode.recordClassIndex(48193);
        }

        a(b bVar) {
            this.f77793a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 7 && i3 == 1) {
                this.f77793a.notifyDataSetChanged();
            }
        }
    }
}

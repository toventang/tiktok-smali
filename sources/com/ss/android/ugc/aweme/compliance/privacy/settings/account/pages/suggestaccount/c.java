package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.c;
import com.bytedance.sdk.a.a.a.e;
import com.bytedance.sdk.a.a.f;
import com.ss.android.account.g;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.b;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.Arrays;
import java.util.Objects;

public final class c extends a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f77794h = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    final h f77795e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.lobby.auth.a f77796f;

    /* renamed from: g  reason: collision with root package name */
    public final Fragment f77797g;

    static {
        Covode.recordClassIndex(48195);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final String c() {
        return "sug_to_fb_friends";
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a
    public final String e() {
        return "fb";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48199);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<f> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(48200);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return com.bytedance.sdk.a.f.d.b(this.this$0.f77467d);
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(48203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            c cVar = this.this$0;
            c.a aVar = new c.a(cVar.f77797g.getActivity());
            aVar.f40170a = "facebook";
            aVar.f40172c = cVar.f77796f;
            com.bytedance.lobby.auth.c a2 = aVar.a();
            com.bytedance.lobby.internal.d.a();
            com.bytedance.lobby.internal.d.a(a2);
            b.e.a("fb");
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c$c  reason: collision with other inner class name */
    static final class C1806c implements com.bytedance.lobby.auth.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77800a;

        static {
            Covode.recordClassIndex(48201);
        }

        C1806c(c cVar) {
            this.f77800a = cVar;
        }

        @Override // com.bytedance.lobby.auth.a
        public final void a(AuthResult authResult) {
            l.d(authResult, "");
            if (authResult.f40147a) {
                l.b("310", "");
                String str = authResult.f40152f;
                l.b(str, "");
                ((f) this.f77800a.f77795e.getValue()).a("310", "facebook", str, authResult.f40154h / 1000, ag.a(), (g) new g(this) {
                    /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c.C1806c.AnonymousClass1 */

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ C1806c f77801c;

                    static {
                        Covode.recordClassIndex(48202);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f77801c = r1;
                    }

                    @Override // com.ss.android.account.g
                    public final void a(e eVar) {
                        new com.bytedance.tux.g.b(this.f77801c.f77800a.f77797g).a(this.f77801c.f77800a.f77467d.getString(R.string.dmn)).b();
                    }

                    @Override // com.ss.android.account.g
                    public final void b(e eVar) {
                        this.f77801c.f77800a.notifyDataSetChanged();
                        if (eVar != null) {
                            com.bytedance.sdk.a.n.a aVar = eVar.f43082j;
                            Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.account.BDAccountUserEntity");
                            com.ss.android.ugc.aweme.compliance.privacy.a.a.f().e().updateUserInfo((com.ss.android.account.c) aVar);
                        }
                    }

                    @Override // com.ss.android.account.g
                    public final void a(e eVar, String str) {
                        if (str == null || str.length() == 0) {
                            str = this.f77801c.f77800a.f77467d.getString(R.string.dmn);
                        }
                        l.b(str, "");
                        new com.bytedance.tux.g.b(this.f77801c.f77800a.f77797g).a(str).b();
                    }
                });
                return;
            }
            com.bytedance.lobby.c cVar = authResult.f40149c;
            if (cVar != null) {
                cVar.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(SugToFbFriendsViewModel sugToFbFriendsViewModel, Fragment fragment) {
        super(sugToFbFriendsViewModel, fragment);
        l.d(sugToFbFriendsViewModel, "");
        l.d(fragment, "");
        this.f77797g = fragment;
        a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a.a(this, new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.g()).a(R.string.dn5).a(new h.f.a.a<CharSequence>(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(48196);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ CharSequence invoke() {
                c cVar = (c) this.receiver;
                boolean isPlatformBound = com.ss.android.ugc.aweme.compliance.privacy.a.a.f().h().isPlatformBound("facebook");
                CharSequence text = cVar.f77467d.getText(R.string.dn6);
                l.b(text, "");
                if (isPlatformBound) {
                    return text;
                }
                String string = cVar.f77467d.getString(R.string.dn8);
                l.b(string, "");
                String string2 = cVar.f77467d.getString(R.string.dn7);
                l.b(string2, "");
                String a2 = com.a.a(string2, Arrays.copyOf(new Object[]{string}, 1));
                l.b(a2, "");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(text);
                spannableStringBuilder.append((CharSequence) a2);
                int a3 = p.a((CharSequence) spannableStringBuilder, string, 0, false, 6);
                int length = string.length() + a3;
                if (a3 >= 0 && length < spannableStringBuilder.length()) {
                    com.bytedance.tux.f.c cVar2 = new com.bytedance.tux.f.c();
                    cVar2.f45054f = new d(cVar);
                    cVar2.f45052d = 1;
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) cVar2.a(cVar.f77467d);
                    for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ClickableSpan.class)) {
                        spannableStringBuilder.setSpan(clickableSpan, a3, length, 33);
                    }
                }
                return spannableStringBuilder;
            }
        }).a(1, 2).a());
        sugToFbFriendsViewModel.f77673d.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f77798a;

            static {
                Covode.recordClassIndex(48197);
            }

            {
                this.f77798a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77798a.a();
            }
        });
        sugToFbFriendsViewModel.f77674e.observe(fragment, new u(this) {
            /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.c.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f77799a;

            static {
                Covode.recordClassIndex(48198);
            }

            {
                this.f77799a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f77799a.a();
            }
        });
        this.f77796f = new C1806c(this);
    }
}

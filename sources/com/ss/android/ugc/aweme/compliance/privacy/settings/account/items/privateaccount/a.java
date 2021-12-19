package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.aweme.setting.verification.c;
import f.a.d.f;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77617a = new a();

    private a() {
    }

    static final class b implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.setting.verification.c f77621a;

        static {
            Covode.recordClassIndex(48024);
        }

        b(com.ss.android.ugc.aweme.setting.verification.c cVar) {
            this.f77621a = cVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f77621a.f123053a.a();
        }
    }

    static {
        Covode.recordClassIndex(48021);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.a$a  reason: collision with other inner class name */
    static final class C1798a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.setting.verification.c f77618a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f77619b;

        static {
            Covode.recordClassIndex(48022);
        }

        C1798a(com.ss.android.ugc.aweme.setting.verification.c cVar, User user) {
            this.f77618a = cVar;
            this.f77619b = user;
        }

        @Override // f.a.w
        public final void subscribe(final v<VerificationResponse> vVar) {
            l.d(vVar, "");
            com.ss.android.ugc.aweme.setting.verification.c cVar = this.f77618a;
            User user = this.f77619b;
            AnonymousClass1 r1 = new com.ss.android.ugc.aweme.setting.verification.b() {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.a.C1798a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(48023);
                }

                @Override // com.ss.android.ugc.aweme.setting.verification.b
                public final void a(VerificationResponse verificationResponse) {
                    l.d(verificationResponse, "");
                    vVar.a(verificationResponse);
                    vVar.a();
                }
            };
            l.d(user, "");
            l.d(r1, "");
            cVar.a(c.a.b(), user, r1);
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f77622a;

        static {
            Covode.recordClassIndex(48025);
        }

        c(boolean z) {
            this.f77622a = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.compliance.privacy.a.a.f().e().updateCurSecret(this.f77622a);
            q b2 = com.ss.android.ugc.aweme.compliance.privacy.data.b.b();
            if (b2 != null) {
                b2.f76692h = this.f77622a ? 1 : 0;
            } else {
                b2 = null;
            }
            com.ss.android.ugc.aweme.compliance.privacy.data.c.a(b2);
        }
    }

    public static t<BaseResponse> a(boolean z, boolean z2) {
        t<BaseResponse> b2 = com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a.f77475a.setPrivateAccount("private_account", z ? 1 : 0, z2 ? 1 : 0).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new c(z));
        l.b(b2, "");
        return b2;
    }
}

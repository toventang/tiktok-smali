package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.tux.dialog.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public abstract class a extends com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a<BasePrivacySettingViewModel> {

    /* renamed from: b  reason: collision with root package name */
    public static final C1804a f77788b = new C1804a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final h f77789e;

    static {
        Covode.recordClassIndex(48183);
    }

    private final Keva f() {
        return (Keva) this.f77789e.getValue();
    }

    public abstract String e();

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$a  reason: collision with other inner class name */
    public static final class C1804a {
        static {
            Covode.recordClassIndex(48184);
        }

        private C1804a() {
        }

        public /* synthetic */ C1804a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Keva> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(48185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoFromSp(this.this$0.f77467d, "compliance_setting", 0);
        }
    }

    static final class c extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ int $newTag;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(48186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, int i2) {
            super(1);
            this.this$0 = aVar;
            this.$newTag = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.es7, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(48187);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.this$0.b(this.this$0.$newTag);
                    b.e.a(this.this$0.this$0.e(), true);
                    return z.f158842a;
                }
            });
            bVar2.b(R.string.es6, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(48188);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    b.e.a(this.this$0.this$0.e(), false);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final void b(int i2) {
        String str;
        super.b(i2);
        String e2 = e();
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        l.d(e2, "");
        d a2 = new d().a("account_type", e2);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        r.a("account_auth_switch", a2.a("to_status", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.a
    public final boolean a(int i2) {
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder("has_show_dialog_for_sug_");
            IAccountUserService e2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.f().e();
            l.b(e2, "");
            String sb2 = sb.append(e2.getCurSecUserId()).toString();
            if (!f().getBoolean(sb2, false)) {
                com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) a.C1094a.a(this.f77467d).a(R.string.es9).b(R.string.es8), new c(this, i2)).a().b().show();
                f().storeBoolean(sb2, true);
                String e3 = e();
                l.d(e3, "");
                r.a("account_auth_pop_up", new d().a("account_type", e3).f66730a);
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel r3, androidx.fragment.app.Fragment r4) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.d(r3, r1)
            h.f.b.l.d(r4, r1)
            android.content.Context r0 = r4.getContext()
            if (r0 != 0) goto L_0x0011
            h.f.b.l.b()
        L_0x0011:
            h.f.b.l.b(r0, r1)
            r2.<init>(r3, r0)
            com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$b r0 = new com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a$b
            r0.<init>(r2)
            h.h r0 = h.i.a(r0)
            r2.f77789e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount.a.<init>(com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, androidx.fragment.app.Fragment):void");
    }
}

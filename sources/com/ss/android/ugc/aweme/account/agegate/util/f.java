package com.ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.agegate.util.a;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.f.c;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.f.b.m;
import h.n;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f62840a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(38707);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<com.ss.android.ugc.aweme.account.a.b.a> {
        final /* synthetic */ a $eventEntity;

        static {
            Covode.recordClassIndex(38708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a aVar) {
            super(0);
            this.$eventEntity = aVar;
        }

        /* renamed from: a */
        public final com.ss.android.ugc.aweme.account.a.b.a invoke() {
            com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("user_type", f.a(this.$eventEntity.a())).a("enter_from", this.$eventEntity.c()).a("is_success", f.a(this.$eventEntity.b())).a("error_code", this.$eventEntity.b().getStatus_code()).a("enter_method", this.$eventEntity.d());
            String str = "existing";
            if (!l.a((Object) f.a(this.$eventEntity.a()), (Object) str)) {
                str = this.$eventEntity.e();
            }
            com.ss.android.ugc.aweme.account.a.b.a a3 = a2.a("platform", str).a("page_stay_time", this.$eventEntity.f()).a("is_reg_name", this.$eventEntity.g() ? 1 : 0);
            l.b(a3, "");
            return a3;
        }
    }

    public static int a(AgeGateResponse ageGateResponse) {
        if (ageGateResponse.getStatus_code() == 0 && ageGateResponse.getAgeGatePostAction() == 0 && ageGateResponse.getRegisterAgeGatePostAction() == 0) {
            return 1;
        }
        return 0;
    }

    public static String a(c cVar) {
        int i2 = g.f62841a[cVar.ordinal()];
        if (i2 == 1) {
            return "existing";
        }
        if (i2 == 2) {
            return "new";
        }
        throw new n();
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        if (!(aVar instanceof a.d)) {
            com.ss.android.ugc.aweme.account.a.b.a a2 = new a(aVar).invoke();
            if (aVar instanceof a.b) {
                a2.a("user_age_status", ((a.b) aVar).f62813b);
                a2.a("has_delete_content", aVar.b().is_prompt() ? 1 : 0);
            }
            r.a(aVar.f62798a, a2.f62575a);
        }
    }

    public static final void a(String str) {
        l.d(str, "");
        r.a("age_gate_info_popup_show", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", str).f62575a);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("reg_name_page_error", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", str).a("enter_method", str2).f62575a);
    }

    public static final void a(String str, int i2, long j2) {
        l.d(str, "");
        r.a("reg_name_page_response", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", str).a("platform", "phone_or_email").a("user_type", "new").a("is_success", i2).a("page_stay_time", j2).f62575a);
    }
}

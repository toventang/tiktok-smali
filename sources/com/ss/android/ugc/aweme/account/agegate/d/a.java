package com.ss.android.ugc.aweme.account.agegate.d;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.agegate.model.b;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.i;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public final class a extends c<b, com.ss.android.ugc.aweme.account.agegate.e.a> {

    /* renamed from: a  reason: collision with root package name */
    public b f62765a;

    /* renamed from: b  reason: collision with root package name */
    public DateFormat f62766b = DateFormat.getDateInstance(1, new Locale(((ILanguageService) com.ss.android.ugc.aweme.a.a(ILanguageService.class)).a(), d.a()));

    static {
        Covode.recordClassIndex(38676);
    }

    @Override // com.ss.android.ugc.aweme.common.c
    public final void b() {
        super.b();
        ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b(true);
    }

    private String e() {
        if (this.f62765a.mData == null || this.f62765a.mData.getLogPb() == null) {
            return "";
        }
        return this.f62765a.mData.getLogPb().getImprId();
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        super.c();
        i.a(1, this.f62765a.a() ? 1 : 0, "");
        if (this.f76397i == null) {
            return;
        }
        if (this.f62765a.mData.getAgeGatePostAction() == 1) {
            com.ss.android.ugc.aweme.compliance.api.a.q().a(true, new b(this));
        } else {
            d();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        int i2;
        ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b(false);
        if (this.f62765a.a()) {
            a(0, -1, "");
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).o();
            if (AccountService.a().e().isLogin() || !this.f62765a.i()) {
                com.ss.android.ugc.aweme.compliance.api.a.r().a(8);
            } else {
                com.ss.android.ugc.aweme.compliance.api.a.h().a(true);
                SecApiImpl.a().updateCollectMode(null);
                com.ss.android.ugc.aweme.compliance.api.a.r().a(3);
            }
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b((AgeGateResponse) this.f62765a.mData);
            return;
        }
        if (this.f62765a.mData != null) {
            i2 = this.f62765a.mData.getStatus_code();
        } else {
            i2 = 1;
        }
        a(1, i2, e());
        if (this.f62765a.b()) {
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).a((AgeGateResponse) this.f62765a.mData);
            if (!this.f62765a.g() && !this.f62765a.h()) {
                com.ss.android.ugc.aweme.compliance.api.a.r().g();
                if (this.f62765a.mData.getRegisterAgeGatePostAction() != 1) {
                    ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).c(this.f62765a.mData.getStatus_msg());
                    return;
                }
            }
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b((AgeGateResponse) this.f62765a.mData);
            return;
        }
        if (this.f62765a.f()) {
            if (!this.f62765a.g()) {
                com.ss.android.ugc.aweme.compliance.api.a.r().g();
            }
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).a(this.f62765a.c(), this.f62765a.mData.getStatus_code());
        } else {
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).d(this.f62765a.c());
        }
        ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b(this.f62765a.mData.getStatus_code());
    }

    public final Date a(String str) {
        try {
            return this.f62766b.parse(str);
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        int i2;
        LogPbBean logPb;
        super.a_(exc);
        boolean z = exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a;
        String str = "";
        if (z) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
            i2 = aVar.getErrorCode();
            if ((aVar.getRawResponse() instanceof AgeGateResponse) && (logPb = ((AgeGateResponse) aVar.getRawResponse()).getLogPb()) != null) {
                str = logPb.getImprId();
            }
        } else {
            i2 = 1;
        }
        a(1, i2, str);
        i.a(0, 0, exc.getMessage());
        if (this.f76397i != null) {
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b(false);
            if (z) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar2 = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
                int errorCode = aVar2.getErrorCode();
                if (this.f62765a.f62777c.contains(Integer.valueOf(errorCode))) {
                    if (!this.f62765a.g()) {
                        com.ss.android.ugc.aweme.compliance.api.a.r().g();
                    }
                    ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).a(aVar2.getErrorMsg(), errorCode);
                } else {
                    ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).d(aVar2.getErrorMsg());
                }
                ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b(aVar2.getErrorCode());
                return;
            }
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).d(null);
            ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).b(-1);
        }
    }

    public a(k kVar, j jVar) {
        this.f62765a = new b(kVar, jVar);
    }

    public final void a(boolean z, boolean z2) {
        boolean z3;
        String d2 = ((b) this.f76396h).d();
        if (!z || z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        a(d2, Boolean.valueOf(z3), Boolean.valueOf(z2));
        if (z3 || z2) {
            h.f62842a = d2;
        }
    }

    public final void a(int i2, int i3, int i4) {
        ((b) this.f76396h).a(i2, i3, i4);
        ((com.ss.android.ugc.aweme.account.agegate.e.a) this.f76397i).a(this.f62766b.format(new Date(i2 - 1900, i3 - 1, i4)));
    }

    private static void a(int i2, int i3, String str) {
        com.ss.android.ugc.aweme.app.f.c cVar = new com.ss.android.ugc.aweme.app.f.c();
        cVar.a("status", Integer.valueOf(i2)).a(StringSet.type, "/aweme/v3/verification/age/");
        if (i2 == 1) {
            cVar.a("error_message", Integer.valueOf(i3));
            cVar.a("tns_logId", str);
        }
        com.ss.android.ugc.aweme.account.m.b.a("compliance_api_status", "", cVar.a());
    }
}

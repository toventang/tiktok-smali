package com.ss.android.ugc.aweme.account.util;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.agegate.util.h;
import com.ss.android.ugc.aweme.account.login.b.a;
import com.ss.android.ugc.aweme.account.m.b;
import com.ss.android.ugc.aweme.app.f.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class z implements g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f65513a;

    static {
        Covode.recordClassIndex(40293);
    }

    z(boolean z) {
        this.f65513a = z;
    }

    @Override // b.g
    public final Object then(i iVar) {
        String str;
        boolean z = this.f65513a;
        if (iVar.c() || iVar.b() || !(((a) iVar.d()).f63384a == 0 || ((a) iVar.d()).f63384a == 5)) {
            int i2 = 1;
            h.f62844c = true;
            c a2 = new c().a(StringSet.type, "/aweme/v3/user/info/sync/").a("error_message", Integer.valueOf(((a) iVar.d()).f63384a));
            if (z) {
                i2 = 2;
            }
            c a3 = a2.a("status", Integer.valueOf(i2));
            if (((a) iVar.d()).f63386c != null) {
                str = ((a) iVar.d()).f63386c.getImprId();
            } else {
                str = "";
            }
            b.a("compliance_api_status", "", a3.a("tns_logId", str).a());
        } else if (iVar.a() && (((a) iVar.d()).f63384a == 0 || ((a) iVar.d()).f63384a == 5)) {
            h.f62844c = false;
            b.a("compliance_api_status", "", new c().a(StringSet.type, "/aweme/v3/user/info/sync/").a("status", (Integer) 0).a());
        }
        return i.b(ab.f65477a, i.f4824a);
    }
}

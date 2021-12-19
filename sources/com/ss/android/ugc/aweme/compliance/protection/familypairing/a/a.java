package com.ss.android.ugc.aweme.compliance.protection.familypairing.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class a extends BaseResponse {
    @c(a = "password")

    /* renamed from: a  reason: collision with root package name */
    public final String f77986a;
    @c(a = "pass_code")

    /* renamed from: b  reason: collision with root package name */
    public final String f77987b;
    @c(a = "token")

    /* renamed from: c  reason: collision with root package name */
    public final String f77988c;

    static {
        Covode.recordClassIndex(48342);
    }

    private /* synthetic */ a() {
        this("", "", "");
    }

    private a(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f77986a = str;
        this.f77987b = str2;
        this.f77988c = str3;
    }
}

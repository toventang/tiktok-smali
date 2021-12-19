package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class u extends BaseResponse {
    @c(a = "set_anonymize_for_appsflyer")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f76700a;
    @c(a = "postpone_af_tracking")

    /* renamed from: b  reason: collision with root package name */
    public final boolean f76701b;

    static {
        Covode.recordClassIndex(47367);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f76700a == uVar.f76700a && this.f76701b == uVar.f76701b;
    }

    public final int hashCode() {
        boolean z = this.f76700a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f76701b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "UltimateCmplSettings(setAnonymizeUserForAF=" + this.f76700a + ", delayAFStart=" + this.f76701b + ")";
    }
}

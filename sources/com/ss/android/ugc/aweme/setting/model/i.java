package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;

public final class i extends BaseResponse {
    @c(a = "should_display")

    /* renamed from: a  reason: collision with root package name */
    public boolean f122329a;
    @c(a = "link_sug_switch_status")

    /* renamed from: b  reason: collision with root package name */
    public Boolean f122330b;
    @c(a = "is_displayed_before")

    /* renamed from: c  reason: collision with root package name */
    public boolean f122331c;

    static {
        Covode.recordClassIndex(80213);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f122329a == iVar.f122329a && l.a(this.f122330b, iVar.f122330b) && this.f122331c == iVar.f122331c;
    }

    public final int hashCode() {
        boolean z = this.f122329a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        Boolean bool = this.f122330b;
        int hashCode = (i6 + (bool != null ? bool.hashCode() : 0)) * 31;
        if (!this.f122331c) {
            i2 = 0;
        }
        return hashCode + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "LinkPrivacyPopupStatusResponse(shouldDisplay=" + this.f122329a + ", linkSugSwitchStatus=" + this.f122330b + ", isDisplayedBefore=" + this.f122331c + ")";
    }
}

package com.ss.android.ugc.gamora.editor.sticker.donation.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class d extends BaseResponse {
    @c(a = "cursor")

    /* renamed from: a  reason: collision with root package name */
    public final int f146545a;
    @c(a = "has_more")

    /* renamed from: b  reason: collision with root package name */
    public final int f146546b;
    @c(a = "powered_by")

    /* renamed from: c  reason: collision with root package name */
    public final String f146547c;
    @c(a = "donation_text")

    /* renamed from: d  reason: collision with root package name */
    public final a f146548d;
    @c(a = "organizations")

    /* renamed from: e  reason: collision with root package name */
    public final List<c> f146549e;

    static {
        Covode.recordClassIndex(96447);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f146545a == dVar.f146545a && this.f146546b == dVar.f146546b && l.a(this.f146547c, dVar.f146547c) && l.a(this.f146548d, dVar.f146548d) && l.a(this.f146549e, dVar.f146549e);
    }

    public final int hashCode() {
        int i2 = ((this.f146545a * 31) + this.f146546b) * 31;
        String str = this.f146547c;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        a aVar = this.f146548d;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<c> list = this.f146549e;
        if (list != null) {
            i3 = list.hashCode();
        }
        return hashCode2 + i3;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "OrganizationResponse(cursor=" + this.f146545a + ", hasMore=" + this.f146546b + ", poweredBy=" + this.f146547c + ", matchDonationText=" + this.f146548d + ", orgList=" + this.f146549e + ")";
    }
}

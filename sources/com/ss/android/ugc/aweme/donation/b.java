package com.ss.android.ugc.aweme.donation;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import h.f.b.l;
import java.util.List;

public final class b extends BaseResponse {
    @c(a = "ngo_struct")

    /* renamed from: a  reason: collision with root package name */
    public final f f82958a;
    @c(a = "donor_list")

    /* renamed from: b  reason: collision with root package name */
    public final List<e> f82959b;
    @c(a = "cursor")

    /* renamed from: c  reason: collision with root package name */
    public final Integer f82960c;
    @c(a = "has_more")

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f82961d;
    @c(a = "banner")

    /* renamed from: e  reason: collision with root package name */
    public final a f82962e;
    @c(a = "donation_summary")

    /* renamed from: f  reason: collision with root package name */
    public final String f82963f;

    static {
        Covode.recordClassIndex(51727);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f82958a, bVar.f82958a) && l.a(this.f82959b, bVar.f82959b) && l.a(this.f82960c, bVar.f82960c) && l.a(this.f82961d, bVar.f82961d) && l.a(this.f82962e, bVar.f82962e) && l.a(this.f82963f, bVar.f82963f);
    }

    public final int hashCode() {
        f fVar = this.f82958a;
        int i2 = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        List<e> list = this.f82959b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Integer num = this.f82960c;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Boolean bool = this.f82961d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        a aVar = this.f82962e;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.f82963f;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode5 + i2;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "DonateResponse(ngo=" + this.f82958a + ", donorList=" + this.f82959b + ", cursor=" + this.f82960c + ", hasMore=" + this.f82961d + ", banner=" + this.f82962e + ", donationSummary=" + this.f82963f + ")";
    }

    public b(f fVar, List<e> list, Integer num, Boolean bool, a aVar, String str) {
        this.f82958a = fVar;
        this.f82959b = list;
        this.f82960c = num;
        this.f82961d = bool;
        this.f82962e = aVar;
        this.f82963f = str;
    }
}
